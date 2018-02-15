/**
 */
package CipVamprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Management System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.ManagementSystem#getManages <em>Manages</em>}</li>
 *   <li>{@link CipVamprofile.ManagementSystem#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link CipVamprofile.ManagementSystem#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getManagementSystem()
 * @model
 * @generated
 */
public interface ManagementSystem extends Protection {
	/**
	 * Returns the value of the '<em><b>Manages</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Protection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manages</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getManagementSystem_Manages()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Protection> getManages();

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
	 * @see CipVamprofile.CipVamprofilePackage#getManagementSystem_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link CipVamprofile.ManagementSystem#getBase_Class <em>Base Class</em>}' reference.
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
	 * @see CipVamprofile.CipVamprofilePackage#getManagementSystem_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link CipVamprofile.ManagementSystem#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

} // ManagementSystem
