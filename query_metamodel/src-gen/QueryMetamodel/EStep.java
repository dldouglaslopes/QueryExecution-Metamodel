/**
 */
package QueryMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EStep</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelPackage#getEStep()
 * @model
 * @generated
 */
public enum EStep implements Enumerator {
	/**
	 * The '<em><b>Auxiliary Conduct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_CONDUCT_VALUE
	 * @generated
	 * @ordered
	 */
	AUXILIARY_CONDUCT(1, "AuxiliaryConduct", "AuxilioConduta"),

	/**
	 * The '<em><b>Treatment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENT(2, "Treatment", "Tratamento"),

	/**
	 * The '<em><b>Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION(3, "Action", "Action"),

	/**
	 * The '<em><b>Discharge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCHARGE(4, "Discharge", "Alta"),

	/**
	 * The '<em><b>Referral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERRAL_VALUE
	 * @generated
	 * @ordered
	 */
	REFERRAL(5, "Referral", "Encaminhamento"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(6, "Procedure", "Procedimento"),

	/**
	 * The '<em><b>Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION(7, "Prescription", "Receita"),

	/**
	 * The '<em><b>Pause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSE(8, "Pause", "Pausa"),

	/**
	 * The '<em><b>Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION(9, "Information", "Informa\u00e7\u00e3o");

	/**
	 * The '<em><b>Auxiliary Conduct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auxiliary Conduct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUXILIARY_CONDUCT
	 * @model name="AuxiliaryConduct" literal="AuxilioConduta"
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARY_CONDUCT_VALUE = 1;

	/**
	 * The '<em><b>Treatment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Treatment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREATMENT
	 * @model name="Treatment" literal="Tratamento"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENT_VALUE = 2;

	/**
	 * The '<em><b>Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTION
	 * @model name="Action"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_VALUE = 3;

	/**
	 * The '<em><b>Discharge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discharge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCHARGE
	 * @model name="Discharge" literal="Alta"
	 * @generated
	 * @ordered
	 */
	public static final int DISCHARGE_VALUE = 4;

	/**
	 * The '<em><b>Referral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Referral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERRAL
	 * @model name="Referral" literal="Encaminhamento"
	 * @generated
	 * @ordered
	 */
	public static final int REFERRAL_VALUE = 5;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Procedure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE
	 * @model name="Procedure" literal="Procedimento"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 6;

	/**
	 * The '<em><b>Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION
	 * @model name="Prescription" literal="Receita"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_VALUE = 7;

	/**
	 * The '<em><b>Pause</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pause</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAUSE
	 * @model name="Pause" literal="Pausa"
	 * @generated
	 * @ordered
	 */
	public static final int PAUSE_VALUE = 8;

	/**
	 * The '<em><b>Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Information</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFORMATION
	 * @model name="Information" literal="Informa\347\343o"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_VALUE = 9;

	/**
	 * An array of all the '<em><b>EStep</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EStep[] VALUES_ARRAY = new EStep[] { AUXILIARY_CONDUCT, TREATMENT, ACTION, DISCHARGE, REFERRAL,
			PROCEDURE, PRESCRIPTION, PAUSE, INFORMATION, };

	/**
	 * A public read-only list of all the '<em><b>EStep</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EStep> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EStep</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EStep get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EStep result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EStep</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EStep getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EStep result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EStep</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EStep get(int value) {
		switch (value) {
		case AUXILIARY_CONDUCT_VALUE:
			return AUXILIARY_CONDUCT;
		case TREATMENT_VALUE:
			return TREATMENT;
		case ACTION_VALUE:
			return ACTION;
		case DISCHARGE_VALUE:
			return DISCHARGE;
		case REFERRAL_VALUE:
			return REFERRAL;
		case PROCEDURE_VALUE:
			return PROCEDURE;
		case PRESCRIPTION_VALUE:
			return PRESCRIPTION;
		case PAUSE_VALUE:
			return PAUSE;
		case INFORMATION_VALUE:
			return INFORMATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EStep(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //EStep
