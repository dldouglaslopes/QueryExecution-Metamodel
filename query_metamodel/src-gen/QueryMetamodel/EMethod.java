/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.EMethod#getName <em>Name</em>}</li>
 *   <li>{@link QueryMetamodel.EMethod#getEAttribute <em>EAttribute</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getEMethod()
 * @model
 * @generated
 */
public interface EMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryMetamodel.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see QueryMetamodel.Method
	 * @see #setName(Method)
	 * @see QueryMetamodel.Query_metamodelPackage#getEMethod_Name()
	 * @model
	 * @generated
	 */
	Method getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EMethod#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see QueryMetamodel.Method
	 * @see #getName()
	 * @generated
	 */
	void setName(Method value);

	/**
	 * Returns the value of the '<em><b>EAttribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute</em>' containment reference.
	 * @see #setEAttribute(EAttribute)
	 * @see QueryMetamodel.Query_metamodelPackage#getEMethod_EAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EAttribute getEAttribute();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EMethod#getEAttribute <em>EAttribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute</em>' containment reference.
	 * @see #getEAttribute()
	 * @generated
	 */
	void setEAttribute(EAttribute value);

} // EMethod
