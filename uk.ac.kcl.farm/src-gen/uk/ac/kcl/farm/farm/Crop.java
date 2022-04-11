/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.Crop#getCropName <em>Crop Name</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.Crop#getCropStages <em>Crop Stages</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getCrop()
 * @model
 * @generated
 */
public interface Crop extends Instance
{
  /**
   * Returns the value of the '<em><b>Crop Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Crop Name</em>' attribute.
   * @see #setCropName(String)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCrop_CropName()
   * @model
   * @generated
   */
  String getCropName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.Crop#getCropName <em>Crop Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Crop Name</em>' attribute.
   * @see #getCropName()
   * @generated
   */
  void setCropName(String value);

  /**
   * Returns the value of the '<em><b>Crop Stages</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.farm.farm.CropStages}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Crop Stages</em>' containment reference list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCrop_CropStages()
   * @model containment="true"
   * @generated
   */
  EList<CropStages> getCropStages();

} // Crop
