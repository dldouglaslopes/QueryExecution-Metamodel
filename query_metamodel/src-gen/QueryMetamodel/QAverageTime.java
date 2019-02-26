/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QAverage Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QAverageTime#getAverage <em>Average</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQAverageTime()
 * @model
 * @generated
 */
public interface QAverageTime extends EMethod {
	/**
	 * Returns the value of the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average</em>' attribute.
	 * @see #setAverage(double)
	 * @see QueryMetamodel.Query_metamodelPackage#getQAverageTime_Average()
	 * @model
	 * @generated
	 */
	double getAverage();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QAverageTime#getAverage <em>Average</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average</em>' attribute.
	 * @see #getAverage()
	 * @generated
	 */
	void setAverage(double value);

} // QAverageTime
