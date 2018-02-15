/**
 */
package CipVamprofile.CipVamLibrary.GeometricDT.impl;

import CipVamprofile.CipVamLibrary.GeometricDT.Angle;
import CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage;
import CipVamprofile.CipVamLibrary.GeometricDT.Point;
import CipVamprofile.CipVamLibrary.GeometricDT.PolygonType;
import CipVamprofile.CipVamLibrary.GeometricDT.Shape;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getType <em>Type</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getArea <em>Area</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getCentre <em>Centre</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeImpl extends MinimalEObjectImpl.Container implements Shape {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PolygonType TYPE_EDEFAULT = PolygonType.POLYGON;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PolygonType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> vertices;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerimeter() <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeter()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerimeter() <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeter()
	 * @generated
	 * @ordered
	 */
	protected String perimeter = PERIMETER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCentre() <em>Centre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentre()
	 * @generated
	 * @ordered
	 */
	protected Point centre;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final String RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected String radius = RADIUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected Angle angle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometricDTPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PolygonType newType) {
		PolygonType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Point> getVertices() {
		if (vertices == null) {
			vertices = new EObjectContainmentEList<Point>(Point.class, this, GeometricDTPackage.SHAPE__VERTICES);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerimeter() {
		return perimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerimeter(String newPerimeter) {
		String oldPerimeter = perimeter;
		perimeter = newPerimeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__PERIMETER, oldPerimeter, perimeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getCentre() {
		return centre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCentre(Point newCentre, NotificationChain msgs) {
		Point oldCentre = centre;
		centre = newCentre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__CENTRE, oldCentre, newCentre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentre(Point newCentre) {
		if (newCentre != centre) {
			NotificationChain msgs = null;
			if (centre != null)
				msgs = ((InternalEObject)centre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeometricDTPackage.SHAPE__CENTRE, null, msgs);
			if (newCentre != null)
				msgs = ((InternalEObject)newCentre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeometricDTPackage.SHAPE__CENTRE, null, msgs);
			msgs = basicSetCentre(newCentre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__CENTRE, newCentre, newCentre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(String newRadius) {
		String oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Angle getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngle(Angle newAngle, NotificationChain msgs) {
		Angle oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__ANGLE, oldAngle, newAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(Angle newAngle) {
		if (newAngle != angle) {
			NotificationChain msgs = null;
			if (angle != null)
				msgs = ((InternalEObject)angle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeometricDTPackage.SHAPE__ANGLE, null, msgs);
			if (newAngle != null)
				msgs = ((InternalEObject)newAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeometricDTPackage.SHAPE__ANGLE, null, msgs);
			msgs = basicSetAngle(newAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeometricDTPackage.SHAPE__ANGLE, newAngle, newAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeometricDTPackage.SHAPE__VERTICES:
				return ((InternalEList<?>)getVertices()).basicRemove(otherEnd, msgs);
			case GeometricDTPackage.SHAPE__CENTRE:
				return basicSetCentre(null, msgs);
			case GeometricDTPackage.SHAPE__ANGLE:
				return basicSetAngle(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeometricDTPackage.SHAPE__TYPE:
				return getType();
			case GeometricDTPackage.SHAPE__VERTICES:
				return getVertices();
			case GeometricDTPackage.SHAPE__AREA:
				return getArea();
			case GeometricDTPackage.SHAPE__PERIMETER:
				return getPerimeter();
			case GeometricDTPackage.SHAPE__CENTRE:
				return getCentre();
			case GeometricDTPackage.SHAPE__LENGTH:
				return getLength();
			case GeometricDTPackage.SHAPE__WIDTH:
				return getWidth();
			case GeometricDTPackage.SHAPE__RADIUS:
				return getRadius();
			case GeometricDTPackage.SHAPE__ANGLE:
				return getAngle();
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
			case GeometricDTPackage.SHAPE__TYPE:
				setType((PolygonType)newValue);
				return;
			case GeometricDTPackage.SHAPE__VERTICES:
				getVertices().clear();
				getVertices().addAll((Collection<? extends Point>)newValue);
				return;
			case GeometricDTPackage.SHAPE__AREA:
				setArea((String)newValue);
				return;
			case GeometricDTPackage.SHAPE__PERIMETER:
				setPerimeter((String)newValue);
				return;
			case GeometricDTPackage.SHAPE__CENTRE:
				setCentre((Point)newValue);
				return;
			case GeometricDTPackage.SHAPE__LENGTH:
				setLength((String)newValue);
				return;
			case GeometricDTPackage.SHAPE__WIDTH:
				setWidth((String)newValue);
				return;
			case GeometricDTPackage.SHAPE__RADIUS:
				setRadius((String)newValue);
				return;
			case GeometricDTPackage.SHAPE__ANGLE:
				setAngle((Angle)newValue);
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
			case GeometricDTPackage.SHAPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GeometricDTPackage.SHAPE__VERTICES:
				getVertices().clear();
				return;
			case GeometricDTPackage.SHAPE__AREA:
				setArea(AREA_EDEFAULT);
				return;
			case GeometricDTPackage.SHAPE__PERIMETER:
				setPerimeter(PERIMETER_EDEFAULT);
				return;
			case GeometricDTPackage.SHAPE__CENTRE:
				setCentre((Point)null);
				return;
			case GeometricDTPackage.SHAPE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case GeometricDTPackage.SHAPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GeometricDTPackage.SHAPE__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
			case GeometricDTPackage.SHAPE__ANGLE:
				setAngle((Angle)null);
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
			case GeometricDTPackage.SHAPE__TYPE:
				return type != TYPE_EDEFAULT;
			case GeometricDTPackage.SHAPE__VERTICES:
				return vertices != null && !vertices.isEmpty();
			case GeometricDTPackage.SHAPE__AREA:
				return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
			case GeometricDTPackage.SHAPE__PERIMETER:
				return PERIMETER_EDEFAULT == null ? perimeter != null : !PERIMETER_EDEFAULT.equals(perimeter);
			case GeometricDTPackage.SHAPE__CENTRE:
				return centre != null;
			case GeometricDTPackage.SHAPE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case GeometricDTPackage.SHAPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case GeometricDTPackage.SHAPE__RADIUS:
				return RADIUS_EDEFAULT == null ? radius != null : !RADIUS_EDEFAULT.equals(radius);
			case GeometricDTPackage.SHAPE__ANGLE:
				return angle != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", area: ");
		result.append(area);
		result.append(", perimeter: ");
		result.append(perimeter);
		result.append(", length: ");
		result.append(length);
		result.append(", width: ");
		result.append(width);
		result.append(", radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}

} //ShapeImpl
