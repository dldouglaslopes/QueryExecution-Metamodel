/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ABoolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.ABoolean#getFalseQuantity <em>False Quantity</em>}</li>
 *   <li>{@link QueryMetamodel.ABoolean#getTrueQuantity <em>True Quantity</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getABoolean()
 * @model
 * @generated
 */
public interface ABoolean extends Answer {
	/**
	 * Returns the value of the '<em><b>False Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>False Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>False Quantity</em>' attribute.
	 * @see #setFalseQuantity(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getABoolean_FalseQuantity()
	 * @model
	 * @generated
	 */
	int getFalseQuantity();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ABoolean#getFalseQuantity <em>False Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Quantity</em>' attribute.
	 * @see #getFalseQuantity()
	 * @generated
	 */
	void setFalseQuantity(int value);

	/**
	 * Returns the value of the '<em><b>True Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Quantity</em>' attribute.
	 * @see #setTrueQuantity(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getABoolean_TrueQuantity()
	 * @model
	 * @generated
	 */
	int getTrueQuantity();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ABoolean#getTrueQuantity <em>True Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Quantity</em>' attribute.
	 * @see #getTrueQuantity()
	 * @generated
	 */
	void setTrueQuantity(int value);

} // ABoolean
