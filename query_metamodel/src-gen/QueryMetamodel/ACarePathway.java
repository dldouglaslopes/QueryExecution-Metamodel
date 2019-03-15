/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACare Pathway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.ACarePathway#getConduct <em>Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.ACarePathway#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getACarePathway()
 * @model
 * @generated
 */
public interface ACarePathway extends EObject {
	/**
	 * Returns the value of the '<em><b>Conduct</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryMetamodel.Conduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conduct</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduct</em>' attribute.
	 * @see QueryMetamodel.Conduct
	 * @see #setConduct(Conduct)
	 * @see QueryMetamodel.Query_metamodelPackage#getACarePathway_Conduct()
	 * @model
	 * @generated
	 */
	Conduct getConduct();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ACarePathway#getConduct <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conduct</em>' attribute.
	 * @see QueryMetamodel.Conduct
	 * @see #getConduct()
	 * @generated
	 */
	void setConduct(Conduct value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
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
	 * @see QueryMetamodel.Query_metamodelPackage#getACarePathway_Name()
	 * @model
	 * @generated
	 */
	CarePathway getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ACarePathway#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see QueryMetamodel.CarePathway
	 * @see #getName()
	 * @generated
	 */
	void setName(CarePathway value);

} // ACarePathway
