/**
 */
package query_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query_metamodel.Date#getFrom <em>From</em>}</li>
 *   <li>{@link query_metamodel.Date#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see query_metamodel.Query_metamodelPackage#getDate()
 * @model
 * @generated
 */
public interface Date extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(java.util.Date)
	 * @see query_metamodel.Query_metamodelPackage#getDate_From()
	 * @model
	 * @generated
	 */
	java.util.Date getFrom();

	/**
	 * Sets the value of the '{@link query_metamodel.Date#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(java.util.Date value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(java.util.Date)
	 * @see query_metamodel.Query_metamodelPackage#getDate_To()
	 * @model
	 * @generated
	 */
	java.util.Date getTo();

	/**
	 * Sets the value of the '{@link query_metamodel.Date#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(java.util.Date value);

} // Date
