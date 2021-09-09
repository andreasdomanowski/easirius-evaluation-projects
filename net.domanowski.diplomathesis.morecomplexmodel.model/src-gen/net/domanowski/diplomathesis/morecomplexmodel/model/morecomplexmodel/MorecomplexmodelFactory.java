/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage
 * @generated
 */
public interface MorecomplexmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MorecomplexmodelFactory eINSTANCE = net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.impl.MorecomplexmodelFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Ellipse Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ellipse Node</em>'.
	 * @generated
	 */
	EllipseNode createEllipseNode();

	/**
	 * Returns a new object of class '<em>Rectangle Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle Node</em>'.
	 * @generated
	 */
	RectangleNode createRectangleNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MorecomplexmodelPackage getMorecomplexmodelPackage();

} //MorecomplexmodelFactory
