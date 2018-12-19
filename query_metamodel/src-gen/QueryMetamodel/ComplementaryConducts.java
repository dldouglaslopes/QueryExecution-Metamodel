/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complementary Conducts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.ComplementaryConducts#getConduct <em>Conduct</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getComplementaryConducts()
 * @model
 * @generated
 */
public interface ComplementaryConducts extends Field {
	/**
	 * Returns the value of the '<em><b>Conduct</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryMetamodel.Conduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conduct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduct</em>' attribute.
	 * @see QueryMetamodel.Conduct
	 * @see #setConduct(Conduct)
	 * @see QueryMetamodel.Query_metamodelPackage#getComplementaryConducts_Conduct()
	 * @model
	 * @generated
	 */
	Conduct getConduct();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ComplementaryConducts#getConduct <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conduct</em>' attribute.
	 * @see QueryMetamodel.Conduct
	 * @see #getConduct()
	 * @generated
	 */
	void setConduct(Conduct value);

} // ComplementaryConducts
