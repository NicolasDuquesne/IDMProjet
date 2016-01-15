/**
 */
package playlist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link playlist.Video#getUri <em>Uri</em>}</li>
 *   <li>{@link playlist.Video#getDurationSeconds <em>Duration Seconds</em>}</li>
 * </ul>
 *
 * @see playlist.PlaylistPackage#getVideo()
 * @model
 * @generated
 */
public interface Video extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see playlist.PlaylistPackage#getVideo_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link playlist.Video#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Duration Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Seconds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Seconds</em>' attribute.
	 * @see #setDurationSeconds(int)
	 * @see playlist.PlaylistPackage#getVideo_DurationSeconds()
	 * @model
	 * @generated
	 */
	int getDurationSeconds();

	/**
	 * Sets the value of the '{@link playlist.Video#getDurationSeconds <em>Duration Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Seconds</em>' attribute.
	 * @see #getDurationSeconds()
	 * @generated
	 */
	void setDurationSeconds(int value);

} // Video
