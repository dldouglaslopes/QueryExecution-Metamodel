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
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Fratura Exposta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRATURA_EXPOSTA_VALUE
	 * @generated
	 * @ordered
	 */
	FRATURA_EXPOSTA(1, "FraturaExposta", "Fratura Exposta"),

	/**
	 * The '<em><b>Pneumonia Influenza</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNEUMONIA_INFLUENZA_VALUE
	 * @generated
	 * @ordered
	 */
	PNEUMONIA_INFLUENZA(2, "PneumoniaInfluenza", "Pneumonia & Influenza"),

	/**
	 * The '<em><b>Meningite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENINGITE_VALUE
	 * @generated
	 * @ordered
	 */
	MENINGITE(3, "Meningite", "Meningite"),

	/**
	 * The '<em><b>Amniorrexe Prematura</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMNIORREXE_PREMATURA_VALUE
	 * @generated
	 * @ordered
	 */
	AMNIORREXE_PREMATURA(4, "AmniorrexePrematura", "Amniorrexe Prematura"),

	/**
	 * The '<em><b>ITU Cistite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITU_CISTITE_VALUE
	 * @generated
	 * @ordered
	 */
	ITU_CISTITE(61, "ITUCistite", "ITU - Cistite"),

	/**
	 * The '<em><b>Verifica SEPSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFICA_SEPSE_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFICA_SEPSE(64, "VerificaSEPSE", "Verifica SEPSE"),

	/**
	 * The '<em><b>Tratamento SEPSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRATAMENTO_SEPSE_VALUE
	 * @generated
	 * @ordered
	 */
	TRATAMENTO_SEPSE(65, "TratamentoSEPSE", "Tratamento de SEPSE"),

	/**
	 * The '<em><b>Tratamento SIRS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRATAMENTO_SIRS_VALUE
	 * @generated
	 * @ordered
	 */
	TRATAMENTO_SIRS(8, "TratamentoSIRS", "Tratamento de SIRS"),

	/**
	 * The '<em><b>ITU Pielonefrite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITU_PIELONEFRITE_VALUE
	 * @generated
	 * @ordered
	 */
	ITU_PIELONEFRITE(81, "ITUPielonefrite", "ITU - Pielonefrite"),

	/**
	 * The '<em><b>Neutropenia Febril</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTROPENIA_FEBRIL_VALUE
	 * @generated
	 * @ordered
	 */
	NEUTROPENIA_FEBRIL(82, "NeutropeniaFebril", "Neutropenia Febril"),

	/**
	 * The '<em><b>IVAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVAS_VALUE
	 * @generated
	 * @ordered
	 */
	IVAS(83, "IVAS", "IVAS"),

	/**
	 * The '<em><b>Diarréia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARRÉIA_VALUE
	 * @generated
	 * @ordered
	 */
	DIARRÉIA(101, "Diarréia", "Diarr\u00e9ia"),

	/**
	 * The '<em><b>Cefaléia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEFALÉIA_VALUE
	 * @generated
	 * @ordered
	 */
	CEFALÉIA(121, "Cefaléia", "Cefal\u00e9ia"),

	/**
	 * The '<em><b>Lombalgia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOMBALGIA_VALUE
	 * @generated
	 * @ordered
	 */
	LOMBALGIA(161, "Lombalgia", "Lombalgia"),

	/**
	 * The '<em><b>Dor Torácica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOR_TORÁCICA_VALUE
	 * @generated
	 * @ordered
	 */
	DOR_TORÁCICA(181, "DorTorácica", "Dor Tor\u00e1cica"),

	/**
	 * The '<em><b>Dor Abdominal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOR_ABDOMINAL_VALUE
	 * @generated
	 * @ordered
	 */
	DOR_ABDOMINAL(201, "DorAbdominal", "Dor Abdominal"),

	/**
	 * The '<em><b>Tontura Vertigem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TONTURA_VERTIGEM_VALUE
	 * @generated
	 * @ordered
	 */
	TONTURA_VERTIGEM(221, "TonturaVertigem", "Tontura e Vertigem"),

	/**
	 * The '<em><b>IVAS Pediátrico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVAS_PEDIÁTRICO_VALUE
	 * @generated
	 * @ordered
	 */
	IVAS_PEDIÁTRICO(261, "IVASPediátrico", "IVAS Pedi\u00e1trico"),

	/**
	 * The '<em><b>Otalgia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTALGIA_VALUE
	 * @generated
	 * @ordered
	 */
	OTALGIA(281, "Otalgia", "Otalgia"),

	/**
	 * The '<em><b>Náuseas Vômitos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NÁUSEAS_VÔMITOS_VALUE
	 * @generated
	 * @ordered
	 */
	NÁUSEAS_VÔMITOS(282, "NáuseasVômitos", "N\u00e1useas e V\u00f4mitos"),

	/**
	 * The '<em><b>Diarreia Aguda Pediátrico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARREIA_AGUDA_PEDIÁTRICO_VALUE
	 * @generated
	 * @ordered
	 */
	DIARREIA_AGUDA_PEDIÁTRICO(301, "DiarreiaAgudaPediátrico", "Diarreia aguda Pedi\u00e1trico"),

	/**
	 * The '<em><b>Trabalho Parto Prematuro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRABALHO_PARTO_PREMATURO_VALUE
	 * @generated
	 * @ordered
	 */
	TRABALHO_PARTO_PREMATURO(321, "TrabalhoPartoPrematuro", "Trabalho de Parto Prematuro"),

	/**
	 * The '<em><b>DHEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHEG_VALUE
	 * @generated
	 * @ordered
	 */
	DHEG(341, "DHEG", "DHEG"),

	/**
	 * The '<em><b>Dispepsia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPEPSIA_VALUE
	 * @generated
	 * @ordered
	 */
	DISPEPSIA(361, "Dispepsia", "Dispepsia"),

	/**
	 * The '<em><b>TCE Pediátrico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCE_PEDIÁTRICO_VALUE
	 * @generated
	 * @ordered
	 */
	TCE_PEDIÁTRICO(362, "TCEPediátrico", "TCE Pedi\u00e1trico"),

	/**
	 * The '<em><b>Aminiorrexe Prematura</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMINIORREXE_PREMATURA_VALUE
	 * @generated
	 * @ordered
	 */
	AMINIORREXE_PREMATURA(365, "AminiorrexePrematura", "Aminiorrexe Prematura"),

	/**
	 * The '<em><b>Dor Articular Tendinopatia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOR_ARTICULAR_TENDINOPATIA_VALUE
	 * @generated
	 * @ordered
	 */
	DOR_ARTICULAR_TENDINOPATIA(381, "DorArticularTendinopatia", "Dor Articular/Tendinopatia"),

	/**
	 * The '<em><b>Febre Sem Sinais Localização</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEBRE_SEM_SINAIS_LOCALIZAÇÃO_VALUE
	 * @generated
	 * @ordered
	 */
	FEBRE_SEM_SINAIS_LOCALIZAÇÃO(403, "FebreSemSinaisLocalização", "Febre Sem Sinais de Localiza\u00e7\u00e3o"),

	/**
	 * The '<em><b>Infecção Partes Moles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFECÇÃO_PARTES_MOLES_VALUE
	 * @generated
	 * @ordered
	 */
	INFECÇÃO_PARTES_MOLES(424, "InfecçãoPartesMoles", "Infec\u00e7\u00e3o das Partes Moles"),

	/**
	 * The '<em><b>Asma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASMA_VALUE
	 * @generated
	 * @ordered
	 */
	ASMA(441, "Asma", "Asma"),

	/**
	 * The '<em><b>Pneumonia Adquirida Comunidade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNEUMONIA_ADQUIRIDA_COMUNIDADE_VALUE
	 * @generated
	 * @ordered
	 */
	PNEUMONIA_ADQUIRIDA_COMUNIDADE(461, "PneumoniaAdquiridaComunidade", "Pneumonia Adquirida na Comunidade"),

	/**
	 * The '<em><b>Urticária Pediátrico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URTICÁRIA_PEDIÁTRICO_VALUE
	 * @generated
	 * @ordered
	 */
	URTICÁRIA_PEDIÁTRICO(462, "UrticáriaPediátrico", "Urtic\u00e1ria Pedi\u00e1trico"),

	/**
	 * The '<em><b>Endometrite Puerperal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDOMETRITE_PUERPERAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENDOMETRITE_PUERPERAL(481, "EndometritePuerperal", "Endometrite Puerperal"),

	/**
	 * The '<em><b>Hemorragia Pós Parto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMORRAGIA_PÓS_PARTO_VALUE
	 * @generated
	 * @ordered
	 */
	HEMORRAGIA_PÓS_PARTO(501, "HemorragiaPósParto", "Hemorragia P\u00f3s-Parto"),

	/**
	 * The '<em><b>Posdatismo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSDATISMO_VALUE
	 * @generated
	 * @ordered
	 */
	POSDATISMO(502, "Posdatismo", "Posdatismo"),

	/**
	 * The '<em><b>Hipertensão Arterial Sistêmica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIPERTENSÃO_ARTERIAL_SISTÊMICA_VALUE
	 * @generated
	 * @ordered
	 */
	HIPERTENSÃO_ARTERIAL_SISTÊMICA(521, "HipertensãoArterialSistêmica", "Hipertens\u00e3o Arterial Sist\u00eamica"),

	/**
	 * The '<em><b>Insuficiência Cardíaca</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSUFICIÊNCIA_CARDÍACA_VALUE
	 * @generated
	 * @ordered
	 */
	INSUFICIÊNCIA_CARDÍACA(522, "InsuficiênciaCardíaca", "Insufici\u00eancia Card\u00edaca"),

	/**
	 * The '<em><b>DPOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPOC_VALUE
	 * @generated
	 * @ordered
	 */
	DPOC(541, "DPOC", "DPOC"),

	/**
	 * The '<em><b>Curativo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURATIVO_VALUE
	 * @generated
	 * @ordered
	 */
	CURATIVO(561, "Curativo", "Curativo");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Fratura Exposta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fratura Exposta</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRATURA_EXPOSTA
	 * @model name="FraturaExposta" literal="Fratura Exposta"
	 * @generated
	 * @ordered
	 */
	public static final int FRATURA_EXPOSTA_VALUE = 1;

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
	public static final int PNEUMONIA_INFLUENZA_VALUE = 2;

	/**
	 * The '<em><b>Meningite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meningite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENINGITE
	 * @model name="Meningite"
	 * @generated
	 * @ordered
	 */
	public static final int MENINGITE_VALUE = 3;

	/**
	 * The '<em><b>Amniorrexe Prematura</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amniorrexe Prematura</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMNIORREXE_PREMATURA
	 * @model name="AmniorrexePrematura" literal="Amniorrexe Prematura"
	 * @generated
	 * @ordered
	 */
	public static final int AMNIORREXE_PREMATURA_VALUE = 4;

	/**
	 * The '<em><b>ITU Cistite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITU Cistite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITU_CISTITE
	 * @model name="ITUCistite" literal="ITU - Cistite"
	 * @generated
	 * @ordered
	 */
	public static final int ITU_CISTITE_VALUE = 61;

	/**
	 * The '<em><b>Verifica SEPSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verifica SEPSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERIFICA_SEPSE
	 * @model name="VerificaSEPSE" literal="Verifica SEPSE"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFICA_SEPSE_VALUE = 64;

	/**
	 * The '<em><b>Tratamento SEPSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tratamento SEPSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRATAMENTO_SEPSE
	 * @model name="TratamentoSEPSE" literal="Tratamento de SEPSE"
	 * @generated
	 * @ordered
	 */
	public static final int TRATAMENTO_SEPSE_VALUE = 65;

	/**
	 * The '<em><b>Tratamento SIRS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tratamento SIRS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRATAMENTO_SIRS
	 * @model name="TratamentoSIRS" literal="Tratamento de SIRS"
	 * @generated
	 * @ordered
	 */
	public static final int TRATAMENTO_SIRS_VALUE = 8;

	/**
	 * The '<em><b>ITU Pielonefrite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITU Pielonefrite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITU_PIELONEFRITE
	 * @model name="ITUPielonefrite" literal="ITU - Pielonefrite"
	 * @generated
	 * @ordered
	 */
	public static final int ITU_PIELONEFRITE_VALUE = 81;

	/**
	 * The '<em><b>Neutropenia Febril</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Neutropenia Febril</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEUTROPENIA_FEBRIL
	 * @model name="NeutropeniaFebril" literal="Neutropenia Febril"
	 * @generated
	 * @ordered
	 */
	public static final int NEUTROPENIA_FEBRIL_VALUE = 82;

	/**
	 * The '<em><b>IVAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IVAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IVAS_VALUE = 83;

	/**
	 * The '<em><b>Diarréia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diarréia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIARRÉIA
	 * @model name="Diarréia"
	 * @generated
	 * @ordered
	 */
	public static final int DIARRÉIA_VALUE = 101;

	/**
	 * The '<em><b>Cefaléia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cefaléia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CEFALÉIA
	 * @model name="Cefaléia"
	 * @generated
	 * @ordered
	 */
	public static final int CEFALÉIA_VALUE = 121;

	/**
	 * The '<em><b>Lombalgia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lombalgia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOMBALGIA
	 * @model name="Lombalgia"
	 * @generated
	 * @ordered
	 */
	public static final int LOMBALGIA_VALUE = 161;

	/**
	 * The '<em><b>Dor Torácica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dor Torácica</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOR_TORÁCICA
	 * @model name="DorTorácica" literal="Dor Tor\341cica"
	 * @generated
	 * @ordered
	 */
	public static final int DOR_TORÁCICA_VALUE = 181;

	/**
	 * The '<em><b>Dor Abdominal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dor Abdominal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOR_ABDOMINAL
	 * @model name="DorAbdominal" literal="Dor Abdominal"
	 * @generated
	 * @ordered
	 */
	public static final int DOR_ABDOMINAL_VALUE = 201;

	/**
	 * The '<em><b>Tontura Vertigem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tontura Vertigem</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TONTURA_VERTIGEM
	 * @model name="TonturaVertigem" literal="Tontura e Vertigem"
	 * @generated
	 * @ordered
	 */
	public static final int TONTURA_VERTIGEM_VALUE = 221;

	/**
	 * The '<em><b>IVAS Pediátrico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IVAS Pediátrico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVAS_PEDIÁTRICO
	 * @model name="IVASPediátrico" literal="IVAS Pedi\341trico"
	 * @generated
	 * @ordered
	 */
	public static final int IVAS_PEDIÁTRICO_VALUE = 261;

	/**
	 * The '<em><b>Otalgia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Otalgia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTALGIA
	 * @model name="Otalgia"
	 * @generated
	 * @ordered
	 */
	public static final int OTALGIA_VALUE = 281;

	/**
	 * The '<em><b>Náuseas Vômitos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Náuseas Vômitos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NÁUSEAS_VÔMITOS
	 * @model name="NáuseasVômitos" literal="N\341useas e V\364mitos"
	 * @generated
	 * @ordered
	 */
	public static final int NÁUSEAS_VÔMITOS_VALUE = 282;

	/**
	 * The '<em><b>Diarreia Aguda Pediátrico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diarreia Aguda Pediátrico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIARREIA_AGUDA_PEDIÁTRICO
	 * @model name="DiarreiaAgudaPediátrico" literal="Diarreia aguda Pedi\341trico"
	 * @generated
	 * @ordered
	 */
	public static final int DIARREIA_AGUDA_PEDIÁTRICO_VALUE = 301;

	/**
	 * The '<em><b>Trabalho Parto Prematuro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trabalho Parto Prematuro</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRABALHO_PARTO_PREMATURO
	 * @model name="TrabalhoPartoPrematuro" literal="Trabalho de Parto Prematuro"
	 * @generated
	 * @ordered
	 */
	public static final int TRABALHO_PARTO_PREMATURO_VALUE = 321;

	/**
	 * The '<em><b>DHEG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DHEG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DHEG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DHEG_VALUE = 341;

	/**
	 * The '<em><b>Dispepsia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispepsia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPEPSIA
	 * @model name="Dispepsia"
	 * @generated
	 * @ordered
	 */
	public static final int DISPEPSIA_VALUE = 361;

	/**
	 * The '<em><b>TCE Pediátrico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TCE Pediátrico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCE_PEDIÁTRICO
	 * @model name="TCEPediátrico" literal="TCE Pedi\341trico"
	 * @generated
	 * @ordered
	 */
	public static final int TCE_PEDIÁTRICO_VALUE = 362;

	/**
	 * The '<em><b>Aminiorrexe Prematura</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aminiorrexe Prematura</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMINIORREXE_PREMATURA
	 * @model name="AminiorrexePrematura" literal="Aminiorrexe Prematura"
	 * @generated
	 * @ordered
	 */
	public static final int AMINIORREXE_PREMATURA_VALUE = 365;

	/**
	 * The '<em><b>Dor Articular Tendinopatia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dor Articular Tendinopatia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOR_ARTICULAR_TENDINOPATIA
	 * @model name="DorArticularTendinopatia" literal="Dor Articular/Tendinopatia"
	 * @generated
	 * @ordered
	 */
	public static final int DOR_ARTICULAR_TENDINOPATIA_VALUE = 381;

	/**
	 * The '<em><b>Febre Sem Sinais Localização</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Febre Sem Sinais Localização</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEBRE_SEM_SINAIS_LOCALIZAÇÃO
	 * @model name="FebreSemSinaisLocalização" literal="Febre Sem Sinais de Localiza\347\343o"
	 * @generated
	 * @ordered
	 */
	public static final int FEBRE_SEM_SINAIS_LOCALIZAÇÃO_VALUE = 403;

	/**
	 * The '<em><b>Infecção Partes Moles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infecção Partes Moles</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFECÇÃO_PARTES_MOLES
	 * @model name="InfecçãoPartesMoles" literal="Infec\347\343o das Partes Moles"
	 * @generated
	 * @ordered
	 */
	public static final int INFECÇÃO_PARTES_MOLES_VALUE = 424;

	/**
	 * The '<em><b>Asma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asma</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASMA
	 * @model name="Asma"
	 * @generated
	 * @ordered
	 */
	public static final int ASMA_VALUE = 441;

	/**
	 * The '<em><b>Pneumonia Adquirida Comunidade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pneumonia Adquirida Comunidade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PNEUMONIA_ADQUIRIDA_COMUNIDADE
	 * @model name="PneumoniaAdquiridaComunidade" literal="Pneumonia Adquirida na Comunidade"
	 * @generated
	 * @ordered
	 */
	public static final int PNEUMONIA_ADQUIRIDA_COMUNIDADE_VALUE = 461;

	/**
	 * The '<em><b>Urticária Pediátrico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urticária Pediátrico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URTICÁRIA_PEDIÁTRICO
	 * @model name="UrticáriaPediátrico" literal="Urtic\341ria Pedi\341trico"
	 * @generated
	 * @ordered
	 */
	public static final int URTICÁRIA_PEDIÁTRICO_VALUE = 462;

	/**
	 * The '<em><b>Endometrite Puerperal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Endometrite Puerperal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDOMETRITE_PUERPERAL
	 * @model name="EndometritePuerperal" literal="Endometrite Puerperal"
	 * @generated
	 * @ordered
	 */
	public static final int ENDOMETRITE_PUERPERAL_VALUE = 481;

	/**
	 * The '<em><b>Hemorragia Pós Parto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hemorragia Pós Parto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEMORRAGIA_PÓS_PARTO
	 * @model name="HemorragiaPósParto" literal="Hemorragia P\363s-Parto"
	 * @generated
	 * @ordered
	 */
	public static final int HEMORRAGIA_PÓS_PARTO_VALUE = 501;

	/**
	 * The '<em><b>Posdatismo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Posdatismo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSDATISMO
	 * @model name="Posdatismo"
	 * @generated
	 * @ordered
	 */
	public static final int POSDATISMO_VALUE = 502;

	/**
	 * The '<em><b>Hipertensão Arterial Sistêmica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hipertensão Arterial Sistêmica</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIPERTENSÃO_ARTERIAL_SISTÊMICA
	 * @model name="HipertensãoArterialSistêmica" literal="Hipertens\343o Arterial Sist\352mica"
	 * @generated
	 * @ordered
	 */
	public static final int HIPERTENSÃO_ARTERIAL_SISTÊMICA_VALUE = 521;

	/**
	 * The '<em><b>Insuficiência Cardíaca</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Insuficiência Cardíaca</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSUFICIÊNCIA_CARDÍACA
	 * @model name="InsuficiênciaCardíaca" literal="Insufici\352ncia Card\355aca"
	 * @generated
	 * @ordered
	 */
	public static final int INSUFICIÊNCIA_CARDÍACA_VALUE = 522;

	/**
	 * The '<em><b>DPOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DPOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DPOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DPOC_VALUE = 541;

	/**
	 * The '<em><b>Curativo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Curativo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURATIVO
	 * @model name="Curativo"
	 * @generated
	 * @ordered
	 */
	public static final int CURATIVO_VALUE = 561;

	/**
	 * An array of all the '<em><b>Care Pathway</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CarePathway[] VALUES_ARRAY = new CarePathway[] { NONE, FRATURA_EXPOSTA, PNEUMONIA_INFLUENZA,
			MENINGITE, AMNIORREXE_PREMATURA, ITU_CISTITE, VERIFICA_SEPSE, TRATAMENTO_SEPSE, TRATAMENTO_SIRS,
			ITU_PIELONEFRITE, NEUTROPENIA_FEBRIL, IVAS, DIARRÉIA, CEFALÉIA, LOMBALGIA, DOR_TORÁCICA, DOR_ABDOMINAL,
			TONTURA_VERTIGEM, IVAS_PEDIÁTRICO, OTALGIA, NÁUSEAS_VÔMITOS, DIARREIA_AGUDA_PEDIÁTRICO,
			TRABALHO_PARTO_PREMATURO, DHEG, DISPEPSIA, TCE_PEDIÁTRICO, AMINIORREXE_PREMATURA,
			DOR_ARTICULAR_TENDINOPATIA, FEBRE_SEM_SINAIS_LOCALIZAÇÃO, INFECÇÃO_PARTES_MOLES, ASMA,
			PNEUMONIA_ADQUIRIDA_COMUNIDADE, URTICÁRIA_PEDIÁTRICO, ENDOMETRITE_PUERPERAL, HEMORRAGIA_PÓS_PARTO,
			POSDATISMO, HIPERTENSÃO_ARTERIAL_SISTÊMICA, INSUFICIÊNCIA_CARDÍACA, DPOC, CURATIVO, };

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
		case NONE_VALUE:
			return NONE;
		case FRATURA_EXPOSTA_VALUE:
			return FRATURA_EXPOSTA;
		case PNEUMONIA_INFLUENZA_VALUE:
			return PNEUMONIA_INFLUENZA;
		case MENINGITE_VALUE:
			return MENINGITE;
		case AMNIORREXE_PREMATURA_VALUE:
			return AMNIORREXE_PREMATURA;
		case ITU_CISTITE_VALUE:
			return ITU_CISTITE;
		case VERIFICA_SEPSE_VALUE:
			return VERIFICA_SEPSE;
		case TRATAMENTO_SEPSE_VALUE:
			return TRATAMENTO_SEPSE;
		case TRATAMENTO_SIRS_VALUE:
			return TRATAMENTO_SIRS;
		case ITU_PIELONEFRITE_VALUE:
			return ITU_PIELONEFRITE;
		case NEUTROPENIA_FEBRIL_VALUE:
			return NEUTROPENIA_FEBRIL;
		case IVAS_VALUE:
			return IVAS;
		case DIARRÉIA_VALUE:
			return DIARRÉIA;
		case CEFALÉIA_VALUE:
			return CEFALÉIA;
		case LOMBALGIA_VALUE:
			return LOMBALGIA;
		case DOR_TORÁCICA_VALUE:
			return DOR_TORÁCICA;
		case DOR_ABDOMINAL_VALUE:
			return DOR_ABDOMINAL;
		case TONTURA_VERTIGEM_VALUE:
			return TONTURA_VERTIGEM;
		case IVAS_PEDIÁTRICO_VALUE:
			return IVAS_PEDIÁTRICO;
		case OTALGIA_VALUE:
			return OTALGIA;
		case NÁUSEAS_VÔMITOS_VALUE:
			return NÁUSEAS_VÔMITOS;
		case DIARREIA_AGUDA_PEDIÁTRICO_VALUE:
			return DIARREIA_AGUDA_PEDIÁTRICO;
		case TRABALHO_PARTO_PREMATURO_VALUE:
			return TRABALHO_PARTO_PREMATURO;
		case DHEG_VALUE:
			return DHEG;
		case DISPEPSIA_VALUE:
			return DISPEPSIA;
		case TCE_PEDIÁTRICO_VALUE:
			return TCE_PEDIÁTRICO;
		case AMINIORREXE_PREMATURA_VALUE:
			return AMINIORREXE_PREMATURA;
		case DOR_ARTICULAR_TENDINOPATIA_VALUE:
			return DOR_ARTICULAR_TENDINOPATIA;
		case FEBRE_SEM_SINAIS_LOCALIZAÇÃO_VALUE:
			return FEBRE_SEM_SINAIS_LOCALIZAÇÃO;
		case INFECÇÃO_PARTES_MOLES_VALUE:
			return INFECÇÃO_PARTES_MOLES;
		case ASMA_VALUE:
			return ASMA;
		case PNEUMONIA_ADQUIRIDA_COMUNIDADE_VALUE:
			return PNEUMONIA_ADQUIRIDA_COMUNIDADE;
		case URTICÁRIA_PEDIÁTRICO_VALUE:
			return URTICÁRIA_PEDIÁTRICO;
		case ENDOMETRITE_PUERPERAL_VALUE:
			return ENDOMETRITE_PUERPERAL;
		case HEMORRAGIA_PÓS_PARTO_VALUE:
			return HEMORRAGIA_PÓS_PARTO;
		case POSDATISMO_VALUE:
			return POSDATISMO;
		case HIPERTENSÃO_ARTERIAL_SISTÊMICA_VALUE:
			return HIPERTENSÃO_ARTERIAL_SISTÊMICA;
		case INSUFICIÊNCIA_CARDÍACA_VALUE:
			return INSUFICIÊNCIA_CARDÍACA;
		case DPOC_VALUE:
			return DPOC;
		case CURATIVO_VALUE:
			return CURATIVO;
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
