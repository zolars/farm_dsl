/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>False Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.FalseLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getFalseLiteral()
 * @model
 * @generated
 */
public interface FalseLiteral extends Literal
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getFalseLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.FalseLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // FalseLiteral