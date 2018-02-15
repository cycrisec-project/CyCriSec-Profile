/**
 */
package CipVamprofile.impl;

import CipVamprofile.Attack;
import CipVamprofile.Attacker;

import CipVamprofile.CipVamLibrary.BasicDT.Tactic;

import CipVamprofile.CipVamLibrary.StructuredDT.Threat;

import CipVamprofile.CipVamprofilePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.AttackImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link CipVamprofile.impl.AttackImpl#getTactic <em>Tactic</em>}</li>
 *   <li>{@link CipVamprofile.impl.AttackImpl#getThreats <em>Threats</em>}</li>
 *   <li>{@link CipVamprofile.impl.AttackImpl#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link CipVamprofile.impl.AttackImpl#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link CipVamprofile.impl.AttackImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackImpl extends MinimalEObjectImpl.Container implements Attack {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTactic() <em>Tactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTactic()
	 * @generated
	 * @ordered
	 */
	protected static final Tactic TACTIC_EDEFAULT = Tactic.ARMED_ATTACK;

	/**
	 * The cached value of the '{@link #getTactic() <em>Tactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTactic()
	 * @generated
	 * @ordered
	 */
	protected Tactic tactic = TACTIC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThreats() <em>Threats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreats()
	 * @generated
	 * @ordered
	 */
	protected Threat threats;

	/**
	 * The cached value of the '{@link #getAttacker() <em>Attacker</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacker()
	 * @generated
	 * @ordered
	 */
	protected EList<Attacker> attacker;

	/**
	 * The cached value of the '{@link #getBase_Activity() <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Activity()
	 * @generated
	 * @ordered
	 */
	protected Activity base_Activity;

	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase base_UseCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.ATTACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACK__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tactic getTactic() {
		return tactic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTactic(Tactic newTactic) {
		Tactic oldTactic = tactic;
		tactic = newTactic == null ? TACTIC_EDEFAULT : newTactic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACK__TACTIC, oldTactic, tactic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threat getThreats() {
		return threats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThreats(Threat newThreats, NotificationChain msgs) {
		Threat oldThreats = threats;
		threats = newThreats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACK__THREATS, oldThreats, newThreats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreats(Threat newThreats) {
		if (newThreats != threats) {
			NotificationChain msgs = null;
			if (threats != null)
				msgs = ((InternalEObject)threats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.ATTACK__THREATS, null, msgs);
			if (newThreats != null)
				msgs = ((InternalEObject)newThreats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.ATTACK__THREATS, null, msgs);
			msgs = basicSetThreats(newThreats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACK__THREATS, newThreats, newThreats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attacker> getAttacker() {
		if (attacker == null) {
			attacker = new EObjectResolvingEList<Attacker>(Attacker.class, this, CipVamprofilePackage.ATTACK__ATTACKER);
		}
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getBase_Activity() {
		if (base_Activity != null && base_Activity.eIsProxy()) {
			InternalEObject oldBase_Activity = (InternalEObject)base_Activity;
			base_Activity = (Activity)eResolveProxy(oldBase_Activity);
			if (base_Activity != oldBase_Activity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CipVamprofilePackage.ATTACK__BASE_ACTIVITY, oldBase_Activity, base_Activity));
			}
		}
		return base_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetBase_Activity() {
		return base_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Activity(Activity newBase_Activity) {
		Activity oldBase_Activity = base_Activity;
		base_Activity = newBase_Activity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACK__BASE_ACTIVITY, oldBase_Activity, base_Activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CipVamprofilePackage.ATTACK__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_UseCase(UseCase newBase_UseCase) {
		UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACK__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CipVamprofilePackage.ATTACK__THREATS:
				return basicSetThreats(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.ATTACK__DURATION:
				return getDuration();
			case CipVamprofilePackage.ATTACK__TACTIC:
				return getTactic();
			case CipVamprofilePackage.ATTACK__THREATS:
				return getThreats();
			case CipVamprofilePackage.ATTACK__ATTACKER:
				return getAttacker();
			case CipVamprofilePackage.ATTACK__BASE_ACTIVITY:
				if (resolve) return getBase_Activity();
				return basicGetBase_Activity();
			case CipVamprofilePackage.ATTACK__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CipVamprofilePackage.ATTACK__DURATION:
				setDuration((String)newValue);
				return;
			case CipVamprofilePackage.ATTACK__TACTIC:
				setTactic((Tactic)newValue);
				return;
			case CipVamprofilePackage.ATTACK__THREATS:
				setThreats((Threat)newValue);
				return;
			case CipVamprofilePackage.ATTACK__ATTACKER:
				getAttacker().clear();
				getAttacker().addAll((Collection<? extends Attacker>)newValue);
				return;
			case CipVamprofilePackage.ATTACK__BASE_ACTIVITY:
				setBase_Activity((Activity)newValue);
				return;
			case CipVamprofilePackage.ATTACK__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
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
			case CipVamprofilePackage.ATTACK__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CipVamprofilePackage.ATTACK__TACTIC:
				setTactic(TACTIC_EDEFAULT);
				return;
			case CipVamprofilePackage.ATTACK__THREATS:
				setThreats((Threat)null);
				return;
			case CipVamprofilePackage.ATTACK__ATTACKER:
				getAttacker().clear();
				return;
			case CipVamprofilePackage.ATTACK__BASE_ACTIVITY:
				setBase_Activity((Activity)null);
				return;
			case CipVamprofilePackage.ATTACK__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
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
			case CipVamprofilePackage.ATTACK__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case CipVamprofilePackage.ATTACK__TACTIC:
				return tactic != TACTIC_EDEFAULT;
			case CipVamprofilePackage.ATTACK__THREATS:
				return threats != null;
			case CipVamprofilePackage.ATTACK__ATTACKER:
				return attacker != null && !attacker.isEmpty();
			case CipVamprofilePackage.ATTACK__BASE_ACTIVITY:
				return base_Activity != null;
			case CipVamprofilePackage.ATTACK__BASE_USE_CASE:
				return base_UseCase != null;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(", tactic: ");
		result.append(tactic);
		result.append(')');
		return result.toString();
	}

} //AttackImpl
