/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.MoveFunction#getMoveFromField <em>Move From Field</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.MoveFunction#getMoveToField <em>Move To Field</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getMoveFunction()
 * @model
 * @generated
 */
public interface MoveFunction extends BuiltinFunction
{
  /**
   * Returns the value of the '<em><b>Move From Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move From Field</em>' reference.
   * @see #setMoveFromField(Field)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getMoveFunction_MoveFromField()
   * @model
   * @generated
   */
  Field getMoveFromField();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.MoveFunction#getMoveFromField <em>Move From Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Move From Field</em>' reference.
   * @see #getMoveFromField()
   * @generated
   */
  void setMoveFromField(Field value);

  /**
   * Returns the value of the '<em><b>Move To Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move To Field</em>' reference.
   * @see #setMoveToField(Field)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getMoveFunction_MoveToField()
   * @model
   * @generated
   */
  Field getMoveToField();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.MoveFunction#getMoveToField <em>Move To Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Move To Field</em>' reference.
   * @see #getMoveToField()
   * @generated
   */
  void setMoveToField(Field value);

} // MoveFunction