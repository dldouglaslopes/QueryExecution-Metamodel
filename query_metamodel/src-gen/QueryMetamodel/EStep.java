/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.EStep#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getEStep()
 * @model
 * @generated
 */
public interface EStep extends Field {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryMetamodel.EElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see QueryMetamodel.EElement
	 * @see #setStep(EElement)
	 * @see QueryMetamodel.Query_metamodelPackage#getEStep_Step()
	 * @model
	 * @generated
	 */
	EElement getStep();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EStep#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see QueryMetamodel.EElement
	 * @see #getStep()
	 * @generated
	 */
	void setStep(EElement value);

} // EStep
