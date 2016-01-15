/**
 */
package playlist.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import playlist.PlaylistPackage;
import playlist.Video;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link playlist.impl.VideoImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link playlist.impl.VideoImpl#getDurationSeconds <em>Duration Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoImpl extends MinimalEObjectImpl.Container implements Video {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationSeconds() <em>Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_SECONDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDurationSeconds() <em>Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationSeconds()
	 * @generated
	 * @ordered
	 */
	protected int durationSeconds = DURATION_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlaylistPackage.Literals.VIDEO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.VIDEO__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDurationSeconds() {
		return durationSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationSeconds(int newDurationSeconds) {
		int oldDurationSeconds = durationSeconds;
		durationSeconds = newDurationSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlaylistPackage.VIDEO__DURATION_SECONDS, oldDurationSeconds, durationSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlaylistPackage.VIDEO__URI:
				return getUri();
			case PlaylistPackage.VIDEO__DURATION_SECONDS:
				return getDurationSeconds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PlaylistPackage.VIDEO__URI:
				setUri((String)newValue);
				return;
			case PlaylistPackage.VIDEO__DURATION_SECONDS:
				setDurationSeconds((Integer)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PlaylistPackage.VIDEO__URI:
				setUri(URI_EDEFAULT);
				return;
			case PlaylistPackage.VIDEO__DURATION_SECONDS:
				setDurationSeconds(DURATION_SECONDS_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PlaylistPackage.VIDEO__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case PlaylistPackage.VIDEO__DURATION_SECONDS:
				return durationSeconds != DURATION_SECONDS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(", durationSeconds: ");
		result.append(durationSeconds);
		result.append(')');
		return result.toString();
	}

} //VideoImpl
