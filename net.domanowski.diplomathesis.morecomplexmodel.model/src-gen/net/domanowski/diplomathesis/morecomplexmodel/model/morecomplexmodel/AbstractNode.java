/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode#getLabel <em>Label</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode#getInheritedHiddenAttribute <em>Inherited Hidden Attribute</em>}</li>
 * </ul>
 *
 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getAbstractNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getAbstractNode_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Inherited Hidden Attribute</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherited Hidden Attribute</em>' attribute.
	 * @see #setInheritedHiddenAttribute(String)
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getAbstractNode_InheritedHiddenAttribute()
	 * @model default=""
	 * @generated
	 */
	String getInheritedHiddenAttribute();

	/**
	 * Sets the value of the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode#getInheritedHiddenAttribute <em>Inherited Hidden Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherited Hidden Attribute</em>' attribute.
	 * @see #getInheritedHiddenAttribute()
	 * @generated
	 */
	void setInheritedHiddenAttribute(String value);

} // AbstractNode
