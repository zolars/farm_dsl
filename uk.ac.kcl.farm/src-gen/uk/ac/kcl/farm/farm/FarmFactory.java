/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.farm.farm.FarmPackage
 * @generated
 */
public interface FarmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FarmFactory eINSTANCE = uk.ac.kcl.farm.farm.impl.FarmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  FarmProgram createFarmProgram();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Expression Or Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Or Call</em>'.
   * @generated
   */
  ExpressionOrCall createExpressionOrCall();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Var Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Expression</em>'.
   * @generated
   */
  VarExpression createVarExpression();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call</em>'.
   * @generated
   */
  Call createCall();

  /**
   * Returns a new object of class '<em>Loop Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Loop Statement</em>'.
   * @generated
   */
  LoopStatement createLoopStatement();

  /**
   * Returns a new object of class '<em>Judge Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Judge Statement</em>'.
   * @generated
   */
  JudgeStatement createJudgeStatement();

  /**
   * Returns a new object of class '<em>Else Judge Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Judge Statement</em>'.
   * @generated
   */
  ElseJudgeStatement createElseJudgeStatement();

  /**
   * Returns a new object of class '<em>Else Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Statement</em>'.
   * @generated
   */
  ElseStatement createElseStatement();

  /**
   * Returns a new object of class '<em>Builtin Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Builtin Function</em>'.
   * @generated
   */
  BuiltinFunction createBuiltinFunction();

  /**
   * Returns a new object of class '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance</em>'.
   * @generated
   */
  Instance createInstance();

  /**
   * Returns a new object of class '<em>Report Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Report Function</em>'.
   * @generated
   */
  ReportFunction createReportFunction();

  /**
   * Returns a new object of class '<em>Move Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Move Function</em>'.
   * @generated
   */
  MoveFunction createMoveFunction();

  /**
   * Returns a new object of class '<em>Wait Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wait Function</em>'.
   * @generated
   */
  WaitFunction createWaitFunction();

  /**
   * Returns a new object of class '<em>Call Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Function</em>'.
   * @generated
   */
  CallFunction createCallFunction();

  /**
   * Returns a new object of class '<em>Get Stage Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Stage Function</em>'.
   * @generated
   */
  GetStageFunction createGetStageFunction();

  /**
   * Returns a new object of class '<em>Field Set Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Set Function</em>'.
   * @generated
   */
  FieldSetFunction createFieldSetFunction();

  /**
   * Returns a new object of class '<em>Plant Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plant Function</em>'.
   * @generated
   */
  PlantFunction createPlantFunction();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Not Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Boolean Expression</em>'.
   * @generated
   */
  NotBooleanExpression createNotBooleanExpression();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>True Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>True Literal</em>'.
   * @generated
   */
  TrueLiteral createTrueLiteral();

  /**
   * Returns a new object of class '<em>False Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>False Literal</em>'.
   * @generated
   */
  FalseLiteral createFalseLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns a new object of class '<em>Crop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Crop</em>'.
   * @generated
   */
  Crop createCrop();

  /**
   * Returns a new object of class '<em>Crop Stages</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Crop Stages</em>'.
   * @generated
   */
  CropStages createCropStages();

  /**
   * Returns a new object of class '<em>Crop Stage</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Crop Stage</em>'.
   * @generated
   */
  CropStage createCropStage();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Call Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Attributes</em>'.
   * @generated
   */
  CallAttributes createCallAttributes();

  /**
   * Returns a new object of class '<em>Mission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mission</em>'.
   * @generated
   */
  Mission createMission();

  /**
   * Returns a new object of class '<em>Condition Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Or Expression</em>'.
   * @generated
   */
  ConditionOrExpression createConditionOrExpression();

  /**
   * Returns a new object of class '<em>Condition And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition And Expression</em>'.
   * @generated
   */
  ConditionAndExpression createConditionAndExpression();

  /**
   * Returns a new object of class '<em>Less Than Or Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less Than Or Equal</em>'.
   * @generated
   */
  LessThanOrEqual createLessThanOrEqual();

  /**
   * Returns a new object of class '<em>Less Than</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less Than</em>'.
   * @generated
   */
  LessThan createLessThan();

  /**
   * Returns a new object of class '<em>Greater Than Or Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater Than Or Equal</em>'.
   * @generated
   */
  GreaterThanOrEqual createGreaterThanOrEqual();

  /**
   * Returns a new object of class '<em>Greater Than</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greater Than</em>'.
   * @generated
   */
  GreaterThan createGreaterThan();

  /**
   * Returns a new object of class '<em>Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equal</em>'.
   * @generated
   */
  Equal createEqual();

  /**
   * Returns a new object of class '<em>Not Equal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Equal</em>'.
   * @generated
   */
  NotEqual createNotEqual();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Multiply</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiply</em>'.
   * @generated
   */
  Multiply createMultiply();

  /**
   * Returns a new object of class '<em>Divide</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Divide</em>'.
   * @generated
   */
  Divide createDivide();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FarmPackage getFarmPackage();

} //FarmFactory
