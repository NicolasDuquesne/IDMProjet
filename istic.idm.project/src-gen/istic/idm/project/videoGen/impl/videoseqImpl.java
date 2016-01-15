/**
 */
package istic.idm.project.videoGen.impl;

import istic.idm.project.videoGen.VideoGenPackage;
import istic.idm.project.videoGen.videoseq;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>videoseq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istic.idm.project.videoGen.impl.videoseqImpl#getId <em>Id</em>}</li>
 *   <li>{@link istic.idm.project.videoGen.impl.videoseqImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class videoseqImpl extends mandatoryImpl implements videoseq
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected videoseqImpl()
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
    return VideoGenPackage.Literals.VIDEOSEQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEOSEQ__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.VIDEOSEQ__TEXT, oldText, text));
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
      case VideoGenPackage.VIDEOSEQ__ID:
        return getId();
      case VideoGenPackage.VIDEOSEQ__TEXT:
        return getText();
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
      case VideoGenPackage.VIDEOSEQ__ID:
        setId((String)newValue);
        return;
      case VideoGenPackage.VIDEOSEQ__TEXT:
        setText((String)newValue);
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
      case VideoGenPackage.VIDEOSEQ__ID:
        setId(ID_EDEFAULT);
        return;
      case VideoGenPackage.VIDEOSEQ__TEXT:
        setText(TEXT_EDEFAULT);
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
      case VideoGenPackage.VIDEOSEQ__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case VideoGenPackage.VIDEOSEQ__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", text: ");
    result.append(text);
    result.append(')');
    return result.toString();
  }

} //videoseqImpl
