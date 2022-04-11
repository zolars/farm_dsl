package uk.ac.kcl.farm.interpreter

import java.util.HashMap

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

/*
 * Expression Interpreter 
 */
class Exp {
	
	public HashMap<String, Object> variableMap = new HashMap<String, Object>

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
		Float.valueOf(this.variableMap.get(exp.^var.name).toString())
	}
	
	dispatch def Boolean toBoolean(VarExpression exp) {
		Boolean.valueOf(this.variableMap.get(exp.^var.name).toString())
	}

	dispatch def String toString(RealLiteral exp) {
		Float.toString(exp.num)
	}
	
    dispatch def Float toFloat(RealLiteral exp) {
    	exp.num
    }
		
	dispatch def Boolean toBoolean(RealLiteral exp) {
		throw new Exception("Variable cannot be interpreted")
	}

	dispatch def String toString(TrueLiteral exp) {
		exp.value
	}
	
	dispatch def Float toFloat(TrueLiteral exp) {
		throw new Exception("Variable cannot be interpreted")
	}
	
	dispatch def Boolean toBoolean(TrueLiteral exp) {
		true
	}
	
	dispatch def String toString(FalseLiteral exp) {
		exp.value
	}
	
	dispatch def Float toFloat(FalseLiteral exp) {
		throw new Exception("Variable cannot be interpreted")
	}
	
	dispatch def Boolean toBoolean(FalseLiteral exp) {
		false
	}

	dispatch def String toString(NotBooleanExpression exp) '''
		! «exp.exp.toString»
	'''
	
	dispatch def Float toFloat(NotBooleanExpression exp) {
		throw new Exception("Variable cannot be interpreted")
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
		throw new Exception("Variable cannot be interpreted")
	}
	
	dispatch def String toString(ConditionOrExpression exp) '''
		«exp.left.toString» || «exp.right.toString»
	'''
	
	dispatch def Float toFloat(ConditionOrExpression exp) {
		throw new Exception("Variable cannot be interpreted")
	}
	
	dispatch def Boolean toBoolean(ConditionOrExpression exp) {
		exp.left.toBoolean || exp.right.toBoolean
	}

	dispatch def String toString(ConditionAndExpression exp) {
		'''«exp.left.toString» && «exp.right.toString»'''
	}
	
	dispatch def Float toFloat(ConditionAndExpression exp) {
		throw new Exception("Variable cannot be interpreted")
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
		throw new Exception("Variable cannot be interpreted")
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
		throw new Exception("Variable cannot be interpreted")
	}

	dispatch def String toString(LessThanOrEqual exp) '''
		«exp.left.toString» <= «exp.right.toString»
	'''
	
	dispatch def Float toFloat(LessThanOrEqual exp) {
		throw new Exception("Variable cannot be interpreted")
	}
	
	dispatch def Boolean toBoolean(LessThanOrEqual exp) {
		exp.left.toFloat <= exp.right.toFloat
	}

	dispatch def String toString(LessThan exp) '''
		«exp.left.toString» < «exp.right.toString»
	'''
	
	dispatch def Float toFloat(LessThan exp) {
		throw new Exception("Variable cannot be interpreted")
	}
	
	dispatch def Boolean toBoolean(LessThan exp) {
		exp.left.toFloat < exp.right.toFloat
	}

	dispatch def String toString(GreaterThanOrEqual exp) '''
		«exp.left.toString» >= «exp.right.toString»
	'''
	
	dispatch def Float toFloat(GreaterThanOrEqual exp) {
		throw new Exception("Variable cannot be interpreted")
	}

	dispatch def Boolean toBoolean(GreaterThanOrEqual exp) {
		exp.left.toFloat >= exp.right.toFloat
	}

	dispatch def String toString(GreaterThan exp) '''
		«exp.left.toString» > «exp.right.toString»
	'''

	dispatch def Float toFloat(GreaterThan exp) {
		throw new Exception("Variable cannot be interpreted")
	}

	dispatch def Boolean toBoolean(GreaterThan exp) {
		exp.left.toFloat > exp.right.toFloat
	}

	dispatch def String toString(Equal exp) '''
		«exp.left.toString» == «exp.right.toString»
	'''
	
	dispatch def Float toFloat(Equal exp) {
		throw new Exception("Variable cannot be interpreted")
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
		throw new Exception("Variable cannot be interpreted")
	}

	dispatch def Boolean toBoolean(NotEqual exp) {
		try {
			exp.left.toFloat != exp.right.toFloat
		} catch (Exception e) {
			exp.left.toBoolean != exp.right.toBoolean
		}
	}
}