/**
 */
package CipVamprofile.CipVamLibrary.BasicDT;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see CipVamprofile.CipVamLibrary.BasicDT.BasicDTFactory
 * @model kind="package"
 * @generated
 */
public interface BasicDTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BasicDT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CipVamprofile/CipVamLibrary/BasicDT.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CipVamprofile.CipVamLibrary.BasicDT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BasicDTPackage eINSTANCE = CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl.init();

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.RiskLevel <em>Risk Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.RiskLevel
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getRiskLevel()
	 * @generated
	 */
	int RISK_LEVEL = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.Tactic <em>Tactic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Tactic
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getTactic()
	 * @generated
	 */
	int TACTIC = 1;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 2;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.WeaponNature <em>Weapon Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.WeaponNature
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getWeaponNature()
	 * @generated
	 */
	int WEAPON_NATURE = 3;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.ActionKind <em>Action Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ActionKind
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getActionKind()
	 * @generated
	 */
	int ACTION_KIND = 4;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.StepKind <em>Step Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.StepKind
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getStepKind()
	 * @generated
	 */
	int STEP_KIND = 5;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature <em>Protection Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getProtectionNature()
	 * @generated
	 */
	int PROTECTION_NATURE = 6;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech <em>Transmission Tech</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getTransmissionTech()
	 * @generated
	 */
	int TRANSMISSION_TECH = 7;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.ProcessingType <em>Processing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ProcessingType
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getProcessingType()
	 * @generated
	 */
	int PROCESSING_TYPE = 8;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit <em>Angular Speed Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getAngularSpeedUnit()
	 * @generated
	 */
	int ANGULAR_SPEED_UNIT = 9;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind <em>Angular Unit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getAngularUnitKind()
	 * @generated
	 */
	int ANGULAR_UNIT_KIND = 10;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.BasicDT.ZoomType <em>Zoom Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ZoomType
	 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getZoomType()
	 * @generated
	 */
	int ZOOM_TYPE = 11;


	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.RiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Level</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.RiskLevel
	 * @generated
	 */
	EEnum getRiskLevel();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.Tactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tactic</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Tactic
	 * @generated
	 */
	EEnum getTactic();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.WeaponNature <em>Weapon Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weapon Nature</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.WeaponNature
	 * @generated
	 */
	EEnum getWeaponNature();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.ActionKind <em>Action Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Kind</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ActionKind
	 * @generated
	 */
	EEnum getActionKind();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.StepKind <em>Step Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Step Kind</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.StepKind
	 * @generated
	 */
	EEnum getStepKind();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature <em>Protection Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protection Nature</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature
	 * @generated
	 */
	EEnum getProtectionNature();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech <em>Transmission Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transmission Tech</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech
	 * @generated
	 */
	EEnum getTransmissionTech();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.ProcessingType <em>Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Type</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ProcessingType
	 * @generated
	 */
	EEnum getProcessingType();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit <em>Angular Speed Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Angular Speed Unit</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit
	 * @generated
	 */
	EEnum getAngularSpeedUnit();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind <em>Angular Unit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Angular Unit Kind</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind
	 * @generated
	 */
	EEnum getAngularUnitKind();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.BasicDT.ZoomType <em>Zoom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Zoom Type</em>'.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ZoomType
	 * @generated
	 */
	EEnum getZoomType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BasicDTFactory getBasicDTFactory();

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
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.RiskLevel <em>Risk Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.RiskLevel
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getRiskLevel()
		 * @generated
		 */
		EEnum RISK_LEVEL = eINSTANCE.getRiskLevel();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.Tactic <em>Tactic</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.Tactic
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getTactic()
		 * @generated
		 */
		EEnum TACTIC = eINSTANCE.getTactic();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.WeaponNature <em>Weapon Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.WeaponNature
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getWeaponNature()
		 * @generated
		 */
		EEnum WEAPON_NATURE = eINSTANCE.getWeaponNature();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.ActionKind <em>Action Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.ActionKind
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getActionKind()
		 * @generated
		 */
		EEnum ACTION_KIND = eINSTANCE.getActionKind();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.StepKind <em>Step Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.StepKind
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getStepKind()
		 * @generated
		 */
		EEnum STEP_KIND = eINSTANCE.getStepKind();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature <em>Protection Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getProtectionNature()
		 * @generated
		 */
		EEnum PROTECTION_NATURE = eINSTANCE.getProtectionNature();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech <em>Transmission Tech</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getTransmissionTech()
		 * @generated
		 */
		EEnum TRANSMISSION_TECH = eINSTANCE.getTransmissionTech();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.ProcessingType <em>Processing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.ProcessingType
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getProcessingType()
		 * @generated
		 */
		EEnum PROCESSING_TYPE = eINSTANCE.getProcessingType();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit <em>Angular Speed Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getAngularSpeedUnit()
		 * @generated
		 */
		EEnum ANGULAR_SPEED_UNIT = eINSTANCE.getAngularSpeedUnit();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind <em>Angular Unit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getAngularUnitKind()
		 * @generated
		 */
		EEnum ANGULAR_UNIT_KIND = eINSTANCE.getAngularUnitKind();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.BasicDT.ZoomType <em>Zoom Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.BasicDT.ZoomType
		 * @see CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl#getZoomType()
		 * @generated
		 */
		EEnum ZOOM_TYPE = eINSTANCE.getZoomType();

	}

} //BasicDTPackage
