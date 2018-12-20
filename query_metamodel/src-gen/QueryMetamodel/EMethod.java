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
 *   <li>{@link QueryMetamodel.EMethod#getAttribute <em>Attribute</em>}</li>
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
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(EAttribute)
	 * @see QueryMetamodel.Query_metamodelPackage#getEMethod_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EAttribute getAttribute();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EMethod#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(EAttribute value);

} // EMethod
