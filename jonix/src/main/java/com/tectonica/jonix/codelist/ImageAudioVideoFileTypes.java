package com.tectonica.jonix.codelist;

/**
 * Enum that corresponds to Onix's CodeList 38
 * 
 * @author Zach Melamed
 * 
 */
public enum ImageAudioVideoFileTypes
{
	/**
	 * Link to a location where the whole product may be found – used for epublications.
	 */
	Whole_product("01"),

	Application__software_demo("02"),

	/**
	 * Includes cover, back cover, spine and – where appropriate – any flaps. Quality unspecified: if sending both a standard quality and a high quality image, use 03 for standard quality and 05 for high quality.
	 */
	Image__whole_cover("03"),

	/**
	 * Quality unspecified: if sending both a standard quality and a high quality image, use 04 for standard quality and 06 for high quality.
	 */
	Image__front_cover("04"),

	/**
	 * Should have a minimum resolution of 300 dpi when rendered at the intended size for display or print.
	 */
	Image__whole_cover__high_quality("05"),

	/**
	 * Should have a minimum resolution of 300 dpi when rendered at the intended size for display or print.
	 */
	Image__front_cover__high_quality("06"),

	Image__front_cover_thumbnail("07"),

	Image__contributors("08"),

	/**
	 * Use for an image, other than a logo, that is part of the ‘branding’ of a series.
	 */
	Image__for_series("10"),

	Image__series_logo("11"),

	/**
	 * Use only for a logo which is specific to an individual product.
	 */
	Image__product_logo("12"),

	Image__Master_brand_logo("16"),

	Image__publisher_logo("17"),

	Image__imprint_logo("18"),

	Image__table_of_contents("22"),

	/**
	 * Use for inside page image for book, or screenshot for software or game (revised definition from Issue 8).
	 */
	Image__sample_content("23"),

	/**
	 * Quality unspecified: if sending both a standard quality and a high quality image, use 24 for standard quality and 25 for high quality.
	 */
	Image__back_cover("24"),

	/**
	 * Should have a minimum resolution of 300 dpi when rendered at the intended size for display or print.
	 */
	Image__back_cover__high_quality("25"),

	Image__back_cover_thumbnail("26"),

	Image__other_cover_material("27"),

	Image__promotional_material("28"),

	Video_segment__unspecified("29"),

	Audio_segment__unspecified("30"),

	Video__author_presentation___commentary("31"),

	Video__author_interview("32"),

	Video__author_reading("33"),

	Video__cover_material("34"),

	Video__sample_content("35"),

	Video__promotional_material("36"),

	Video__review("37"),

	Video__other_commentary___discussion("38"),

	Audio__author_presentation___commentary("41"),

	Audio__author_interview("42"),

	Audio__author_reading("43"),

	Audio__sample_content("44"),

	Audio__promotional_material("45"),

	Audio__review("46"),

	Audio__other_commentary___discussion("47"),

	/**
	 * Use for ‘look inside’ facility or ‘widget’.
	 */
	Application__sample_content("51"),

	Application__promotional_material("52");

	public final String code;

	private ImageAudioVideoFileTypes(String code)
	{
		this.code = code;
	}

	private static ImageAudioVideoFileTypes[] values = ImageAudioVideoFileTypes.values();
	public static ImageAudioVideoFileTypes fromCode(String code)
	{
		if (code != null && !code.isEmpty())
			for (ImageAudioVideoFileTypes item : values)
				if (item.code.equals(code))
					return item;
		return null;
	}
}

