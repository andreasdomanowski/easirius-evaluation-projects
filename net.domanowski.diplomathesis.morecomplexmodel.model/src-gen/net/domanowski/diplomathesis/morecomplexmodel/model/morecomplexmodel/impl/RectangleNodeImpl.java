/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl;

import java.util.Collection;

import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.RectangleNodeImpl#getNextEllipse <em>Next Ellipse</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.RectangleNodeImpl#getRectangleSiblings <em>Rectangle Siblings</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.RectangleNodeImpl#getHiddenRectangleAttribute <em>Hidden Rectangle Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleNodeImpl extends AbstractNodeImpl implements RectangleNode {
	/**
	 * The cached value of the '{@link #getNextEllipse() <em>Next Ellipse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextEllipse()
	 * @generated
	 * @ordered
	 */
	protected EllipseNode nextEllipse;

	/**
	 * The cached value of the '{@link #getRectangleSiblings() <em>Rectangle Siblings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangleSiblings()
	 * @generated
	 * @ordered
	 */
	protected EList<RectangleNode> rectangleSiblings;

	/**
	 * The default value of the '{@link #getHiddenRectangleAttribute() <em>Hidden Rectangle Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenRectangleAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String HIDDEN_RECTANGLE_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHiddenRectangleAttribute() <em>Hidden Rectangle Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenRectangleAttribute()
	 * @generated
	 * @ordered
	 */
	protected String hiddenRectangleAttribute = HIDDEN_RECTANGLE_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RectangleNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MorecomplexmodelPackage.Literals.RECTANGLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseNode getNextEllipse() {
		if (nextEllipse != null && nextEllipse.eIsProxy()) {
			InternalEObject oldNextEllipse = (InternalEObject) nextEllipse;
			nextEllipse = (EllipseNode) eResolveProxy(oldNextEllipse);
			if (nextEllipse != oldNextEllipse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MorecomplexmodelPackage.RECTANGLE_NODE__NEXT_ELLIPSE, oldNextEllipse, nextEllipse));
			}
		}
		return nextEllipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseNode basicGetNextEllipse() {
		return nextEllipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextEllipse(EllipseNode newNextEllipse) {
		EllipseNode oldNextEllipse = nextEllipse;
		nextEllipse = newNextEllipse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MorecomplexmodelPackage.RECTANGLE_NODE__NEXT_ELLIPSE,
					oldNextEllipse, nextEllipse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RectangleNode> getRectangleSiblings() {
		if (rectangleSiblings == null) {
			rectangleSiblings = new EObjectResolvingEList<RectangleNode>(RectangleNode.class, this,
					MorecomplexmodelPackage.RECTANGLE_NODE__RECTANGLE_SIBLINGS);
		}
		return rectangleSiblings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHiddenRectangleAttribute() {
		return hiddenRectangleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenRectangleAttribute(String newHiddenRectangleAttribute) {
		String oldHiddenRectangleAttribute = hiddenRectangleAttribute;
		hiddenRectangleAttribute = newHiddenRectangleAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MorecomplexmodelPackage.RECTANGLE_NODE__HIDDEN_RECTANGLE_ATTRIBUTE, oldHiddenRectangleAttribute,
					hiddenRectangleAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MorecomplexmodelPackage.RECTANGLE_NODE__NEXT_ELLIPSE:
			if (resolve)
				return getNextEllipse();
			return basicGetNextEllipse();
		case MorecomplexmodelPackage.RECTANGLE_NODE__RECTANGLE_SIBLINGS:
			return getRectangleSiblings();
		case MorecomplexmodelPackage.RECTANGLE_NODE__HIDDEN_RECTANGLE_ATTRIBUTE:
			return getHiddenRectangleAttribute();
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
		case MorecomplexmodelPackage.RECTANGLE_NODE__NEXT_ELLIPSE:
			setNextEllipse((EllipseNode) newValue);
			return;
		case MorecomplexmodelPackage.RECTANGLE_NODE__RECTANGLE_SIBLINGS:
			getRectangleSiblings().clear();
			getRectangleSiblings().addAll((Collection<? extends RectangleNode>) newValue);
			return;
		case MorecomplexmodelPackage.RECTANGLE_NODE__HIDDEN_RECTANGLE_ATTRIBUTE:
			setHiddenRectangleAttribute((String) newValue);
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
		case MorecomplexmodelPackage.RECTANGLE_NODE__NEXT_ELLIPSE:
			setNextEllipse((EllipseNode) null);
			return;
		case MorecomplexmodelPackage.RECTANGLE_NODE__RECTANGLE_SIBLINGS:
			getRectangleSiblings().clear();
			return;
		case MorecomplexmodelPackage.RECTANGLE_NODE__HIDDEN_RECTANGLE_ATTRIBUTE:
			setHiddenRectangleAttribute(HIDDEN_RECTANGLE_ATTRIBUTE_EDEFAULT);
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
		case MorecomplexmodelPackage.RECTANGLE_NODE__NEXT_ELLIPSE:
			return nextEllipse != null;
		case MorecomplexmodelPackage.RECTANGLE_NODE__RECTANGLE_SIBLINGS:
			return rectangleSiblings != null && !rectangleSiblings.isEmpty();
		case MorecomplexmodelPackage.RECTANGLE_NODE__HIDDEN_RECTANGLE_ATTRIBUTE:
			return HIDDEN_RECTANGLE_ATTRIBUTE_EDEFAULT == null ? hiddenRectangleAttribute != null
					: !HIDDEN_RECTANGLE_ATTRIBUTE_EDEFAULT.equals(hiddenRectangleAttribute);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (hiddenRectangleAttribute: ");
		result.append(hiddenRectangleAttribute);
		result.append(')');
		return result.toString();
	}

} //RectangleNodeImpl
