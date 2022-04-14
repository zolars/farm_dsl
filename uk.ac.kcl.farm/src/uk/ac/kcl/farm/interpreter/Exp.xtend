package uk.ac.kcl.farm.interpreter

import java.util.HashMap

import uk.ac.kcl.farm.farm.Crop
import uk.ac.kcl.farm.farm.CropStage
import uk.ac.kcl.farm.farm.Field

import uk.ac.kcl.farm.farm.Call
import uk.ac.kcl.farm.farm.CallFunction
import uk.ac.kcl.farm.farm.GetStageFunction
import uk.ac.kcl.farm.farm.FieldSetFunction
import uk.ac.kcl.farm.farm.IsEmptyFunction
import uk.ac.kcl.farm.farm.PlantFunction
import uk.ac.kcl.farm.farm.Expression
import uk.ac.kcl.farm.farm.ConditionOrExpression
import uk.ac.kcl.farm.farm.ConditionAndExpression
import uk.ac.kcl.farm.farm.LessThanOrEqual
import uk.ac.kcl.farm.farm.LessThan
import uk.ac.kcl.farm.farm.GreaterThanOrEqual
import uk.ac.kcl.farm.farm.GreaterThan
import uk.ac.kcl.farm.farm.Equal
import uk.ac.kcl.farm.farm.NotEqual
import uk.ac.kcl.farm.farm.Plus
import uk.ac.kcl.farm.farm.Minus
import uk.ac.kcl.farm.farm.Multiply
import uk.ac.kcl.farm.farm.Divide
import uk.ac.kcl.farm.farm.UnaryExpression
import uk.ac.kcl.farm.farm.NotBooleanExpression
import uk.ac.kcl.farm.farm.VarExpression
import uk.ac.kcl.farm.farm.TrueLiteral
import uk.ac.kcl.farm.farm.FalseLiteral
import uk.ac.kcl.farm.farm.RealLiteral

import uk.ac.kcl.farm.generator.*

/*
 * Expression Interpreter 
 */
class Exp {
	
	Runtime runtime = null
	
	new(Runtime runtime) {
		this.runtime = runtime
	}
	
    dispatch def String toString(Call exp) '''
    	(«exp.toString»)
    '''
    
    dispatch def Float toFloat(Call exp) { 	
    	if (exp.functions.size == 0) {
	    	for (String attribute : exp.attributes) {
    			return exp.instance.toFloat(attribute)
    		}
    	} else {
    		for (CallFunction function : exp.functions) {
    			return exp.instance.toFloat(function)
    		}
    	}
    }
    
    dispatch def Boolean toBoolean(Call exp) {
    	if (exp.functions.size != 0) {
	    	for (CallFunction function : exp.functions) {
	    		return exp.instance.toBoolean(function)
    		}
    	} else {
    		throw new Exception("The function do not have attributes")
    	}
		
    }
    
    dispatch def String toString(CropStage exp, String attribute) '''
    	«runtime.fieldMap.get(exp.name).getClass().getField(attribute).get(runtime.fieldMap.get(exp.name))»
    '''
    
    dispatch def Float toFloat(CropStage exp, String attribute) {
    	Float.valueOf(runtime.fieldMap.get(exp.name).getClass().getField(attribute).get(runtime.fieldMap.get(exp.name)).toString())
    }
    
    dispatch def Boolean toBoolean(CropStage exp, String attribute) {
		throw new Exception("Variable cannot be interpreted - TypeError")
    }
    
    dispatch def String toString(Field exp, String attribute) '''
    	«runtime.fieldMap.get(exp.name).getClass().getField(attribute).get(runtime.fieldMap.get(exp.name))»
    '''
    
    dispatch def Float toFloat(Field exp, String attribute) {
    	var field = runtime.fieldMap.get(exp.name)
		field.attributes.get(attribute)
	}
    
    dispatch def Boolean toBoolean(Field exp, String attribute) {
		throw new Exception("Variable cannot be interpreted - TypeError")
    }
    
    dispatch def String toString(Crop exp, GetStageFunction function) {
    	""
    }
    
    dispatch def Float toFloat(Crop exp, GetStageFunction function) {
    	var crop = runtime.cropMap.get(exp.name)
    	var stage = crop.stage.get(function.id)
		if (function.attribute == "timeConsumed") {
			return stage.time
		} else {
			return stage.attributes.get(function.attribute)
		}
	}
    
    dispatch def Boolean toBoolean(Crop exp, GetStageFunction function) {
		throw new Exception("Expected Float but received Boolean")
    }
    
    dispatch def String toString(Field exp, FieldSetFunction function) {
    	""
    }
    
    dispatch def Float toFloat(Field exp, FieldSetFunction function) {
		throw new Exception("Expected Boolean but received Float")
	}
    
    dispatch def Boolean toBoolean(Field exp, FieldSetFunction function) {
    	var field = runtime.fieldMap.get(exp.name)
    	try {
    		field.attributes.put(function.attribute.name, function.value.toFloat)
    		true
    	} catch (Exception e) {
    		throw new Exception('''Value «function.value.toFloat» cannot be given to «function.attribute»''')
    	}
    }
    
    dispatch def String toString(Field exp, IsEmptyFunction function) {
    	""
    }
    
    dispatch def Float toFloat(Field exp, IsEmptyFunction function) {
		throw new Exception("Expected Boolean but received Float")
	}
    
    dispatch def Boolean toBoolean(Field exp, IsEmptyFunction function) {
    	var field = runtime.fieldMap.get(exp.name)
    	if (function.left == "(") {
    		try {
	    		return field.crop === null 
	    	} catch (Exception e) {
	    		throw new Exception('''''')
	    	}
    	} else {
    		false
    	}

    }
    
    
    dispatch def String toString(Field exp, PlantFunction function) {
    	""	
	}
    
    dispatch def Float toFloat(Field exp, PlantFunction function) {
		throw new Exception("Expected Boolean but received Float")
	}
    
    def Boolean judegeEnvironment(GeneratedField field, GeneratedStage stage) {
    	
    	var key = true
    	for (String attribute : runtime.attributeList) {
    		if (field.attributes.get(attribute) != stage.attributes.get(attribute)) {
    			key = false
    			throw new Exception('''Crop cannot be plant in Field `«field.name»` because attribute `«attribute»` (expected «stage.attributes.get(attribute)» but got «field.attributes.get(attribute)»)''')
    		}
    	}
    	return key
    } 
    
    dispatch def Boolean toBoolean(Field exp, PlantFunction function) {
    	var field = runtime.fieldMap.get(exp.name)
    	var crop = runtime.cropMap.get(function.plantCrop.name)

		if (field.crop !== null || crop.field !== null) {
			throw new Exception('''Crop `«crop.name»` have been plant in Field `«field.name»`''')
		} else if (judegeEnvironment(field, crop.currentStage)) {
			field.crop = crop
			crop.field = field
			crop.time = 0
			crop.currentStageID = 0
			true
		} else {
			false
		}
    }
    

    dispatch def String toString(Expression exp) '''
    	(«exp.toString»)
    '''
    
    dispatch def Float toFloat(Expression exp) {
    	exp.toFloat
    }
    
    dispatch def Boolean toBoolean(Expression exp) {
    	exp.toBoolean
    }

	dispatch def String toString(VarExpression exp) {
		exp.^var.name
	}
	
	dispatch def Float toFloat(VarExpression exp) {
		Float.valueOf(runtime.variableMap.get(exp.^var.name).toString())
	}
	
	dispatch def Boolean toBoolean(VarExpression exp) {
		Boolean.valueOf(runtime.variableMap.get(exp.^var.name).toString())
	}

	dispatch def String toString(RealLiteral exp) {
		Float.toString(exp.num)
	}
	
    dispatch def Float toFloat(RealLiteral exp) {
    	exp.num
    }
		
	dispatch def Boolean toBoolean(RealLiteral exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}

	dispatch def String toString(TrueLiteral exp) {
		exp.value
	}
	
	dispatch def Float toFloat(TrueLiteral exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}
	
	dispatch def Boolean toBoolean(TrueLiteral exp) {
		true
	}
	
	dispatch def String toString(FalseLiteral exp) {
		exp.value
	}
	
	dispatch def Float toFloat(FalseLiteral exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}
	
	dispatch def Boolean toBoolean(FalseLiteral exp) {
		false
	}

	dispatch def String toString(NotBooleanExpression exp) '''
		! «exp.exp.toString»
	'''
	
	dispatch def Float toFloat(NotBooleanExpression exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}
	
	dispatch def Boolean toBoolean(NotBooleanExpression exp) {
		! exp.exp.toBoolean
	}

	dispatch def String toString(UnaryExpression exp) '''
		- «exp.exp.toString»
	'''

	dispatch def Float toFloat(UnaryExpression exp) {
		- exp.exp.toFloat
	}

	dispatch def Boolean toBoolean(UnaryExpression exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}
	
	dispatch def String toString(ConditionOrExpression exp) '''
		«exp.left.toString» || «exp.right.toString»
	'''
	
	dispatch def Float toFloat(ConditionOrExpression exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}
	
	dispatch def Boolean toBoolean(ConditionOrExpression exp) {
		exp.left.toBoolean || exp.right.toBoolean
	}

	dispatch def String toString(ConditionAndExpression exp) {
		'''«exp.left.toString» && «exp.right.toString»'''
	}
	
	dispatch def Float toFloat(ConditionAndExpression exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}
	
	dispatch def Boolean toBoolean(ConditionAndExpression exp) {
		exp.left.toBoolean && exp.right.toBoolean
	}

	dispatch def String toString(Plus exp) '''
		«exp.left.toString» + «exp.right.toString»
	'''
	
	dispatch def Float toFloat(Plus exp) {
		exp.left.toFloat + exp.right.toFloat
	}
	
	dispatch def Boolean toBoolean(Plus exp) {
		exp.left.toBoolean || exp.right.toBoolean
	}

	dispatch def String toString(Minus exp) '''
		«exp.left.toString» - «exp.right.toString»
	'''
	
	dispatch def Float toFloat(Minus exp) {
		exp.left.toFloat - exp.right.toFloat
	}
	
	dispatch def Boolean toBoolean(Minus exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}

	dispatch def String toString(Multiply exp) '''
		«exp.left.toString» * «exp.right.toString»
	'''

	dispatch def Float toFloat(Multiply exp) {
		exp.left.toFloat * exp.right.toFloat
	}
	
	dispatch def Boolean toBoolean(Multiply exp) {
		exp.left.toBoolean && exp.right.toBoolean
	}
	
	dispatch def String toString(Divide exp) '''
		«exp.left.toString» / «exp.right.toString»
	'''

	dispatch def Float toFloat(Divide exp) {
		exp.left.toFloat / exp.right.toFloat
	}
	
	dispatch def Boolean toBoolean(Divide exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}

	dispatch def String toString(LessThanOrEqual exp) '''
		«exp.left.toString» <= «exp.right.toString»
	'''
	
	dispatch def Float toFloat(LessThanOrEqual exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}
	
	dispatch def Boolean toBoolean(LessThanOrEqual exp) {
		exp.left.toFloat <= exp.right.toFloat
	}

	dispatch def String toString(LessThan exp) '''
		«exp.left.toString» < «exp.right.toString»
	'''
	
	dispatch def Float toFloat(LessThan exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}
	
	dispatch def Boolean toBoolean(LessThan exp) {
		exp.left.toFloat < exp.right.toFloat
	}

	dispatch def String toString(GreaterThanOrEqual exp) '''
		«exp.left.toString» >= «exp.right.toString»
	'''
	
	dispatch def Float toFloat(GreaterThanOrEqual exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}

	dispatch def Boolean toBoolean(GreaterThanOrEqual exp) {
		exp.left.toFloat >= exp.right.toFloat
	}

	dispatch def String toString(GreaterThan exp) '''
		«exp.left.toString» > «exp.right.toString»
	'''

	dispatch def Float toFloat(GreaterThan exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}

	dispatch def Boolean toBoolean(GreaterThan exp) {
		exp.left.toFloat > exp.right.toFloat
	}

	dispatch def String toString(Equal exp) '''
		«exp.left.toString» == «exp.right.toString»
	'''
	
	dispatch def Float toFloat(Equal exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}

	dispatch def Boolean toBoolean(Equal exp) {
		try {
			exp.left.toFloat == exp.right.toFloat
		} catch (Exception e) {
			exp.left.toBoolean == exp.right.toBoolean
		}
	}

	dispatch def String toString(NotEqual exp) '''
		«exp.left.toString» != «exp.right.toString»
	'''
	
	dispatch def Float toFloat(NotEqual exp) {
		throw new Exception("Variable cannot be interpreted - TypeError")
	}

	dispatch def Boolean toBoolean(NotEqual exp) {
		try {
			exp.left.toFloat != exp.right.toFloat
		} catch (Exception e) {
			exp.left.toBoolean != exp.right.toBoolean
		}
	}
}