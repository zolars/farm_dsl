/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Field Value Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.SetFieldValueFunction#getSetValueField <em>Set Value Field</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.SetFieldValueFunction#getSetFieldAttribute <em>Set Field Attribute</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.SetFieldValueFunction#getSetFieldValue <em>Set Field Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getSetFieldValueFunction()
 * @model
 * @generated
 */
public interface SetFieldValueFunction extends BuiltinFunction
{
  /**
   * Returns the value of the '<em><b>Set Value Field</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Value Field</em>' reference.
   * @see #setSetValueField(Field)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getSetFieldValueFunction_SetValueField()
   * @model
   * @generated
   */
  Field getSetValueField();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.SetFieldValueFunction#getSetValueField <em>Set Value Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Value Field</em>' reference.
   * @see #getSetValueField()
   * @generated
   */
  void setSetValueField(Field value);

  /**
   * Returns the value of the '<em><b>Set Field Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Field Attribute</em>' attribute.
   * @see #setSetFieldAttribute(String)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getSetFieldValueFunction_SetFieldAttribute()
   * @model
   * @generated
   */
  String getSetFieldAttribute();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.SetFieldValueFunction#getSetFieldAttribute <em>Set Field Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Field Attribute</em>' attribute.
   * @see #getSetFieldAttribute()
   * @generated
   */
  void setSetFieldAttribute(String value);

  /**
   * Returns the value of the '<em><b>Set Field Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Field Value</em>' containment reference.
   * @see #setSetFieldValue(Expression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getSetFieldValueFunction_SetFieldValue()
   * @model containment="true"
   * @generated
   */
  Expression getSetFieldValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.SetFieldValueFunction#getSetFieldValue <em>Set Field Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Field Value</em>' containment reference.
   * @see #getSetFieldValue()
   * @generated
   */
  void setSetFieldValue(Expression value);

} // SetFieldValueFunction