package com.tectonica.jonix.codelist;

/**
 * Enum that corresponds to Onix's CodeList 81
 * 
 * @author Zach Melamed
 * 
 */
public enum ProductContentTypes
{
	/**
	 * Readable text of the main work: this value is required, together with applicable <ProductForm> and <ProductFormDetail> values, to designate an e-book or other digital product whose primary content is eye-readable text.
	 */
	Text_eyereadable("10"),

	/**
	 * E-publication is enhanced with a significant number of actionable cross-references, hyperlinked notes and annotations, or with other links between largely textual elements (eg quiz/test questions, ‘choose your own ending’ etc).
	 */
	Extensive_links_between_internal_content("15"),

	/**
	 * E-publication is enhanced with a significant number of actionable (clickable) web links.
	 */
	Extensive_links_to_external_content("14"),

	/**
	 * E-publication is enhanced with additional textual content such as interview, feature article, essay, bibliography, quiz/test, other background material or text that is not included in a primary or ‘unenhanced’ version.
	 */
	Additional_eyereadable_text_not_part_of_main_work("16"),

	/**
	 * eg Teaser chapter.
	 */
	Promotional_text_for_other_book_product("17"),

	Musical_notation("11"),

	/**
	 * Use only when no more detailed specification is provided.
	 */
	Still_images___graphics("07"),

	/**
	 * Whether in a plate section / insert, or not.
	 */
	Photographs("18"),

	/**
	 * Including other ‘mechanical’ (ie non-photographic) illustrations.
	 */
	Figures__diagrams__charts__graphs("19"),

	/**
	 * E-publication is enhanced with additional images or graphical content such as supplementary photographs that are not included in a primary or ‘unenhanced’ version.
	 */
	Additional_images___graphics_not_part_of_main_work("20"),

	Maps_and_or_other_cartographic_content("12"),

	/**
	 * Audio recording of a reading of a book or other text.
	 */
	Audiobook("01"),

	/**
	 * Audio recording of a drama or other spoken word performance.
	 */
	Performance___spoken_word("02"),

	/**
	 * eg an interview, not a ‘reading’ or ‘performance’).
	 */
	Other_speech_content("13"),

	/**
	 * Audio recording of a music performance, including musical drama and opera.
	 */
	Music_recording("03"),

	/**
	 * Audio recording of other sound, eg birdsong.
	 */
	Other_audio("04"),

	/**
	 * Audio recording of a reading, performance or dramatization of part of the work.
	 */
	Partial_performance___spoken_word("21"),

	/**
	 * Product is enhanced with audio recording of full or partial reading, performance, dramatization, interview, background documentary or other audio content not included in the primary or ‘unenhanced’ version.
	 */
	Additional_audio_content_not_part_of_main_work("22"),

	/**
	 * eg Reading of teaser chapter.
	 */
	Promotional_audio_for_other_book_product("23"),

	/**
	 * Includes Film, video, animation etc. Use only when no more detailed specification is provided. Formerly ‘Moving images’.
	 */
	Video("06"),

	Video_recording_of_a_reading("26"),

	/**
	 * Video recording of a drama or other performance, including musical performance.
	 */
	Performance___visual("27"),

	/**
	 * eg animated diagrams, charts, graphs or other illustrations.
	 */
	Animated___interactive_illustrations("24"),

	/**
	 * eg cartoon, animatic or CGI animation.
	 */
	Narrative_animation("25"),

	/**
	 * Other video content eg interview, not a reading or performance.
	 */
	Other_video("28"),

	/**
	 * Video recording of a reading, performance or dramatization of part of the work.
	 */
	Partial_performance___video("29"),

	/**
	 * E-publication is enhanced with video recording of full or partial reading, performance, dramatization, interview, background documentary or other content not included in the primary or ‘unenhanced’ version.
	 */
	Additional_video_content_not_part_of_main_work("30"),

	/**
	 * eg Book trailer.
	 */
	Promotional_video_for_other_book_product("31"),

	/**
	 * No multi-user functionality. Formerly just ‘Game’.
	 */
	Game___Puzzle("05"),

	/**
	 * Includes some degree of multi-user functionality.
	 */
	Contest("32"),

	/**
	 * Largely ‘content free’.
	 */
	Software("08"),

	/**
	 * Data files.
	 */
	Data("09"),

	Data_set_plus_software("33"),

	/**
	 * Intended to be filled in by the reader.
	 */
	Blank_pages("34"),

	/**
	 * Use only where type of advertising content is not stated.
	 */
	Advertising_content("35"),

	/**
	 * ‘Back ads’ – promotional pages for other books (that do not include sample content, cf codes 17, 23).
	 */
	Advertising___first_party("37"),

	/**
	 * Eg to obtain discounts on other products.
	 */
	Advertising___coupons("36"),

	Advertising___third_party_display("38"),

	Advertising___third_party_textual("39");

	public final String code;

	private ProductContentTypes(String code)
	{
		this.code = code;
	}

	private static ProductContentTypes[] values = ProductContentTypes.values();
	public static ProductContentTypes fromCode(String code)
	{
		if (code != null && !code.isEmpty())
			for (ProductContentTypes item : values)
				if (item.code.equals(code))
					return item;
		return null;
	}
}

