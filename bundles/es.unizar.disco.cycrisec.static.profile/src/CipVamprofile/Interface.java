/**
 */
package CipVamprofile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Interface#getExposures <em>Exposures</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Physical {
	/**
	 * Returns the value of the '<em><b>Exposures</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Site}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposures</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getInterface_Exposures()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Site> getExposures();

} // Interface
