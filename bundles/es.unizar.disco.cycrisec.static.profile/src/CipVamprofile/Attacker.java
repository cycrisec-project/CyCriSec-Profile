/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.BasicDT.Level;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Attacker#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link CipVamprofile.Attacker#getSkill <em>Skill</em>}</li>
 *   <li>{@link CipVamprofile.Attacker#getFirmness <em>Firmness</em>}</li>
 *   <li>{@link CipVamprofile.Attacker#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getAttacker()
 * @model
 * @generated
 */
public interface Attacker extends EObject {
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
	 * @see CipVamprofile.CipVamprofilePackage#getAttacker_Multiplicity()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	String getMultiplicity();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attacker#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Skill</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
	 * @see #setSkill(Level)
	 * @see CipVamprofile.CipVamprofilePackage#getAttacker_Skill()
	 * @model ordered="false"
	 * @generated
	 */
	Level getSkill();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attacker#getSkill <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Level value);

	/**
	 * Returns the value of the '<em><b>Firmness</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmness</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
	 * @see #setFirmness(Level)
	 * @see CipVamprofile.CipVamprofilePackage#getAttacker_Firmness()
	 * @model ordered="false"
	 * @generated
	 */
	Level getFirmness();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attacker#getFirmness <em>Firmness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmness</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
	 * @see #getFirmness()
	 * @generated
	 */
	void setFirmness(Level value);

	/**
	 * Returns the value of the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Actor</em>' reference.
	 * @see #setBase_Actor(Actor)
	 * @see CipVamprofile.CipVamprofilePackage#getAttacker_Base_Actor()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Actor getBase_Actor();

	/**
	 * Sets the value of the '{@link CipVamprofile.Attacker#getBase_Actor <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Actor</em>' reference.
	 * @see #getBase_Actor()
	 * @generated
	 */
	void setBase_Actor(Actor value);

} // Attacker
