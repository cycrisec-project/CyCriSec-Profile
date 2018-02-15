/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT;

import CipVamprofile.CipVamLibrary.BasicDT.WeaponNature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weapon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon#getFailureRate <em>Failure Rate</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon#getNature <em>Nature</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getWeapon()
 * @model
 * @generated
 */
public interface Weapon extends EObject {
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
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getWeapon_FailureRate()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getFailureRate();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon#getFailureRate <em>Failure Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Rate</em>' attribute.
	 * @see #getFailureRate()
	 * @generated
	 */
	void setFailureRate(String value);

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.WeaponNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.WeaponNature
	 * @see #setNature(WeaponNature)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getWeapon_Nature()
	 * @model ordered="false"
	 * @generated
	 */
	WeaponNature getNature();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.WeaponNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(WeaponNature value);

} // Weapon
