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
 *   <li>{@link QueryMetamodel.EQuery#getEMethod <em>EMethod</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getEQuery()
 * @model
 * @generated
 */
public interface EQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>EMethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMethod</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMethod</em>' containment reference.
	 * @see #setEMethod(EMethod)
	 * @see QueryMetamodel.Query_metamodelPackage#getEQuery_EMethod()
	 * @model containment="true"
	 * @generated
	 */
	EMethod getEMethod();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EQuery#getEMethod <em>EMethod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMethod</em>' containment reference.
	 * @see #getEMethod()
	 * @generated
	 */
	void setEMethod(EMethod value);

} // EQuery
