package uk.ac.kcl.farm.generator

import java.util.List
import java.util.HashMap

//import uk.ac.kcl.farm.farm.Expression
//import uk.ac.kcl.farm.farm.AdditionExpression
//import uk.ac.kcl.farm.farm.MultiplicationExpression

@Data
class GeneratedStage {
	public String name
	public float time
	public float timeover
	public HashMap<String, Float> attributes
}

class GeneratedCrop {
	public String ID
	public String name
	public var List<GeneratedStage> stage = newArrayList()
		
	public float time
	public GeneratedStage currentStage
	public int currentStageID = 0
	
	public GeneratedField field
	
	new(String ID, String name, List<GeneratedStage> stage) {
		this.ID = ID
		this.name = name
		this.stage = stage
		
		this.time = 0
		this.currentStage = this.stage.get(0)
		this.currentStageID = 0
		
		this.field = null
	}
	
	def addStage() {
		this.currentStageID += 1
		if (this.currentStageID  < this.stage.size) {
			this.currentStage = this.stage.get(this.currentStageID)
		}
	}
	
	def refresh() {
		this.field.crop = null
		this.time = 0
		this.currentStage = this.stage.get(0)
		this.currentStageID = 0
		
		this.field = null
	}
}

class GeneratedField {
	public String name
	public String ip
	public String type
	public String light
	public var HashMap<String, Float> attributes
	
	public GeneratedCrop crop
	new(
		String name,
		String ip,
		String type,
		String light,
		HashMap<String, Float> attributes
	) {
		this.name = name
		this.ip = ip
		this.type = type
		this.light = light
		
		this.attributes = attributes
		
		this.crop = null
	}
}

class Runtime {
		
	public float time = Float.valueOf(0)
	public List<String> attributeList = newArrayList()
	public HashMap<String, GeneratedCrop> cropMap = new HashMap<String, GeneratedCrop>
	public HashMap<String, GeneratedField> fieldMap = new HashMap<String, GeneratedField>
	public HashMap<String, Object> variableMap = new HashMap<String, Object>
    
	
}