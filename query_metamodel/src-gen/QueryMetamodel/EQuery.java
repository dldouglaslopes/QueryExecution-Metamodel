/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EQuery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.EQuery#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getEQuery()
 * @model
 * @generated
 */
public interface EQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(Method)
	 * @see QueryMetamodel.Query_metamodelPackage#getEQuery_Method()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Method getMethod();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EQuery#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Method value);

} // EQuery
