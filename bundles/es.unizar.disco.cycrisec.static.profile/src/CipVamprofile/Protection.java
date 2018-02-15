/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.BasicDT.Tactic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Protection#getCost <em>Cost</em>}</li>
 *   <li>{@link CipVamprofile.Protection#getSuccessProb <em>Success Prob</em>}</li>
 *   <li>{@link CipVamprofile.Protection#getProtects <em>Protects</em>}</li>
 *   <li>{@link CipVamprofile.Protection#getForbidden <em>Forbidden</em>}</li>
 *   <li>{@link CipVamprofile.Protection#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link CipVamprofile.Protection#getCounteracts <em>Counteracts</em>}</li>
 *   <li>{@link CipVamprofile.Protection#getExposes <em>Exposes</em>}</li>
 *   <li>{@link CipVamprofile.Protection#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getProtection()
 * @model abstract="true"
 * @generated
 */
public interface Protection extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(String)
	 * @see CipVamprofile.CipVamprofilePackage#getProtection_Cost()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getCost();

	/**
	 * Sets the value of the '{@link CipVamprofile.Protection#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(String value);

	/**
	 * Returns the value of the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Prob</em>' attribute.
	 * @see #setSuccessProb(String)
	 * @see CipVamprofile.CipVamprofilePackage#getProtection_SuccessProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getSuccessProb();

	/**
	 * Sets the value of the '{@link CipVamprofile.Protection#getSuccessProb <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Prob</em>' attribute.
	 * @see #getSuccessProb()
	 * @generated
	 */
	void setSuccessProb(String value);

	/**
	 * Returns the value of the '<em><b>Protects</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protects</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getProtection_Protects()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Item> getProtects();

	/**
	 * Returns the value of the '<em><b>Forbidden</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forbidden</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forbidden</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getProtection_Forbidden()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Item> getForbidden();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getProtection_Mandatory()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Item> getMandatory();

	/**
	 * Returns the value of the '<em><b>Counteracts</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counteracts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counteracts</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getProtection_Counteracts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Action> getCounteracts();

	/**
	 * Returns the value of the '<em><b>Exposes</b></em>' attribute list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.BasicDT.Tactic}.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.Tactic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposes</em>' attribute list.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Tactic
	 * @see CipVamprofile.CipVamprofilePackage#getProtection_Exposes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Tactic> getExposes();

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(String)
	 * @see CipVamprofile.CipVamprofilePackage#getProtection_Multiplicity()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	String getMultiplicity();

	/**
	 * Sets the value of the '{@link CipVamprofile.Protection#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(String value);

} // Protection
