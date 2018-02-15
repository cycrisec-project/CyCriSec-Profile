/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT.impl;

import CipVamprofile.CipVamLibrary.StructuredDT.Impairment;
import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impairment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ImpairmentImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ImpairmentImpl#getPropProb <em>Prop Prob</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ImpairmentImpl#getPropCond <em>Prop Cond</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ImpairmentImpl#getPropEffect <em>Prop Effect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpairmentImpl extends ThreatImpl implements Impairment {
	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final String LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected String latency = LATENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropProb() <em>Prop Prob</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropProb()
	 * @generated
	 * @ordered
	 */
	protected EList<String> propProb;

	/**
	 * The cached value of the '{@link #getPropCond() <em>Prop Cond</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropCond()
	 * @generated
	 * @ordered
	 */
	protected EList<String> propCond;

	/**
	 * The cached value of the '{@link #getPropEffect() <em>Prop Effect</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<String> propEffect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpairmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredDTPackage.Literals.IMPAIRMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(String newLatency) {
		String oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.IMPAIRMENT__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPropProb() {
		if (propProb == null) {
			propProb = new EDataTypeUniqueEList<String>(String.class, this, StructuredDTPackage.IMPAIRMENT__PROP_PROB);
		}
		return propProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPropCond() {
		if (propCond == null) {
			propCond = new EDataTypeUniqueEList<String>(String.class, this, StructuredDTPackage.IMPAIRMENT__PROP_COND);
		}
		return propCond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPropEffect() {
		if (propEffect == null) {
			propEffect = new EDataTypeUniqueEList<String>(String.class, this, StructuredDTPackage.IMPAIRMENT__PROP_EFFECT);
		}
		return propEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuredDTPackage.IMPAIRMENT__LATENCY:
				return getLatency();
			case StructuredDTPackage.IMPAIRMENT__PROP_PROB:
				return getPropProb();
			case StructuredDTPackage.IMPAIRMENT__PROP_COND:
				return getPropCond();
			case StructuredDTPackage.IMPAIRMENT__PROP_EFFECT:
				return getPropEffect();
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
			case StructuredDTPackage.IMPAIRMENT__LATENCY:
				setLatency((String)newValue);
				return;
			case StructuredDTPackage.IMPAIRMENT__PROP_PROB:
				getPropProb().clear();
				getPropProb().addAll((Collection<? extends String>)newValue);
				return;
			case StructuredDTPackage.IMPAIRMENT__PROP_COND:
				getPropCond().clear();
				getPropCond().addAll((Collection<? extends String>)newValue);
				return;
			case StructuredDTPackage.IMPAIRMENT__PROP_EFFECT:
				getPropEffect().clear();
				getPropEffect().addAll((Collection<? extends String>)newValue);
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
			case StructuredDTPackage.IMPAIRMENT__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case StructuredDTPackage.IMPAIRMENT__PROP_PROB:
				getPropProb().clear();
				return;
			case StructuredDTPackage.IMPAIRMENT__PROP_COND:
				getPropCond().clear();
				return;
			case StructuredDTPackage.IMPAIRMENT__PROP_EFFECT:
				getPropEffect().clear();
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
			case StructuredDTPackage.IMPAIRMENT__LATENCY:
				return LATENCY_EDEFAULT == null ? latency != null : !LATENCY_EDEFAULT.equals(latency);
			case StructuredDTPackage.IMPAIRMENT__PROP_PROB:
				return propProb != null && !propProb.isEmpty();
			case StructuredDTPackage.IMPAIRMENT__PROP_COND:
				return propCond != null && !propCond.isEmpty();
			case StructuredDTPackage.IMPAIRMENT__PROP_EFFECT:
				return propEffect != null && !propEffect.isEmpty();
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
		result.append(" (latency: ");
		result.append(latency);
		result.append(", propProb: ");
		result.append(propProb);
		result.append(", propCond: ");
		result.append(propCond);
		result.append(", propEffect: ");
		result.append(propEffect);
		result.append(')');
		return result.toString();
	}

} //ImpairmentImpl
