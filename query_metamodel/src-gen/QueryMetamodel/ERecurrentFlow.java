/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERecurrent Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.ERecurrentFlow#getFlows <em>Flows</em>}</li>
 *   <li>{@link QueryMetamodel.ERecurrentFlow#getPercentages <em>Percentages</em>}</li>
 *   <li>{@link QueryMetamodel.ERecurrentFlow#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getERecurrentFlow()
 * @model
 * @generated
 */
public interface ERecurrentFlow extends EMethod {
	/**
	 * Returns the value of the '<em><b>Flows</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' attribute list.
	 * @see QueryMetamodel.Query_metamodelPackage#getERecurrentFlow_Flows()
	 * @model
	 * @generated
	 */
	EList<String> getFlows();

	/**
	 * Returns the value of the '<em><b>Percentages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentages</em>' attribute list.
	 * @see QueryMetamodel.Query_metamodelPackage#getERecurrentFlow_Percentages()
	 * @model
	 * @generated
	 */
	EList<Double> getPercentages();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"SHOW RECURRENT FLOW"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getERecurrentFlow_Name()
	 * @model default="SHOW RECURRENT FLOW"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ERecurrentFlow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ERecurrentFlow
