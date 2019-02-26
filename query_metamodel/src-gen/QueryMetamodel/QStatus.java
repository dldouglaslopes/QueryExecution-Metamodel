/**
 */
package QueryMetamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QStatus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QStatus#getCompleted <em>Completed</em>}</li>
 *   <li>{@link QueryMetamodel.QStatus#getInProgress <em>In Progress</em>}</li>
 *   <li>{@link QueryMetamodel.QStatus#getAborted <em>Aborted</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQStatus()
 * @model
 * @generated
 */
public interface QStatus extends EMethod {
	/**
	 * Returns the value of the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed</em>' attribute.
	 * @see #setCompleted(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getQStatus_Completed()
	 * @model
	 * @generated
	 */
	int getCompleted();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QStatus#getCompleted <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed</em>' attribute.
	 * @see #getCompleted()
	 * @generated
	 */
	void setCompleted(int value);

	/**
	 * Returns the value of the '<em><b>In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Progress</em>' attribute.
	 * @see #setInProgress(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getQStatus_InProgress()
	 * @model
	 * @generated
	 */
	int getInProgress();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QStatus#getInProgress <em>In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Progress</em>' attribute.
	 * @see #getInProgress()
	 * @generated
	 */
	void setInProgress(int value);

	/**
	 * Returns the value of the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aborted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aborted</em>' attribute.
	 * @see #setAborted(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getQStatus_Aborted()
	 * @model
	 * @generated
	 */
	int getAborted();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QStatus#getAborted <em>Aborted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aborted</em>' attribute.
	 * @see #getAborted()
	 * @generated
	 */
	void setAborted(int value);

} // QStatus
