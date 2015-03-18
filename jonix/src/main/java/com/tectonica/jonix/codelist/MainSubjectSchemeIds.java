package com.tectonica.jonix.codelist;

/**
 * Enum that corresponds to Onix's CodeList 26
 * 
 * @author Zach Melamed
 * 
 */
public enum MainSubjectSchemeIds
{
	/**
	 * Dewey Decimal Classification.
	 */
	Dewey("01"),

	Abridged_Dewey("02"),

	/**
	 * US Library of Congress classification.
	 */
	LC_classification("03"),

	/**
	 * US Library of Congress subject heading.
	 */
	LC_subject_heading("04"),

	/**
	 * US National Library of Medicine medical classification.
	 */
	NLM_classification("05"),

	/**
	 * US National Library of Medicine Medical subject heading.
	 */
	MeSH_heading("06"),

	/**
	 * US National Agricultural Library subject heading.
	 */
	NAL_subject_heading("07"),

	/**
	 * Getty Art and Architecture Thesaurus heading.
	 */
	AAT("08"),

	/**
	 * Universal Decimal Classification.
	 */
	UDC("09"),

	/**
	 * BISAC Subject Headings are used in the North American market to categorize books based on topical content. They serve as a guideline for shelving books in physical stores and browsing books in online stores. See ‘http://www.bisg.org/what-we-do-cat-20-classification-schemes.php’.
	 */
	BISAC_Subject_Heading("10"),

	/**
	 * A geographical qualifier used with a BISAC subject category.
	 */
	BISAC_region_code("11"),

	/**
	 * For all BIC subject codes and qualifiers, see ‘http://www.bic.org.uk/7/BIC-Standard-Subject-Categories/’.
	 */
	BIC_subject_category("12"),

	BIC_geographical_qualifier("13"),

	BIC_language_qualifier_language_as_subject("14"),

	BIC_time_period_qualifier("15"),

	BIC_educational_purpose_qualifier("16"),

	BIC_reading_level_and_special_interest_qualifier("17"),

	/**
	 * Used for German National Bibliography since 2004 (100 subjects). Is different from value 30. See http://www.d-nb.de/service/pdf/ddc_wv_aktuell.pdf (in German) or http://www.d-nb.de/eng/service/pdf/ddc_wv_aktuell_eng.pdf (English).
	 */
	DDCSachgruppen_der_Deutschen_Nationalbibliografie("18"),

	LC_fiction_genre_heading("19"),

	/**
	 * Where multiple keywords or keyword phrases are sent in a single instance of the <SubjectHeadingText> element, it is recommended that they should be separated by semi-colons (this is consistent with Library of Congress preferred practice).
	 */
	Keywords("20"),

	/**
	 * See ‘http://www.bic.org.uk/8/Children’s-Books-Marketing-Classifications/’.
	 */
	BIC_childrens_book_marketing_category("21"),

	/**
	 * BISAC Merchandising Themes are used in addition to BISAC Subject Headings to denote an audience to which a work may be of particular appeal, a time of year or event for which a work may be especially appropriate, or to further describe fictional works that have been subject-coded by genre.
	 */
	BISAC_Merchandising_Theme("22"),

	Publishers_own_category_code("23"),

	/**
	 * As specified in <SubjectSchemeName>.
	 */
	Proprietary_subject_scheme("24"),

	/**
	 * Latin America.
	 */
	Tabla_de_materias_ISBN("25"),

	/**
	 * See ‘http://www.boersenverein.de/sixcms/media.php/976/WGSneuVersion2_0.pdf’.
	 */
	WarengruppenSystematik_des_deutschen_Buchhandels("26"),

	/**
	 * Schlagwortnormdatei – Subject Headings Authority File in the German-speaking countries. See http://www.d-nb.de/standardisierung/normdateien/swd.htm (in German) and http://www.d-nb.de/eng/standardisierung/normdateien/swd.htm (English). DEPRECATED in favour of the GND.
	 */
	SWD("27"),

	/**
	 * Subject classification used by Electre (France).
	 */
	Th_mes_Electre("28"),

	/**
	 * France, see http://www.clil.org/information/documentation.html (in French).
	 */
	CLIL("29"),

	/**
	 * Deutsche Bibliothek subject groups. Used for German National Bibliography until 2003 (65 subjects). Is different from value 18. See ‘http://www.d-nb.de/service/pdf/ddc_wv_alt_neu.pdf’.
	 */
	DNBSachgruppen("30"),

	/**
	 * Nederlandse Uniforme Genre-Indeling (former Dutch book trade classification).
	 */
	NUGI("31"),

	/**
	 * Nederlandstalige Uniforme Rubrieksindeling (Dutch book trade classification, from 2002),see http://reeks.boekwinkeltjes.nl/downloads/NUR-lijst.pdf (in Dutch).
	 */
	NUR("32"),

	/**
	 * ECPA Christian Product Category Book Codes, consisting of up to three x 3-letter blocks, for Super Category, Primary Category and Sub-Category. See ‘http://www.ecpa.org/ECPA/cbacategories.xls’.
	 */
	ECPA_Christian_Book_Category("33"),

	/**
	 * Schema Indeling Systematische Catalogus Openbare Bibliotheken (Dutch library classification).
	 */
	SISO("34"),

	/**
	 * A modified Dewey Decimal Classification used in the Republic of Korea.
	 */
	Korean_Decimal_Classification_KDC("35"),

	/**
	 * German Translation of Dewey Decimal Classification 22. Also known as DDC 22 ger. See ‘http://www.ddc-deutsch.de/produkte/uebersichten/’.
	 */
	DDC_Deutsch_22("36"),

	/**
	 * Norwegian book trade product categories (4701).
	 */
	Bokgrupper("37"),

	/**
	 * Norwegian bookselling subject categories (4702).
	 */
	Varegrupper("38"),

	/**
	 * Norwegian school curriculum version (4703).
	 */
	L_replaner("39"),

	/**
	 * Japanese subject classification scheme.
	 */
	Nippon_Decimal_Classification("40"),

	/**
	 * BookSelling Qualifier: Russian book trade classification.
	 */
	BSQ("41"),

	/**
	 * Spain: subject coding scheme of the Asociación Nacional de Editores de Libros y Material de Enseñanza.
	 */
	ANELE_Materias("42"),

	/**
	 * Norwegian primary and secondary school subject categories (4705).
	 */
	Skolefag("43"),

	/**
	 * Norwegian list of categories used in higher secondary education and vocational training (4706).
	 */
	Videreg_ende("44"),

	/**
	 * Norwegian list of categories for books and other material used in education (4707).
	 */
	Undervisningsmateriell("45"),

	/**
	 * Norwegian version of Dewey Decimal Classification.
	 */
	Norsk_DDK("46"),

	/**
	 * Swedish bookselling subject categories.
	 */
	Varugrupper("47"),

	/**
	 * Swedish classification scheme.
	 */
	SAB("48"),

	/**
	 * Swedish bookselling educational subject.
	 */
	L_romedel("49"),

	/**
	 * Swedish publishers preliminary subject classification.
	 */
	F_rhandsbeskrivning("50"),

	/**
	 * Controlled subset of UDC codes used by the Spanish ISBN Agency.
	 */
	Spanish_ISBN_UDC_subset("51"),

	/**
	 * Subject categories defined by El Corte Inglés and used widely in the Spanish book trade.
	 */
	ECI_subject_categories("52"),

	/**
	 * Classificazione commerciale editoriale (Italian book trade subject category based on BIC). CCE documentation available at ‘http://www.ie-online.it/CCE2_2.0.pdf’.
	 */
	Soggetto_CCE("53"),

	Qualificatore_geografico_CCE("54"),

	Qualificatore_di_lingua_CCE("55"),

	Qualificatore_di_periodo_storico_CCE("56"),

	Qualificatore_di_livello_scolastico_CCE("57"),

	Qualificatore_di_et__di_lettura_CCE("58"),

	/**
	 * Subject code list of the German association of educational media publishers.
	 */
	VdS_Bildungsmedien_F_cher("59"),

	/**
	 * Undervisningsdirektoratets fagkoder for kunnskapsløftet I videregående (Norwegian educational curriculum for secondary schools) (4708).
	 */
	Fagkoder("60"),

	/**
	 * Journal of Economic Literature classification scheme.
	 */
	JEL_classification("61"),

	/**
	 * National Library of Canada subject heading (English).
	 */
	CSH("62"),

	/**
	 * Répertoire de vedettes-matière (Bibliothèque et Archives Canada et Bibliothèque de l’Université Laval) (French).
	 */
	RVM("63"),

	/**
	 * Yleinen suomalainen asiasanasto: Finnish General Thesaurus. See http://onki.fi/fi/browser/ (in Finnish).
	 */
	YSA("64"),

	/**
	 * Allmän tesaurus på svenska: Swedish translation of the Finnish General Thesaurus. See http://onki.fi/fi/browser/ (in Finnish).
	 */
	All_rs("65"),

	/**
	 * Yleisten kirjastojen luokitusjärjestelmä: Finnish Public Libraries Classification System. See http://ykl.kirjastot.fi/ (in Finnish).
	 */
	YKL("66"),

	/**
	 * Musiikin asiasanasto: Finnish Music Thesaurus. See http://onki.fi/fi/browser/ (in Finnish).
	 */
	MUSA("67"),

	/**
	 * Specialtesaurus för musik: Swedish translation of the Finnish Music Thesaurus. See http://onki.fi/fi/browser/ (in Finnish).
	 */
	CILLA("68"),

	/**
	 * Fiktiivisen aineiston asiasanasto: Finnish thesaurus for fiction. See http://kaunokki.kirjastot.fi/ (in Finnish).
	 */
	Kaunokki("69"),

	/**
	 * Specialtesaurus för fiktivt material: Swedish translation of the Finnish thesaurus for fiction. See http://kaunokki.kirjastot.fi/sv-FI/ (in Finnish).
	 */
	Bella("70"),

	/**
	 * Yleinen suomalainen ontologia: Finnish General Upper Ontology. See http://onki.fi/fi/browser/ (In Finnish).
	 */
	YSO("71"),

	/**
	 * Finnish Place Ontology. See http://onki.fi/fi/browser/ (in Finnish).
	 */
	Paikkatieto_ontologia("72"),

	/**
	 * Finnish book trade categorisation.
	 */
	Suomalainen_kirjaalan_luokitus("73"),

	/**
	 * Sears List of Subject Headings.
	 */
	Sears("74"),

	/**
	 * BIC E4Libraries Category Headings, see ‘http://www.bic.org.uk/51/E4libraries-Subject-Category-Headings/’.
	 */
	BIC_E4L("75"),

	/**
	 * Code Sujet Rayon: subject categories used by bookstores in France.
	 */
	CSR("76"),

	/**
	 * Finnish school subject categories.
	 */
	Suomalainen_oppiaineluokitus("77"),

	/**
	 * See ‘http://www.asahi-net.or.jp/~ax2s-kmtn/ref/ccode.html’ (in Japanese).
	 */
	Japanese_book_trade_CCode("78"),

	Japanese_book_trade_Genre_Code("79"),

	/**
	 * Finnish fiction genre classification. See http://ykl.kirjastot.fi/fi-FI/lisaluokat/ (in Finnish).
	 */
	Fiktiivisen_aineiston_lis_luokitus("80"),

	/**
	 * Location defined by postal code. Format is two-letter country code (from List 91), space, postal code. Note some postal codes themselves contain spaces, eg “GB N7 9DP” or “US 10125”.
	 */
	Postal_code("85"),

	/**
	 * ID number for geographical place, as defined at http://www.geonames.org (eg 2825297 is Stuttgart, Germany, see http://www.geonames.org/2825297).
	 */
	GeoNames_ID("86"),

	/**
	 * Used for classification of academic and specialist publication in German-speaking countries. See http://www.newbooks-services.com/de/top/unternehmensportrait/klassifikation-und-mapping.html (German) and http://www.newbooks-services.com/en/top/about-newbooks/classification-mapping.html (English).
	 */
	NewBooks_Subject_Classification("87"),

	/**
	 * Gemeinsame Normdatei – Joint Authority File in the German-speaking countries. See 'http://www.dnb.de/EN/Standardisierung/Normdaten/GND/gnd_node.html (English)'. Combines the PND, SWD and GKD into a single authority file, and should be used in preference to the older codes.
	 */
	GND("91"),

	/**
	 * UK Standard Library Categories, the successor to BIC’s E4L classification scheme.
	 */
	BIC_UKSLC("92"),

	Thema_subject_category("93"),

	Thema_geographical_qualifier("94"),

	Thema_language_qualifier("95"),

	Thema_time_period_qualifier("96"),

	Thema_educational_purpose_qualifier("97"),

	Thema_reading_level___interest_qualifier("98");

	public final String code;

	private MainSubjectSchemeIds(String code)
	{
		this.code = code;
	}

	private static MainSubjectSchemeIds[] values = MainSubjectSchemeIds.values();
	public static MainSubjectSchemeIds fromCode(String code)
	{
		if (code != null && !code.isEmpty())
			for (MainSubjectSchemeIds item : values)
				if (item.code.equals(code))
					return item;
		return null;
	}
}

