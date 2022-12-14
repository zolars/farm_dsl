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
import uk.ac.kcl.farm.farm.HarvestFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Harvest Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.HarvestFunctionImpl#getCrop <em>Crop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HarvestFunctionImpl extends BuiltinFunctionImpl implements HarvestFunction
{
  /**
   * The cached value of the '{@link #getCrop() <em>Crop</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrop()
   * @generated
   * @ordered
   */
  protected Crop crop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HarvestFunctionImpl()
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
    return FarmPackage.Literals.HARVEST_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Crop getCrop()
  {
    if (crop != null && crop.eIsProxy())
    {
      InternalEObject oldCrop = (InternalEObject)crop;
      crop = (Crop)eResolveProxy(oldCrop);
      if (crop != oldCrop)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FarmPackage.HARVEST_FUNCTION__CROP, oldCrop, crop));
      }
    }
    return crop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Crop basicGetCrop()
  {
    return crop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCrop(Crop newCrop)
  {
    Crop oldCrop = crop;
    crop = newCrop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.HARVEST_FUNCTION__CROP, oldCrop, crop));
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
      case FarmPackage.HARVEST_FUNCTION__CROP:
        if (resolve) return getCrop();
        return basicGetCrop();
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
      case FarmPackage.HARVEST_FUNCTION__CROP:
        setCrop((Crop)newValue);
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
      case FarmPackage.HARVEST_FUNCTION__CROP:
        setCrop((Crop)null);
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
      case FarmPackage.HARVEST_FUNCTION__CROP:
        return crop != null;
    }
    return super.eIsSet(featureID);
  }

} //HarvestFunctionImpl
