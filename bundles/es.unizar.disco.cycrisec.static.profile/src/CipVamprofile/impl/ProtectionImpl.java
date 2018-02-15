/**
 */
package CipVamprofile.impl;

import CipVamprofile.Action;

import CipVamprofile.CipVamLibrary.BasicDT.Tactic;

import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.Item;
import CipVamprofile.Protection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.ProtectionImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtectionImpl#getSuccessProb <em>Success Prob</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtectionImpl#getProtects <em>Protects</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtectionImpl#getForbidden <em>Forbidden</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtectionImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtectionImpl#getCounteracts <em>Counteracts</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtectionImpl#getExposes <em>Exposes</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtectionImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProtectionImpl extends MinimalEObjectImpl.Container implements Protection {
	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final String COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected String cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessProb() <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessProb()
	 * @generated
	 * @ordered
	 */
	protected static final String SUCCESS_PROB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuccessProb() <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessProb()
	 * @generated
	 * @ordered
	 */
	protected String successProb = SUCCESS_PROB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtects() <em>Protects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtects()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> protects;

	/**
	 * The cached value of the '{@link #getForbidden() <em>Forbidden</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbidden()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> forbidden;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> mandatory;

	/**
	 * The cached value of the '{@link #getCounteracts() <em>Counteracts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounteracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> counteracts;

	/**
	 * The cached value of the '{@link #getExposes() <em>Exposes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Tactic> exposes;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.PROTECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(String newCost) {
		String oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PROTECTION__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuccessProb() {
		return successProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessProb(String newSuccessProb) {
		String oldSuccessProb = successProb;
		successProb = newSuccessProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PROTECTION__SUCCESS_PROB, oldSuccessProb, successProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getProtects() {
		if (protects == null) {
			protects = new EObjectResolvingEList<Item>(Item.class, this, CipVamprofilePackage.PROTECTION__PROTECTS);
		}
		return protects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getForbidden() {
		if (forbidden == null) {
			forbidden = new EObjectResolvingEList<Item>(Item.class, this, CipVamprofilePackage.PROTECTION__FORBIDDEN);
		}
		return forbidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getMandatory() {
		if (mandatory == null) {
			mandatory = new EObjectResolvingEList<Item>(Item.class, this, CipVamprofilePackage.PROTECTION__MANDATORY);
		}
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getCounteracts() {
		if (counteracts == null) {
			counteracts = new EObjectResolvingEList<Action>(Action.class, this, CipVamprofilePackage.PROTECTION__COUNTERACTS);
		}
		return counteracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tactic> getExposes() {
		if (exposes == null) {
			exposes = new EDataTypeUniqueEList<Tactic>(Tactic.class, this, CipVamprofilePackage.PROTECTION__EXPOSES);
		}
		return exposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PROTECTION__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.PROTECTION__COST:
				return getCost();
			case CipVamprofilePackage.PROTECTION__SUCCESS_PROB:
				return getSuccessProb();
			case CipVamprofilePackage.PROTECTION__PROTECTS:
				return getProtects();
			case CipVamprofilePackage.PROTECTION__FORBIDDEN:
				return getForbidden();
			case CipVamprofilePackage.PROTECTION__MANDATORY:
				return getMandatory();
			case CipVamprofilePackage.PROTECTION__COUNTERACTS:
				return getCounteracts();
			case CipVamprofilePackage.PROTECTION__EXPOSES:
				return getExposes();
			case CipVamprofilePackage.PROTECTION__MULTIPLICITY:
				return getMultiplicity();
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
			case CipVamprofilePackage.PROTECTION__COST:
				setCost((String)newValue);
				return;
			case CipVamprofilePackage.PROTECTION__SUCCESS_PROB:
				setSuccessProb((String)newValue);
				return;
			case CipVamprofilePackage.PROTECTION__PROTECTS:
				getProtects().clear();
				getProtects().addAll((Collection<? extends Item>)newValue);
				return;
			case CipVamprofilePackage.PROTECTION__FORBIDDEN:
				getForbidden().clear();
				getForbidden().addAll((Collection<? extends Item>)newValue);
				return;
			case CipVamprofilePackage.PROTECTION__MANDATORY:
				getMandatory().clear();
				getMandatory().addAll((Collection<? extends Item>)newValue);
				return;
			case CipVamprofilePackage.PROTECTION__COUNTERACTS:
				getCounteracts().clear();
				getCounteracts().addAll((Collection<? extends Action>)newValue);
				return;
			case CipVamprofilePackage.PROTECTION__EXPOSES:
				getExposes().clear();
				getExposes().addAll((Collection<? extends Tactic>)newValue);
				return;
			case CipVamprofilePackage.PROTECTION__MULTIPLICITY:
				setMultiplicity((String)newValue);
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
			case CipVamprofilePackage.PROTECTION__COST:
				setCost(COST_EDEFAULT);
				return;
			case CipVamprofilePackage.PROTECTION__SUCCESS_PROB:
				setSuccessProb(SUCCESS_PROB_EDEFAULT);
				return;
			case CipVamprofilePackage.PROTECTION__PROTECTS:
				getProtects().clear();
				return;
			case CipVamprofilePackage.PROTECTION__FORBIDDEN:
				getForbidden().clear();
				return;
			case CipVamprofilePackage.PROTECTION__MANDATORY:
				getMandatory().clear();
				return;
			case CipVamprofilePackage.PROTECTION__COUNTERACTS:
				getCounteracts().clear();
				return;
			case CipVamprofilePackage.PROTECTION__EXPOSES:
				getExposes().clear();
				return;
			case CipVamprofilePackage.PROTECTION__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
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
			case CipVamprofilePackage.PROTECTION__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case CipVamprofilePackage.PROTECTION__SUCCESS_PROB:
				return SUCCESS_PROB_EDEFAULT == null ? successProb != null : !SUCCESS_PROB_EDEFAULT.equals(successProb);
			case CipVamprofilePackage.PROTECTION__PROTECTS:
				return protects != null && !protects.isEmpty();
			case CipVamprofilePackage.PROTECTION__FORBIDDEN:
				return forbidden != null && !forbidden.isEmpty();
			case CipVamprofilePackage.PROTECTION__MANDATORY:
				return mandatory != null && !mandatory.isEmpty();
			case CipVamprofilePackage.PROTECTION__COUNTERACTS:
				return counteracts != null && !counteracts.isEmpty();
			case CipVamprofilePackage.PROTECTION__EXPOSES:
				return exposes != null && !exposes.isEmpty();
			case CipVamprofilePackage.PROTECTION__MULTIPLICITY:
				return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", successProb: ");
		result.append(successProb);
		result.append(", exposes: ");
		result.append(exposes);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //ProtectionImpl
