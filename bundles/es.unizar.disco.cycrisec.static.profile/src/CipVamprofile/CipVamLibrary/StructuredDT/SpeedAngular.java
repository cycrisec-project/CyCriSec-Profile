/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT;

import CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed Angular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular#getValue <em>Value</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular#getSpeedUnit <em>Speed Unit</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getSpeedAngular()
 * @model
 * @generated
 */
public interface SpeedAngular extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getSpeedAngular_Value()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.Real" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Speed Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Unit</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit
	 * @see #setSpeedUnit(AngularSpeedUnit)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getSpeedAngular_SpeedUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AngularSpeedUnit getSpeedUnit();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular#getSpeedUnit <em>Speed Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Unit</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit
	 * @see #getSpeedUnit()
	 * @generated
	 */
	void setSpeedUnit(AngularSpeedUnit value);

} // SpeedAngular
