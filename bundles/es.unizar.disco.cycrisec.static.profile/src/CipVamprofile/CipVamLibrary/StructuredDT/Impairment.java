/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impairment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getLatency <em>Latency</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropProb <em>Prop Prob</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropCond <em>Prop Cond</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropEffect <em>Prop Effect</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getImpairment()
 * @model
 * @generated
 */
public interface Impairment extends Threat {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(String)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getImpairment_Latency()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	String getLatency();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(String value);

	/**
	 * Returns the value of the '<em><b>Prop Prob</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Prob</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Prob</em>' attribute list.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getImpairment_PropProb()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getPropProb();

	/**
	 * Returns the value of the '<em><b>Prop Cond</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Cond</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Cond</em>' attribute list.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getImpairment_PropCond()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.VSL_Expression" ordered="false"
	 * @generated
	 */
	EList<String> getPropCond();

	/**
	 * Returns the value of the '<em><b>Prop Effect</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Effect</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Effect</em>' attribute list.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getImpairment_PropEffect()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	EList<String> getPropEffect();

} // Impairment
