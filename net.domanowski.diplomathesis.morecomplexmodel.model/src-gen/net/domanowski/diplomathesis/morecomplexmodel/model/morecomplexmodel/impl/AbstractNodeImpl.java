/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl;

import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.AbstractNodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.AbstractNodeImpl#getInheritedHiddenAttribute <em>Inherited Hidden Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractNodeImpl extends MinimalEObjectImpl.Container implements AbstractNode {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInheritedHiddenAttribute() <em>Inherited Hidden Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedHiddenAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String INHERITED_HIDDEN_ATTRIBUTE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getInheritedHiddenAttribute() <em>Inherited Hidden Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritedHiddenAttribute()
	 * @generated
	 * @ordered
	 */
	protected String inheritedHiddenAttribute = INHERITED_HIDDEN_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MorecomplexmodelPackage.Literals.ABSTRACT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MorecomplexmodelPackage.ABSTRACT_NODE__LABEL,
					oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInheritedHiddenAttribute() {
		return inheritedHiddenAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritedHiddenAttribute(String newInheritedHiddenAttribute) {
		String oldInheritedHiddenAttribute = inheritedHiddenAttribute;
		inheritedHiddenAttribute = newInheritedHiddenAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MorecomplexmodelPackage.ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE, oldInheritedHiddenAttribute,
					inheritedHiddenAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MorecomplexmodelPackage.ABSTRACT_NODE__LABEL:
			return getLabel();
		case MorecomplexmodelPackage.ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE:
			return getInheritedHiddenAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MorecomplexmodelPackage.ABSTRACT_NODE__LABEL:
			setLabel((String) newValue);
			return;
		case MorecomplexmodelPackage.ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE:
			setInheritedHiddenAttribute((String) newValue);
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
		case MorecomplexmodelPackage.ABSTRACT_NODE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case MorecomplexmodelPackage.ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE:
			setInheritedHiddenAttribute(INHERITED_HIDDEN_ATTRIBUTE_EDEFAULT);
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
		case MorecomplexmodelPackage.ABSTRACT_NODE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case MorecomplexmodelPackage.ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE:
			return INHERITED_HIDDEN_ATTRIBUTE_EDEFAULT == null ? inheritedHiddenAttribute != null
					: !INHERITED_HIDDEN_ATTRIBUTE_EDEFAULT.equals(inheritedHiddenAttribute);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", inheritedHiddenAttribute: ");
		result.append(inheritedHiddenAttribute);
		result.append(')');
		return result.toString();
	}

} //AbstractNodeImpl
