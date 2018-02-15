/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT;

import CipVamprofile.CipVamLibrary.GeometricDT.Point;

import CipVamprofile.Item;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getPosition <em>Position</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getDirection <em>Direction</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getInstallation <em>Installation</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Point)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getApplication_Position()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' containment reference.
	 * @see #setDirection(Point)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getApplication_Direction()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Point getDirection();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getDirection <em>Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' containment reference.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Point value);

	/**
	 * Returns the value of the '<em><b>Installation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation</em>' reference.
	 * @see #setInstallation(Item)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getApplication_Installation()
	 * @model ordered="false"
	 * @generated
	 */
	Item getInstallation();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getInstallation <em>Installation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation</em>' reference.
	 * @see #getInstallation()
	 * @generated
	 */
	void setInstallation(Item value);

} // Application
