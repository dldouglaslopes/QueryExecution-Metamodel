/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QConduct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QConduct#getWithConduct <em>With Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.QConduct#getNoConduct <em>No Conduct</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQConduct()
 * @model
 * @generated
 */
public interface QConduct extends EMethod {
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
	 * @see QueryMetamodel.Query_metamodelPackage#getQConduct_WithConduct()
	 * @model
	 * @generated
	 */
	int getWithConduct();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QConduct#getWithConduct <em>With Conduct</em>}' attribute.
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
	 * @see QueryMetamodel.Query_metamodelPackage#getQConduct_NoConduct()
	 * @model
	 * @generated
	 */
	int getNoConduct();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QConduct#getNoConduct <em>No Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Conduct</em>' attribute.
	 * @see #getNoConduct()
	 * @generated
	 */
	void setNoConduct(int value);

} // QConduct
