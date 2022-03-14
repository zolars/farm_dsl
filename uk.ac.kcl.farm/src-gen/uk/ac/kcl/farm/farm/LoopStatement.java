/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.LoopStatement#getCount <em>Count</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.LoopStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Count</em>' containment reference.
   * @see #setCount(IntExpression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getLoopStatement_Count()
   * @model containment="true"
   * @generated
   */
  IntExpression getCount();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.LoopStatement#getCount <em>Count</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Count</em>' containment reference.
   * @see #getCount()
   * @generated
   */
  void setCount(IntExpression value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.farm.farm.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getLoopStatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // LoopStatement
