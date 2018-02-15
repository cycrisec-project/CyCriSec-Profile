/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT.impl;

import CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit;

import CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular;
import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speed Angular</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.SpeedAngularImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.SpeedAngularImpl#getSpeedUnit <em>Speed Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpeedAngularImpl extends MinimalEObjectImpl.Container implements SpeedAngular {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedUnit() <em>Speed Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedUnit()
	 * @generated
	 * @ordered
	 */
	protected static final AngularSpeedUnit SPEED_UNIT_EDEFAULT = AngularSpeedUnit.DEG_PER_SEC;

	/**
	 * The cached value of the '{@link #getSpeedUnit() <em>Speed Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedUnit()
	 * @generated
	 * @ordered
	 */
	protected AngularSpeedUnit speedUnit = SPEED_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeedAngularImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredDTPackage.Literals.SPEED_ANGULAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.SPEED_ANGULAR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngularSpeedUnit getSpeedUnit() {
		return speedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedUnit(AngularSpeedUnit newSpeedUnit) {
		AngularSpeedUnit oldSpeedUnit = speedUnit;
		speedUnit = newSpeedUnit == null ? SPEED_UNIT_EDEFAULT : newSpeedUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.SPEED_ANGULAR__SPEED_UNIT, oldSpeedUnit, speedUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuredDTPackage.SPEED_ANGULAR__VALUE:
				return getValue();
			case StructuredDTPackage.SPEED_ANGULAR__SPEED_UNIT:
				return getSpeedUnit();
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
			case StructuredDTPackage.SPEED_ANGULAR__VALUE:
				setValue((String)newValue);
				return;
			case StructuredDTPackage.SPEED_ANGULAR__SPEED_UNIT:
				setSpeedUnit((AngularSpeedUnit)newValue);
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
			case StructuredDTPackage.SPEED_ANGULAR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case StructuredDTPackage.SPEED_ANGULAR__SPEED_UNIT:
				setSpeedUnit(SPEED_UNIT_EDEFAULT);
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
			case StructuredDTPackage.SPEED_ANGULAR__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case StructuredDTPackage.SPEED_ANGULAR__SPEED_UNIT:
				return speedUnit != SPEED_UNIT_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", speedUnit: ");
		result.append(speedUnit);
		result.append(')');
		return result.toString();
	}

} //SpeedAngularImpl
