/**
 */
package QueryMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelPackage#getVersion()
 * @model
 * @generated
 */
public enum Version implements Enumerator {
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
	FRATURA_EXPOSTA(3, "FraturaExposta", "Fratura Exposta"),

	/**
	 * The '<em><b>Pneumonia Influenza</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNEUMONIA_INFLUENZA_VALUE
	 * @generated
	 * @ordered
	 */
	PNEUMONIA_INFLUENZA(12, "PneumoniaInfluenza", "Pneumonia & Influenza"),

	/**
	 * The '<em><b>Meningite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENINGITE_VALUE
	 * @generated
	 * @ordered
	 */
	MENINGITE(7, "Meningite", "Meningite"),

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
	ITU_CISTITE(6, "ITUCistite", "ITU - Cistite"),

	/**
	 * The '<em><b>Verifica SEPSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFICA_SEPSE_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFICA_SEPSE(2, "VerificaSEPSE", "Verifica SEPSE"),

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
	ITU_PIELONEFRITE(9, "ITUPielonefrite", "ITU - Pielonefrite"),

	/**
	 * The '<em><b>Neutropenia Febril</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEUTROPENIA_FEBRIL_VALUE
	 * @generated
	 * @ordered
	 */
	NEUTROPENIA_FEBRIL(2, "NeutropeniaFebril", "Neutropenia Febril"),

	/**
	 * The '<em><b>IVAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVAS_VALUE
	 * @generated
	 * @ordered
	 */
	IVAS(19, "IVAS", "IVAS"),

	/**
	 * The '<em><b>Diarr�ia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARR�IA_VALUE
	 * @generated
	 * @ordered
	 */
	DIARR�IA(4, "Diarr�ia", "Diarr\u00e9ia"),

	/**
	 * The '<em><b>Cefal�ia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEFAL�IA_VALUE
	 * @generated
	 * @ordered
	 */
	CEFAL�IA(9, "Cefal�ia", "Cefal\u00e9ia"),

	/**
	 * The '<em><b>Lombalgia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOMBALGIA_VALUE
	 * @generated
	 * @ordered
	 */
	LOMBALGIA(18, "Lombalgia", "Lombalgia"),

	/**
	 * The '<em><b>Dor Tor�cica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOR_TOR�CICA_VALUE
	 * @generated
	 * @ordered
	 */
	DOR_TOR�CICA(6, "DorTor�cica", "Dor Tor\u00e1cica"),

	/**
	 * The '<em><b>Dor Abdominal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOR_ABDOMINAL_VALUE
	 * @generated
	 * @ordered
	 */
	DOR_ABDOMINAL(22, "DorAbdominal", "Dor Abdominal"),

	/**
	 * The '<em><b>Tontura Vertigem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TONTURA_VERTIGEM_VALUE
	 * @generated
	 * @ordered
	 */
	TONTURA_VERTIGEM(3, "TonturaVertigem", "Tontura e Vertigem"),

	/**
	 * The '<em><b>IVAS Pedi�trico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IVAS_PEDI�TRICO_VALUE
	 * @generated
	 * @ordered
	 */
	IVAS_PEDI�TRICO(7, "IVASPedi�trico", "IVAS Pedi\u00e1trico"),

	/**
	 * The '<em><b>Otalgia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTALGIA_VALUE
	 * @generated
	 * @ordered
	 */
	OTALGIA(4, "Otalgia", "Otalgia"),

	/**
	 * The '<em><b>N�useas V�mitos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #N�USEAS_V�MITOS_VALUE
	 * @generated
	 * @ordered
	 */
	N�USEAS_V�MITOS(2, "N�useasV�mitos", "N\u00e1useas e V\u00f4mitos"),

	/**
	 * The '<em><b>Diarreia Aguda Pedi�trico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIARREIA_AGUDA_PEDI�TRICO_VALUE
	 * @generated
	 * @ordered
	 */
	DIARREIA_AGUDA_PEDI�TRICO(7, "DiarreiaAgudaPedi�trico", "Diarreia aguda Pedi\u00e1trico"),

	/**
	 * The '<em><b>Trabalho Parto Prematuro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRABALHO_PARTO_PREMATURO_VALUE
	 * @generated
	 * @ordered
	 */
	TRABALHO_PARTO_PREMATURO(1, "TrabalhoPartoPrematuro", "Trabalho de Parto Prematuro"),

	/**
	 * The '<em><b>DHEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DHEG_VALUE
	 * @generated
	 * @ordered
	 */
	DHEG(1, "DHEG", "DHEG"),

	/**
	 * The '<em><b>Dispepsia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPEPSIA_VALUE
	 * @generated
	 * @ordered
	 */
	DISPEPSIA(2, "Dispepsia", "Dispepsia"),

	/**
	 * The '<em><b>TCE Pedi�trico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TCE_PEDI�TRICO_VALUE
	 * @generated
	 * @ordered
	 */
	TCE_PEDI�TRICO(5, "TCEPedi�trico", "TCE Pedi\u00e1trico"),

	/**
	 * The '<em><b>Aminiorrexe Prematura</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMINIORREXE_PREMATURA_VALUE
	 * @generated
	 * @ordered
	 */
	AMINIORREXE_PREMATURA(1, "AminiorrexePrematura", "Aminiorrexe Prematura"),

	/**
	 * The '<em><b>Dor Articular Tendinopatia</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOR_ARTICULAR_TENDINOPATIA_VALUE
	 * @generated
	 * @ordered
	 */
	DOR_ARTICULAR_TENDINOPATIA(2, "DorArticularTendinopatia", "Dor Articular/Tendinopatia"),

	/**
	 * The '<em><b>Febre Sem Sinais Localiza��o</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEBRE_SEM_SINAIS_LOCALIZA��O_VALUE
	 * @generated
	 * @ordered
	 */
	FEBRE_SEM_SINAIS_LOCALIZA��O(8, "FebreSemSinaisLocaliza��o", "Febre Sem Sinais de Localiza\u00e7\u00e3o"),

	/**
	 * The '<em><b>Infec��o Partes Moles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFEC��O_PARTES_MOLES_VALUE
	 * @generated
	 * @ordered
	 */
	INFEC��O_PARTES_MOLES(9, "Infec��oPartesMoles", "Infec\u00e7\u00e3o das Partes Moles"),

	/**
	 * The '<em><b>Asma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASMA_VALUE
	 * @generated
	 * @ordered
	 */
	ASMA(1, "Asma", "Asma"),

	/**
	 * The '<em><b>Pneumonia Adquirida Comunidade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PNEUMONIA_ADQUIRIDA_COMUNIDADE_VALUE
	 * @generated
	 * @ordered
	 */
	PNEUMONIA_ADQUIRIDA_COMUNIDADE(1, "PneumoniaAdquiridaComunidade", "Pneumonia Adquirida na Comunidade"),

	/**
	 * The '<em><b>Urtic�ria Pedi�trico</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URTIC�RIA_PEDI�TRICO_VALUE
	 * @generated
	 * @ordered
	 */
	URTIC�RIA_PEDI�TRICO(1, "Urtic�riaPedi�trico", "Urtic\u00e1ria Pedi\u00e1trico"),

	/**
	 * The '<em><b>Endometrite Puerperal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDOMETRITE_PUERPERAL_VALUE
	 * @generated
	 * @ordered
	 */
	ENDOMETRITE_PUERPERAL(1, "EndometritePuerperal", "Endometrite Puerperal"),

	/**
	 * The '<em><b>Hemorragia P�s Parto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEMORRAGIA_P�S_PARTO_VALUE
	 * @generated
	 * @ordered
	 */
	HEMORRAGIA_P�S_PARTO(1, "HemorragiaP�sParto", "Hemorragia P\u00f3s-Parto"),

	/**
	 * The '<em><b>Posdatismo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSDATISMO_VALUE
	 * @generated
	 * @ordered
	 */
	POSDATISMO(1, "Posdatismo", "Posdatismo"),

	/**
	 * The '<em><b>Hipertens�o Arterial Sist�mica</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIPERTENS�O_ARTERIAL_SIST�MICA_VALUE
	 * @generated
	 * @ordered
	 */
	HIPERTENS�O_ARTERIAL_SIST�MICA(1, "Hipertens�oArterialSist�mica", "Hipertens\u00e3o Arterial Sist\u00eamica"),

	/**
	 * The '<em><b>Insufici�ncia Card�aca</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSUFICI�NCIA_CARD�ACA_VALUE
	 * @generated
	 * @ordered
	 */
	INSUFICI�NCIA_CARD�ACA(1, "Insufici�nciaCard�aca", "Insufici\u00eancia Card\u00edaca"),

	/**
	 * The '<em><b>DPOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DPOC_VALUE
	 * @generated
	 * @ordered
	 */
	DPOC(1, "DPOC", "DPOC"),

	/**
	 * The '<em><b>Curativo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURATIVO_VALUE
	 * @generated
	 * @ordered
	 */
	CURATIVO(2, "Curativo", "Curativo");

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
	public static final int FRATURA_EXPOSTA_VALUE = 3;

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
	public static final int PNEUMONIA_INFLUENZA_VALUE = 12;

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
	public static final int MENINGITE_VALUE = 7;

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
	public static final int ITU_CISTITE_VALUE = 6;

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
	public static final int VERIFICA_SEPSE_VALUE = 2;

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
	public static final int ITU_PIELONEFRITE_VALUE = 9;

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
	public static final int NEUTROPENIA_FEBRIL_VALUE = 2;

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
	public static final int IVAS_VALUE = 19;

	/**
	 * The '<em><b>Diarr�ia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diarr�ia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIARR�IA
	 * @model name="Diarr�ia"
	 * @generated
	 * @ordered
	 */
	public static final int DIARR�IA_VALUE = 4;

	/**
	 * The '<em><b>Cefal�ia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cefal�ia</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CEFAL�IA
	 * @model name="Cefal�ia"
	 * @generated
	 * @ordered
	 */
	public static final int CEFAL�IA_VALUE = 9;

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
	public static final int LOMBALGIA_VALUE = 18;

	/**
	 * The '<em><b>Dor Tor�cica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dor Tor�cica</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOR_TOR�CICA
	 * @model name="DorTor�cica" literal="Dor Tor\341cica"
	 * @generated
	 * @ordered
	 */
	public static final int DOR_TOR�CICA_VALUE = 6;

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
	public static final int DOR_ABDOMINAL_VALUE = 22;

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
	public static final int TONTURA_VERTIGEM_VALUE = 3;

	/**
	 * The '<em><b>IVAS Pedi�trico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IVAS Pedi�trico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IVAS_PEDI�TRICO
	 * @model name="IVASPedi�trico" literal="IVAS Pedi\341trico"
	 * @generated
	 * @ordered
	 */
	public static final int IVAS_PEDI�TRICO_VALUE = 7;

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
	public static final int OTALGIA_VALUE = 4;

	/**
	 * The '<em><b>N�useas V�mitos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>N�useas V�mitos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #N�USEAS_V�MITOS
	 * @model name="N�useasV�mitos" literal="N\341useas e V\364mitos"
	 * @generated
	 * @ordered
	 */
	public static final int N�USEAS_V�MITOS_VALUE = 2;

	/**
	 * The '<em><b>Diarreia Aguda Pedi�trico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diarreia Aguda Pedi�trico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIARREIA_AGUDA_PEDI�TRICO
	 * @model name="DiarreiaAgudaPedi�trico" literal="Diarreia aguda Pedi\341trico"
	 * @generated
	 * @ordered
	 */
	public static final int DIARREIA_AGUDA_PEDI�TRICO_VALUE = 7;

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
	public static final int TRABALHO_PARTO_PREMATURO_VALUE = 1;

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
	public static final int DHEG_VALUE = 1;

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
	public static final int DISPEPSIA_VALUE = 2;

	/**
	 * The '<em><b>TCE Pedi�trico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TCE Pedi�trico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TCE_PEDI�TRICO
	 * @model name="TCEPedi�trico" literal="TCE Pedi\341trico"
	 * @generated
	 * @ordered
	 */
	public static final int TCE_PEDI�TRICO_VALUE = 5;

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
	public static final int AMINIORREXE_PREMATURA_VALUE = 1;

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
	public static final int DOR_ARTICULAR_TENDINOPATIA_VALUE = 2;

	/**
	 * The '<em><b>Febre Sem Sinais Localiza��o</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Febre Sem Sinais Localiza��o</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEBRE_SEM_SINAIS_LOCALIZA��O
	 * @model name="FebreSemSinaisLocaliza��o" literal="Febre Sem Sinais de Localiza\347\343o"
	 * @generated
	 * @ordered
	 */
	public static final int FEBRE_SEM_SINAIS_LOCALIZA��O_VALUE = 8;

	/**
	 * The '<em><b>Infec��o Partes Moles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Infec��o Partes Moles</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFEC��O_PARTES_MOLES
	 * @model name="Infec��oPartesMoles" literal="Infec\347\343o das Partes Moles"
	 * @generated
	 * @ordered
	 */
	public static final int INFEC��O_PARTES_MOLES_VALUE = 9;

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
	public static final int ASMA_VALUE = 1;

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
	public static final int PNEUMONIA_ADQUIRIDA_COMUNIDADE_VALUE = 1;

	/**
	 * The '<em><b>Urtic�ria Pedi�trico</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Urtic�ria Pedi�trico</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #URTIC�RIA_PEDI�TRICO
	 * @model name="Urtic�riaPedi�trico" literal="Urtic\341ria Pedi\341trico"
	 * @generated
	 * @ordered
	 */
	public static final int URTIC�RIA_PEDI�TRICO_VALUE = 1;

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
	public static final int ENDOMETRITE_PUERPERAL_VALUE = 1;

	/**
	 * The '<em><b>Hemorragia P�s Parto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hemorragia P�s Parto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEMORRAGIA_P�S_PARTO
	 * @model name="HemorragiaP�sParto" literal="Hemorragia P\363s-Parto"
	 * @generated
	 * @ordered
	 */
	public static final int HEMORRAGIA_P�S_PARTO_VALUE = 1;

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
	public static final int POSDATISMO_VALUE = 1;

	/**
	 * The '<em><b>Hipertens�o Arterial Sist�mica</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hipertens�o Arterial Sist�mica</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIPERTENS�O_ARTERIAL_SIST�MICA
	 * @model name="Hipertens�oArterialSist�mica" literal="Hipertens\343o Arterial Sist\352mica"
	 * @generated
	 * @ordered
	 */
	public static final int HIPERTENS�O_ARTERIAL_SIST�MICA_VALUE = 1;

	/**
	 * The '<em><b>Insufici�ncia Card�aca</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Insufici�ncia Card�aca</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSUFICI�NCIA_CARD�ACA
	 * @model name="Insufici�nciaCard�aca" literal="Insufici\352ncia Card\355aca"
	 * @generated
	 * @ordered
	 */
	public static final int INSUFICI�NCIA_CARD�ACA_VALUE = 1;

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
	public static final int DPOC_VALUE = 1;

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
	public static final int CURATIVO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Version[] VALUES_ARRAY = new Version[] { NONE, FRATURA_EXPOSTA, PNEUMONIA_INFLUENZA, MENINGITE,
			AMNIORREXE_PREMATURA, ITU_CISTITE, VERIFICA_SEPSE, TRATAMENTO_SEPSE, TRATAMENTO_SIRS, ITU_PIELONEFRITE,
			NEUTROPENIA_FEBRIL, IVAS, DIARR�IA, CEFAL�IA, LOMBALGIA, DOR_TOR�CICA, DOR_ABDOMINAL, TONTURA_VERTIGEM,
			IVAS_PEDI�TRICO, OTALGIA, N�USEAS_V�MITOS, DIARREIA_AGUDA_PEDI�TRICO, TRABALHO_PARTO_PREMATURO, DHEG,
			DISPEPSIA, TCE_PEDI�TRICO, AMINIORREXE_PREMATURA, DOR_ARTICULAR_TENDINOPATIA, FEBRE_SEM_SINAIS_LOCALIZA��O,
			INFEC��O_PARTES_MOLES, ASMA, PNEUMONIA_ADQUIRIDA_COMUNIDADE, URTIC�RIA_PEDI�TRICO, ENDOMETRITE_PUERPERAL,
			HEMORRAGIA_P�S_PARTO, POSDATISMO, HIPERTENS�O_ARTERIAL_SIST�MICA, INSUFICI�NCIA_CARD�ACA, DPOC, CURATIVO, };

	/**
	 * A public read-only list of all the '<em><b>Version</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Version> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Version</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Version get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Version result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Version</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Version getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Version result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Version</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Version get(int value) {
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
		case IVAS_VALUE:
			return IVAS;
		case LOMBALGIA_VALUE:
			return LOMBALGIA;
		case DOR_ABDOMINAL_VALUE:
			return DOR_ABDOMINAL;
		case TRABALHO_PARTO_PREMATURO_VALUE:
			return TRABALHO_PARTO_PREMATURO;
		case TCE_PEDI�TRICO_VALUE:
			return TCE_PEDI�TRICO;
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
	private Version(int value, String name, String literal) {
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

} //Version
