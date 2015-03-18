package com.tectonica.jonix.codelist;

/**
 * Enum that corresponds to Onix's CodeList 82
 * 
 * @author Zach Melamed
 * 
 */
public enum BibleContentss
{
	/**
	 * The seven portions of the Apocrypha added to the Catholic canon at the Council of Trent in 1546: Tobit; Judith; Wisdom of Solomon; Sirach (Ecclesiasticus); Baruch, including the Letter of Jeremiah; I and II Maccabees; Extra portions of Esther and Daniel (Additions to Esther; the Prayer of Azariah; Song of the Three Jews; Susannah; Bel and the Dragon). These are not generally included in the Protestant canon.
	 */
	Apocrypha_Catholic_canon("AP"),

	/**
	 * A collection of Apocryphal texts, canon not specified.
	 */
	Apocrypha_canon_unspecified("AQ"),

	/**
	 * I Esdras; Prayer of Manasseh; Psalm 151; III Maccabees.
	 */
	Additional_Apocryphal_texts__Greek_Orthodox_canon("AX"),

	/**
	 * I and II Esdras; Prayer of Manasseh; Psalm 151; III and IV Maccabees.
	 */
	Additional_Apocryphal_texts__Slavonic_Orthodox_canon("AY"),

	/**
	 * Additional Apocryphal texts included in some Bible versions: I and II Esdras; Prayer of Manasseh.
	 */
	Additional_Apocryphal_texts("AZ"),

	/**
	 * The 66 books included in the Protestant, Catholic and Orthodox canons, together with the seven portions of the Apocrypha included in the Catholic canon.
	 */
	General_canon_with_Apocrypha_Catholic_canon("GA"),

	/**
	 * The 66 books included in the Protestant, Catholic and Orthodox canons, together with Apocryphal texts, canon not specified.
	 */
	General_canon_with_Apocryphal_texts_canon_unspecified("GC"),

	/**
	 * The 66 books included in the Protestant, Catholic and Orthodox canons, 39 from the Old Testament and 27 from the New Testament. The sequence of books may differ in different canons.
	 */
	General_canon("GE"),

	/**
	 * The books of Matthew, Mark, Luke and John.
	 */
	Gospels("GS"),

	/**
	 * Those 39 books which were included in the Jewish canon by the rabbinical academy established at Jamma in 90 CE. Also known as the Jewish or Hebrew scriptures.
	 */
	Old_Testament("OT"),

	/**
	 * The 27 books included in the Christian canon through the Easter Letter of Athanasius, Bishop of Alexandria and also by a general council of the Christian church held near the end of the 4th century CE.
	 */
	New_Testament("NT"),

	/**
	 * Includes the 27 books of the New Testament plus Psalms and Proverbs from the Old Testament.
	 */
	New_Testament_with_Psalms_and_Proverbs("NP"),

	/**
	 * The books containing the letters of Paul to the various early Christian churches.
	 */
	Pauls_Epistles("PE"),

	/**
	 * The book of Psalms and the book of Proverbs combined.
	 */
	Psalms_and_Proverbs("PP"),

	/**
	 * The book of Psalms.
	 */
	Psalms("PS"),

	/**
	 * The first five books of the Bible: Genesis, Exodus, Numbers, Leviticus, Deuteronomy. Also applied to the Torah.
	 */
	Pentateuch("PT"),

	/**
	 * Selected books of either the OT or NT not otherwise noted.
	 */
	Other_portions("ZZ");

	public final String code;

	private BibleContentss(String code)
	{
		this.code = code;
	}

	private static BibleContentss[] values = BibleContentss.values();
	public static BibleContentss fromCode(String code)
	{
		if (code != null && !code.isEmpty())
			for (BibleContentss item : values)
				if (item.code.equals(code))
					return item;
		return null;
	}
}

