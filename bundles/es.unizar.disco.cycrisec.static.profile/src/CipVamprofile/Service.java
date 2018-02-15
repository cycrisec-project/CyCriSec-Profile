/**
 */
package CipVamprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Service#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link CipVamprofile.Service#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link CipVamprofile.Service#getExecProb <em>Exec Prob</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getService()
 * @model
 * @generated
 */
public interface Service extends Item {
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
	 * @see CipVamprofile.CipVamprofilePackage#getService_Base_UseCase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UseCase getBase_UseCase();

	/**
	 * Sets the value of the '{@link CipVamprofile.Service#getBase_UseCase <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Use Case</em>' reference.
	 * @see #getBase_UseCase()
	 * @generated
	 */
	void setBase_UseCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Provided By</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided By</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getService_ProvidedBy()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CipVamprofile.Object> getProvidedBy();

	/**
	 * Returns the value of the '<em><b>Exec Prob</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec Prob</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exec Prob</em>' attribute list.
	 * @see CipVamprofile.CipVamprofilePackage#getService_ExecProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getExecProb();

} // Service
