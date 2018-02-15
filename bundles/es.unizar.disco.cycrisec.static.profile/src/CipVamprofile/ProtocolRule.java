/**
 */
package CipVamprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.ProtocolRule#getBase_ActivityNode <em>Base Activity Node</em>}</li>
 *   <li>{@link CipVamprofile.ProtocolRule#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link CipVamprofile.ProtocolRule#getExecutedBy <em>Executed By</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getProtocolRule()
 * @model
 * @generated
 */
public interface ProtocolRule extends Protection {
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
	 * @see CipVamprofile.CipVamprofilePackage#getProtocolRule_Base_ActivityNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActivityNode getBase_ActivityNode();

	/**
	 * Sets the value of the '{@link CipVamprofile.ProtocolRule#getBase_ActivityNode <em>Base Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity Node</em>' reference.
	 * @see #getBase_ActivityNode()
	 * @generated
	 */
	void setBase_ActivityNode(ActivityNode value);

	/**
	 * Returns the value of the '<em><b>Supported By</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Protection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported By</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getProtocolRule_SupportedBy()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Protection> getSupportedBy();

	/**
	 * Returns the value of the '<em><b>Executed By</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executed By</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getProtocolRule_ExecutedBy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Operator> getExecutedBy();

} // ProtocolRule
