/**
 */
package CipVamprofile.CipVamLibrary.BasicDT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tactic</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage#getTactic()
 * @model
 * @generated
 */
public enum Tactic implements Enumerator {
	/**
	 * The '<em><b>Armed Attack</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARMED_ATTACK_VALUE
	 * @generated
	 * @ordered
	 */
	ARMED_ATTACK(0, "armedAttack", "armedAttack"),

	/**
	 * The '<em><b>Arson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARSON_VALUE
	 * @generated
	 * @ordered
	 */
	ARSON(1, "arson", "arson"),

	/**
	 * The '<em><b>Barricade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARRICADE_VALUE
	 * @generated
	 * @ordered
	 */
	BARRICADE(2, "barricade", "barricade"),

	/**
	 * The '<em><b>Bombing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOMBING_VALUE
	 * @generated
	 * @ordered
	 */
	BOMBING(3, "bombing", "bombing"),

	/**
	 * The '<em><b>Hijacking</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIJACKING_VALUE
	 * @generated
	 * @ordered
	 */
	HIJACKING(4, "hijacking", "hijacking"),

	/**
	 * The '<em><b>Hostage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	HOSTAGE(5, "hostage", "hostage"),

	/**
	 * The '<em><b>Intrusion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRUSION_VALUE
	 * @generated
	 * @ordered
	 */
	INTRUSION(6, "intrusion", "intrusion"),

	/**
	 * The '<em><b>Kidnapping</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KIDNAPPING_VALUE
	 * @generated
	 * @ordered
	 */
	KIDNAPPING(7, "kidnapping", "kidnapping"),

	/**
	 * The '<em><b>Sabotage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SABOTAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SABOTAGE(8, "sabotage", "sabotage"),

	/**
	 * The '<em><b>Suicide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUICIDE_VALUE
	 * @generated
	 * @ordered
	 */
	SUICIDE(9, "suicide", "suicide"),

	/**
	 * The '<em><b>Dispersion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPERSION_VALUE
	 * @generated
	 * @ordered
	 */
	DISPERSION(10, "dispersion", "dispersion");

	/**
	 * The '<em><b>Armed Attack</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Armed Attack</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARMED_ATTACK
	 * @model name="armedAttack"
	 * @generated
	 * @ordered
	 */
	public static final int ARMED_ATTACK_VALUE = 0;

	/**
	 * The '<em><b>Arson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arson</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARSON
	 * @model name="arson"
	 * @generated
	 * @ordered
	 */
	public static final int ARSON_VALUE = 1;

	/**
	 * The '<em><b>Barricade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Barricade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARRICADE
	 * @model name="barricade"
	 * @generated
	 * @ordered
	 */
	public static final int BARRICADE_VALUE = 2;

	/**
	 * The '<em><b>Bombing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bombing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOMBING
	 * @model name="bombing"
	 * @generated
	 * @ordered
	 */
	public static final int BOMBING_VALUE = 3;

	/**
	 * The '<em><b>Hijacking</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hijacking</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIJACKING
	 * @model name="hijacking"
	 * @generated
	 * @ordered
	 */
	public static final int HIJACKING_VALUE = 4;

	/**
	 * The '<em><b>Hostage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hostage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOSTAGE
	 * @model name="hostage"
	 * @generated
	 * @ordered
	 */
	public static final int HOSTAGE_VALUE = 5;

	/**
	 * The '<em><b>Intrusion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intrusion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTRUSION
	 * @model name="intrusion"
	 * @generated
	 * @ordered
	 */
	public static final int INTRUSION_VALUE = 6;

	/**
	 * The '<em><b>Kidnapping</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kidnapping</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KIDNAPPING
	 * @model name="kidnapping"
	 * @generated
	 * @ordered
	 */
	public static final int KIDNAPPING_VALUE = 7;

	/**
	 * The '<em><b>Sabotage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sabotage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SABOTAGE
	 * @model name="sabotage"
	 * @generated
	 * @ordered
	 */
	public static final int SABOTAGE_VALUE = 8;

	/**
	 * The '<em><b>Suicide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suicide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUICIDE
	 * @model name="suicide"
	 * @generated
	 * @ordered
	 */
	public static final int SUICIDE_VALUE = 9;

	/**
	 * The '<em><b>Dispersion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispersion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPERSION
	 * @model name="dispersion"
	 * @generated
	 * @ordered
	 */
	public static final int DISPERSION_VALUE = 10;

	/**
	 * An array of all the '<em><b>Tactic</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Tactic[] VALUES_ARRAY =
		new Tactic[] {
			ARMED_ATTACK,
			ARSON,
			BARRICADE,
			BOMBING,
			HIJACKING,
			HOSTAGE,
			INTRUSION,
			KIDNAPPING,
			SABOTAGE,
			SUICIDE,
			DISPERSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Tactic</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Tactic> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tactic</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tactic get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tactic result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tactic</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tactic getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Tactic result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tactic</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Tactic get(int value) {
		switch (value) {
			case ARMED_ATTACK_VALUE: return ARMED_ATTACK;
			case ARSON_VALUE: return ARSON;
			case BARRICADE_VALUE: return BARRICADE;
			case BOMBING_VALUE: return BOMBING;
			case HIJACKING_VALUE: return HIJACKING;
			case HOSTAGE_VALUE: return HOSTAGE;
			case INTRUSION_VALUE: return INTRUSION;
			case KIDNAPPING_VALUE: return KIDNAPPING;
			case SABOTAGE_VALUE: return SABOTAGE;
			case SUICIDE_VALUE: return SUICIDE;
			case DISPERSION_VALUE: return DISPERSION;
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
	private Tactic(int value, String name, String literal) {
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
	
} //Tactic
