/*
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.farm.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.farm.farm.LoopStatement
// import uk.ac.kcl.farm.farm.MoveStatement
// import uk.ac.kcl.farm.farm.TurnStatement
import uk.ac.kcl.farm.farm.FarmProgram
import uk.ac.kcl.farm.farm.VariableDeclaration
import uk.ac.kcl.farm.farm.Statement
// import uk.ac.kcl.farm.farm.TurnCommand
import uk.ac.kcl.farm.farm.RealExpression
import uk.ac.kcl.farm.farm.Addition
import uk.ac.kcl.farm.farm.Multiplication
import uk.ac.kcl.farm.farm.RealLiteral
import uk.ac.kcl.farm.farm.RealVarExpression

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class FarmGenerator extends AbstractGenerator {

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
	
	def String doGenerateStats(FarmProgram program) '''
		Program contains:
		
		- «program.statements.filter(LoopStatement).size» top-level loops
		- «program.eAllContents.filter(VariableDeclaration).size» variable declarations
	'''
	
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
	
	dispatch def String generateJavaStatement(Statement stmt, Environment env) ''''''
	
	/* 
	dispatch def String generateJavaStatement(MoveStatement stmt, Environment env) '''move«stmt.command.getName.toFirstUpper»(«stmt.steps.generateJavaExpression»);'''
	dispatch def String generateJavaStatement(TurnStatement stmt, Environment env) '''rotate(«if (stmt.command === TurnCommand.LEFT) {'''-'''}»«stmt.degrees»);'''

	dispatch def String generateJavaStatement(LoopStatement stmt, Environment env) {
		val freshVarName = env.getFreshVarName
		
		val result = 
		'''
			while ( «freshVarName» ) {
				«stmt.statements.map[generateJavaStatement(env)].join('\n')»
			}
		'''
		
		env.exit
		
		result
	}

	*/
	
	dispatch def String generateJavaExpression(RealExpression exp) ''''''
	dispatch def String generateJavaExpression(Addition exp) '''
		(«exp.left.generateJavaExpression»«FOR idx: (0..exp.operator.size-1)» «exp.operator.get(idx)» «exp.right.get(idx).generateJavaExpression»«ENDFOR»)'''
	dispatch def String generateJavaExpression(Multiplication exp) '''
		«exp.left.generateJavaExpression»«FOR idx: (0..exp.operator.size-1)» «exp.operator.get(idx)» «exp.right.get(idx).generateJavaExpression»«ENDFOR»'''
	dispatch def String generateJavaExpression(RealLiteral exp) '''«exp.^val»'''
	dispatch def String generateJavaExpression(RealVarExpression exp) '''«exp.^var.value»'''
}
