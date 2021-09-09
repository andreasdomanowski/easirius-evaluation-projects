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
 * An implementation of the model object '<em><b>Ellipse Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.EllipseNodeImpl#getNextRectangle <em>Next Rectangle</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.EllipseNodeImpl#getEllipseSiblings <em>Ellipse Siblings</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.EllipseNodeImpl#getHiddenEllipseAttribute <em>Hidden Ellipse Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EllipseNodeImpl extends AbstractNodeImpl implements EllipseNode {
	/**
	 * The cached value of the '{@link #getNextRectangle() <em>Next Rectangle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextRectangle()
	 * @generated
	 * @ordered
	 */
	protected RectangleNode nextRectangle;

	/**
	 * The cached value of the '{@link #getEllipseSiblings() <em>Ellipse Siblings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipseSiblings()
	 * @generated
	 * @ordered
	 */
	protected EList<EllipseNode> ellipseSiblings;

	/**
	 * The default value of the '{@link #getHiddenEllipseAttribute() <em>Hidden Ellipse Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenEllipseAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String HIDDEN_ELLIPSE_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHiddenEllipseAttribute() <em>Hidden Ellipse Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHiddenEllipseAttribute()
	 * @generated
	 * @ordered
	 */
	protected String hiddenEllipseAttribute = HIDDEN_ELLIPSE_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipseNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MorecomplexmodelPackage.Literals.ELLIPSE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleNode getNextRectangle() {
		if (nextRectangle != null && nextRectangle.eIsProxy()) {
			InternalEObject oldNextRectangle = (InternalEObject) nextRectangle;
			nextRectangle = (RectangleNode) eResolveProxy(oldNextRectangle);
			if (nextRectangle != oldNextRectangle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MorecomplexmodelPackage.ELLIPSE_NODE__NEXT_RECTANGLE, oldNextRectangle, nextRectangle));
			}
		}
		return nextRectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleNode basicGetNextRectangle() {
		return nextRectangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextRectangle(RectangleNode newNextRectangle) {
		RectangleNode oldNextRectangle = nextRectangle;
		nextRectangle = newNextRectangle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MorecomplexmodelPackage.ELLIPSE_NODE__NEXT_RECTANGLE,
					oldNextRectangle, nextRectangle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EllipseNode> getEllipseSiblings() {
		if (ellipseSiblings == null) {
			ellipseSiblings = new EObjectResolvingEList<EllipseNode>(EllipseNode.class, this,
					MorecomplexmodelPackage.ELLIPSE_NODE__ELLIPSE_SIBLINGS);
		}
		return ellipseSiblings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHiddenEllipseAttribute() {
		return hiddenEllipseAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHiddenEllipseAttribute(String newHiddenEllipseAttribute) {
		String oldHiddenEllipseAttribute = hiddenEllipseAttribute;
		hiddenEllipseAttribute = newHiddenEllipseAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MorecomplexmodelPackage.ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE, oldHiddenEllipseAttribute,
					hiddenEllipseAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MorecomplexmodelPackage.ELLIPSE_NODE__NEXT_RECTANGLE:
			if (resolve)
				return getNextRectangle();
			return basicGetNextRectangle();
		case MorecomplexmodelPackage.ELLIPSE_NODE__ELLIPSE_SIBLINGS:
			return getEllipseSiblings();
		case MorecomplexmodelPackage.ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE:
			return getHiddenEllipseAttribute();
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
		case MorecomplexmodelPackage.ELLIPSE_NODE__NEXT_RECTANGLE:
			setNextRectangle((RectangleNode) newValue);
			return;
		case MorecomplexmodelPackage.ELLIPSE_NODE__ELLIPSE_SIBLINGS:
			getEllipseSiblings().clear();
			getEllipseSiblings().addAll((Collection<? extends EllipseNode>) newValue);
			return;
		case MorecomplexmodelPackage.ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE:
			setHiddenEllipseAttribute((String) newValue);
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
		case MorecomplexmodelPackage.ELLIPSE_NODE__NEXT_RECTANGLE:
			setNextRectangle((RectangleNode) null);
			return;
		case MorecomplexmodelPackage.ELLIPSE_NODE__ELLIPSE_SIBLINGS:
			getEllipseSiblings().clear();
			return;
		case MorecomplexmodelPackage.ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE:
			setHiddenEllipseAttribute(HIDDEN_ELLIPSE_ATTRIBUTE_EDEFAULT);
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
		case MorecomplexmodelPackage.ELLIPSE_NODE__NEXT_RECTANGLE:
			return nextRectangle != null;
		case MorecomplexmodelPackage.ELLIPSE_NODE__ELLIPSE_SIBLINGS:
			return ellipseSiblings != null && !ellipseSiblings.isEmpty();
		case MorecomplexmodelPackage.ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE:
			return HIDDEN_ELLIPSE_ATTRIBUTE_EDEFAULT == null ? hiddenEllipseAttribute != null
					: !HIDDEN_ELLIPSE_ATTRIBUTE_EDEFAULT.equals(hiddenEllipseAttribute);
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
		result.append(" (hiddenEllipseAttribute: ");
		result.append(hiddenEllipseAttribute);
		result.append(')');
		return result.toString();
	}

} //EllipseNodeImpl
