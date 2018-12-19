/**
 */
package query_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complementary Conducts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query_metamodel.ComplementaryConducts#getConduct <em>Conduct</em>}</li>
 * </ul>
 *
 * @see query_metamodel.Query_metamodelPackage#getComplementaryConducts()
 * @model
 * @generated
 */
public interface ComplementaryConducts extends Field {
	/**
	 * Returns the value of the '<em><b>Conduct</b></em>' attribute.
	 * The literals are from the enumeration {@link query_metamodel.Conduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conduct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduct</em>' attribute.
	 * @see query_metamodel.Conduct
	 * @see #setConduct(Conduct)
	 * @see query_metamodel.Query_metamodelPackage#getComplementaryConducts_Conduct()
	 * @model
	 * @generated
	 */
	Conduct getConduct();

	/**
	 * Sets the value of the '{@link query_metamodel.ComplementaryConducts#getConduct <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conduct</em>' attribute.
	 * @see query_metamodel.Conduct
	 * @see #getConduct()
	 * @generated
	 */
	void setConduct(Conduct value);

} // ComplementaryConducts
