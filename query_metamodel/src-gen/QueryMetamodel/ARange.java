/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.ARange#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link QueryMetamodel.ARange#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getARange()
 * @model
 * @generated
 */
public interface ARange extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getARange_Quantity()
	 * @model default="0"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ARange#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' attribute.
	 * The default value is <code>"random"</code>.
	 * The literals are from the enumeration {@link QueryMetamodel.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' attribute.
	 * @see QueryMetamodel.Order
	 * @see #setOrder(Order)
	 * @see QueryMetamodel.Query_metamodelPackage#getARange_Order()
	 * @model default="random"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ARange#getOrder <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' attribute.
	 * @see QueryMetamodel.Order
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

} // ARange
