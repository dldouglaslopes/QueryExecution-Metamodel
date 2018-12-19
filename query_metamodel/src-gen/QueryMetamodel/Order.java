/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.Order#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"random"</code>.
	 * The literals are from the enumeration {@link QueryMetamodel.Qualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see QueryMetamodel.Qualifier
	 * @see #setOrder(Qualifier)
	 * @see QueryMetamodel.Query_metamodelPackage#getOrder_Order()
	 * @model default="random"
	 * @generated
	 */
	Qualifier getOrder();

	/**
	 * Sets the value of the '{@link QueryMetamodel.Order#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see QueryMetamodel.Qualifier
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Qualifier value);

} // Order
