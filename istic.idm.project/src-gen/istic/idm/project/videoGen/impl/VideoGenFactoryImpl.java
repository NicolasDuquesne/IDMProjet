/**
 */
package istic.idm.project.videoGen.impl;

import istic.idm.project.videoGen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenFactoryImpl extends EFactoryImpl implements VideoGenFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VideoGenFactory init()
  {
    try
    {
      VideoGenFactory theVideoGenFactory = (VideoGenFactory)EPackage.Registry.INSTANCE.getEFactory(VideoGenPackage.eNS_URI);
      if (theVideoGenFactory != null)
      {
        return theVideoGenFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VideoGenFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VideoGenPackage.VIDEO_GEN: return createVideoGen();
      case VideoGenPackage.TYPE: return createtype();
      case VideoGenPackage.MANDATORY: return createmandatory();
      case VideoGenPackage.OPTIONAL: return createoptional();
      case VideoGenPackage.ALTERNATIVES: return createalternatives();
      case VideoGenPackage.VIDEOSEQ: return createvideoseq();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGen createVideoGen()
  {
    VideoGenImpl videoGen = new VideoGenImpl();
    return videoGen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mandatory createmandatory()
  {
    mandatoryImpl mandatory = new mandatoryImpl();
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public optional createoptional()
  {
    optionalImpl optional = new optionalImpl();
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public alternatives createalternatives()
  {
    alternativesImpl alternatives = new alternativesImpl();
    return alternatives;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public videoseq createvideoseq()
  {
    videoseqImpl videoseq = new videoseqImpl();
    return videoseq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenPackage getVideoGenPackage()
  {
    return (VideoGenPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VideoGenPackage getPackage()
  {
    return VideoGenPackage.eINSTANCE;
  }

} //VideoGenFactoryImpl
