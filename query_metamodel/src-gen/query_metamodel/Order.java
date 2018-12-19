/**
 */
package query_metamodel;

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
 *   <li>{@link query_metamodel.Order#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see query_metamodel.Query_metamodelPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"random"</code>.
	 * The literals are from the enumeration {@link query_metamodel.Qualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see query_metamodel.Qualifier
	 * @see #setOrder(Qualifier)
	 * @see query_metamodel.Query_metamodelPackage#getOrder_Order()
	 * @model default="random"
	 * @generated
	 */
	Qualifier getOrder();

	/**
	 * Sets the value of the '{@link query_metamodel.Order#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see query_metamodel.Qualifier
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Qualifier value);

} // Order
