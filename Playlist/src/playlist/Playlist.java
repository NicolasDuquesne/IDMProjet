/**
 */
package playlist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playlist</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link playlist.Playlist#getListVideo <em>List Video</em>}</li>
 *   <li>{@link playlist.Playlist#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see playlist.PlaylistPackage#getPlaylist()
 * @model
 * @generated
 */
public interface Playlist extends EObject {
	/**
	 * Returns the value of the '<em><b>List Video</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Video</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Video</em>' attribute.
	 * @see #setListVideo(EList)
	 * @see playlist.PlaylistPackage#getPlaylist_ListVideo()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList getListVideo();

	/**
	 * Sets the value of the '{@link playlist.Playlist#getListVideo <em>List Video</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Video</em>' attribute.
	 * @see #getListVideo()
	 * @generated
	 */
	void setListVideo(EList value);

	/**
	 * Returns the value of the '<em><b>Video</b></em>' containment reference list.
	 * The list contents are of type {@link playlist.Video}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' containment reference list.
	 * @see playlist.PlaylistPackage#getPlaylist_Video()
	 * @model containment="true"
	 * @generated
	 */
	EList<Video> getVideo();

} // Playlist
