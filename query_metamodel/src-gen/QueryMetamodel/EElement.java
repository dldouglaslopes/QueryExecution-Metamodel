/**
 */
package QueryMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EElement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelPackage#getEElement()
 * @model
 * @generated
 */
public enum EElement implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Discharge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCHARGE_VALUE
	 * @generated
	 * @ordered
	 */
	DISCHARGE(1, "discharge", "discharge"),

	/**
	 * The '<em><b>Referral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERRAL_VALUE
	 * @generated
	 * @ordered
	 */
	REFERRAL(2, "referral", "referral"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(3, "procedure", "procedure"),

	/**
	 * The '<em><b>Action</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION(4, "action", "action"),

	/**
	 * The '<em><b>Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION(5, "information", "information"),

	/**
	 * The '<em><b>Treatment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENT(6, "treatment", "treatment"),

	/**
	 * The '<em><b>Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION(7, "prescription", "prescription"),

	/**
	 * The '<em><b>Pause</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSE(8, "pause", "pause"),

	/**
	 * The '<em><b>Auxiliaryconduct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUXILIARYCONDUCT_VALUE
	 * @generated
	 * @ordered
	 */
	AUXILIARYCONDUCT(9, "auxiliaryconduct", "auxiliaryconduct"),

	/**
	 * The '<em><b>All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(10, "all", "all");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Discharge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discharge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCHARGE
	 * @model name="discharge"
	 * @generated
	 * @ordered
	 */
	public static final int DISCHARGE_VALUE = 1;

	/**
	 * The '<em><b>Referral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Referral</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERRAL
	 * @model name="referral"
	 * @generated
	 * @ordered
	 */
	public static final int REFERRAL_VALUE = 2;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Procedure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE
	 * @model name="procedure"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 3;

	/**
	 * The '<em><b>Action</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Action</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTION
	 * @model name="action"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_VALUE = 4;

	/**
	 * The '<em><b>Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Information</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFORMATION
	 * @model name="information"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_VALUE = 5;

	/**
	 * The '<em><b>Treatment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Treatment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREATMENT
	 * @model name="treatment"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENT_VALUE = 6;

	/**
	 * The '<em><b>Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION
	 * @model name="prescription"
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
	 * @model name="pause"
	 * @generated
	 * @ordered
	 */
	public static final int PAUSE_VALUE = 8;

	/**
	 * The '<em><b>Auxiliaryconduct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auxiliaryconduct</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUXILIARYCONDUCT
	 * @model name="auxiliaryconduct"
	 * @generated
	 * @ordered
	 */
	public static final int AUXILIARYCONDUCT_VALUE = 9;

	/**
	 * The '<em><b>All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model name="all"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 10;

	/**
	 * An array of all the '<em><b>EElement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EElement[] VALUES_ARRAY = new EElement[] { NONE, DISCHARGE, REFERRAL, PROCEDURE, ACTION,
			INFORMATION, TREATMENT, PRESCRIPTION, PAUSE, AUXILIARYCONDUCT, ALL, };

	/**
	 * A public read-only list of all the '<em><b>EElement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EElement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EElement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EElement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EElement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EElement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EElement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EElement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EElement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EElement get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case DISCHARGE_VALUE:
			return DISCHARGE;
		case REFERRAL_VALUE:
			return REFERRAL;
		case PROCEDURE_VALUE:
			return PROCEDURE;
		case ACTION_VALUE:
			return ACTION;
		case INFORMATION_VALUE:
			return INFORMATION;
		case TREATMENT_VALUE:
			return TREATMENT;
		case PRESCRIPTION_VALUE:
			return PRESCRIPTION;
		case PAUSE_VALUE:
			return PAUSE;
		case AUXILIARYCONDUCT_VALUE:
			return AUXILIARYCONDUCT;
		case ALL_VALUE:
			return ALL;
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
	private EElement(int value, String name, String literal) {
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

} //EElement
