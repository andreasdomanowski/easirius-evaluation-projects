/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelFactory
 * @model kind="package"
 * @generated
 */
public interface MorecomplexmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "morecomplexmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.domanowski.net/morecomplexmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "morecomplexmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MorecomplexmodelPackage eINSTANCE = net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.ModelImpl
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NODES = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.AbstractNodeImpl
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Inherited Hidden Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.EllipseNodeImpl <em>Ellipse Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.EllipseNodeImpl
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl#getEllipseNode()
	 * @generated
	 */
	int ELLIPSE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_NODE__LABEL = ABSTRACT_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Inherited Hidden Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_NODE__INHERITED_HIDDEN_ATTRIBUTE = ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Next Rectangle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_NODE__NEXT_RECTANGLE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ellipse Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_NODE__ELLIPSE_SIBLINGS = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hidden Ellipse Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ellipse Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ellipse Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELLIPSE_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.RectangleNodeImpl <em>Rectangle Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.RectangleNodeImpl
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl#getRectangleNode()
	 * @generated
	 */
	int RECTANGLE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_NODE__LABEL = ABSTRACT_NODE__LABEL;

	/**
	 * The feature id for the '<em><b>Inherited Hidden Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_NODE__INHERITED_HIDDEN_ATTRIBUTE = ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Next Ellipse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_NODE__NEXT_ELLIPSE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rectangle Siblings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_NODE__RECTANGLE_SIBLINGS = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hidden Rectangle Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_NODE__HIDDEN_RECTANGLE_ATTRIBUTE = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rectangle Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rectangle Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_NODE_OPERATION_COUNT = ABSTRACT_NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.Model#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.Model#getNodes()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Nodes();

	/**
	 * Returns the meta object for class '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the attribute '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode#getLabel()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode#getInheritedHiddenAttribute <em>Inherited Hidden Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherited Hidden Attribute</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode#getInheritedHiddenAttribute()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_InheritedHiddenAttribute();

	/**
	 * Returns the meta object for class '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode <em>Ellipse Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ellipse Node</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode
	 * @generated
	 */
	EClass getEllipseNode();

	/**
	 * Returns the meta object for the reference '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getNextRectangle <em>Next Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Rectangle</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getNextRectangle()
	 * @see #getEllipseNode()
	 * @generated
	 */
	EReference getEllipseNode_NextRectangle();

	/**
	 * Returns the meta object for the reference list '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getEllipseSiblings <em>Ellipse Siblings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ellipse Siblings</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getEllipseSiblings()
	 * @see #getEllipseNode()
	 * @generated
	 */
	EReference getEllipseNode_EllipseSiblings();

	/**
	 * Returns the meta object for the attribute '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getHiddenEllipseAttribute <em>Hidden Ellipse Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden Ellipse Attribute</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode#getHiddenEllipseAttribute()
	 * @see #getEllipseNode()
	 * @generated
	 */
	EAttribute getEllipseNode_HiddenEllipseAttribute();

	/**
	 * Returns the meta object for class '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode <em>Rectangle Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle Node</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode
	 * @generated
	 */
	EClass getRectangleNode();

	/**
	 * Returns the meta object for the reference '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getNextEllipse <em>Next Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Ellipse</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getNextEllipse()
	 * @see #getRectangleNode()
	 * @generated
	 */
	EReference getRectangleNode_NextEllipse();

	/**
	 * Returns the meta object for the reference list '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getRectangleSiblings <em>Rectangle Siblings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rectangle Siblings</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getRectangleSiblings()
	 * @see #getRectangleNode()
	 * @generated
	 */
	EReference getRectangleNode_RectangleSiblings();

	/**
	 * Returns the meta object for the attribute '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getHiddenRectangleAttribute <em>Hidden Rectangle Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden Rectangle Attribute</em>'.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode#getHiddenRectangleAttribute()
	 * @see #getRectangleNode()
	 * @generated
	 */
	EAttribute getRectangleNode_HiddenRectangleAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MorecomplexmodelFactory getMorecomplexmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.ModelImpl
		 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__NODES = eINSTANCE.getModel_Nodes();

		/**
		 * The meta object literal for the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.AbstractNodeImpl
		 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__LABEL = eINSTANCE.getAbstractNode_Label();

		/**
		 * The meta object literal for the '<em><b>Inherited Hidden Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE = eINSTANCE.getAbstractNode_InheritedHiddenAttribute();

		/**
		 * The meta object literal for the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.EllipseNodeImpl <em>Ellipse Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.EllipseNodeImpl
		 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl#getEllipseNode()
		 * @generated
		 */
		EClass ELLIPSE_NODE = eINSTANCE.getEllipseNode();

		/**
		 * The meta object literal for the '<em><b>Next Rectangle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE_NODE__NEXT_RECTANGLE = eINSTANCE.getEllipseNode_NextRectangle();

		/**
		 * The meta object literal for the '<em><b>Ellipse Siblings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELLIPSE_NODE__ELLIPSE_SIBLINGS = eINSTANCE.getEllipseNode_EllipseSiblings();

		/**
		 * The meta object literal for the '<em><b>Hidden Ellipse Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE = eINSTANCE.getEllipseNode_HiddenEllipseAttribute();

		/**
		 * The meta object literal for the '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.RectangleNodeImpl <em>Rectangle Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.RectangleNodeImpl
		 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelPackageImpl#getRectangleNode()
		 * @generated
		 */
		EClass RECTANGLE_NODE = eINSTANCE.getRectangleNode();

		/**
		 * The meta object literal for the '<em><b>Next Ellipse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE_NODE__NEXT_ELLIPSE = eINSTANCE.getRectangleNode_NextEllipse();

		/**
		 * The meta object literal for the '<em><b>Rectangle Siblings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE_NODE__RECTANGLE_SIBLINGS = eINSTANCE.getRectangleNode_RectangleSiblings();

		/**
		 * The meta object literal for the '<em><b>Hidden Rectangle Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_NODE__HIDDEN_RECTANGLE_ATTRIBUTE = eINSTANCE.getRectangleNode_HiddenRectangleAttribute();

	}

} //MorecomplexmodelPackage
