/**
 */
package net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.provider;

import java.util.Collection;
import java.util.List;

import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode;
import net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.MorecomplexmodelPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.domanowski.diplomathesis.morecomplexmodel.model.morecomplexmodel.EllipseNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EllipseNodeItemProvider extends AbstractNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNextRectanglePropertyDescriptor(object);
			addEllipseSiblingsPropertyDescriptor(object);
			addHiddenEllipseAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Next Rectangle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNextRectanglePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EllipseNode_nextRectangle_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_EllipseNode_nextRectangle_feature",
								"_UI_EllipseNode_type"),
						MorecomplexmodelPackage.Literals.ELLIPSE_NODE__NEXT_RECTANGLE, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Ellipse Siblings feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEllipseSiblingsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EllipseNode_ellipseSiblings_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_EllipseNode_ellipseSiblings_feature",
						"_UI_EllipseNode_type"),
				MorecomplexmodelPackage.Literals.ELLIPSE_NODE__ELLIPSE_SIBLINGS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Hidden Ellipse Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHiddenEllipseAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_EllipseNode_hiddenEllipseAttribute_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_EllipseNode_hiddenEllipseAttribute_feature", "_UI_EllipseNode_type"),
						MorecomplexmodelPackage.Literals.ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns EllipseNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EllipseNode"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EllipseNode) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_EllipseNode_type")
				: getString("_UI_EllipseNode_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EllipseNode.class)) {
		case MorecomplexmodelPackage.ELLIPSE_NODE__HIDDEN_ELLIPSE_ATTRIBUTE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
