package com.tectonica.jonix.codelist;

/**
 * Enum that corresponds to Onix's CodeList 196
 * 
 * @author Zach Melamed
 * 
 */
public enum EpubAccessibilityDetailss
{
	LIA_Compliance_Scheme("01"),

	/**
	 * No accessibility features offered by the reading system, device or reading software (including but not limited to choice of text size or typeface, choice of text or background color, text-to-speech) are disabled, overridden or otherwise unusable with the product EXCEPT – in ONIX 3 messages only – those specifically noted as subject to restriction or prohibition in <EpubUsageConstraint>. Note that provision of any significant part of the textual content as images (ie as pictures of text, rather than as text) inevitably prevents use of these accessibility options.
	 */
	No_reading_system_accessibility_options_disabled_except("10"),

	/**
	 * Table of contents allows direct (eg hyperlinked) access to all levels of text organization above individual paragraphs (eg to all sections and subsections) and to all tables, figures, illustrations etc. Non-textual items such as illustrations, tables, audio or video content may be directly accessible from the Table of contents, or from a similar List of illustrations, List of tables, etc.
	 */
	Table_of_contents_navigation("11"),

	/**
	 * Index provides direct (eg hyperlinked) access to uses of the index terms in the document body.
	 */
	Index_navigation("12"),

	/**
	 * All or substantially all textual matter is arranged in a single logical reading order (including text that is visually presented as separate from the main text flow, eg in boxouts, captions, tables, footnotes, endnotes, citations, etc). Non-textual content is also linked from within this logical reading order. (Purely decorative non-text content can be ignored.)
	 */
	Reading_order("13"),

	/**
	 * All or substantially all non-text content has short alternative descriptions, usually provided via alt attributes. Note this applies to normal images (eg photographs, charts and diagrams) and also to any embedded audio, video etc. Audio and video content should include alternative descriptions suitable for hearing-impaired as well as for visually-impaired readers. (Purely decorative non-text content can be ignored, but the accessibility of resources delivered via a network connection rather than as part of the e-publication package must be included.)
	 */
	Short_alternative_descriptions("14"),

	/**
	 * All or substantially all non-text content has full alternative descriptions. Note this applies to normal images (eg photographs, charts and diagrams) and also to any embedded audio, video etc. Audio and video content should include full alternative descriptions (eg audio-described video) and subtitles or closed captions suitable for hearing-impaired as well as for visually-impaired readers. (Purely decorative non-text content can be ignored, but the accessibility of resources delivered via a network connection rather than as part of the e-publication package must be included.)
	 */
	Full_alternative_descriptions("15"),

	/**
	 * Where data visualisations are provided (eg graphs and charts), the underlying data is also available in non-graphical (usually tabular, textual) form.
	 */
	Visualised_data_also_available_as_nongraphical_data("16"),

	/**
	 * Mathematical content such as equations is usable with assistive technology, eg through use of MathML. Semantic MathML is preferred but Presentational MathML is acceptable.
	 */
	Accessible_math_content("17"),

	/**
	 * Chemistry content such as chemical formulae is usable with assistive technology, eg through use of ChemML.
	 */
	Accessible_chem_content("18"),

	/**
	 * For a reflowable e-publication, contains references to the page numbering of an equivalent printed product.
	 */
	Printequivalent_page_numbering("19"),

	/**
	 * Text-synchronised pre-recorded audio narration (natural or synthesised voice) is included for substantially all textual matter, including all alternative descriptions.
	 */
	Synchronised_prerecorded_audio("20"),

	/**
	 * Text-to-speech has been optimised through provision of PLS lexicons, SSML or CSS Speech synthesis hints.
	 */
	Texttospeech_hinting_provided("21"),

	/**
	 * The language of the text has been specified (eg via the HTML or XML lang attribute) to optimise text-to-speech (and other alternative renderings), both at whole document level and, where appropriate, for individual words, phrases or passages in a different language.
	 */
	Language_tagging_provided("22"),

	/**
	 * <ProductFormFeatureDescription> carries a the URL of a web page giving further detailed description of the accessibility features, compatibility, testing etc. The web page should be maintained by an independent compliance scheme or testing organization.
	 */
	Compliance_web_page_for_detailed_accessibility_information("94"),

	/**
	 * <ProductFormFeatureDescription> carries a the URL of a web page giving further detailed description of the accessibility features, compatibility, testing etc. The web page should be provided by a trusted intermediary or third party nominated by the publisher.
	 */
	Trusted_intermediarys_web_page_for_detailed_accessibility_information("95"),

	/**
	 * <ProductFormFeatureDescription> carries a the URL of a web page giving further detailed description of the accessibility features, compatibility, testing etc. The web page should be provided by the publisher.
	 */
	Publishers_web_page_for_detailed_accessibility_information("96"),

	/**
	 * <ProductFormFeatureDescription> carries a short description of compatibility testing carried out for this product, including detailed compatibility with various assistive technology such as third-party screen-reading software.
	 */
	Compatibility_tested("97"),

	/**
	 * <ProductFormFeatureDescription> carries the e-mail address for a contact at a ‘trusted intermediary’, to whom detailed questions about accessibility for this product may be directed.
	 */
	Trusted_Intermediary_contact("98"),

	/**
	 * <ProductFormFeatureDescription> carries the e-mail address for a contact at the publisher to whom detailed questions about accessibility of this product may be directed.
	 */
	Publisher_contact_for_further_accessibility_information("99");

	public final String code;

	private EpubAccessibilityDetailss(String code)
	{
		this.code = code;
	}

	private static EpubAccessibilityDetailss[] values = EpubAccessibilityDetailss.values();
	public static EpubAccessibilityDetailss fromCode(String code)
	{
		if (code != null && !code.isEmpty())
			for (EpubAccessibilityDetailss item : values)
				if (item.code.equals(code))
					return item;
		return null;
	}
}

