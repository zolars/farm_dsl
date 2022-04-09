/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.farm.farm.Entity;
import uk.ac.kcl.farm.farm.FarmPackage;
import uk.ac.kcl.farm.farm.Field;
import uk.ac.kcl.farm.farm.FieldMonitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.FieldImpl#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.FieldImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.FieldImpl#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.FieldImpl#getFieldLight <em>Field Light</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.FieldImpl#getFieldMonitors <em>Field Monitors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends ClassImpl implements Field
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected static final String FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldName() <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldName()
   * @generated
   * @ordered
   */
  protected String fieldName = FIELD_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected static final String IP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIp()
   * @generated
   * @ordered
   */
  protected String ip = IP_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldType()
   * @generated
   * @ordered
   */
  protected static final String FIELD_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldType()
   * @generated
   * @ordered
   */
  protected String fieldType = FIELD_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldLight() <em>Field Light</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldLight()
   * @generated
   * @ordered
   */
  protected static final String FIELD_LIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldLight() <em>Field Light</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldLight()
   * @generated
   * @ordered
   */
  protected String fieldLight = FIELD_LIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getFieldMonitors() <em>Field Monitors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldMonitors()
   * @generated
   * @ordered
   */
  protected EList<FieldMonitor> fieldMonitors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
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
    return FarmPackage.Literals.FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFieldName()
  {
    return fieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFieldName(String newFieldName)
  {
    String oldFieldName = fieldName;
    fieldName = newFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.FIELD__FIELD_NAME, oldFieldName, fieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIp()
  {
    return ip;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIp(String newIp)
  {
    String oldIp = ip;
    ip = newIp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.FIELD__IP, oldIp, ip));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFieldType()
  {
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFieldType(String newFieldType)
  {
    String oldFieldType = fieldType;
    fieldType = newFieldType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.FIELD__FIELD_TYPE, oldFieldType, fieldType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFieldLight()
  {
    return fieldLight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFieldLight(String newFieldLight)
  {
    String oldFieldLight = fieldLight;
    fieldLight = newFieldLight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.FIELD__FIELD_LIGHT, oldFieldLight, fieldLight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FieldMonitor> getFieldMonitors()
  {
    if (fieldMonitors == null)
    {
      fieldMonitors = new EObjectContainmentEList<FieldMonitor>(FieldMonitor.class, this, FarmPackage.FIELD__FIELD_MONITORS);
    }
    return fieldMonitors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FarmPackage.FIELD__FIELD_MONITORS:
        return ((InternalEList<?>)getFieldMonitors()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FarmPackage.FIELD__NAME:
        return getName();
      case FarmPackage.FIELD__FIELD_NAME:
        return getFieldName();
      case FarmPackage.FIELD__IP:
        return getIp();
      case FarmPackage.FIELD__FIELD_TYPE:
        return getFieldType();
      case FarmPackage.FIELD__FIELD_LIGHT:
        return getFieldLight();
      case FarmPackage.FIELD__FIELD_MONITORS:
        return getFieldMonitors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FarmPackage.FIELD__NAME:
        setName((String)newValue);
        return;
      case FarmPackage.FIELD__FIELD_NAME:
        setFieldName((String)newValue);
        return;
      case FarmPackage.FIELD__IP:
        setIp((String)newValue);
        return;
      case FarmPackage.FIELD__FIELD_TYPE:
        setFieldType((String)newValue);
        return;
      case FarmPackage.FIELD__FIELD_LIGHT:
        setFieldLight((String)newValue);
        return;
      case FarmPackage.FIELD__FIELD_MONITORS:
        getFieldMonitors().clear();
        getFieldMonitors().addAll((Collection<? extends FieldMonitor>)newValue);
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
      case FarmPackage.FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FarmPackage.FIELD__FIELD_NAME:
        setFieldName(FIELD_NAME_EDEFAULT);
        return;
      case FarmPackage.FIELD__IP:
        setIp(IP_EDEFAULT);
        return;
      case FarmPackage.FIELD__FIELD_TYPE:
        setFieldType(FIELD_TYPE_EDEFAULT);
        return;
      case FarmPackage.FIELD__FIELD_LIGHT:
        setFieldLight(FIELD_LIGHT_EDEFAULT);
        return;
      case FarmPackage.FIELD__FIELD_MONITORS:
        getFieldMonitors().clear();
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
      case FarmPackage.FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FarmPackage.FIELD__FIELD_NAME:
        return FIELD_NAME_EDEFAULT == null ? fieldName != null : !FIELD_NAME_EDEFAULT.equals(fieldName);
      case FarmPackage.FIELD__IP:
        return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
      case FarmPackage.FIELD__FIELD_TYPE:
        return FIELD_TYPE_EDEFAULT == null ? fieldType != null : !FIELD_TYPE_EDEFAULT.equals(fieldType);
      case FarmPackage.FIELD__FIELD_LIGHT:
        return FIELD_LIGHT_EDEFAULT == null ? fieldLight != null : !FIELD_LIGHT_EDEFAULT.equals(fieldLight);
      case FarmPackage.FIELD__FIELD_MONITORS:
        return fieldMonitors != null && !fieldMonitors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Entity.class)
    {
      switch (derivedFeatureID)
      {
        case FarmPackage.FIELD__NAME: return FarmPackage.ENTITY__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Entity.class)
    {
      switch (baseFeatureID)
      {
        case FarmPackage.ENTITY__NAME: return FarmPackage.FIELD__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", fieldName: ");
    result.append(fieldName);
    result.append(", ip: ");
    result.append(ip);
    result.append(", fieldType: ");
    result.append(fieldType);
    result.append(", fieldLight: ");
    result.append(fieldLight);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
