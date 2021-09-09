/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.util;

import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage
 * @generated
 */
public class MorecomplexmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MorecomplexmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MorecomplexmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MorecomplexmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MorecomplexmodelSwitch<Adapter> modelSwitch = new MorecomplexmodelSwitch<Adapter>() {
		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseAbstractNode(AbstractNode object) {
			return createAbstractNodeAdapter();
		}

		@Override
		public Adapter caseEllipseNode(EllipseNode object) {
			return createEllipseNodeAdapter();
		}

		@Override
		public Adapter caseRectangleNode(RectangleNode object) {
			return createRectangleNodeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode
	 * @generated
	 */
	public Adapter createAbstractNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode <em>Ellipse Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode
	 * @generated
	 */
	public Adapter createEllipseNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode <em>Rectangle Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.RectangleNode
	 * @generated
	 */
	public Adapter createRectangleNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MorecomplexmodelAdapterFactory
