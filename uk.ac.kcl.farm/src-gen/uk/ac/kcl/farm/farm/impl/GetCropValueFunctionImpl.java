/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.farm.farm.Crop;
import uk.ac.kcl.farm.farm.FarmPackage;
import uk.ac.kcl.farm.farm.GetCropValueFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Crop Value Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.GetCropValueFunctionImpl#getGetValueCrop <em>Get Value Crop</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.GetCropValueFunctionImpl#getGetCropAttribute <em>Get Crop Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetCropValueFunctionImpl extends BuiltinFunctionImpl implements GetCropValueFunction
{
  /**
   * The cached value of the '{@link #getGetValueCrop() <em>Get Value Crop</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetValueCrop()
   * @generated
   * @ordered
   */
  protected Crop getValueCrop;

  /**
   * The default value of the '{@link #getGetCropAttribute() <em>Get Crop Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetCropAttribute()
   * @generated
   * @ordered
   */
  protected static final String GET_CROP_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGetCropAttribute() <em>Get Crop Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetCropAttribute()
   * @generated
   * @ordered
   */
  protected String getCropAttribute = GET_CROP_ATTRIBUTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetCropValueFunctionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FarmPackage.Literals.GET_CROP_VALUE_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Crop getGetValueCrop()
  {
    if (getValueCrop != null && getValueCrop.eIsProxy())
    {
      InternalEObject oldGetValueCrop = (InternalEObject)getValueCrop;
      getValueCrop = (Crop)eResolveProxy(oldGetValueCrop);
      if (getValueCrop != oldGetValueCrop)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FarmPackage.GET_CROP_VALUE_FUNCTION__GET_VALUE_CROP, oldGetValueCrop, getValueCrop));
      }
    }
    return getValueCrop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Crop basicGetGetValueCrop()
  {
    return getValueCrop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGetValueCrop(Crop newGetValueCrop)
  {
    Crop oldGetValueCrop = getValueCrop;
    getValueCrop = newGetValueCrop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.GET_CROP_VALUE_FUNCTION__GET_VALUE_CROP, oldGetValueCrop, getValueCrop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getGetCropAttribute()
  {
    return getCropAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGetCropAttribute(String newGetCropAttribute)
  {
    String oldGetCropAttribute = getCropAttribute;
    getCropAttribute = newGetCropAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.GET_CROP_VALUE_FUNCTION__GET_CROP_ATTRIBUTE, oldGetCropAttribute, getCropAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FarmPackage.GET_CROP_VALUE_FUNCTION__GET_VALUE_CROP:
        if (resolve) return getGetValueCrop();
        return basicGetGetValueCrop();
      case FarmPackage.GET_CROP_VALUE_FUNCTION__GET_CROP_ATTRIBUTE:
        return getGetCropAttribute();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FarmPackage.GET_CROP_VALUE_FUNCTION__GET_VALUE_CROP:
        setGetValueCrop((Crop)newValue);
        return;
      case FarmPackage.GET_CROP_VALUE_FUNCTION__GET_CROP_ATTRIBUTE:
        setGetCropAttribute((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FarmPackage.GET_CROP_VALUE_FUNCTION__GET_VALUE_CROP:
        setGetValueCrop((Crop)null);
        return;
      case FarmPackage.GET_CROP_VALUE_FUNCTION__GET_CROP_ATTRIBUTE:
        setGetCropAttribute(GET_CROP_ATTRIBUTE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FarmPackage.GET_CROP_VALUE_FUNCTION__GET_VALUE_CROP:
        return getValueCrop != null;
      case FarmPackage.GET_CROP_VALUE_FUNCTION__GET_CROP_ATTRIBUTE:
        return GET_CROP_ATTRIBUTE_EDEFAULT == null ? getCropAttribute != null : !GET_CROP_ATTRIBUTE_EDEFAULT.equals(getCropAttribute);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (getCropAttribute: ");
    result.append(getCropAttribute);
    result.append(')');
    return result.toString();
  }

} //GetCropValueFunctionImpl
