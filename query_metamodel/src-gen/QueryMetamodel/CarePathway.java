/**
 */
package QueryMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Care Pathway</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelPackage#getCarePathway()
 * @model
 * @generated
 */
public enum CarePathway implements Enumerator {
	/**
	 * The '<em><b>Dm Treatment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #DM_TREATMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DM_TREATMENT(1, "DmTreatment", "Viver Bem Diabetes - Tratamento DM"),

	/**
	 * The '<em><b>Dm Adjustments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DM_ADJUSTMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	DM_ADJUSTMENTS(2, "DmAdjustments", "Viver Bem Dm Ajustes"),

	/**
	 * The '<em><b>Abdominal Pain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABDOMINAL_PAIN_VALUE
	 * @generated
	 * @ordered
	 */
	ABDOMINAL_PAIN(3, "AbdominalPain", "Dor Abdominal"),

	/**
	 * The '<em><b>Chest Pain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEST_PAIN_VALUE
	 * @generated
	 * @ordered
	 */
	CHEST_PAIN(4, "ChestPain", "Dor Tor\u00e1cica"),

	/**
	 * The '<em><b>HDP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDP_VALUE
	 * @generated
	 * @ordered
	 */
	HDP(5, "HDP", "DHEG"),

	/**
	 * The '<em><b>Diarrhea</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARRHEA_VALUE
	 * @generated
	 * @ordered
	 */
	DIARRHEA(6, "Diarrhea", "Diarr\u00e9ia"),

	/**
	 * The '<em><b>COPD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPD_VALUE
	 * @generated
	 * @ordered
	 */
	COPD(7, "COPD", "DCOP"),

	/**
	 * The '<em><b>URTI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URTI_VALUE
	 * @generated
	 * @ordered
	 */
	URTI(8, "URTI", "IVAS"),

	/**
	 * The '<em><b>Pneumonia Influenza</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNEUMONIA_INFLUENZA_VALUE
	 * @generated
	 * @ordered
	 */
	PNEUMONIA_INFLUENZA(9, "PneumoniaInfluenza", "Pneumonia & Influenza"),

	/**
	 * The '<em><b>Premature Amniorrexis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREMATURE_AMNIORREXIS_VALUE
	 * @generated
	 * @ordered
	 */
	PREMATURE_AMNIORREXIS(10, "PrematureAmniorrexis", "Aminiorrexe Prematura"),

	/**
	 * The '<em><b>Toxoplasmosis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOXOPLASMOSIS_VALUE
	 * @generated
	 * @ordered
	 */
	TOXOPLASMOSIS(11, "Toxoplasmosis", "Nascer Bem Toxoplasmose"),

	/**
	 * The '<em><b>Headache</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADACHE_VALUE
	 * @generated
	 * @ordered
	 */
	HEADACHE(12, "Headache", "Cefal\u00e9ia"),

	/**
	 * The '<em><b>Parasite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARASITE_VALUE
	 * @generated
	 * @ordered
	 */
	PARASITE(13, "Parasite", "Parasitose"),

	/**
	 * The '<em><b>Africa Line Monotherapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFRICA_LINE_MONOTHERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	AFRICA_LINE_MONOTHERAPY(14, "AfricaLineMonotherapy", "Viver Bem Monoterapia Linha Afro"),

	/**
	 * The '<em><b>Gestational Diabetes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESTATIONAL_DIABETES_VALUE
	 * @generated
	 * @ordered
	 */
	GESTATIONAL_DIABETES(15, "GestationalDiabetes", "Diabetes Gestational"),

	/**
	 * The '<em><b>Lumbar Pain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LUMBAR_PAIN_VALUE
	 * @generated
	 * @ordered
	 */
	LUMBAR_PAIN(16, "LumbarPain", "M\u00e9dico da Fam\u00edlia Dor Lombar"),

	/**
	 * The '<em><b>Afro Line Tetratherapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFRO_LINE_TETRATHERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	AFRO_LINE_TETRATHERAPY(17, "AfroLineTetratherapy", "Viver Bem Tetraterapia Linha Afro"),

	/**
	 * The '<em><b>Vulvovaginitis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VULVOVAGINITIS_VALUE
	 * @generated
	 * @ordered
	 */
	VULVOVAGINITIS(18, "Vulvovaginitis", "Vulvovaginite"),

	/**
	 * The '<em><b>Febrile Neutropenia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEBRILE_NEUTROPENIA_VALUE
	 * @generated
	 * @ordered
	 */
	FEBRILE_NEUTROPENIA(19, "FebrileNeutropenia", "Neutropenia Febril"),

	/**
	 * The '<em><b>Pharyngitis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARYNGITIS_VALUE
	 * @generated
	 * @ordered
	 */
	PHARYNGITIS(20, "Pharyngitis", "Faringite"),

	/**
	 * The '<em><b>Acute Otitis Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACUTE_OTITIS_MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	ACUTE_OTITIS_MEDIA(21, "AcuteOtitisMedia", "Otite M\u00e9dia Aguda"),

	/**
	 * The '<em><b>Tetratherapy Bar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TETRATHERAPY_BAR_VALUE
	 * @generated
	 * @ordered
	 */
	TETRATHERAPY_BAR(22, "TetratherapyBar", "Viver Bem Tetraterapia Bar"),

	/**
	 * The '<em><b>UTI Cystitis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTI_CYSTITIS_VALUE
	 * @generated
	 * @ordered
	 */
	UTI_CYSTITIS(23, "UTICystitis", "ITU - Cistite"),

	/**
	 * The '<em><b>Sepsis Treatment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPSIS_TREATMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SEPSIS_TREATMENT(24, "SepsisTreatment", "Tratamento de SEPSE"),

	/**
	 * The '<em><b>Joint Pain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOINT_PAIN_VALUE
	 * @generated
	 * @ordered
	 */
	JOINT_PAIN(25, "JointPain", "Dor Articular"),

	/**
	 * The '<em><b>ACEI Line Monotherapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACEI_LINE_MONOTHERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	ACEI_LINE_MONOTHERAPY(26, "ACEILineMonotherapy", "Viver Bem Monoterapia Linha IECA"),

	/**
	 * The '<em><b>Acne</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACNE_VALUE
	 * @generated
	 * @ordered
	 */
	ACNE(27, "Acne", "Acne"),

	/**
	 * The '<em><b>Dyspepsia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DYSPEPSIA_VALUE
	 * @generated
	 * @ordered
	 */
	DYSPEPSIA(28, "Dyspepsia", "DIspepsia"),

	/**
	 * The '<em><b>Vertigo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTIGO_VALUE
	 * @generated
	 * @ordered
	 */
	VERTIGO(29, "Vertigo", "Tontura e Vertigem"),

	/**
	 * The '<em><b>ACEI Line Tetra Therapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACEI_LINE_TETRA_THERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	ACEI_LINE_TETRA_THERAPY(30, "ACEILineTetraTherapy", "Viver Bem Tetraterapia Linha IECA"),
	/**
	* The '<em><b>Double Therapy Afro Line</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #DOUBLE_THERAPY_AFRO_LINE_VALUE
	* @generated
	* @ordered
	*/
	DOUBLE_THERAPY_AFRO_LINE(31, "DoubleTherapyAfroLine", "Viver Bem DuploTerapia Linha Afro"),

	/**
	 * The '<em><b>Treatment Low Risk Dyslipidemia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_LOW_RISK_DYSLIPIDEMIA_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENT_LOW_RISK_DYSLIPIDEMIA(32, "TreatmentLowRiskDyslipidemia",
			"Viver Bem Tratamento Dislipidemia - Risco Baixo"),

	/**
	 * The '<em><b>Triple Afro Line Therapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_AFRO_LINE_THERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	TRIPLE_AFRO_LINE_THERAPY(33, "TripleAfroLineTherapy", "Viver Bem Triploterapia Linha Afro"),

	/**
	 * The '<em><b>Diabetes Dyslipidemia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIABETES_DYSLIPIDEMIA_VALUE
	 * @generated
	 * @ordered
	 */
	DIABETES_DYSLIPIDEMIA(34, "DiabetesDyslipidemia", "Viver Bem Diabetes - Dislipidemia"),

	/**
	 * The '<em><b>Double Therapy Bar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_THERAPY_BAR_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_THERAPY_BAR(35, "DoubleTherapyBar", "Viver Bem Duploterapia Bar"),

	/**
	 * The '<em><b>Monotherapy Bar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONOTHERAPY_BAR_VALUE
	 * @generated
	 * @ordered
	 */
	MONOTHERAPY_BAR(36, "MonotherapyBar", "Viver Bem Monoterapia Bar"),

	/**
	 * The '<em><b>Treatment Dyslipidemia High Risk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_DYSLIPIDEMIA_HIGH_RISK_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENT_DYSLIPIDEMIA_HIGH_RISK(37, "TreatmentDyslipidemiaHighRisk",
			"Viver Bem Tratamento Dislipidemia - Risco Alto"),

	/**
	 * The '<em><b>Treatment Dyslipidemia Intermediate Risk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_DYSLIPIDEMIA_INTERMEDIATE_RISK_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENT_DYSLIPIDEMIA_INTERMEDIATE_RISK(38, "TreatmentDyslipidemiaIntermediateRisk",
			"Viver Bem Tratamento Dislipidemia - Risco Intermedi\u00e1rio"),

	/**
	 * The '<em><b>Treatment Dyslipidemia Very High Risk</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_DYSLIPIDEMIA_VERY_HIGH_RISK_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENT_DYSLIPIDEMIA_VERY_HIGH_RISK(39, "TreatmentDyslipidemiaVeryHighRisk",
			"Viver Bem Tratamento Dislipidemia - Risco Muito Alto"),

	/**
	 * The '<em><b>Meningitis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENINGITIS_VALUE
	 * @generated
	 * @ordered
	 */
	MENINGITIS(40, "Meningitis", "Meningite"),

	/**
	 * The '<em><b>Syphilis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYPHILIS_VALUE
	 * @generated
	 * @ordered
	 */
	SYPHILIS(41, "Syphilis", "S\u00edfilis"),

	/**
	 * The '<em><b>ACEI Line Double Therapy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACEI_LINE_DOUBLE_THERAPY_VALUE
	 * @generated
	 * @ordered
	 */
	ACEI_LINE_DOUBLE_THERAPY(42, "ACEILineDoubleTherapy", "Viver Bem Duploterapia Linha IECA"),
	/**
	* The '<em><b>Triploterapia BAR</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #TRIPLOTERAPIA_BAR_VALUE
	* @generated
	* @ordered
	*/
	TRIPLOTERAPIA_BAR(43, "TriploterapiaBAR", "Viver Bem Triploterapia Bar"),

	/**
	 * The '<em><b>UTI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTI_VALUE
	 * @generated
	 * @ordered
	 */
	UTI(44, "UTI", "ITU"),

	/**
	 * The '<em><b>Bar BBC Betablocker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_BBC_BETABLOCKER_VALUE
	 * @generated
	 * @ordered
	 */
	BAR_BBC_BETABLOCKER(45, "BarBBCBetablocker", "Viver Bem Bar & BCC - Betabloqueador"),
	/**
	* The '<em><b>UTI Diabetes</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #UTI_DIABETES_VALUE
	* @generated
	* @ordered
	*/
	UTI_DIABETES(46, "UTIDiabetes", "Viver Bem Diabetes - ITU"),

	/**
	 * The '<em><b>UTI Pyelonephritis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTI_PYELONEPHRITIS_VALUE
	 * @generated
	 * @ordered
	 */
	UTI_PYELONEPHRITIS(47, "UTIPyelonephritis", "ITU - Pielonefrite"),

	/**
	 * The '<em><b>African American Pharmacological</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AFRICAN_AMERICAN_PHARMACOLOGICAL_VALUE
	 * @generated
	 * @ordered
	 */
	AFRICAN_AMERICAN_PHARMACOLOGICAL(48, "AfricanAmericanPharmacological",
			"Viver Bem Protocolo Farmacol\u00f3gico Afroamericano"),

	/**
	 * The '<em><b>Exposed Fracture</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPOSED_FRACTURE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPOSED_FRACTURE(49, "ExposedFracture", "Fratura Exposta"),

	/**
	 * The '<em><b>ACEIBBC Betablocker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACEIBBC_BETABLOCKER_VALUE
	 * @generated
	 * @ordered
	 */
	ACEIBBC_BETABLOCKER(50, "ACEIBBCBetablocker", "Viver Bem IECA & BBC - Betabloqueador"),
	/**
	 * The '<em><b>Low Back Pain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #LOW_BACK_PAIN_VALUE
	 * @generated
	 * @ordered
	 */
	LOW_BACK_PAIN(51, "LowBackPain", "Lombalgia");

	/**
	 * The '<em><b>Dm Treatment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dm Treatment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DM_TREATMENT
	 * @model name="DmTreatment" literal="Viver Bem Diabetes - Tratamento DM"
	 * @generated
	 * @ordered
	 */
	public static final int DM_TREATMENT_VALUE = 1;

	/**
	 * The '<em><b>Dm Adjustments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dm Adjustments</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DM_ADJUSTMENTS
	 * @model name="DmAdjustments" literal="Viver Bem Dm Ajustes"
	 * @generated
	 * @ordered
	 */
	public static final int DM_ADJUSTMENTS_VALUE = 2;

	/**
	 * The '<em><b>Abdominal Pain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abdominal Pain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABDOMINAL_PAIN
	 * @model name="AbdominalPain" literal="Dor Abdominal"
	 * @generated
	 * @ordered
	 */
	public static final int ABDOMINAL_PAIN_VALUE = 3;

	/**
	 * The '<em><b>Chest Pain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chest Pain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEST_PAIN
	 * @model name="ChestPain" literal="Dor Tor\341cica"
	 * @generated
	 * @ordered
	 */
	public static final int CHEST_PAIN_VALUE = 4;

	/**
	 * The '<em><b>HDP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HDP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HDP
	 * @model literal="DHEG"
	 * @generated
	 * @ordered
	 */
	public static final int HDP_VALUE = 5;

	/**
	 * The '<em><b>Diarrhea</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diarrhea</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIARRHEA
	 * @model name="Diarrhea" literal="Diarr\351ia"
	 * @generated
	 * @ordered
	 */
	public static final int DIARRHEA_VALUE = 6;

	/**
	 * The '<em><b>COPD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COPD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPD
	 * @model literal="DCOP"
	 * @generated
	 * @ordered
	 */
	public static final int COPD_VALUE = 7;

	/**
	 * The '<em><b>URTI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>URTI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URTI
	 * @model literal="IVAS"
	 * @generated
	 * @ordered
	 */
	public static final int URTI_VALUE = 8;

	/**
	 * The '<em><b>Pneumonia Influenza</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pneumonia Influenza</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PNEUMONIA_INFLUENZA
	 * @model name="PneumoniaInfluenza" literal="Pneumonia &amp; Influenza"
	 * @generated
	 * @ordered
	 */
	public static final int PNEUMONIA_INFLUENZA_VALUE = 9;

	/**
	 * The '<em><b>Premature Amniorrexis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Premature Amniorrexis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREMATURE_AMNIORREXIS
	 * @model name="PrematureAmniorrexis" literal="Aminiorrexe Prematura"
	 * @generated
	 * @ordered
	 */
	public static final int PREMATURE_AMNIORREXIS_VALUE = 10;

	/**
	 * The '<em><b>Toxoplasmosis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Toxoplasmosis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOXOPLASMOSIS
	 * @model name="Toxoplasmosis" literal="Nascer Bem Toxoplasmose"
	 * @generated
	 * @ordered
	 */
	public static final int TOXOPLASMOSIS_VALUE = 11;

	/**
	 * The '<em><b>Headache</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Headache</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADACHE
	 * @model name="Headache" literal="Cefal\351ia"
	 * @generated
	 * @ordered
	 */
	public static final int HEADACHE_VALUE = 12;

	/**
	 * The '<em><b>Parasite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parasite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARASITE
	 * @model name="Parasite" literal="Parasitose"
	 * @generated
	 * @ordered
	 */
	public static final int PARASITE_VALUE = 13;

	/**
	 * The '<em><b>Africa Line Monotherapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Africa Line Monotherapy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFRICA_LINE_MONOTHERAPY
	 * @model name="AfricaLineMonotherapy" literal="Viver Bem Monoterapia Linha Afro"
	 * @generated
	 * @ordered
	 */
	public static final int AFRICA_LINE_MONOTHERAPY_VALUE = 14;

	/**
	 * The '<em><b>Gestational Diabetes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gestational Diabetes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESTATIONAL_DIABETES
	 * @model name="GestationalDiabetes" literal="Diabetes Gestational"
	 * @generated
	 * @ordered
	 */
	public static final int GESTATIONAL_DIABETES_VALUE = 15;

	/**
	 * The '<em><b>Lumbar Pain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lumbar Pain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LUMBAR_PAIN
	 * @model name="LumbarPain" literal="M\351dico da Fam\355lia Dor Lombar"
	 * @generated
	 * @ordered
	 */
	public static final int LUMBAR_PAIN_VALUE = 16;

	/**
	 * The '<em><b>Afro Line Tetratherapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Afro Line Tetratherapy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFRO_LINE_TETRATHERAPY
	 * @model name="AfroLineTetratherapy" literal="Viver Bem Tetraterapia Linha Afro"
	 * @generated
	 * @ordered
	 */
	public static final int AFRO_LINE_TETRATHERAPY_VALUE = 17;

	/**
	 * The '<em><b>Vulvovaginitis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vulvovaginitis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VULVOVAGINITIS
	 * @model name="Vulvovaginitis" literal="Vulvovaginite"
	 * @generated
	 * @ordered
	 */
	public static final int VULVOVAGINITIS_VALUE = 18;

	/**
	 * The '<em><b>Febrile Neutropenia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Febrile Neutropenia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEBRILE_NEUTROPENIA
	 * @model name="FebrileNeutropenia" literal="Neutropenia Febril"
	 * @generated
	 * @ordered
	 */
	public static final int FEBRILE_NEUTROPENIA_VALUE = 19;

	/**
	 * The '<em><b>Pharyngitis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharyngitis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARYNGITIS
	 * @model name="Pharyngitis" literal="Faringite"
	 * @generated
	 * @ordered
	 */
	public static final int PHARYNGITIS_VALUE = 20;

	/**
	 * The '<em><b>Acute Otitis Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acute Otitis Media</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACUTE_OTITIS_MEDIA
	 * @model name="AcuteOtitisMedia" literal="Otite M\351dia Aguda"
	 * @generated
	 * @ordered
	 */
	public static final int ACUTE_OTITIS_MEDIA_VALUE = 21;

	/**
	 * The '<em><b>Tetratherapy Bar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tetratherapy Bar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TETRATHERAPY_BAR
	 * @model name="TetratherapyBar" literal="Viver Bem Tetraterapia Bar"
	 * @generated
	 * @ordered
	 */
	public static final int TETRATHERAPY_BAR_VALUE = 22;

	/**
	 * The '<em><b>UTI Cystitis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTI Cystitis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTI_CYSTITIS
	 * @model name="UTICystitis" literal="ITU - Cistite"
	 * @generated
	 * @ordered
	 */
	public static final int UTI_CYSTITIS_VALUE = 23;

	/**
	 * The '<em><b>Sepsis Treatment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sepsis Treatment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEPSIS_TREATMENT
	 * @model name="SepsisTreatment" literal="Tratamento de SEPSE"
	 * @generated
	 * @ordered
	 */
	public static final int SEPSIS_TREATMENT_VALUE = 24;

	/**
	 * The '<em><b>Joint Pain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Joint Pain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOINT_PAIN
	 * @model name="JointPain" literal="Dor Articular"
	 * @generated
	 * @ordered
	 */
	public static final int JOINT_PAIN_VALUE = 25;

	/**
	 * The '<em><b>ACEI Line Monotherapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACEI Line Monotherapy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACEI_LINE_MONOTHERAPY
	 * @model name="ACEILineMonotherapy" literal="Viver Bem Monoterapia Linha IECA"
	 * @generated
	 * @ordered
	 */
	public static final int ACEI_LINE_MONOTHERAPY_VALUE = 26;

	/**
	 * The '<em><b>Acne</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Acne</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACNE
	 * @model name="Acne"
	 * @generated
	 * @ordered
	 */
	public static final int ACNE_VALUE = 27;

	/**
	 * The '<em><b>Dyspepsia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dyspepsia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DYSPEPSIA
	 * @model name="Dyspepsia" literal="DIspepsia"
	 * @generated
	 * @ordered
	 */
	public static final int DYSPEPSIA_VALUE = 28;

	/**
	 * The '<em><b>Vertigo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vertigo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTIGO
	 * @model name="Vertigo" literal="Tontura e Vertigem"
	 * @generated
	 * @ordered
	 */
	public static final int VERTIGO_VALUE = 29;

	/**
	 * The '<em><b>ACEI Line Tetra Therapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACEI Line Tetra Therapy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACEI_LINE_TETRA_THERAPY
	 * @model name="ACEILineTetraTherapy" literal="Viver Bem Tetraterapia Linha IECA"
	 * @generated
	 * @ordered
	 */
	public static final int ACEI_LINE_TETRA_THERAPY_VALUE = 30;

	/**
	 * The '<em><b>Double Therapy Afro Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double Therapy Afro Line</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_THERAPY_AFRO_LINE
	 * @model name="DoubleTherapyAfroLine" literal="Viver Bem DuploTerapia Linha Afro"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_THERAPY_AFRO_LINE_VALUE = 31;

	/**
	 * The '<em><b>Treatment Low Risk Dyslipidemia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Treatment Low Risk Dyslipidemia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_LOW_RISK_DYSLIPIDEMIA
	 * @model name="TreatmentLowRiskDyslipidemia" literal="Viver Bem Tratamento Dislipidemia - Risco Baixo"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENT_LOW_RISK_DYSLIPIDEMIA_VALUE = 32;

	/**
	 * The '<em><b>Triple Afro Line Therapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Triple Afro Line Therapy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIPLE_AFRO_LINE_THERAPY
	 * @model name="TripleAfroLineTherapy" literal="Viver Bem Triploterapia Linha Afro"
	 * @generated
	 * @ordered
	 */
	public static final int TRIPLE_AFRO_LINE_THERAPY_VALUE = 33;

	/**
	 * The '<em><b>Diabetes Dyslipidemia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diabetes Dyslipidemia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIABETES_DYSLIPIDEMIA
	 * @model name="DiabetesDyslipidemia" literal="Viver Bem Diabetes - Dislipidemia"
	 * @generated
	 * @ordered
	 */
	public static final int DIABETES_DYSLIPIDEMIA_VALUE = 34;

	/**
	 * The '<em><b>Double Therapy Bar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double Therapy Bar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_THERAPY_BAR
	 * @model name="DoubleTherapyBar" literal="Viver Bem Duploterapia Bar"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_THERAPY_BAR_VALUE = 35;

	/**
	 * The '<em><b>Monotherapy Bar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monotherapy Bar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONOTHERAPY_BAR
	 * @model name="MonotherapyBar" literal="Viver Bem Monoterapia Bar"
	 * @generated
	 * @ordered
	 */
	public static final int MONOTHERAPY_BAR_VALUE = 36;

	/**
	 * The '<em><b>Treatment Dyslipidemia High Risk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Treatment Dyslipidemia High Risk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_DYSLIPIDEMIA_HIGH_RISK
	 * @model name="TreatmentDyslipidemiaHighRisk" literal="Viver Bem Tratamento Dislipidemia - Risco Alto"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENT_DYSLIPIDEMIA_HIGH_RISK_VALUE = 37;

	/**
	 * The '<em><b>Treatment Dyslipidemia Intermediate Risk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Treatment Dyslipidemia Intermediate Risk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_DYSLIPIDEMIA_INTERMEDIATE_RISK
	 * @model name="TreatmentDyslipidemiaIntermediateRisk" literal="Viver Bem Tratamento Dislipidemia - Risco Intermedi\341rio"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENT_DYSLIPIDEMIA_INTERMEDIATE_RISK_VALUE = 38;

	/**
	 * The '<em><b>Treatment Dyslipidemia Very High Risk</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Treatment Dyslipidemia Very High Risk</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_DYSLIPIDEMIA_VERY_HIGH_RISK
	 * @model name="TreatmentDyslipidemiaVeryHighRisk" literal="Viver Bem Tratamento Dislipidemia - Risco Muito Alto"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENT_DYSLIPIDEMIA_VERY_HIGH_RISK_VALUE = 39;

	/**
	 * The '<em><b>Meningitis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meningitis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENINGITIS
	 * @model name="Meningitis" literal="Meningite"
	 * @generated
	 * @ordered
	 */
	public static final int MENINGITIS_VALUE = 40;

	/**
	 * The '<em><b>Syphilis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Syphilis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYPHILIS
	 * @model name="Syphilis" literal="S\355filis"
	 * @generated
	 * @ordered
	 */
	public static final int SYPHILIS_VALUE = 41;

	/**
	 * The '<em><b>ACEI Line Double Therapy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACEI Line Double Therapy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACEI_LINE_DOUBLE_THERAPY
	 * @model name="ACEILineDoubleTherapy" literal="Viver Bem Duploterapia Linha IECA"
	 * @generated
	 * @ordered
	 */
	public static final int ACEI_LINE_DOUBLE_THERAPY_VALUE = 42;

	/**
	 * The '<em><b>Triploterapia BAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Triploterapia BAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIPLOTERAPIA_BAR
	 * @model name="TriploterapiaBAR" literal="Viver Bem Triploterapia Bar"
	 * @generated
	 * @ordered
	 */
	public static final int TRIPLOTERAPIA_BAR_VALUE = 43;

	/**
	 * The '<em><b>UTI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTI
	 * @model literal="ITU"
	 * @generated
	 * @ordered
	 */
	public static final int UTI_VALUE = 44;

	/**
	 * The '<em><b>Bar BBC Betablocker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bar BBC Betablocker</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAR_BBC_BETABLOCKER
	 * @model name="BarBBCBetablocker" literal="Viver Bem Bar &amp; BCC - Betabloqueador"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_BBC_BETABLOCKER_VALUE = 45;

	/**
	 * The '<em><b>UTI Diabetes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTI Diabetes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTI_DIABETES
	 * @model name="UTIDiabetes" literal="Viver Bem Diabetes - ITU"
	 * @generated
	 * @ordered
	 */
	public static final int UTI_DIABETES_VALUE = 46;

	/**
	 * The '<em><b>UTI Pyelonephritis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UTI Pyelonephritis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UTI_PYELONEPHRITIS
	 * @model name="UTIPyelonephritis" literal="ITU - Pielonefrite"
	 * @generated
	 * @ordered
	 */
	public static final int UTI_PYELONEPHRITIS_VALUE = 47;

	/**
	 * The '<em><b>African American Pharmacological</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>African American Pharmacological</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AFRICAN_AMERICAN_PHARMACOLOGICAL
	 * @model name="AfricanAmericanPharmacological" literal="Viver Bem Protocolo Farmacol\363gico Afroamericano"
	 * @generated
	 * @ordered
	 */
	public static final int AFRICAN_AMERICAN_PHARMACOLOGICAL_VALUE = 48;

	/**
	 * The '<em><b>Exposed Fracture</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exposed Fracture</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPOSED_FRACTURE
	 * @model name="ExposedFracture" literal="Fratura Exposta"
	 * @generated
	 * @ordered
	 */
	public static final int EXPOSED_FRACTURE_VALUE = 49;

	/**
	 * The '<em><b>ACEIBBC Betablocker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACEIBBC Betablocker</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACEIBBC_BETABLOCKER
	 * @model name="ACEIBBCBetablocker" literal="Viver Bem IECA &amp; BBC - Betabloqueador"
	 * @generated
	 * @ordered
	 */
	public static final int ACEIBBC_BETABLOCKER_VALUE = 50;

	/**
	 * The '<em><b>Low Back Pain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Low Back Pain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW_BACK_PAIN
	 * @model name="LowBackPain" literal="Lombalgia"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_BACK_PAIN_VALUE = 51;

	/**
	 * An array of all the '<em><b>Care Pathway</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CarePathway[] VALUES_ARRAY = new CarePathway[] { DM_TREATMENT, DM_ADJUSTMENTS, ABDOMINAL_PAIN,
			CHEST_PAIN, HDP, DIARRHEA, COPD, URTI, PNEUMONIA_INFLUENZA, PREMATURE_AMNIORREXIS, TOXOPLASMOSIS, HEADACHE,
			PARASITE, AFRICA_LINE_MONOTHERAPY, GESTATIONAL_DIABETES, LUMBAR_PAIN, AFRO_LINE_TETRATHERAPY,
			VULVOVAGINITIS, FEBRILE_NEUTROPENIA, PHARYNGITIS, ACUTE_OTITIS_MEDIA, TETRATHERAPY_BAR, UTI_CYSTITIS,
			SEPSIS_TREATMENT, JOINT_PAIN, ACEI_LINE_MONOTHERAPY, ACNE, DYSPEPSIA, VERTIGO, ACEI_LINE_TETRA_THERAPY,
			DOUBLE_THERAPY_AFRO_LINE, TREATMENT_LOW_RISK_DYSLIPIDEMIA, TRIPLE_AFRO_LINE_THERAPY, DIABETES_DYSLIPIDEMIA,
			DOUBLE_THERAPY_BAR, MONOTHERAPY_BAR, TREATMENT_DYSLIPIDEMIA_HIGH_RISK,
			TREATMENT_DYSLIPIDEMIA_INTERMEDIATE_RISK, TREATMENT_DYSLIPIDEMIA_VERY_HIGH_RISK, MENINGITIS, SYPHILIS,
			ACEI_LINE_DOUBLE_THERAPY, TRIPLOTERAPIA_BAR, UTI, BAR_BBC_BETABLOCKER, UTI_DIABETES, UTI_PYELONEPHRITIS,
			AFRICAN_AMERICAN_PHARMACOLOGICAL, EXPOSED_FRACTURE, ACEIBBC_BETABLOCKER, LOW_BACK_PAIN, };

	/**
	 * A public read-only list of all the '<em><b>Care Pathway</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CarePathway> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Care Pathway</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CarePathway get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CarePathway result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Care Pathway</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CarePathway getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CarePathway result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Care Pathway</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CarePathway get(int value) {
		switch (value) {
		case DM_TREATMENT_VALUE:
			return DM_TREATMENT;
		case DM_ADJUSTMENTS_VALUE:
			return DM_ADJUSTMENTS;
		case ABDOMINAL_PAIN_VALUE:
			return ABDOMINAL_PAIN;
		case CHEST_PAIN_VALUE:
			return CHEST_PAIN;
		case HDP_VALUE:
			return HDP;
		case DIARRHEA_VALUE:
			return DIARRHEA;
		case COPD_VALUE:
			return COPD;
		case URTI_VALUE:
			return URTI;
		case PNEUMONIA_INFLUENZA_VALUE:
			return PNEUMONIA_INFLUENZA;
		case PREMATURE_AMNIORREXIS_VALUE:
			return PREMATURE_AMNIORREXIS;
		case TOXOPLASMOSIS_VALUE:
			return TOXOPLASMOSIS;
		case HEADACHE_VALUE:
			return HEADACHE;
		case PARASITE_VALUE:
			return PARASITE;
		case AFRICA_LINE_MONOTHERAPY_VALUE:
			return AFRICA_LINE_MONOTHERAPY;
		case GESTATIONAL_DIABETES_VALUE:
			return GESTATIONAL_DIABETES;
		case LUMBAR_PAIN_VALUE:
			return LUMBAR_PAIN;
		case AFRO_LINE_TETRATHERAPY_VALUE:
			return AFRO_LINE_TETRATHERAPY;
		case VULVOVAGINITIS_VALUE:
			return VULVOVAGINITIS;
		case FEBRILE_NEUTROPENIA_VALUE:
			return FEBRILE_NEUTROPENIA;
		case PHARYNGITIS_VALUE:
			return PHARYNGITIS;
		case ACUTE_OTITIS_MEDIA_VALUE:
			return ACUTE_OTITIS_MEDIA;
		case TETRATHERAPY_BAR_VALUE:
			return TETRATHERAPY_BAR;
		case UTI_CYSTITIS_VALUE:
			return UTI_CYSTITIS;
		case SEPSIS_TREATMENT_VALUE:
			return SEPSIS_TREATMENT;
		case JOINT_PAIN_VALUE:
			return JOINT_PAIN;
		case ACEI_LINE_MONOTHERAPY_VALUE:
			return ACEI_LINE_MONOTHERAPY;
		case ACNE_VALUE:
			return ACNE;
		case DYSPEPSIA_VALUE:
			return DYSPEPSIA;
		case VERTIGO_VALUE:
			return VERTIGO;
		case ACEI_LINE_TETRA_THERAPY_VALUE:
			return ACEI_LINE_TETRA_THERAPY;
		case DOUBLE_THERAPY_AFRO_LINE_VALUE:
			return DOUBLE_THERAPY_AFRO_LINE;
		case TREATMENT_LOW_RISK_DYSLIPIDEMIA_VALUE:
			return TREATMENT_LOW_RISK_DYSLIPIDEMIA;
		case TRIPLE_AFRO_LINE_THERAPY_VALUE:
			return TRIPLE_AFRO_LINE_THERAPY;
		case DIABETES_DYSLIPIDEMIA_VALUE:
			return DIABETES_DYSLIPIDEMIA;
		case DOUBLE_THERAPY_BAR_VALUE:
			return DOUBLE_THERAPY_BAR;
		case MONOTHERAPY_BAR_VALUE:
			return MONOTHERAPY_BAR;
		case TREATMENT_DYSLIPIDEMIA_HIGH_RISK_VALUE:
			return TREATMENT_DYSLIPIDEMIA_HIGH_RISK;
		case TREATMENT_DYSLIPIDEMIA_INTERMEDIATE_RISK_VALUE:
			return TREATMENT_DYSLIPIDEMIA_INTERMEDIATE_RISK;
		case TREATMENT_DYSLIPIDEMIA_VERY_HIGH_RISK_VALUE:
			return TREATMENT_DYSLIPIDEMIA_VERY_HIGH_RISK;
		case MENINGITIS_VALUE:
			return MENINGITIS;
		case SYPHILIS_VALUE:
			return SYPHILIS;
		case ACEI_LINE_DOUBLE_THERAPY_VALUE:
			return ACEI_LINE_DOUBLE_THERAPY;
		case TRIPLOTERAPIA_BAR_VALUE:
			return TRIPLOTERAPIA_BAR;
		case UTI_VALUE:
			return UTI;
		case BAR_BBC_BETABLOCKER_VALUE:
			return BAR_BBC_BETABLOCKER;
		case UTI_DIABETES_VALUE:
			return UTI_DIABETES;
		case UTI_PYELONEPHRITIS_VALUE:
			return UTI_PYELONEPHRITIS;
		case AFRICAN_AMERICAN_PHARMACOLOGICAL_VALUE:
			return AFRICAN_AMERICAN_PHARMACOLOGICAL;
		case EXPOSED_FRACTURE_VALUE:
			return EXPOSED_FRACTURE;
		case ACEIBBC_BETABLOCKER_VALUE:
			return ACEIBBC_BETABLOCKER;
		case LOW_BACK_PAIN_VALUE:
			return LOW_BACK_PAIN;
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
	private CarePathway(int value, String name, String literal) {
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

} //CarePathway
