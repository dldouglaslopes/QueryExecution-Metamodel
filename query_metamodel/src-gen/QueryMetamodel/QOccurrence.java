/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QOccurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QOccurrence#getPathway <em>Pathway</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQOccurrence()
 * @model
 * @generated
 */
public interface QOccurrence extends EMethod {
	/**
	 * Returns the value of the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathway</em>' containment reference.
	 * @see #setPathway(Pathway)
	 * @see QueryMetamodel.Query_metamodelPackage#getQOccurrence_Pathway()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pathway getPathway();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QOccurrence#getPathway <em>Pathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathway</em>' containment reference.
	 * @see #getPathway()
	 * @generated
	 */
	void setPathway(Pathway value);

} // QOccurrence
