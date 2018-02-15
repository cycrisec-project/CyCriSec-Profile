/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.BasicDT.Tactic;

import CipVamprofile.CipVamLibrary.StructuredDT.Threat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Attack#getDuration <em>Duration</em>}</li>
 *   <li>{@link CipVamprofile.Attack#getTactic <em>Tactic</em>}</li>
 *   <li>{@link CipVamprofile.Attack#getThreats <em>Threats</em>}</li>
 *   <li>{@link CipVamprofile.Attack#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link CipVamprofile.Attack#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link CipVamprofile.Attack#getBase_UseCase <em>Base Use Case</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getAttack()
 * @model
 * @generated
 */
public interface Attack extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see CipVamprofile.CipVamprofilePackage#getAttack_Duration()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attack#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Tactic</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.Tactic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tactic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tactic</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Tactic
	 * @see #setTactic(Tactic)
	 * @see CipVamprofile.CipVamprofilePackage#getAttack_Tactic()
	 * @model ordered="false"
	 * @generated
	 */
	Tactic getTactic();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attack#getTactic <em>Tactic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tactic</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Tactic
	 * @see #getTactic()
	 * @generated
	 */
	void setTactic(Tactic value);

	/**
	 * Returns the value of the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threats</em>' containment reference.
	 * @see #setThreats(Threat)
	 * @see CipVamprofile.CipVamprofilePackage#getAttack_Threats()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Threat getThreats();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attack#getThreats <em>Threats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threats</em>' containment reference.
	 * @see #getThreats()
	 * @generated
	 */
	void setThreats(Threat value);

	/**
	 * Returns the value of the '<em><b>Attacker</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Attacker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getAttack_Attacker()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Attacker> getAttacker();

	/**
	 * Returns the value of the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity</em>' reference.
	 * @see #setBase_Activity(Activity)
	 * @see CipVamprofile.CipVamprofilePackage#getAttack_Base_Activity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Activity getBase_Activity();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attack#getBase_Activity <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity</em>' reference.
	 * @see #getBase_Activity()
	 * @generated
	 */
	void setBase_Activity(Activity value);

	/**
	 * Returns the value of the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Use Case</em>' reference.
	 * @see #setBase_UseCase(UseCase)
	 * @see CipVamprofile.CipVamprofilePackage#getAttack_Base_UseCase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attack#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

} // Attack
