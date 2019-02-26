/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QFlow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QFlow#getFlow <em>Flow</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQFlow()
 * @model
 * @generated
 */
public interface QFlow extends EMethod {
	/**
	 * Returns the value of the '<em><b>Flow</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQFlow_Flow()
	 * @model containment="true"
	 * @generated
	 */
	EList<Flow> getFlow();

} // QFlow
