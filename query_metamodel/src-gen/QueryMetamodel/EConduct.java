/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EConduct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.EConduct#getWithConduct <em>With Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.EConduct#getNoConduct <em>No Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.EConduct#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getEConduct()
 * @model
 * @generated
 */
public interface EConduct extends EMethod {
	/**
	 * Returns the value of the '<em><b>With Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Conduct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Conduct</em>' attribute.
	 * @see #setWithConduct(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getEConduct_WithConduct()
	 * @model
	 * @generated
	 */
	int getWithConduct();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EConduct#getWithConduct <em>With Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Conduct</em>' attribute.
	 * @see #getWithConduct()
	 * @generated
	 */
	void setWithConduct(int value);

	/**
	 * Returns the value of the '<em><b>No Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Conduct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Conduct</em>' attribute.
	 * @see #setNoConduct(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getEConduct_NoConduct()
	 * @model
	 * @generated
	 */
	int getNoConduct();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EConduct#getNoConduct <em>No Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Conduct</em>' attribute.
	 * @see #getNoConduct()
	 * @generated
	 */
	void setNoConduct(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"COUNT CONDUCT"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getEConduct_Name()
	 * @model default="COUNT CONDUCT"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EConduct#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EConduct
