/**
 */
package CipVamprofile.CipVamLibrary.BasicDT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protection Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage#getProtectionNature()
 * @model
 * @generated
 */
public enum ProtectionNature implements Enumerator {
	/**
	 * The '<em><b>Acoustic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACOUSTIC_VALUE
	 * @generated
	 * @ordered
	 */
	ACOUSTIC(0, "acoustic", "acoustic"),

	/**
	 * The '<em><b>Biological</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOLOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICAL(1, "biological", "biological"),

	/**
	 * The '<em><b>Chemical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL(2, "chemical", "chemical"),

	/**
	 * The '<em><b>Electric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTRIC(3, "electric", "electric"),

	/**
	 * The '<em><b>Magnetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGNETIC_VALUE
	 * @generated
	 * @ordered
	 */
	MAGNETIC(4, "magnetic", "magnetic"),

	/**
	 * The '<em><b>Mechanical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MECHANICAL(5, "mechanical", "mechanical"),

	/**
	 * The '<em><b>Optical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTICAL(6, "optical", "optical"),

	/**
	 * The '<em><b>Thermal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THERMAL_VALUE
	 * @generated
	 * @ordered
	 */
	THERMAL(7, "thermal", "thermal"),

	/**
	 * The '<em><b>Radiation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIATION_VALUE
	 * @generated
	 * @ordered
	 */
	RADIATION(8, "radiation", "radiation"),

	/**
	 * The '<em><b>Optical Fiber</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTICAL_FIBER_VALUE
	 * @generated
	 * @ordered
	 */
	OPTICAL_FIBER(9, "opticalFiber", "opticalFiber"),

	/**
	 * The '<em><b>Infrared</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFRARED_VALUE
	 * @generated
	 * @ordered
	 */
	INFRARED(10, "infrared", "infrared"),

	/**
	 * The '<em><b>Software Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_BASED(11, "softwareBased", "softwareBased");

	/**
	 * The '<em><b>Acoustic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acoustic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACOUSTIC
	 * @model name="acoustic"
	 * @generated
	 * @ordered
	 */
	public static final int ACOUSTIC_VALUE = 0;

	/**
	 * The '<em><b>Biological</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Biological</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIOLOGICAL
	 * @model name="biological"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICAL_VALUE = 1;

	/**
	 * The '<em><b>Chemical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chemical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL
	 * @model name="chemical"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_VALUE = 2;

	/**
	 * The '<em><b>Electric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Electric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELECTRIC
	 * @model name="electric"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTRIC_VALUE = 3;

	/**
	 * The '<em><b>Magnetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Magnetic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAGNETIC
	 * @model name="magnetic"
	 * @generated
	 * @ordered
	 */
	public static final int MAGNETIC_VALUE = 4;

	/**
	 * The '<em><b>Mechanical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mechanical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MECHANICAL
	 * @model name="mechanical"
	 * @generated
	 * @ordered
	 */
	public static final int MECHANICAL_VALUE = 5;

	/**
	 * The '<em><b>Optical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTICAL
	 * @model name="optical"
	 * @generated
	 * @ordered
	 */
	public static final int OPTICAL_VALUE = 6;

	/**
	 * The '<em><b>Thermal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Thermal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THERMAL
	 * @model name="thermal"
	 * @generated
	 * @ordered
	 */
	public static final int THERMAL_VALUE = 7;

	/**
	 * The '<em><b>Radiation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radiation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIATION
	 * @model name="radiation"
	 * @generated
	 * @ordered
	 */
	public static final int RADIATION_VALUE = 8;

	/**
	 * The '<em><b>Optical Fiber</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Optical Fiber</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTICAL_FIBER
	 * @model name="opticalFiber"
	 * @generated
	 * @ordered
	 */
	public static final int OPTICAL_FIBER_VALUE = 9;

	/**
	 * The '<em><b>Infrared</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infrared</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFRARED
	 * @model name="infrared"
	 * @generated
	 * @ordered
	 */
	public static final int INFRARED_VALUE = 10;

	/**
	 * The '<em><b>Software Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Software Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_BASED
	 * @model name="softwareBased"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_BASED_VALUE = 11;

	/**
	 * An array of all the '<em><b>Protection Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtectionNature[] VALUES_ARRAY =
		new ProtectionNature[] {
			ACOUSTIC,
			BIOLOGICAL,
			CHEMICAL,
			ELECTRIC,
			MAGNETIC,
			MECHANICAL,
			OPTICAL,
			THERMAL,
			RADIATION,
			OPTICAL_FIBER,
			INFRARED,
			SOFTWARE_BASED,
		};

	/**
	 * A public read-only list of all the '<em><b>Protection Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtectionNature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protection Nature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionNature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtectionNature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protection Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionNature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtectionNature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protection Nature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionNature get(int value) {
		switch (value) {
			case ACOUSTIC_VALUE: return ACOUSTIC;
			case BIOLOGICAL_VALUE: return BIOLOGICAL;
			case CHEMICAL_VALUE: return CHEMICAL;
			case ELECTRIC_VALUE: return ELECTRIC;
			case MAGNETIC_VALUE: return MAGNETIC;
			case MECHANICAL_VALUE: return MECHANICAL;
			case OPTICAL_VALUE: return OPTICAL;
			case THERMAL_VALUE: return THERMAL;
			case RADIATION_VALUE: return RADIATION;
			case OPTICAL_FIBER_VALUE: return OPTICAL_FIBER;
			case INFRARED_VALUE: return INFRARED;
			case SOFTWARE_BASED_VALUE: return SOFTWARE_BASED;
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
	private ProtectionNature(int value, String name, String literal) {
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
	
} //ProtectionNature
