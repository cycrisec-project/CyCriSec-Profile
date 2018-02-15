/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.BasicDT.Level;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Operator#getFirmness <em>Firmness</em>}</li>
 *   <li>{@link CipVamprofile.Operator#getSkill <em>Skill</em>}</li>
 *   <li>{@link CipVamprofile.Operator#getNature <em>Nature</em>}</li>
 *   <li>{@link CipVamprofile.Operator#getAvailability <em>Availability</em>}</li>
 *   <li>{@link CipVamprofile.Operator#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link CipVamprofile.Operator#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends Protection {
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
	 * @see CipVamprofile.CipVamprofilePackage#getOperator_Firmness()
	 * @model ordered="false"
	 * @generated
	 */
	Level getFirmness();

	/**
	 * Sets the value of the '{@link CipVamprofile.Operator#getFirmness <em>Firmness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmness</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
	 * @see #getFirmness()
	 * @generated
	 */
	void setFirmness(Level value);

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
	 * @see CipVamprofile.CipVamprofilePackage#getOperator_Skill()
	 * @model ordered="false"
	 * @generated
	 */
	Level getSkill();

	/**
	 * Sets the value of the '{@link CipVamprofile.Operator#getSkill <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.Level
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Level value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see CipVamprofile.OperatorType
	 * @see #setNature(OperatorType)
	 * @see CipVamprofile.CipVamprofilePackage#getOperator_Nature()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OperatorType getNature();

	/**
	 * Sets the value of the '{@link CipVamprofile.Operator#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see CipVamprofile.OperatorType
	 * @see #getNature()
	 * @generated
	 */
	void setNature(OperatorType value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(String)
	 * @see CipVamprofile.CipVamprofilePackage#getOperator_Availability()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getAvailability();

	/**
	 * Sets the value of the '{@link CipVamprofile.Operator#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(String value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see CipVamprofile.CipVamprofilePackage#getOperator_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link CipVamprofile.Operator#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see CipVamprofile.CipVamprofilePackage#getOperator_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link CipVamprofile.Operator#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // Operator
