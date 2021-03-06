/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT.util;

import CipVamprofile.CipVamLibrary.StructuredDT.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage
 * @generated
 */
public class StructuredDTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructuredDTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StructuredDTPackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
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
	protected StructuredDTSwitch<Adapter> modelSwitch =
		new StructuredDTSwitch<Adapter>() {
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseImpairment(Impairment object) {
				return createImpairmentAdapter();
			}
			@Override
			public Adapter caseThreat(Threat object) {
				return createThreatAdapter();
			}
			@Override
			public Adapter caseWeapon(Weapon object) {
				return createWeaponAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseSpeedAngular(SpeedAngular object) {
				return createSpeedAngularAdapter();
			}
			@Override
			public Adapter caseZoom(Zoom object) {
				return createZoomAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment <em>Impairment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Impairment
	 * @generated
	 */
	public Adapter createImpairmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Threat
	 * @generated
	 */
	public Adapter createThreatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Weapon
	 * @generated
	 */
	public Adapter createWeaponAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular <em>Speed Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular
	 * @generated
	 */
	public Adapter createSpeedAngularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Zoom
	 * @generated
	 */
	public Adapter createZoomAdapter() {
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
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StructuredDTAdapterFactory
