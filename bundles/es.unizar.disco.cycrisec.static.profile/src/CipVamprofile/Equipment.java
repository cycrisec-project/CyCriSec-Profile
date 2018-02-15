/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature;

import CipVamprofile.CipVamLibrary.StructuredDT.Application;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Equipment#getNature <em>Nature</em>}</li>
 *   <li>{@link CipVamprofile.Equipment#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link CipVamprofile.Equipment#getApplication <em>Application</em>}</li>
 *   <li>{@link CipVamprofile.Equipment#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link CipVamprofile.Equipment#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends Protection {
	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature}.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute list.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature
	 * @see CipVamprofile.CipVamprofilePackage#getEquipment_Nature()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ProtectionNature> getNature();

	/**
	 * Returns the value of the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Rate</em>' attribute.
	 * @see #setFailureRate(String)
	 * @see CipVamprofile.CipVamprofilePackage#getEquipment_FailureRate()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getFailureRate();

	/**
	 * Sets the value of the '{@link CipVamprofile.Equipment#getFailureRate <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Rate</em>' attribute.
	 * @see #getFailureRate()
	 * @generated
	 */
	void setFailureRate(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference.
	 * @see #setApplication(Application)
	 * @see CipVamprofile.CipVamprofilePackage#getEquipment_Application()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link CipVamprofile.Equipment#getApplication <em>Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' containment reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

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
	 * @see CipVamprofile.CipVamprofilePackage#getEquipment_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link CipVamprofile.Equipment#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

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
	 * @see CipVamprofile.CipVamprofilePackage#getEquipment_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link CipVamprofile.Equipment#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // Equipment
