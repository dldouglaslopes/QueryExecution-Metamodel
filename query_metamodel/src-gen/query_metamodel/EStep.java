/**
 */
package query_metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query_metamodel.EStep#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see query_metamodel.Query_metamodelPackage#getEStep()
 * @model
 * @generated
 */
public interface EStep extends Field {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * The literals are from the enumeration {@link query_metamodel.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see query_metamodel.Element
	 * @see #setStep(Element)
	 * @see query_metamodel.Query_metamodelPackage#getEStep_Step()
	 * @model
	 * @generated
	 */
	Element getStep();

	/**
	 * Sets the value of the '{@link query_metamodel.EStep#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see query_metamodel.Element
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Element value);

} // EStep
