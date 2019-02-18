/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QAverage Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QAverageTime#getName <em>Name</em>}</li>
 *   <li>{@link QueryMetamodel.QAverageTime#getAverageTime <em>Average Time</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQAverageTime()
 * @model
 * @generated
 */
public interface QAverageTime extends EMethod {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"AverageTime"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getQAverageTime_Name()
	 * @model default="AverageTime"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QAverageTime#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Average Time</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.AverageTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Time</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQAverageTime_AverageTime()
	 * @model containment="true"
	 * @generated
	 */
	EList<AverageTime> getAverageTime();

} // QAverageTime
