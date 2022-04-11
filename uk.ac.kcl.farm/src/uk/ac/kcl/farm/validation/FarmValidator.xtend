/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.farm.validation

//import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.validation.Check


import uk.ac.kcl.farm.validation.AbstractFarmValidator
import uk.ac.kcl.farm.farm.FarmPackage
import uk.ac.kcl.farm.farm.FarmProgram
import uk.ac.kcl.farm.farm.Crop
import uk.ac.kcl.farm.farm.CropStage
import uk.ac.kcl.farm.farm.Field
import uk.ac.kcl.farm.farm.Mission
import uk.ac.kcl.farm.farm.Attribute
import uk.ac.kcl.farm.farm.Variable
import uk.ac.kcl.farm.farm.MoveFunction

import uk.ac.kcl.farm.generator.*
import uk.ac.kcl.farm.interpreter.Exp

//import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class FarmValidator extends AbstractFarmValidator {
	
	Runtime runtime = new Runtime()
	Exp expRuntime = new Exp(runtime)
	
	public static val INVALID_ATTRIBUTE_NAME = 'uk.ac.kcl.farm.farm.INVALID_ATTRIBUTE_NAME'
	public static val INVALID_VARIABLE_NAME = 'uk.ac.kcl.farm.farm.INVALID_VARIABLE_NAME'
	public static val INVALID_EXPRESSION = 'uk.ac.kcl.farm.farm.INVALID_EXPRESSION'
	public static val INVALID_IP_ADDRESS = 'uk.ac.kcl.farm.farm.INVALID_IP_ADDRESS'
	public static val INVALID_CROP_STAGE_TIME = 'uk.ac.kcl.farm.farm.INVALID_CROP_STAGE_TIME'
	public static val INVALID_FUNCTION = 'uk.ac.kcl.farm.farm.INVALID_FUNCTION'

	@Check
	def checkAttributeStartsWithLowerCase(Attribute attribute) {
		if (!Character.isLowerCase(attribute.name.charAt(0))) {
			warning('Attribute should start with a lower-case character', 
					FarmPackage.Literals.ATTRIBUTE__NAME,
					INVALID_ATTRIBUTE_NAME
			)
		}
	}
	
	@Check
	def checkVariableStartsWithLowerCase(Variable variable) {
		if (!Character.isLowerCase(variable.name.charAt(0))) {
			warning('Variable should start with a lower-case character', 
					FarmPackage.Literals.VARIABLE__EXPRESSION,
					INVALID_VARIABLE_NAME
			)
		}
	}
	
//	@Check
//	def checkExpressionType(Expression exp) {
//		try {
//			expRuntime.toBoolean(exp)
//		} catch (Exception e1) {
//			try {
//				expRuntime.toFloat(exp)
//			} catch (Exception e2) {
//				error(
//					'Variable cannot be interpreted', 
//					null,
//					INVALID_EXPRESSION
//				)
//			}
//		}
//	}
	
//	@Check
//	def checkExpressionType(LoopStatement loop) {
//		try {
//			expRuntime.toBoolean(loop.condition)
//		} catch (Exception e1) {
//			try {
//				expRuntime.toBoolean(loop.condition)
//				error(
//					'Type mismatch: cannot convert from Real to Boolean', 
//					FarmPackage.Literals.LOOP_STATEMENT__CONDITION,
//					INVALID_EXPRESSION
//				)
//			} catch (Exception e2) {
//				error(
//					'Variable cannot be interpreted', 
//					FarmPackage.Literals.LOOP_STATEMENT__CONDITION,
//					INVALID_EXPRESSION
//				)
//			}
//		}
//	}
	
	def static boolean validateIPAddress(String ip) {
	    val PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
	
	    return ip.matches(PATTERN);
	}
	
	@Check
	def checkTimeConsumed(CropStage stage) {
		if (expRuntime.toFloat(stage.time) < 0) {
			error('timeConsumed must be a Float bigger than 0', 
					FarmPackage.Literals.CROP_STAGE__TIME,
					INVALID_CROP_STAGE_TIME
			)
		}
	}
	
	@Check
	def checkIPAddressFormat(Field field) {
		if (!validateIPAddress(field.fieldIP)) {
			warning('IP Address format is wrong', 
					FarmPackage.Literals.FIELD__FIELD_IP,
					INVALID_IP_ADDRESS
			)
		}
	}
	
	def haveAllClass(EList<EObject> statements) {
		var haveCrop = false
		var haveField = false
		var haveMission = false
		for (EObject statement : statements) {
			if (statement instanceof Crop) {
				haveCrop = true
			}
			
			if (statement instanceof Field) {
				haveField = true
			}
			
			if (statement instanceof Mission) {
				haveMission = true
			}
		}
		
		var errorLog = ""
		
		if (!haveCrop) {
			errorLog += "\tYou must add at least one Crop class\n"
		}
		
		if (!haveField) {
			errorLog += "\tYou must add at least one Field class\n"
		}
		
		if (!haveMission) {
			errorLog += "\tYou must add at least one Mission class\n"
		}
		return errorLog
	}
	@Check(NORMAL)
	def checkHaveCrop(FarmProgram program) {
		var errorLog = haveAllClass(program.statements)
		if (errorLog !== "") {
			error('The farm program must have at least one of Crop, Field and Mission\n' + errorLog, 
					null,
					INVALID_VARIABLE_NAME
			)
		}
	}
	
		
	@Check
	def checkMoveFunctionParamsDifferent(MoveFunction function) {
		if (function.moveFromField.name == function.moveToField.name) {
			warning('move function params cannot be the same', 
					FarmPackage.Literals.MOVE_FUNCTION__MOVE_FROM_FIELD,
					INVALID_FUNCTION
			)
		}
	}
	
}
