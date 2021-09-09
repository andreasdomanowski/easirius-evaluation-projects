/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getNextRectangle <em>Next Rectangle</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getEllipseSiblings <em>Ellipse Siblings</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getHiddenEllipseAttribute <em>Hidden Ellipse Attribute</em>}</li>
 * </ul>
 *
 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getEllipseNode()
 * @model
 * @generated
 */
public interface EllipseNode extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Next Rectangle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Rectangle</em>' reference.
	 * @see #setNextRectangle(RectangleNode)
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getEllipseNode_NextRectangle()
	 * @model
	 * @generated
	 */
	RectangleNode getNextRectangle();

	/**
	 * Sets the value of the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getNextRectangle <em>Next Rectangle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Rectangle</em>' reference.
	 * @see #getNextRectangle()
	 * @generated
	 */
	void setNextRectangle(RectangleNode value);

	/**
	 * Returns the value of the '<em><b>Ellipse Siblings</b></em>' reference list.
	 * The list contents are of type {@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ellipse Siblings</em>' reference list.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getEllipseNode_EllipseSiblings()
	 * @model
	 * @generated
	 */
	EList<EllipseNode> getEllipseSiblings();

	/**
	 * Returns the value of the '<em><b>Hidden Ellipse Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Ellipse Attribute</em>' attribute.
	 * @see #setHiddenEllipseAttribute(String)
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getEllipseNode_HiddenEllipseAttribute()
	 * @model
	 * @generated
	 */
	String getHiddenEllipseAttribute();

	/**
	 * Sets the value of the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getHiddenEllipseAttribute <em>Hidden Ellipse Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden Ellipse Attribute</em>' attribute.
	 * @see #getHiddenEllipseAttribute()
	 * @generated
	 */
	void setHiddenEllipseAttribute(String value);

} // EllipseNode
