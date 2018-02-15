/**
 */
package CipVamprofile.CipVamLibrary.BasicDT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Weapon Nature</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage#getWeaponNature()
 * @model
 * @generated
 */
public enum WeaponNature implements Enumerator {
	/**
	 * The '<em><b>Chemical Agent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	CHEMICAL_AGENT(0, "chemicalAgent", "chemicalAgent"),

	/**
	 * The '<em><b>Explosive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLOSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLOSIVE(1, "explosive", "explosive"),

	/**
	 * The '<em><b>Firebomb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREBOMB_VALUE
	 * @generated
	 * @ordered
	 */
	FIREBOMB(2, "firebomb", "firebomb"),

	/**
	 * The '<em><b>Firearm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIREARM_VALUE
	 * @generated
	 * @ordered
	 */
	FIREARM(3, "firearm", "firearm"),

	/**
	 * The '<em><b>Radiological Agent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIOLOGICAL_AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	RADIOLOGICAL_AGENT(4, "radiologicalAgent", "radiologicalAgent"),

	/**
	 * The '<em><b>Aerosol</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AEROSOL_VALUE
	 * @generated
	 * @ordered
	 */
	AEROSOL(5, "aerosol", "aerosol");

	/**
	 * The '<em><b>Chemical Agent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chemical Agent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEMICAL_AGENT
	 * @model name="chemicalAgent"
	 * @generated
	 * @ordered
	 */
	public static final int CHEMICAL_AGENT_VALUE = 0;

	/**
	 * The '<em><b>Explosive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Explosive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPLOSIVE
	 * @model name="explosive"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLOSIVE_VALUE = 1;

	/**
	 * The '<em><b>Firebomb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Firebomb</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIREBOMB
	 * @model name="firebomb"
	 * @generated
	 * @ordered
	 */
	public static final int FIREBOMB_VALUE = 2;

	/**
	 * The '<em><b>Firearm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Firearm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIREARM
	 * @model name="firearm"
	 * @generated
	 * @ordered
	 */
	public static final int FIREARM_VALUE = 3;

	/**
	 * The '<em><b>Radiological Agent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radiological Agent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIOLOGICAL_AGENT
	 * @model name="radiologicalAgent"
	 * @generated
	 * @ordered
	 */
	public static final int RADIOLOGICAL_AGENT_VALUE = 4;

	/**
	 * The '<em><b>Aerosol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aerosol</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AEROSOL
	 * @model name="aerosol"
	 * @generated
	 * @ordered
	 */
	public static final int AEROSOL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Weapon Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WeaponNature[] VALUES_ARRAY =
		new WeaponNature[] {
			CHEMICAL_AGENT,
			EXPLOSIVE,
			FIREBOMB,
			FIREARM,
			RADIOLOGICAL_AGENT,
			AEROSOL,
		};

	/**
	 * A public read-only list of all the '<em><b>Weapon Nature</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WeaponNature> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Weapon Nature</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeaponNature get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeaponNature result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weapon Nature</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeaponNature getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeaponNature result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weapon Nature</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeaponNature get(int value) {
		switch (value) {
			case CHEMICAL_AGENT_VALUE: return CHEMICAL_AGENT;
			case EXPLOSIVE_VALUE: return EXPLOSIVE;
			case FIREBOMB_VALUE: return FIREBOMB;
			case FIREARM_VALUE: return FIREARM;
			case RADIOLOGICAL_AGENT_VALUE: return RADIOLOGICAL_AGENT;
			case AEROSOL_VALUE: return AEROSOL;
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
	private WeaponNature(int value, String name, String literal) {
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
	
} //WeaponNature
