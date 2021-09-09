/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl;

import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.Model;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelFactory;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MorecomplexmodelPackageImpl extends EPackageImpl implements MorecomplexmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleNodeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MorecomplexmodelPackageImpl() {
		super(eNS_URI, MorecomplexmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MorecomplexmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MorecomplexmodelPackage init() {
		if (isInited)
			return (MorecomplexmodelPackage) EPackage.Registry.INSTANCE.getEPackage(MorecomplexmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMorecomplexmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MorecomplexmodelPackageImpl theMorecomplexmodelPackage = registeredMorecomplexmodelPackage instanceof MorecomplexmodelPackageImpl
				? (MorecomplexmodelPackageImpl) registeredMorecomplexmodelPackage
				: new MorecomplexmodelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMorecomplexmodelPackage.createPackageContents();

		// Initialize created meta-data
		theMorecomplexmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMorecomplexmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MorecomplexmodelPackage.eNS_URI, theMorecomplexmodelPackage);
		return theMorecomplexmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Nodes() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_Label() {
		return (EAttribute) abstractNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractNode_InheritedHiddenAttribute() {
		return (EAttribute) abstractNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipseNode() {
		return ellipseNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipseNode_NextRectangle() {
		return (EReference) ellipseNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipseNode_EllipseSiblings() {
		return (EReference) ellipseNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseNode_HiddenEllipseAttribute() {
		return (EAttribute) ellipseNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangleNode() {
		return rectangleNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangleNode_NextEllipse() {
		return (EReference) rectangleNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangleNode_RectangleSiblings() {
		return (EReference) rectangleNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleNode_HiddenRectangleAttribute() {
		return (EAttribute) rectangleNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MorecomplexmodelFactory getMorecomplexmodelFactory() {
		return (MorecomplexmodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__NODES);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__LABEL);
		createEAttribute(abstractNodeEClass, ABSTRACT_NODE__INHERITED_HIDDEN_ATTRIBUTE);

		ellipseNodeEClass = createEClass(ELLIPSE_NODE);
		createEReference(ellipseNodeEClass, ELLIPSE_NODE__NEXT_RECTANGLE);
		createEReference(ellipseNodeEClass, ELLIPSE_NODE__ELLIPSE_SIBLINGS);
		createEAttribute(ellipseNodeEClass, ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE);

		rectangleNodeEClass = createEClass(RECTANGLE_NODE);
		createEReference(rectangleNodeEClass, RECTANGLE_NODE__NEXT_ELLIPSE);
		createEReference(rectangleNodeEClass, RECTANGLE_NODE__RECTANGLE_SIBLINGS);
		createEAttribute(rectangleNodeEClass, RECTANGLE_NODE__HIDDEN_RECTANGLE_ATTRIBUTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ellipseNodeEClass.getESuperTypes().add(this.getAbstractNode());
		rectangleNodeEClass.getESuperTypes().add(this.getAbstractNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Nodes(), this.getAbstractNode(), null, "nodes", null, 0, -1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractNode_Label(), ecorePackage.getEString(), "label", null, 0, 1, AbstractNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractNode_InheritedHiddenAttribute(), ecorePackage.getEString(),
				"inheritedHiddenAttribute", "", 0, 1, AbstractNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ellipseNodeEClass, EllipseNode.class, "EllipseNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEllipseNode_NextRectangle(), this.getRectangleNode(), null, "nextRectangle", null, 0, 1,
				EllipseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipseNode_EllipseSiblings(), this.getEllipseNode(), null, "ellipseSiblings", null, 0, -1,
				EllipseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipseNode_HiddenEllipseAttribute(), ecorePackage.getEString(), "hiddenEllipseAttribute",
				null, 0, 1, EllipseNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleNodeEClass, RectangleNode.class, "RectangleNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangleNode_NextEllipse(), this.getEllipseNode(), null, "nextEllipse", null, 0, 1,
				RectangleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRectangleNode_RectangleSiblings(), this.getRectangleNode(), null, "rectangleSiblings", null,
				0, -1, RectangleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleNode_HiddenRectangleAttribute(), ecorePackage.getEString(),
				"hiddenRectangleAttribute", null, 0, 1, RectangleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MorecomplexmodelPackageImpl
