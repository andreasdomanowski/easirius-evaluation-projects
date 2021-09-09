/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.Model#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.AbstractNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage#getModel_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractNode> getNodes();

} // Model
