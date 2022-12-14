/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.NotBooleanExpression#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getNotBooleanExpression()
 * @model
 * @generated
 */
public interface NotBooleanExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Expression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getNotBooleanExpression_Exp()
   * @model containment="true"
   * @generated
   */
  Expression getExp();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.NotBooleanExpression#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Expression value);

} // NotBooleanExpression
