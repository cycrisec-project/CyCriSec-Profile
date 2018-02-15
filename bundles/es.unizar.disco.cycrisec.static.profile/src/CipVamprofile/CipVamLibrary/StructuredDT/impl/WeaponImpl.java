/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT.impl;

import CipVamprofile.CipVamLibrary.BasicDT.WeaponNature;

import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage;
import CipVamprofile.CipVamLibrary.StructuredDT.Weapon;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weapon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.WeaponImpl#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.WeaponImpl#getNature <em>Nature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeaponImpl extends MinimalEObjectImpl.Container implements Weapon {
	/**
	 * The default value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureRate() <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureRate()
	 * @generated
	 * @ordered
	 */
	protected String failureRate = FAILURE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final WeaponNature NATURE_EDEFAULT = WeaponNature.CHEMICAL_AGENT;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected WeaponNature nature = NATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeaponImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredDTPackage.Literals.WEAPON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailureRate() {
		return failureRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureRate(String newFailureRate) {
		String oldFailureRate = failureRate;
		failureRate = newFailureRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.WEAPON__FAILURE_RATE, oldFailureRate, failureRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeaponNature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(WeaponNature newNature) {
		WeaponNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.WEAPON__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuredDTPackage.WEAPON__FAILURE_RATE:
				return getFailureRate();
			case StructuredDTPackage.WEAPON__NATURE:
				return getNature();
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
			case StructuredDTPackage.WEAPON__FAILURE_RATE:
				setFailureRate((String)newValue);
				return;
			case StructuredDTPackage.WEAPON__NATURE:
				setNature((WeaponNature)newValue);
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
			case StructuredDTPackage.WEAPON__FAILURE_RATE:
				setFailureRate(FAILURE_RATE_EDEFAULT);
				return;
			case StructuredDTPackage.WEAPON__NATURE:
				setNature(NATURE_EDEFAULT);
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
			case StructuredDTPackage.WEAPON__FAILURE_RATE:
				return FAILURE_RATE_EDEFAULT == null ? failureRate != null : !FAILURE_RATE_EDEFAULT.equals(failureRate);
			case StructuredDTPackage.WEAPON__NATURE:
				return nature != NATURE_EDEFAULT;
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
		result.append(" (failureRate: ");
		result.append(failureRate);
		result.append(", nature: ");
		result.append(nature);
		result.append(')');
		return result.toString();
	}

} //WeaponImpl
