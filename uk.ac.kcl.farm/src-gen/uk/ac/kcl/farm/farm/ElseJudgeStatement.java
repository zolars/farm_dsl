/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Else Judge Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.ElseJudgeStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.ElseJudgeStatement#getElseJudgeStatements <em>Else Judge Statements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getElseJudgeStatement()
 * @model
 * @generated
 */
public interface ElseJudgeStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getElseJudgeStatement_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.ElseJudgeStatement#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Else Judge Statements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.farm.farm.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Judge Statements</em>' containment reference list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getElseJudgeStatement_ElseJudgeStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getElseJudgeStatements();

} // ElseJudgeStatement
