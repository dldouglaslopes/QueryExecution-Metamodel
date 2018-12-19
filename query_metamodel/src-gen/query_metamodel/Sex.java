/**
 */
package query_metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query_metamodel.Sex#getSex <em>Sex</em>}</li>
 * </ul>
 *
 * @see query_metamodel.Query_metamodelPackage#getSex()
 * @model
 * @generated
 */
public interface Sex extends EObject {
	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link query_metamodel.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see query_metamodel.Gender
	 * @see #setSex(Gender)
	 * @see query_metamodel.Query_metamodelPackage#getSex_Sex()
	 * @model
	 * @generated
	 */
	Gender getSex();

	/**
	 * Sets the value of the '{@link query_metamodel.Sex#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see query_metamodel.Gender
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Gender value);

} // Sex