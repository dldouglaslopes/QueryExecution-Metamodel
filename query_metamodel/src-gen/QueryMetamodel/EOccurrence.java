/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOccurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.EOccurrence#getValue <em>Value</em>}</li>
 *   <li>{@link QueryMetamodel.EOccurrence#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getEOccurrence()
 * @model
 * @generated
 */
public interface EOccurrence extends EMethod {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getEOccurrence_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EOccurrence#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"COUNT CARE PATHWAY OCCURRENCES"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getEOccurrence_Name()
	 * @model default="COUNT CARE PATHWAY OCCURRENCES"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EOccurrence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EOccurrence
