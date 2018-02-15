/**
 */
package CipVamprofile.CipVamLibrary.GeometricDT;

import CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Angle#getValue <em>Value</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Angle#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getAngle()
 * @model
 * @generated
 */
public interface Angle extends EObject {
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
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getAngle_Value()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.Real" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Angle#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind
	 * @see #setUnit(AngularUnitKind)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getAngle_Unit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AngularUnitKind getUnit();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Angle#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(AngularUnitKind value);

} // Angle
