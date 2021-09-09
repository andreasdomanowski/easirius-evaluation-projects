/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getNextEllipse <em>Next Ellipse</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getRectangleSiblings <em>Rectangle Siblings</em>}</li>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getHiddenRectangleAttribute <em>Hidden Rectangle Attribute</em>}</li>
 * </ul>
 *
 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getRectangleNode()
 * @model
 * @generated
 */
public interface RectangleNode extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Next Ellipse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Ellipse</em>' reference.
	 * @see #setNextEllipse(EllipseNode)
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getRectangleNode_NextEllipse()
	 * @model
	 * @generated
	 */
	EllipseNode getNextEllipse();

	/**
	 * Sets the value of the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getNextEllipse <em>Next Ellipse</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Ellipse</em>' reference.
	 * @see #getNextEllipse()
	 * @generated
	 */
	void setNextEllipse(EllipseNode value);

	/**
	 * Returns the value of the '<em><b>Rectangle Siblings</b></em>' reference list.
	 * The list contents are of type {@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle Siblings</em>' reference list.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getRectangleNode_RectangleSiblings()
	 * @model
	 * @generated
	 */
	EList<RectangleNode> getRectangleSiblings();

	/**
	 * Returns the value of the '<em><b>Hidden Rectangle Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hidden Rectangle Attribute</em>' attribute.
	 * @see #setHiddenRectangleAttribute(String)
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getRectangleNode_HiddenRectangleAttribute()
	 * @model
	 * @generated
	 */
	String getHiddenRectangleAttribute();

	/**
	 * Sets the value of the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getHiddenRectangleAttribute <em>Hidden Rectangle Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hidden Rectangle Attribute</em>' attribute.
	 * @see #getHiddenRectangleAttribute()
	 * @generated
	 */
	void setHiddenRectangleAttribute(String value);

} // RectangleNode
