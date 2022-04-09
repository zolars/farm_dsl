/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.ConditionAndExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.ConditionAndExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getConditionAndExpression()
 * @model
 * @generated
 */
public interface ConditionAndExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getConditionAndExpression_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.ConditionAndExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getConditionAndExpression_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.ConditionAndExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // ConditionAndExpression
