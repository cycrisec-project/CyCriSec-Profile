/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT.impl;

import CipVamprofile.CipVamLibrary.StructuredDT.*;

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
public class StructuredDTFactoryImpl extends EFactoryImpl implements StructuredDTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructuredDTFactory init() {
		try {
			StructuredDTFactory theStructuredDTFactory = (StructuredDTFactory)EPackage.Registry.INSTANCE.getEFactory(StructuredDTPackage.eNS_URI);
			if (theStructuredDTFactory != null) {
				return theStructuredDTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructuredDTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructuredDTPackage.ASSET: return createAsset();
			case StructuredDTPackage.IMPAIRMENT: return createImpairment();
			case StructuredDTPackage.THREAT: return createThreat();
			case StructuredDTPackage.WEAPON: return createWeapon();
			case StructuredDTPackage.APPLICATION: return createApplication();
			case StructuredDTPackage.SPEED_ANGULAR: return createSpeedAngular();
			case StructuredDTPackage.ZOOM: return createZoom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Impairment createImpairment() {
		ImpairmentImpl impairment = new ImpairmentImpl();
		return impairment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat createThreat() {
		ThreatImpl threat = new ThreatImpl();
		return threat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weapon createWeapon() {
		WeaponImpl weapon = new WeaponImpl();
		return weapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedAngular createSpeedAngular() {
		SpeedAngularImpl speedAngular = new SpeedAngularImpl();
		return speedAngular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zoom createZoom() {
		ZoomImpl zoom = new ZoomImpl();
		return zoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDTPackage getStructuredDTPackage() {
		return (StructuredDTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructuredDTPackage getPackage() {
		return StructuredDTPackage.eINSTANCE;
	}

} //StructuredDTFactoryImpl
