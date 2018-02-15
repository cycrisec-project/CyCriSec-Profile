/**
 */
package CipVamprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.ConditionEvent#getProtections <em>Protections</em>}</li>
 *   <li>{@link CipVamprofile.ConditionEvent#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getConditionEvent()
 * @model
 * @generated
 */
public interface ConditionEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Protections</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Protection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protections</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getConditionEvent_Protections()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Protection> getProtections();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.BooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see CipVamprofile.BooleanOperator
	 * @see #setOperator(BooleanOperator)
	 * @see CipVamprofile.CipVamprofilePackage#getConditionEvent_Operator()
	 * @model ordered="false"
	 * @generated
	 */
	BooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link CipVamprofile.ConditionEvent#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see CipVamprofile.BooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanOperator value);

} // ConditionEvent
