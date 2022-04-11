/*
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.farm.generator

import java.util.List
import java.util.HashMap

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import uk.ac.kcl.farm.farm.FarmProgram
import uk.ac.kcl.farm.farm.Statement
import uk.ac.kcl.farm.farm.Attribute
import uk.ac.kcl.farm.farm.Crop
import uk.ac.kcl.farm.farm.CropStages
import uk.ac.kcl.farm.farm.CropStage
import uk.ac.kcl.farm.farm.CropAttributes
import uk.ac.kcl.farm.farm.Field
import uk.ac.kcl.farm.farm.FieldMonitor
import uk.ac.kcl.farm.farm.Mission
import uk.ac.kcl.farm.farm.Variable
import uk.ac.kcl.farm.farm.VarExpression
import uk.ac.kcl.farm.farm.Assignment
import uk.ac.kcl.farm.farm.LoopStatement
import uk.ac.kcl.farm.farm.JudgeStatement
import uk.ac.kcl.farm.farm.ElseJudgeStatement
import uk.ac.kcl.farm.farm.ElseStatement
import uk.ac.kcl.farm.farm.ReportFunction

import uk.ac.kcl.farm.interpreter.Exp

//import uk.ac.kcl.farm.farm.Expression
//import uk.ac.kcl.farm.farm.AdditionExpression
//import uk.ac.kcl.farm.farm.MultiplicationExpression

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */

@Data
class GeneratedStage {
	public String name
	public Float time
	public HashMap<String, Float> attributes
}

class GeneratedCrop {
	String name
	var List<GeneratedStage> stage = newArrayList()
	
	new(String name, List<GeneratedStage> stage) {
		this.name = name
		this.stage = stage
	}
}

class GeneratedField {
	String name
	String ip
	int type
	int light
	var List<String> monitor = newArrayList()
	
	new(
		String name,
		String ip,
		String type,
		String light,
		List<String> monitor
	) {
		this.name = name
		this.ip = ip
		
		if (type === "inside")
			this.type = 0
		else
			this.type = 1
			
		if (type === "sunlight")
			this.light = 0
		else if (type === "LED")
			this.light = 1
		else
			this.light = 2
		
		this.monitor = monitor
	}
}
 
class FarmGenerator extends AbstractGenerator {
	
	List<String> attributeList = newArrayList()
	HashMap<String, GeneratedCrop> cropMap = new HashMap<String, GeneratedCrop>
	HashMap<String, GeneratedField> fieldMap = new HashMap<String, GeneratedField>
	Exp expRuntime = new Exp()
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.contents.head as FarmProgram
		fsa.generateFile(resource.deriveStatsTargetFileNameFor, model.doGenerateStats)
		
		val className = resource.deriveClassNameFor
		fsa.generateFile(className + '.java', model.doGenerateClass(className))
	}
	
	def deriveStatsTargetFileNameFor(Resource resource) {
		resource.URI.appendFileExtension('txt').lastSegment
	}
	
	def deriveClassNameFor(Resource resource) {
		val origName = resource.URI.lastSegment
		
		origName.substring(0, origName.indexOf('.')).toFirstUpper + 'Farm'
	}
	
	def String doGenerateStats(FarmProgram program) {
		'''
		Program contains:
		
		- «program.eAllContents.filter(Attribute).size» attribute declarations
		«program.statements.filter(Attribute).map[generateTimetable(new Environment)].join('\n')»
		- «this.attributeList.size» attribute processed
		- «program.eAllContents.filter(Crop).size» crop declarations
		«program.statements.filter(Crop).map[generateTimetable(new Environment)].join('\n')»
		- «this.cropMap.size» crop processed
		- «program.eAllContents.filter(Field).size» field declarations
		«program.statements.filter(Field).map[generateTimetable(new Environment)].join('\n')»
		- «this.fieldMap.size» field processed
		
		
		«program.statements.filter(Mission).map[generateTimetable(new Environment)].join('\n')»
		'''
	}
	
	def String doGenerateClass(FarmProgram program, String className) '''
		import uk.ac.kcl.farm.library.*
		
		public class «className» {

			public static void main (String[] args) {
				FarmFrame tf = new FarmFrame();
				
				Farm t = new Farm(tf) {
					@Override
					protected void run() {
						«program.statements.map[generateJavaStatement(new Environment)].join('\n')»
					}
				};
				
				t.run();
			}
		}
	'''
	
	private static class Environment {
		var int counter = 0
		
		def getFreshVarName() '''i«counter++»'''
		
		def exit() { counter-- }
	}
	
	/*
	 * generateTimetable
	 */
	 
 	dispatch def String generateTimetable(Attribute attribute, Environment env) {
 		this.attributeList.add(attribute.name)
 		
		'''    - Attribute `«attribute.name»` processed'''
	}
	
	dispatch def String generateTimetable(Crop crop, Environment env) {
		var List<GeneratedStage> generatedStages = newArrayList()
		for (CropStages stages : crop.cropStages) {
			for (CropStage stage : stages.elements) {
				var attributes = new HashMap<String, Float>
				for (CropAttributes attribute : stage.attributes) {
					if (this.attributeList.contains(attribute.type.name)) {
						attributes.put(attribute.type.name, expRuntime.toFloat(attribute.value))
					} else {
						throw new Exception('''
							Undefined attribute «attribute.type.name» used in Crop: «crop.name»
							Avaible attributes is as below: «this.attributeList»
						''');
					}
				}
				var newStage = new GeneratedStage(stage.name, expRuntime.toFloat(stage.time), attributes)
				generatedStages.add(newStage)
			}	
		}
		
		var newCrop = new GeneratedCrop(crop.cropName, generatedStages)
		this.cropMap.put(crop.name, newCrop)
	
		'''    - Crop `«crop.name»` processed'''
	}

 	dispatch def String generateTimetable(Field field, Environment env) {
 		var List<String> monitors = newArrayList()
 		
 		for (FieldMonitor monitor : field.fieldMonitors) { 
 			if (this.attributeList.contains(monitor.monitor.name)) {
 				monitors.add(monitor.monitor.name)
 			} else {
				throw new Exception('''
					Undefined attribute «monitor.monitor.name» used in Field: «field.name»
					Avaible attributes is as below: «this.attributeList»
				''');
			}
 		}
 		
 		var newField = new GeneratedField(field.fieldName, field.fieldIP, field.fieldType, field.fieldLight, monitors)
		this.fieldMap.put(field.name, newField)
		
 		'''    - Field `«field.name»` processed'''
	}
	
	dispatch def String generateTimetable(Mission mission, Environment env) {
		'''«mission.missionStatements.map[generateTimetable(new Environment)].join('\n')»'''
	}
	
	dispatch def String generateTimetable(Variable variable, Environment env) {
		var exp = variable.expression
		try {
			expRuntime.variableMap.put(variable.name, expRuntime.toFloat(exp))
		} catch (Exception e1) {
			try {
				expRuntime.variableMap.put(variable.name, expRuntime.toBoolean(exp))
			} catch (Exception e2) {
				throw new Exception("Variable cannot be interpreted")
			}
		}
		System.out.println('''- Variable `«variable.name» : «expRuntime.variableMap.get(variable.name)»` processed''')
		''''''
	}
	
	dispatch def String generateTimetable(Assignment assignment, Environment env) {
		var exp = assignment.expression
		try {
			expRuntime.variableMap.put(assignment.^var.name, expRuntime.toFloat(exp))
		} catch (Exception e1) {
			try {
				expRuntime.variableMap.put(assignment.^var.name, expRuntime.toBoolean(exp))
			} catch (Exception e2) {
				throw new Exception("Variable cannot be interpreted")
			}
		}
		System.out.println('''- Assignment `«assignment.^var.name» : «expRuntime.variableMap.get(assignment.^var.name)»` processed''')
		''''''
	}
	
	dispatch def String generateTimetable(LoopStatement loop, Environment env) {
		var result = ""
		while (expRuntime.toBoolean(loop.condition)) {
			result += loop.loopStatements.map[generateTimetable(new Environment)].join('\n')
		}
		result
	}
	
	dispatch def String generateTimetable(JudgeStatement judge, Environment env) {
		var result = ""
		if (expRuntime.toBoolean(judge.condition)) {
			result += judge.judgeStatements.map[generateTimetable(new Environment)].join('\n')
		} else {
			var successKey = false
			for (ElseJudgeStatement elseJudgeStatement : judge.elseJudgeStatements) {
				 if (expRuntime.toBoolean(elseJudgeStatement.condition) && !successKey) {
				 	successKey = true
				 	result += elseJudgeStatement.elseJudgeStatements.map[generateTimetable(new Environment)].join('\n')
				 }
			}
			if (!successKey) {
				for (ElseStatement elseStatement : judge.elseStatement) {
					result += elseStatement.elseStatements.map[generateTimetable(new Environment)].join('\n')
				}
			}
		}
		result
	}
	
	dispatch def String generateTimetable(ReportFunction func, Environment env) {
		''''''
	}
	
	dispatch def String generateTimetable(Statement stmt, Environment env) ''''''
	
	/*
	 * generateJavaStatement
	 */
	 
	dispatch def String generateJavaStatement(Attribute attribute, Environment env) '''
	«attribute.name»
	'''
	
	dispatch def String generateJavaStatement(ReportFunction func, Environment env) {
	''''''
	}
	
	dispatch def String generateJavaStatement(Crop stmt, Environment env) ''''''
	dispatch def String generateJavaStatement(Field stmt, Environment env) ''''''
	dispatch def String generateJavaStatement(Mission stmt, Environment env) ''''''
	dispatch def String generateJavaStatement(Statement stmt, Environment env) ''''''
	
}
