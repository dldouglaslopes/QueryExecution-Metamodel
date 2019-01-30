/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECare Pathway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.ECarePathway#getName <em>Name</em>}</li>
 *   <li>{@link QueryMetamodel.ECarePathway#isConduct <em>Conduct</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway()
 * @model
 * @generated
 */
public interface ECarePathway extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link QueryMetamodel.CarePathway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see QueryMetamodel.CarePathway
	 * @see #setName(CarePathway)
	 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway_Name()
	 * @model default="None"
	 * @generated
	 */
	CarePathway getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ECarePathway#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see QueryMetamodel.CarePathway
	 * @see #getName()
	 * @generated
	 */
	void setName(CarePathway value);

	/**
	 * Returns the value of the '<em><b>Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conduct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduct</em>' attribute.
	 * @see #setConduct(boolean)
	 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway_Conduct()
	 * @model
	 * @generated
	 */
	boolean isConduct();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ECarePathway#isConduct <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conduct</em>' attribute.
	 * @see #isConduct()
	 * @generated
	 */
	void setConduct(boolean value);

} // ECarePathway
