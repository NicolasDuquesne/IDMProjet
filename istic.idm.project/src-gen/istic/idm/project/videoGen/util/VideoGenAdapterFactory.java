/**
 */
package istic.idm.project.videoGen.util;

import istic.idm.project.videoGen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see istic.idm.project.videoGen.VideoGenPackage
 * @generated
 */
public class VideoGenAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VideoGenPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VideoGenPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VideoGenSwitch<Adapter> modelSwitch =
    new VideoGenSwitch<Adapter>()
    {
      @Override
      public Adapter caseVideoGen(VideoGen object)
      {
        return createVideoGenAdapter();
      }
      @Override
      public Adapter casetype(type object)
      {
        return createtypeAdapter();
      }
      @Override
      public Adapter casemandatory(mandatory object)
      {
        return createmandatoryAdapter();
      }
      @Override
      public Adapter caseoptional(optional object)
      {
        return createoptionalAdapter();
      }
      @Override
      public Adapter casealternatives(alternatives object)
      {
        return createalternativesAdapter();
      }
      @Override
      public Adapter casevideoseq(videoseq object)
      {
        return createvideoseqAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link istic.idm.project.videoGen.VideoGen <em>Video Gen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.idm.project.videoGen.VideoGen
   * @generated
   */
  public Adapter createVideoGenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.idm.project.videoGen.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.idm.project.videoGen.type
   * @generated
   */
  public Adapter createtypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.idm.project.videoGen.mandatory <em>mandatory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.idm.project.videoGen.mandatory
   * @generated
   */
  public Adapter createmandatoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.idm.project.videoGen.optional <em>optional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.idm.project.videoGen.optional
   * @generated
   */
  public Adapter createoptionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.idm.project.videoGen.alternatives <em>alternatives</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.idm.project.videoGen.alternatives
   * @generated
   */
  public Adapter createalternativesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link istic.idm.project.videoGen.videoseq <em>videoseq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see istic.idm.project.videoGen.videoseq
   * @generated
   */
  public Adapter createvideoseqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VideoGenAdapterFactory
