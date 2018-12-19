/**
 */
package query_metamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query_metamodel.Attribute#getSex <em>Sex</em>}</li>
 *   <li>{@link query_metamodel.Attribute#getOrder <em>Order</em>}</li>
 *   <li>{@link query_metamodel.Attribute#getAge <em>Age</em>}</li>
 *   <li>{@link query_metamodel.Attribute#getRange <em>Range</em>}</li>
 *   <li>{@link query_metamodel.Attribute#getField <em>Field</em>}</li>
 *   <li>{@link query_metamodel.Attribute#getDate <em>Date</em>}</li>
 *   <li>{@link query_metamodel.Attribute#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see query_metamodel.Query_metamodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' containment reference.
	 * @see #setSex(Sex)
	 * @see query_metamodel.Query_metamodelPackage#getAttribute_Sex()
	 * @model containment="true"
	 * @generated
	 */
	Sex getSex();

	/**
	 * Sets the value of the '{@link query_metamodel.Attribute#getSex <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' containment reference.
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Sex value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(Order)
	 * @see query_metamodel.Query_metamodelPackage#getAttribute_Order()
	 * @model containment="true"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link query_metamodel.Attribute#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference list.
	 * The list contents are of type {@link query_metamodel.Age}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' containment reference list.
	 * @see query_metamodel.Query_metamodelPackage#getAttribute_Age()
	 * @model containment="true"
	 * @generated
	 */
	EList<Age> getAge();

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see query_metamodel.Query_metamodelPackage#getAttribute_Range()
	 * @model containment="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link query_metamodel.Attribute#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link query_metamodel.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see query_metamodel.Query_metamodelPackage#getAttribute_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link query_metamodel.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see query_metamodel.Query_metamodelPackage#getAttribute_Date()
	 * @model containment="true"
	 * @generated
	 */
	EList<Date> getDate();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @see query_metamodel.Query_metamodelPackage#getAttribute_Status()
	 * @model containment="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link query_metamodel.Attribute#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // Attribute
