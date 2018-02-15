/**
 */
package CipVamprofile.impl;

import CipVamprofile.Barrier;
import CipVamprofile.CipVamprofilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Barrier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.BarrierImpl#getTimeToCross <em>Time To Cross</em>}</li>
 *   <li>{@link CipVamprofile.impl.BarrierImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BarrierImpl extends EquipmentImpl implements Barrier {
	/**
	 * The default value of the '{@link #getTimeToCross() <em>Time To Cross</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToCross()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_TO_CROSS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeToCross() <em>Time To Cross</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToCross()
	 * @generated
	 * @ordered
	 */
	protected String timeToCross = TIME_TO_CROSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarrierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.BARRIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeToCross() {
		return timeToCross;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToCross(String newTimeToCross) {
		String oldTimeToCross = timeToCross;
		timeToCross = newTimeToCross;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.BARRIER__TIME_TO_CROSS, oldTimeToCross, timeToCross));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.BARRIER__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.BARRIER__TIME_TO_CROSS:
				return getTimeToCross();
			case CipVamprofilePackage.BARRIER__CONDITION:
				return getCondition();
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
			case CipVamprofilePackage.BARRIER__TIME_TO_CROSS:
				setTimeToCross((String)newValue);
				return;
			case CipVamprofilePackage.BARRIER__CONDITION:
				setCondition((String)newValue);
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
			case CipVamprofilePackage.BARRIER__TIME_TO_CROSS:
				setTimeToCross(TIME_TO_CROSS_EDEFAULT);
				return;
			case CipVamprofilePackage.BARRIER__CONDITION:
				setCondition(CONDITION_EDEFAULT);
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
			case CipVamprofilePackage.BARRIER__TIME_TO_CROSS:
				return TIME_TO_CROSS_EDEFAULT == null ? timeToCross != null : !TIME_TO_CROSS_EDEFAULT.equals(timeToCross);
			case CipVamprofilePackage.BARRIER__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
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
		result.append(" (timeToCross: ");
		result.append(timeToCross);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //BarrierImpl
