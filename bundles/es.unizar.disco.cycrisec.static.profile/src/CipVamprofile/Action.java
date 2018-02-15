/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.BasicDT.ActionKind;

import CipVamprofile.CipVamLibrary.StructuredDT.Impairment;
import CipVamprofile.CipVamLibrary.StructuredDT.Weapon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Action#getDuration <em>Duration</em>}</li>
 *   <li>{@link CipVamprofile.Action#getKind <em>Kind</em>}</li>
 *   <li>{@link CipVamprofile.Action#getFailure <em>Failure</em>}</li>
 *   <li>{@link CipVamprofile.Action#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link CipVamprofile.Action#getOccurenceProb <em>Occurence Prob</em>}</li>
 *   <li>{@link CipVamprofile.Action#getEffects <em>Effects</em>}</li>
 *   <li>{@link CipVamprofile.Action#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link CipVamprofile.Action#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link CipVamprofile.Action#getBase_ActivityNode <em>Base Activity Node</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
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
	 * @see CipVamprofile.CipVamprofilePackage#getAction_Duration()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link CipVamprofile.Action#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.ActionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ActionKind
	 * @see #setKind(ActionKind)
	 * @see CipVamprofile.CipVamprofilePackage#getAction_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActionKind getKind();

	/**
	 * Sets the value of the '{@link CipVamprofile.Action#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ActionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ActionKind value);

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' attribute.
	 * @see #setFailure(String)
	 * @see CipVamprofile.CipVamprofilePackage#getAction_Failure()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getFailure();

	/**
	 * Sets the value of the '{@link CipVamprofile.Action#getFailure <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure</em>' attribute.
	 * @see #getFailure()
	 * @generated
	 */
	void setFailure(String value);

	/**
	 * Returns the value of the '<em><b>Triggered By</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getAction_TriggeredBy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Action> getTriggeredBy();

	/**
	 * Returns the value of the '<em><b>Occurence Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurence Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurence Prob</em>' attribute.
	 * @see #setOccurenceProb(String)
	 * @see CipVamprofile.CipVamprofilePackage#getAction_OccurenceProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getOccurenceProb();

	/**
	 * Sets the value of the '{@link CipVamprofile.Action#getOccurenceProb <em>Occurence Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurence Prob</em>' attribute.
	 * @see #getOccurenceProb()
	 * @generated
	 */
	void setOccurenceProb(String value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getAction_Effects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Impairment> getEffects();

	/**
	 * Returns the value of the '<em><b>Weapon</b></em>' containment reference list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weapon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weapon</em>' containment reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getAction_Weapon()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Weapon> getWeapon();

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
	 * @see CipVamprofile.CipVamprofilePackage#getAction_Attacker()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Attacker> getAttacker();

	/**
	 * Returns the value of the '<em><b>Base Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity Node</em>' reference.
	 * @see #setBase_ActivityNode(ActivityNode)
	 * @see CipVamprofile.CipVamprofilePackage#getAction_Base_ActivityNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActivityNode getBase_ActivityNode();

	/**
	 * Sets the value of the '{@link CipVamprofile.Action#getBase_ActivityNode <em>Base Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity Node</em>' reference.
	 * @see #getBase_ActivityNode()
	 * @generated
	 */
	void setBase_ActivityNode(ActivityNode value);

} // Action
