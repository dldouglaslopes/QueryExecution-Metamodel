/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QConduct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QConduct#getConduct <em>Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.QConduct#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQConduct()
 * @model
 * @generated
 */
public interface QConduct extends EMethod {
	/**
	 * Returns the value of the '<em><b>Conduct</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Conduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conduct</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduct</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQConduct_Conduct()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conduct> getConduct();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"CountConduct"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getQConduct_Name()
	 * @model default="CountConduct"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QConduct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QConduct
