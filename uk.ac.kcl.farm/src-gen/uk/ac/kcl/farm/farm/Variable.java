/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.Variable#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Statement, Instance
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ExpressionOrCall)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getVariable_Expression()
   * @model containment="true"
   * @generated
   */
  ExpressionOrCall getExpression();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.Variable#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ExpressionOrCall value);

} // Variable
