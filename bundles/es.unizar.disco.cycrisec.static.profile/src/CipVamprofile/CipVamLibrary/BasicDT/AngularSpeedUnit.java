/**
 */
package CipVamprofile.CipVamLibrary.BasicDT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Angular Speed Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage#getAngularSpeedUnit()
 * @model
 * @generated
 */
public enum AngularSpeedUnit implements Enumerator {
	/**
	 * The '<em><b>Deg per sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEG_PER_SEC_VALUE
	 * @generated
	 * @ordered
	 */
	DEG_PER_SEC(0, "deg_per_sec", "deg_per_sec"),

	/**
	 * The '<em><b>Rad per sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAD_PER_SEC_VALUE
	 * @generated
	 * @ordered
	 */
	RAD_PER_SEC(1, "rad_per_sec", "rad_per_sec");

	/**
	 * The '<em><b>Deg per sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deg per sec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEG_PER_SEC
	 * @model name="deg_per_sec"
	 * @generated
	 * @ordered
	 */
	public static final int DEG_PER_SEC_VALUE = 0;

	/**
	 * The '<em><b>Rad per sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rad per sec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAD_PER_SEC
	 * @model name="rad_per_sec"
	 * @generated
	 * @ordered
	 */
	public static final int RAD_PER_SEC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Angular Speed Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AngularSpeedUnit[] VALUES_ARRAY =
		new AngularSpeedUnit[] {
			DEG_PER_SEC,
			RAD_PER_SEC,
		};

	/**
	 * A public read-only list of all the '<em><b>Angular Speed Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AngularSpeedUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Angular Speed Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AngularSpeedUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AngularSpeedUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Angular Speed Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AngularSpeedUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AngularSpeedUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Angular Speed Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AngularSpeedUnit get(int value) {
		switch (value) {
			case DEG_PER_SEC_VALUE: return DEG_PER_SEC;
			case RAD_PER_SEC_VALUE: return RAD_PER_SEC;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AngularSpeedUnit(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AngularSpeedUnit
