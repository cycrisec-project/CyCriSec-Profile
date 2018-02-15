/**
 */
package CipVamprofile.impl;

import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.Interface;
import CipVamprofile.Site;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.InterfaceImpl#getExposures <em>Exposures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends PhysicalImpl implements Interface {
	/**
	 * The cached value of the '{@link #getExposures() <em>Exposures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposures()
	 * @generated
	 * @ordered
	 */
	protected EList<Site> exposures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Site> getExposures() {
		if (exposures == null) {
			exposures = new EObjectResolvingEList<Site>(Site.class, this, CipVamprofilePackage.INTERFACE__EXPOSURES);
		}
		return exposures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.INTERFACE__EXPOSURES:
				return getExposures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CipVamprofilePackage.INTERFACE__EXPOSURES:
				getExposures().clear();
				getExposures().addAll((Collection<? extends Site>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CipVamprofilePackage.INTERFACE__EXPOSURES:
				getExposures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CipVamprofilePackage.INTERFACE__EXPOSURES:
				return exposures != null && !exposures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
