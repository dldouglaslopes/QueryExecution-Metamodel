/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link QueryMetamodel.ECarePathway#getConducts <em>Conducts</em>}</li>
 *   <li>{@link QueryMetamodel.ECarePathway#getSteps <em>Steps</em>}</li>
 *   <li>{@link QueryMetamodel.ECarePathway#getCarePathways <em>Care Pathways</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway()
 * @model
 * @generated
 */
public interface ECarePathway extends EObject {
	/**
	 * Returns the value of the '<em><b>Conducts</b></em>' attribute list.
	 * The list contents are of type {@link QueryMetamodel.EConduct}.
	 * The literals are from the enumeration {@link QueryMetamodel.EConduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conducts</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conducts</em>' attribute list.
	 * @see QueryMetamodel.EConduct
	 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway_Conducts()
	 * @model
	 * @generated
	 */
	EList<EConduct> getConducts();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' attribute list.
	 * The list contents are of type {@link QueryMetamodel.EStep}.
	 * The literals are from the enumeration {@link QueryMetamodel.EStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' attribute list.
	 * @see QueryMetamodel.EStep
	 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway_Steps()
	 * @model
	 * @generated
	 */
	EList<EStep> getSteps();

	/**
	 * Returns the value of the '<em><b>Care Pathways</b></em>' attribute list.
	 * The list contents are of type {@link QueryMetamodel.CarePathway}.
	 * The literals are from the enumeration {@link QueryMetamodel.CarePathway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Pathways</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Pathways</em>' attribute list.
	 * @see QueryMetamodel.CarePathway
	 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway_CarePathways()
	 * @model
	 * @generated
	 */
	EList<CarePathway> getCarePathways();

} // ECarePathway
