/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.AndExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.AndExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.AndExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getAndExpression()
 * @model
 * @generated
 */
public interface AndExpression extends ConditionExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ConditionExpression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getAndExpression_Left()
   * @model containment="true"
   * @generated
   */
  ConditionExpression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.AndExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ConditionExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getAndExpression_Operator()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperator();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.farm.farm.ConditionExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getAndExpression_Right()
   * @model containment="true"
   * @generated
   */
  EList<ConditionExpression> getRight();

} // AndExpression
