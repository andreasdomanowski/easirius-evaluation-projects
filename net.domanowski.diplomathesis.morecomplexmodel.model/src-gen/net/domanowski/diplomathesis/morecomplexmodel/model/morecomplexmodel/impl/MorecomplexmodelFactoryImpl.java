/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl;

import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MorecomplexmodelFactoryImpl extends EFactoryImpl implements MorecomplexmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MorecomplexmodelFactory init() {
		try {
			MorecomplexmodelFactory theMorecomplexmodelFactory = (MorecomplexmodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MorecomplexmodelPackage.eNS_URI);
			if (theMorecomplexmodelFactory != null) {
				return theMorecomplexmodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MorecomplexmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MorecomplexmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MorecomplexmodelPackage.MODEL:
			return createModel();
		case MorecomplexmodelPackage.ELLIPSE_NODE:
			return createEllipseNode();
		case MorecomplexmodelPackage.RECTANGLE_NODE:
			return createRectangleNode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseNode createEllipseNode() {
		EllipseNodeImpl ellipseNode = new EllipseNodeImpl();
		return ellipseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleNode createRectangleNode() {
		RectangleNodeImpl rectangleNode = new RectangleNodeImpl();
		return rectangleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MorecomplexmodelPackage getMorecomplexmodelPackage() {
		return (MorecomplexmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MorecomplexmodelPackage getPackage() {
		return MorecomplexmodelPackage.eINSTANCE;
	}

} //MorecomplexmodelFactoryImpl
