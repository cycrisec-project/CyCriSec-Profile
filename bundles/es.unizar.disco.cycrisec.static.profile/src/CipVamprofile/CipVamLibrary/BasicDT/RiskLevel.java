/**
 */
package CipVamprofile.CipVamLibrary.BasicDT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Risk Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage#getRiskLevel()
 * @model
 * @generated
 */
public enum RiskLevel implements Enumerator {
	/**
	 * The '<em><b>Negligible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEGLIGIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	NEGLIGIBLE(0, "negligible", "negligible"),

	/**
	 * The '<em><b>Acceptable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCEPTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPTABLE(1, "acceptable", "acceptable"),

	/**
	 * The '<em><b>Tolerable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOLERABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TOLERABLE(2, "tolerable", "tolerable"),

	/**
	 * The '<em><b>Unacceptable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNACCEPTABLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNACCEPTABLE(3, "unacceptable", "unacceptable");

	/**
	 * The '<em><b>Negligible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Negligible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEGLIGIBLE
	 * @model name="negligible"
	 * @generated
	 * @ordered
	 */
	public static final int NEGLIGIBLE_VALUE = 0;

	/**
	 * The '<em><b>Acceptable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acceptable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCEPTABLE
	 * @model name="acceptable"
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPTABLE_VALUE = 1;

	/**
	 * The '<em><b>Tolerable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tolerable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOLERABLE
	 * @model name="tolerable"
	 * @generated
	 * @ordered
	 */
	public static final int TOLERABLE_VALUE = 2;

	/**
	 * The '<em><b>Unacceptable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unacceptable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNACCEPTABLE
	 * @model name="unacceptable"
	 * @generated
	 * @ordered
	 */
	public static final int UNACCEPTABLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Risk Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RiskLevel[] VALUES_ARRAY =
		new RiskLevel[] {
			NEGLIGIBLE,
			ACCEPTABLE,
			TOLERABLE,
			UNACCEPTABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Risk Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RiskLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Risk Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Risk Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Risk Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskLevel get(int value) {
		switch (value) {
			case NEGLIGIBLE_VALUE: return NEGLIGIBLE;
			case ACCEPTABLE_VALUE: return ACCEPTABLE;
			case TOLERABLE_VALUE: return TOLERABLE;
			case UNACCEPTABLE_VALUE: return UNACCEPTABLE;
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
	private RiskLevel(int value, String name, String literal) {
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
	
} //RiskLevel
