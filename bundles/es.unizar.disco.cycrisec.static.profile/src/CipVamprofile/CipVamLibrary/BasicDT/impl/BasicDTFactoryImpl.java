/**
 */
package CipVamprofile.CipVamLibrary.BasicDT.impl;

import CipVamprofile.CipVamLibrary.BasicDT.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class BasicDTFactoryImpl extends EFactoryImpl implements BasicDTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasicDTFactory init() {
		try {
			BasicDTFactory theBasicDTFactory = (BasicDTFactory)EPackage.Registry.INSTANCE.getEFactory(BasicDTPackage.eNS_URI);
			if (theBasicDTFactory != null) {
				return theBasicDTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasicDTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDTFactoryImpl() {
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
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BasicDTPackage.RISK_LEVEL:
				return createRiskLevelFromString(eDataType, initialValue);
			case BasicDTPackage.TACTIC:
				return createTacticFromString(eDataType, initialValue);
			case BasicDTPackage.LEVEL:
				return createLevelFromString(eDataType, initialValue);
			case BasicDTPackage.WEAPON_NATURE:
				return createWeaponNatureFromString(eDataType, initialValue);
			case BasicDTPackage.ACTION_KIND:
				return createActionKindFromString(eDataType, initialValue);
			case BasicDTPackage.STEP_KIND:
				return createStepKindFromString(eDataType, initialValue);
			case BasicDTPackage.PROTECTION_NATURE:
				return createProtectionNatureFromString(eDataType, initialValue);
			case BasicDTPackage.TRANSMISSION_TECH:
				return createTransmissionTechFromString(eDataType, initialValue);
			case BasicDTPackage.PROCESSING_TYPE:
				return createProcessingTypeFromString(eDataType, initialValue);
			case BasicDTPackage.ANGULAR_SPEED_UNIT:
				return createAngularSpeedUnitFromString(eDataType, initialValue);
			case BasicDTPackage.ANGULAR_UNIT_KIND:
				return createAngularUnitKindFromString(eDataType, initialValue);
			case BasicDTPackage.ZOOM_TYPE:
				return createZoomTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BasicDTPackage.RISK_LEVEL:
				return convertRiskLevelToString(eDataType, instanceValue);
			case BasicDTPackage.TACTIC:
				return convertTacticToString(eDataType, instanceValue);
			case BasicDTPackage.LEVEL:
				return convertLevelToString(eDataType, instanceValue);
			case BasicDTPackage.WEAPON_NATURE:
				return convertWeaponNatureToString(eDataType, instanceValue);
			case BasicDTPackage.ACTION_KIND:
				return convertActionKindToString(eDataType, instanceValue);
			case BasicDTPackage.STEP_KIND:
				return convertStepKindToString(eDataType, instanceValue);
			case BasicDTPackage.PROTECTION_NATURE:
				return convertProtectionNatureToString(eDataType, instanceValue);
			case BasicDTPackage.TRANSMISSION_TECH:
				return convertTransmissionTechToString(eDataType, instanceValue);
			case BasicDTPackage.PROCESSING_TYPE:
				return convertProcessingTypeToString(eDataType, instanceValue);
			case BasicDTPackage.ANGULAR_SPEED_UNIT:
				return convertAngularSpeedUnitToString(eDataType, instanceValue);
			case BasicDTPackage.ANGULAR_UNIT_KIND:
				return convertAngularUnitKindToString(eDataType, instanceValue);
			case BasicDTPackage.ZOOM_TYPE:
				return convertZoomTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel createRiskLevelFromString(EDataType eDataType, String initialValue) {
		RiskLevel result = RiskLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tactic createTacticFromString(EDataType eDataType, String initialValue) {
		Tactic result = Tactic.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTacticToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level createLevelFromString(EDataType eDataType, String initialValue) {
		Level result = Level.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeaponNature createWeaponNatureFromString(EDataType eDataType, String initialValue) {
		WeaponNature result = WeaponNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeaponNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionKind createActionKindFromString(EDataType eDataType, String initialValue) {
		ActionKind result = ActionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind createStepKindFromString(EDataType eDataType, String initialValue) {
		StepKind result = StepKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtectionNature createProtectionNatureFromString(EDataType eDataType, String initialValue) {
		ProtectionNature result = ProtectionNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtectionNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionTech createTransmissionTechFromString(EDataType eDataType, String initialValue) {
		TransmissionTech result = TransmissionTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmissionTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingType createProcessingTypeFromString(EDataType eDataType, String initialValue) {
		ProcessingType result = ProcessingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularSpeedUnit createAngularSpeedUnitFromString(EDataType eDataType, String initialValue) {
		AngularSpeedUnit result = AngularSpeedUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngularSpeedUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularUnitKind createAngularUnitKindFromString(EDataType eDataType, String initialValue) {
		AngularUnitKind result = AngularUnitKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngularUnitKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoomType createZoomTypeFromString(EDataType eDataType, String initialValue) {
		ZoomType result = ZoomType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertZoomTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDTPackage getBasicDTPackage() {
		return (BasicDTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BasicDTPackage getPackage() {
		return BasicDTPackage.eINSTANCE;
	}

} //BasicDTFactoryImpl
