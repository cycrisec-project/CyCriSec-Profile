/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT.impl;

import CipVamprofile.CipVamLibrary.BasicDT.RiskLevel;

import CipVamprofile.CipVamLibrary.StructuredDT.Asset;
import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl#getVulnerability <em>Vulnerability</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl#getAttackProb <em>Attack Prob</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl#getRiskLevel <em>Risk Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
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
	 * The default value of the '{@link #getVulnerability() <em>Vulnerability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerability()
	 * @generated
	 * @ordered
	 */
	protected static final String VULNERABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVulnerability() <em>Vulnerability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVulnerability()
	 * @generated
	 * @ordered
	 */
	protected String vulnerability = VULNERABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackProb() <em>Attack Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackProb()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACK_PROB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackProb() <em>Attack Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackProb()
	 * @generated
	 * @ordered
	 */
	protected String attackProb = ATTACK_PROB_EDEFAULT;

	/**
	 * The default value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected static final String RISK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected String risk = RISK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected static final RiskLevel RISK_LEVEL_EDEFAULT = RiskLevel.NEGLIGIBLE;

	/**
	 * The cached value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected RiskLevel riskLevel = RISK_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredDTPackage.Literals.ASSET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.ASSET__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVulnerability() {
		return vulnerability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVulnerability(String newVulnerability) {
		String oldVulnerability = vulnerability;
		vulnerability = newVulnerability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.ASSET__VULNERABILITY, oldVulnerability, vulnerability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttackProb() {
		return attackProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackProb(String newAttackProb) {
		String oldAttackProb = attackProb;
		attackProb = newAttackProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.ASSET__ATTACK_PROB, oldAttackProb, attackProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRisk() {
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisk(String newRisk) {
		String oldRisk = risk;
		risk = newRisk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.ASSET__RISK, oldRisk, risk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel getRiskLevel() {
		return riskLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskLevel(RiskLevel newRiskLevel) {
		RiskLevel oldRiskLevel = riskLevel;
		riskLevel = newRiskLevel == null ? RISK_LEVEL_EDEFAULT : newRiskLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredDTPackage.ASSET__RISK_LEVEL, oldRiskLevel, riskLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuredDTPackage.ASSET__VALUE:
				return getValue();
			case StructuredDTPackage.ASSET__VULNERABILITY:
				return getVulnerability();
			case StructuredDTPackage.ASSET__ATTACK_PROB:
				return getAttackProb();
			case StructuredDTPackage.ASSET__RISK:
				return getRisk();
			case StructuredDTPackage.ASSET__RISK_LEVEL:
				return getRiskLevel();
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
			case StructuredDTPackage.ASSET__VALUE:
				setValue((String)newValue);
				return;
			case StructuredDTPackage.ASSET__VULNERABILITY:
				setVulnerability((String)newValue);
				return;
			case StructuredDTPackage.ASSET__ATTACK_PROB:
				setAttackProb((String)newValue);
				return;
			case StructuredDTPackage.ASSET__RISK:
				setRisk((String)newValue);
				return;
			case StructuredDTPackage.ASSET__RISK_LEVEL:
				setRiskLevel((RiskLevel)newValue);
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
			case StructuredDTPackage.ASSET__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case StructuredDTPackage.ASSET__VULNERABILITY:
				setVulnerability(VULNERABILITY_EDEFAULT);
				return;
			case StructuredDTPackage.ASSET__ATTACK_PROB:
				setAttackProb(ATTACK_PROB_EDEFAULT);
				return;
			case StructuredDTPackage.ASSET__RISK:
				setRisk(RISK_EDEFAULT);
				return;
			case StructuredDTPackage.ASSET__RISK_LEVEL:
				setRiskLevel(RISK_LEVEL_EDEFAULT);
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
			case StructuredDTPackage.ASSET__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case StructuredDTPackage.ASSET__VULNERABILITY:
				return VULNERABILITY_EDEFAULT == null ? vulnerability != null : !VULNERABILITY_EDEFAULT.equals(vulnerability);
			case StructuredDTPackage.ASSET__ATTACK_PROB:
				return ATTACK_PROB_EDEFAULT == null ? attackProb != null : !ATTACK_PROB_EDEFAULT.equals(attackProb);
			case StructuredDTPackage.ASSET__RISK:
				return RISK_EDEFAULT == null ? risk != null : !RISK_EDEFAULT.equals(risk);
			case StructuredDTPackage.ASSET__RISK_LEVEL:
				return riskLevel != RISK_LEVEL_EDEFAULT;
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
		result.append(", vulnerability: ");
		result.append(vulnerability);
		result.append(", attackProb: ");
		result.append(attackProb);
		result.append(", risk: ");
		result.append(risk);
		result.append(", riskLevel: ");
		result.append(riskLevel);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
