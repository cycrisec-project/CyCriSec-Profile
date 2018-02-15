/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT.tests;

import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTFactory;
import CipVamprofile.CipVamLibrary.StructuredDT.Weapon;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Weapon</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WeaponTest extends TestCase {

	/**
	 * The fixture for this Weapon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Weapon fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WeaponTest.class);
	}

	/**
	 * Constructs a new Weapon test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeaponTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Weapon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Weapon fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Weapon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Weapon getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructuredDTFactory.eINSTANCE.createWeapon());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WeaponTest
