/**
 */
package istic.idm.project.videoGen.impl;

import istic.idm.project.videoGen.VideoGenPackage;
import istic.idm.project.videoGen.alternatives;
import istic.idm.project.videoGen.videoseq;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>alternatives</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link istic.idm.project.videoGen.impl.alternativesImpl#getId <em>Id</em>}</li>
 *   <li>{@link istic.idm.project.videoGen.impl.alternativesImpl#getVideoseq <em>Videoseq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class alternativesImpl extends typeImpl implements alternatives
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
   * The cached value of the '{@link #getVideoseq() <em>Videoseq</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideoseq()
   * @generated
   * @ordered
   */
  protected EList<videoseq> videoseq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected alternativesImpl()
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
    return VideoGenPackage.Literals.ALTERNATIVES;
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
      eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.ALTERNATIVES__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<videoseq> getVideoseq()
  {
    if (videoseq == null)
    {
      videoseq = new EObjectContainmentEList<videoseq>(videoseq.class, this, VideoGenPackage.ALTERNATIVES__VIDEOSEQ);
    }
    return videoseq;
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
      case VideoGenPackage.ALTERNATIVES__VIDEOSEQ:
        return ((InternalEList<?>)getVideoseq()).basicRemove(otherEnd, msgs);
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
      case VideoGenPackage.ALTERNATIVES__ID:
        return getId();
      case VideoGenPackage.ALTERNATIVES__VIDEOSEQ:
        return getVideoseq();
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
      case VideoGenPackage.ALTERNATIVES__ID:
        setId((String)newValue);
        return;
      case VideoGenPackage.ALTERNATIVES__VIDEOSEQ:
        getVideoseq().clear();
        getVideoseq().addAll((Collection<? extends videoseq>)newValue);
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
      case VideoGenPackage.ALTERNATIVES__ID:
        setId(ID_EDEFAULT);
        return;
      case VideoGenPackage.ALTERNATIVES__VIDEOSEQ:
        getVideoseq().clear();
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
      case VideoGenPackage.ALTERNATIVES__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case VideoGenPackage.ALTERNATIVES__VIDEOSEQ:
        return videoseq != null && !videoseq.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //alternativesImpl
