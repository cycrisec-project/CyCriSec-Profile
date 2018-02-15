/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT;

import CipVamprofile.CipVamLibrary.BasicDT.RiskLevel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getValue <em>Value</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getVulnerability <em>Vulnerability</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getAttackProb <em>Attack Prob</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getRisk <em>Risk</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getRiskLevel <em>Risk Level</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getAsset_Value()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Vulnerability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vulnerability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vulnerability</em>' attribute.
	 * @see #setVulnerability(String)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getAsset_Vulnerability()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" required="true" ordered="false"
	 * @generated
	 */
	String getVulnerability();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getVulnerability <em>Vulnerability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vulnerability</em>' attribute.
	 * @see #getVulnerability()
	 * @generated
	 */
	void setVulnerability(String value);

	/**
	 * Returns the value of the '<em><b>Attack Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Prob</em>' attribute.
	 * @see #setAttackProb(String)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getAsset_AttackProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" required="true" ordered="false"
	 * @generated
	 */
	String getAttackProb();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getAttackProb <em>Attack Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Prob</em>' attribute.
	 * @see #getAttackProb()
	 * @generated
	 */
	void setAttackProb(String value);

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' attribute.
	 * @see #setRisk(String)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getAsset_Risk()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" required="true" ordered="false"
	 * @generated
	 */
	String getRisk();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getRisk <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' attribute.
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(String value);

	/**
	 * Returns the value of the '<em><b>Risk Level</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.RiskLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Level</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.RiskLevel
	 * @see #setRiskLevel(RiskLevel)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getAsset_RiskLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RiskLevel getRiskLevel();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getRiskLevel <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Level</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.RiskLevel
	 * @see #getRiskLevel()
	 * @generated
	 */
	void setRiskLevel(RiskLevel value);

} // Asset
