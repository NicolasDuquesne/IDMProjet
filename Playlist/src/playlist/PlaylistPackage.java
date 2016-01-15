/**
 */
package playlist;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see playlist.PlaylistFactory
 * @model kind="package"
 * @generated
 */
public interface PlaylistPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "playlist";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/playlist";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "playlist";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlaylistPackage eINSTANCE = playlist.impl.PlaylistPackageImpl.init();

	/**
	 * The meta object id for the '{@link playlist.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.VideoImpl
	 * @see playlist.impl.PlaylistPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URI = 0;

	/**
	 * The feature id for the '<em><b>Duration Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DURATION_SECONDS = 1;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link playlist.impl.PlaylistImpl <em>Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see playlist.impl.PlaylistImpl
	 * @see playlist.impl.PlaylistPackageImpl#getPlaylist()
	 * @generated
	 */
	int PLAYLIST = 1;

	/**
	 * The feature id for the '<em><b>List Video</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__LIST_VIDEO = 0;

	/**
	 * The feature id for the '<em><b>Video</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST__VIDEO = 1;

	/**
	 * The number of structural features of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYLIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link playlist.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see playlist.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for the attribute '{@link playlist.Video#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see playlist.Video#getUri()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_Uri();

	/**
	 * Returns the meta object for the attribute '{@link playlist.Video#getDurationSeconds <em>Duration Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration Seconds</em>'.
	 * @see playlist.Video#getDurationSeconds()
	 * @see #getVideo()
	 * @generated
	 */
	EAttribute getVideo_DurationSeconds();

	/**
	 * Returns the meta object for class '{@link playlist.Playlist <em>Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playlist</em>'.
	 * @see playlist.Playlist
	 * @generated
	 */
	EClass getPlaylist();

	/**
	 * Returns the meta object for the attribute '{@link playlist.Playlist#getListVideo <em>List Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Video</em>'.
	 * @see playlist.Playlist#getListVideo()
	 * @see #getPlaylist()
	 * @generated
	 */
	EAttribute getPlaylist_ListVideo();

	/**
	 * Returns the meta object for the containment reference list '{@link playlist.Playlist#getVideo <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video</em>'.
	 * @see playlist.Playlist#getVideo()
	 * @see #getPlaylist()
	 * @generated
	 */
	EReference getPlaylist_Video();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlaylistFactory getPlaylistFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link playlist.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.VideoImpl
		 * @see playlist.impl.PlaylistPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__URI = eINSTANCE.getVideo_Uri();

		/**
		 * The meta object literal for the '<em><b>Duration Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO__DURATION_SECONDS = eINSTANCE.getVideo_DurationSeconds();

		/**
		 * The meta object literal for the '{@link playlist.impl.PlaylistImpl <em>Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see playlist.impl.PlaylistImpl
		 * @see playlist.impl.PlaylistPackageImpl#getPlaylist()
		 * @generated
		 */
		EClass PLAYLIST = eINSTANCE.getPlaylist();

		/**
		 * The meta object literal for the '<em><b>List Video</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYLIST__LIST_VIDEO = eINSTANCE.getPlaylist_ListVideo();

		/**
		 * The meta object literal for the '<em><b>Video</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYLIST__VIDEO = eINSTANCE.getPlaylist_Video();

	}

} //PlaylistPackage
