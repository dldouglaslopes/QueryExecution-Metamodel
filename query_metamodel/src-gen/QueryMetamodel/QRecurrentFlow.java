/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QRecurrent Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QRecurrentFlow#getName <em>Name</em>}</li>
 *   <li>{@link QueryMetamodel.QRecurrentFlow#getPathway <em>Pathway</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQRecurrentFlow()
 * @model
 * @generated
 */
public interface QRecurrentFlow extends EMethod {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"RecurrentFlow"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getQRecurrentFlow_Name()
	 * @model default="RecurrentFlow"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QRecurrentFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pathway</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Pathway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathway</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathway</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQRecurrentFlow_Pathway()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pathway> getPathway();

} // QRecurrentFlow
