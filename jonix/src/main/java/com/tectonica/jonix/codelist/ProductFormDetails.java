package com.tectonica.jonix.codelist;

/**
 * Enum that corresponds to Onix's CodeList 175
 * 
 * @author Zach Melamed
 * 
 */
public enum ProductFormDetails
{
	/**
	 * CD ‘red book’ format.
	 */
	CD_standard_audio_format("A101"),

	SACD_super_audio_format("A102"),

	/**
	 * MPEG-1/2 Audio Layer III file.
	 */
	MP3_format("A103"),

	WAV_format("A104"),

	Real_Audio_format("A105"),

	/**
	 * Windows Media Audio format.
	 */
	WMA("A106"),

	/**
	 * Advanced Audio Coding format.
	 */
	AAC("A107"),

	/**
	 * Vorbis audio format in the Ogg container.
	 */
	Ogg_Vorbis("A108"),

	/**
	 * Audio format proprietary to Audible.com.
	 */
	Audible("A109"),

	/**
	 * Free lossless audio codec.
	 */
	FLAC("A110"),

	/**
	 * Audio Interchangeable File Format.
	 */
	AIFF("A111"),

	/**
	 * Apple Lossless Audio Codec.
	 */
	ALAC("A112"),

	/**
	 * Deprecated, as does not meet DAISY 2 standard. Use conventional audiobook codes instead.
	 */
	DAISY_2__full_audio_with_title_only_no_navigation("A201"),

	DAISY_2__full_audio_with_navigation_no_text("A202"),

	DAISY_2__full_audio_with_navigation_and_partial_text("A203"),

	DAISY_2__full_audio_with_navigation_and_full_text("A204"),

	/**
	 * Reading systems may provide full audio via text-to-speech.
	 */
	DAISY_2__full_text_with_navigation_and_partial_audio("A205"),

	/**
	 * Reading systems may provide full audio via text-to-speech.
	 */
	DAISY_2__full_text_with_navigation_and_no_audio("A206"),

	/**
	 * Deprecated, as does not meet DAISY 3 standard. Use conventional audiobook codes instead.
	 */
	DAISY_3__full_audio_with_title_only_no_navigation("A207"),

	DAISY_3__full_audio_with_navigation_no_text("A208"),

	DAISY_3__full_audio_with_navigation_and_partial_text("A209"),

	DAISY_3__full_audio_with_navigation_and_full_text("A210"),

	/**
	 * Reading systems may provide full audio via text-to-speech.
	 */
	DAISY_3__full_textwith_navigation_and_partial_audio("A211"),

	/**
	 * Reading systems may provide full audio via text-to-speech.
	 */
	DAISY_3__full_text_with_navigation_and_no_audio("A212"),

	Standalone_audio("A301"),

	/**
	 * Audio intended exclusively for use alongside a printed copy of the book. Most often a children’s product. Normally contains instructions such as “turn the page now” and other references to the printed item, and is usually sold packaged together with a printed copy.
	 */
	Readalong_audio("A302"),

	/**
	 * Audio intended for musical accompaniment, eg ‘Music minus one’, etc, often used for music learning. Includes singalong backing audio for musical learning or for Karaoke-style entertainment.
	 */
	Playalong_audio("A303"),

	/**
	 * Audio intended for language learning, which includes speech plus gaps intended to be filled by the listener.
	 */
	Speakalong_audio("A304"),

	/**
	 * In North America, a category of paperback characterized partly by page size (typically 4¼ x 7 1/8 inches) and partly by target market and terms of trade. Use with Product Form code BC.
	 */
	Mass_market_rack_paperback("B101"),

	/**
	 * In North America, a category of paperback characterized partly by page size and partly by target market and terms of trade. AKA ‘quality paperback’, and including textbooks. Most paperback books sold in North America except ‘mass-market’ (B101) and ‘tall rack’ (B107) are correctly described with this code. Use with Product Form code BC.
	 */
	Trade_paperback_US("B102"),

	/**
	 * In North America, a category of paperback characterized by page size and generally used for children’s books; use with Product Form code BC. Note: was wrongly shown as B102 (duplicate entry) in Issue 3.
	 */
	Digest_format_paperback("B103"),

	/**
	 * In UK, a category of paperback characterized by page size (normally 178 x 111 mm approx); use with Product Form code BC.
	 */
	Aformat_paperback("B104"),

	/**
	 * In UK, a category of paperback characterized by page size (normally 198 x 129 mm approx); use with Product Form code BC.
	 */
	Bformat_paperback("B105"),

	/**
	 * In UK, a category of paperback characterized partly by size (usually in traditional hardback dimensions), and often used for paperback originals; use with Product Form code BC (replaces ‘C-format’ from former List 8).
	 */
	Trade_paperback_UK("B106"),

	/**
	 * In North America, a category of paperback characterised partly by page size and partly by target market and terms of trade; use with Product Form code BC.
	 */
	Tall_rack_paperback_US("B107"),

	/**
	 * 210x148mm.
	 */
	A5_size_Tankobon("B108"),

	/**
	 * Japanese B-series size, 257x182mm.
	 */
	JIS_B5_size_Tankobon("B109"),

	/**
	 * Japanese B-series size, 182x128mm.
	 */
	JIS_B6_size_Tankobon("B110"),

	/**
	 * 148x105mm.
	 */
	A6_size_Bunko("B111"),

	/**
	 * Japanese format, 182x103mm or 173x105mm.
	 */
	B40dori_Shinsho("B112"),

	/**
	 * A Swedish paperback format, use with Product Form Code BC.
	 */
	Pocket_Sweden("B113"),

	/**
	 * A Swedish paperback format, use with Product Form Code BC.
	 */
	Storpocket_Sweden("B114"),

	/**
	 * A Swedish hardback format, use with Product Form Code BB.
	 */
	Kartonnage_Sweden("B115"),

	/**
	 * A Swedish softback format, use with Product Form Code BC.
	 */
	Flexband_Sweden("B116"),

	/**
	 * In Japan, a softback book in the format of a magazine but sold like a book.
	 */
	Mook("B117"),

	/**
	 * Also called ‘Flipback’. A softback book in a specially compact proprietary format with pages printed in landscape on very thin paper and bound along the long (top) edge – see www.dwarsligger.com.
	 */
	Dwarsligger("B118"),

	/**
	 * Japanese format: 188x127mm.
	 */
	_46_size("B119"),

	/**
	 * Japanese format.
	 */
	_46Henkei_size("B120"),

	/**
	 * 297x210mm.
	 */
	A4("B121"),

	/**
	 * Japanese format.
	 */
	A4Henkei_size("B122"),

	/**
	 * Japanese format.
	 */
	A5Henkei_size("B123"),

	/**
	 * Japanese format.
	 */
	B5Henkei_size("B124"),

	/**
	 * Japanese format.
	 */
	B6Henkei_size("B125"),

	/**
	 * 257x210mm.
	 */
	AB_size("B126"),

	/**
	 * Japanese B-series size, 128x91mm.
	 */
	JIS_B7_size("B127"),

	/**
	 * Japanese format: 218x152mm or 227x152mm.
	 */
	Kiku_size("B128"),

	/**
	 * Japanese format.
	 */
	KikuHenkei_size("B129"),

	/**
	 * Japanese B-series size, 257x364mm.
	 */
	JIS_B4_size("B130"),

	Coloring___jointhedot_book("B201"),

	Lifttheflap_book("B202"),

	/**
	 * Note: was wrongly shown as B203 (duplicate entry) in Issue 3.
	 */
	Miniature_book("B204"),

	Moving_picture___flicker_book("B205"),

	Popup_book("B206"),

	Scented____smelly_book("B207"),

	Sound_story____noisy_book("B208"),

	Sticker_book("B209"),

	/**
	 * A book whose pages have a variety of textured inserts designed to stimulate tactile exploration: see also B214 and B215.
	 */
	Touchandfeel_book("B210"),

	/**
	 * A book which is cut into a distinctive non-rectilinear shape and/or in which holes or shapes have been cut internally. (‘Die-cut’ is used here as a convenient shorthand, and does not imply strict limitation to a particular production process.).
	 */
	Diecut_book("B212"),

	/**
	 * A book which is also a toy, or which incorporates a toy as an integral part. (Do not, however, use B213 for a multiple-item product which includes a book and a toy as separate items.).
	 */
	Bookastoy("B213"),

	/**
	 * A book whose cover has a soft textured finish, typically over board.
	 */
	Softtotouch_book("B214"),

	/**
	 * A book with detachable felt pieces and textured pages on which they can be arranged.
	 */
	Fuzzyfelt_book("B215"),

	/**
	 * Children’s picture book: use with applicable Product Form code.
	 */
	Picture_book("B221"),

	/**
	 * (aka ‘Star’ book). Tax treatment of products may differ from that of products with similar codes such as Book as toy or Pop-up book).
	 */
	_Carousel_Book("B222"),

	/**
	 * Use with Product Form code BD.
	 */
	Loose_leaf___sheets_and_binder("B301"),

	/**
	 * Use with Product Form code BD.
	 */
	Loose_leaf___binder_only("B302"),

	/**
	 * Use with Product Form code BD.
	 */
	Loose_leaf___sheets_only("B303"),

	/**
	 * AKA stitched; for ‘saddle-sewn’, see code B310.
	 */
	Sewn("B304"),

	/**
	 * Including ‘perfect bound’, ‘glued’.
	 */
	Unsewn___adhesive_bound("B305"),

	/**
	 * Strengthened binding intended for libraries.
	 */
	Library_binding("B306"),

	/**
	 * Strengthened binding, not specifically intended for libraries.
	 */
	Reinforced_binding("B307"),

	/**
	 * Must be accompanied by a code specifiying a material, eg ‘half-bound real leather’.
	 */
	Half_bound("B308"),

	/**
	 * Must be accompanied by a code specifiying a material, eg ‘quarter bound real leather’.
	 */
	Quarter_bound("B309"),

	/**
	 * AKA ‘saddle-stitched’ or ‘wire-stitched’.
	 */
	Saddlesewn("B310"),

	/**
	 * Round or oval plastic forms in a clamp-like configuration: use with Product Form code BE.
	 */
	Comb_bound("B311"),

	/**
	 * Twin loop metal or plastic spine: use with Product Form code BE.
	 */
	WireO("B312"),

	/**
	 * Cased over Wire-O binding: use with Product Form code BE.
	 */
	Concealed_wire("B313"),

	/**
	 * AKA fabric, linen over boards.
	 */
	Cloth_over_boards("B401"),

	Paper_over_boards("B402"),

	Leather__real("B403"),

	Leather__imitation("B404"),

	Leather__bonded("B405"),

	Vellum("B406"),

	/**
	 * Cloth, not necessarily over boards – cf B401.
	 */
	Cloth("B409"),

	/**
	 * Spanish ‘simil-tela’.
	 */
	Imitation_cloth("B410"),

	Velvet("B411"),

	/**
	 * AKA “flexibound”: use with Product Form code BC.
	 */
	Flexible_plastic_vinyl_cover("B412"),

	Plasticcovered("B413"),

	Vinylcovered("B414"),

	/**
	 * Book, laminating material unspecified: use L101 for ‘whole product laminated’, eg a laminated sheet map or wallchart.
	 */
	Laminated_cover("B415"),

	/**
	 * Type unspecified.
	 */
	With_dust_jacket("B501"),

	/**
	 * Used to distinguish from B503.
	 */
	With_printed_dust_jacket("B502"),

	/**
	 * With translucent paper or plastic protective cover.
	 */
	With_translucent_dust_cover("B503"),

	/**
	 * For paperback with flaps.
	 */
	With_flaps("B504"),

	With_thumb_index("B505"),

	/**
	 * If the number of markers is significant, it can be stated as free text in <ProductFormDescription>.
	 */
	With_ribbon_markers("B506"),

	With_zip_fastener("B507"),

	With_button_snap_fastener("B508"),

	/**
	 * AKA yapp edge?.
	 */
	With_leather_edge_lining("B509"),

	/**
	 * With edge trimming such that the front edge is ragged, not neatly and squarely trimmed: AKA deckle edge, feather edge, uncut edge, rough cut.
	 */
	Rough_front("B510"),

	/**
	 * A book in which half the content is printed upside-down, to be read the other way round. Also known as a ‘flip-book’ (usually an omnibus of two works).
	 */
	Turnaround_book("B601"),

	/**
	 * Manga with pages and panels in the sequence of the original Japanese, but with Western text.
	 */
	Unflipped_manga_format("B602"),

	/**
	 * Single letters only. Was formerly identified as UK Braille Grade 1.
	 */
	UK_Uncontracted_Braille("B701"),

	/**
	 * With some letter combinations. Was formerly identified as UK Braille Grade 2.
	 */
	UK_Contracted_Braille("B702"),

	/**
	 * DEPRECATED- use B704/B705 as appropriate instead.
	 */
	US_Braille("B703"),

	US_Uncontracted_Braille("B704"),

	US_Contracted_Braille("B705"),

	Unified_English_Braille("B706"),

	/**
	 * Moon embossed alphabet, used by some print-impaired readers who have difficulties with Braille.
	 */
	Moon("B707"),

	/**
	 * Proprietary RealNetworks format. Includes Real Video packaged within a .rm RealMedia container.
	 */
	Real_Video_format("D101"),

	Quicktime_format("D102"),

	AVI_format("D103"),

	Windows_Media_Video_format("D104"),

	MPEG4("D105"),

	/**
	 * Use with an applicable Product Form code D*; note that more detail of operating system requirements can be given in a Product Form Feature composite.
	 */
	MSDOS("D201"),

	/**
	 * Use with an applicable Product Form code D*; see note on D201.
	 */
	Windows("D202"),

	/**
	 * Use with an applicable Product Form code D*; see note on D201.
	 */
	Macintosh("D203"),

	/**
	 * Use with an applicable Product Form code D*; see note on D201.
	 */
	UNIX___LINUX("D204"),

	/**
	 * Use with an applicable Product Form code D*; see note on D201.
	 */
	Other_operating_systems("D205"),

	/**
	 * Use with an applicable Product Form code D*; see note on D201.
	 */
	Palm_OS("D206"),

	/**
	 * Use with an applicable Product Form code D*; see note on D201.
	 */
	Windows_Mobile("D207"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Microsoft_XBox("D301"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Nintendo_Gameboy_Color("D302"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Nintendo_Gameboy_Advanced("D303"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Nintendo_Gameboy("D304"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Nintendo_Gamecube("D305"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Nintendo_64("D306"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Sega_Dreamcast("D307"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Sega_Genesis_Megadrive("D308"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Sega_Saturn("D309"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Sony_PlayStation_1("D310"),

	/**
	 * Use with Product Form code DE or DB as applicable.
	 */
	Sony_PlayStation_2("D311"),

	Nintendo_Dual_Screen("D312"),

	Sony_PlayStation_3("D313"),

	Xbox_360("D314"),

	Nintendo_Wii("D315"),

	Sony_PlayStation_Portable_PSP("D316"),

	/**
	 * No code allocated for this e-publication format yet.
	 */
	Other("E100"),

	/**
	 * The Open Publication Structure / OPS Container Format standard of the International Digital Publishing Forum (IDPF) [File extension .epub].
	 */
	EPUB("E101"),

	/**
	 * The Open EBook format of the IDPF, a predecessor of the full EPUB format, still (2008) supported as part of the latter [File extension .opf]. Includes EPUB format up to and including version 2 – but prefer code E101 for EPUB 2, and always use code E101 for EPUB 3.
	 */
	OEB("E102"),

	/**
	 * Microsoft Word binary document format [File extension .doc].
	 */
	DOC("E103"),

	/**
	 * Office Open XML / Microsoft Word XML document format (ISO/IEC 29500:2008) [File extension .docx].
	 */
	DOCX("E104"),

	/**
	 * HyperText Mark-up Language [File extension .html, .htm].
	 */
	HTML("E105"),

	/**
	 * Open Document Format [File extension .odt].
	 */
	ODF("E106"),

	/**
	 * Portable Document Format (ISO 32000-1:2008) [File extension .pdf].
	 */
	PDF("E107"),

	/**
	 * PDF archiving format defined by ISO 19005-1:2005 [File extension .pdf].
	 */
	PDF_A("E108"),

	/**
	 * Rich Text Format [File extension .rtf].
	 */
	RTF("E109"),

	/**
	 * Standard Generalized Mark-up Language.
	 */
	SGML("E110"),

	/**
	 * A compressed text format mainly used on Psion handheld devices [File extension .tcr].
	 */
	TCR("E111"),

	/**
	 * Text file format [File extension .txt].
	 */
	TXT("E112"),

	/**
	 * Extensible Hypertext Markup Language [File extension .xhtml, .xht, .xml, .html, .htm].
	 */
	XHTML("E113"),

	/**
	 * A compressed text format mainly used on Palm handheld devices [File extension .pdb – see also E121, E125, E130].
	 */
	zTXT("E114"),

	/**
	 * XML Paper Specification format [File extension .xps].
	 */
	XPS("E115"),

	/**
	 * A format proprietary to Amazon for use with its Kindle reading devices or software readers [File extensions .azw, .mobi, .prc].
	 */
	Amazon_Kindle("E116"),

	/**
	 * A Sony proprietary format for use with the Sony Reader and LIBRIé reading devices [File extension .lrf].
	 */
	BBeB("E117"),

	/**
	 * A proprietary format for use with DXReader software.
	 */
	DXReader("E118"),

	/**
	 * A format proprietary to the Ebook Library service.
	 */
	EBL("E119"),

	/**
	 * A format proprietary to the Ebrary service.
	 */
	Ebrary("E120"),

	/**
	 * A proprietary format for use with eReader (AKA ‘Palm Reader’) software on various hardware platforms [File extension .pdb – see also E114, E125, E130].
	 */
	eReader("E121"),

	/**
	 * A proprietary format with its own reading system for Windows platforms [File extension .exe].
	 */
	Exebook("E122"),

	/**
	 * A proprietary format for use with the Franklin eBookman reader.
	 */
	Franklin_eBookman("E123"),

	/**
	 * A proprietary format for use with the Gemstar Rocketbook reader [File extension .rb].
	 */
	Gemstar_Rocketbook("E124"),

	/**
	 * A proprietary format for use with iSilo software on various hardware platforms [File extension .pdb – see also E114, E121, E130].
	 */
	iSilo("E125"),

	/**
	 * A proprietary format for use with Microsoft Reader software on Windows and Pocket PC platforms [File extension .lit].
	 */
	Microsoft_Reader("E126"),

	/**
	 * A proprietary format for use with Mobipocket software on various hardware platforms [File extensions .mobi, .prc]. Includes Amazon Kindle formats up to and including version 7 – but prefer code E116 for version 7, and always use E116 for KF8.
	 */
	Mobipocket("E127"),

	/**
	 * A format proprietary to the MyiLibrary service.
	 */
	MyiLibrary("E128"),

	/**
	 * A format proprietary to the NetLibrary service.
	 */
	NetLibrary("E129"),

	/**
	 * A proprietary format for use with Plucker reader software on Palm and other handheld devices [File extension .pdb – see also E114, E121, E125].
	 */
	Plucker("E130"),

	/**
	 * A format proprietary to the VitalSource service.
	 */
	VitalBook("E131"),

	/**
	 * A proprietary digital product combining text and video content and available to be used online or as a downloadable application for a mobile device – see www.vook.com.
	 */
	Vook("E132"),

	/**
	 * An epublication made available by Google in association with a publisher; readable online on a browser-enabled device and offline on designated ebook readers.
	 */
	Google_Edition("E133"),

	/**
	 * Epublication packaged as application for iOS (eg Apple iPhone, iPad etc), containing both executable code and content. Use <ProductContentType> to describe content, and <ProductFormFeatureType> to list detailed technical requirements.
	 */
	Book__app_for_iOS("E134"),

	/**
	 * Epublication packaged as application for Android (eg Android phone or tablet), containing both executable code and content. Use <ProductContentType> to describe content, and <ProductFormFeatureType> to list detailed technical requirements.
	 */
	Book__app_for_Android("E135"),

	/**
	 * Epublication packaged as application, containing both executable code and content. Use where other ‘app’ codes are not applicable. Technical requirements such as target operating system and/or device should be provided eg in <ProductFormFeatureType>. Content type (text or text plus various ‘enhancements’) may be described with <ProductContentType>.
	 */
	Book__app_for_other_operating_system("E136"),

	/**
	 * Founder Apabi’s proprietary basic e-book format.
	 */
	CEB("E139"),

	/**
	 * Founder Apabi’s proprietary XML e-book format.
	 */
	CEBX("E140"),

	/**
	 * Apple’s iBook format (a proprietary extension of EPUB), can only be read on Apple iOS devices.
	 */
	iBook("E141"),

	/**
	 * Proprietary format used by Barnes and Noble, readable on NOOK devices and Nook reader software.
	 */
	ePIB("E142"),

	/**
	 * Sharable Content Object Reference Model, standard content and packaging format for e-learning objects.
	 */
	SCORM("E143"),

	/**
	 * Use when a particular e-publication type (specified using codes E100 and upwards) has both fixed format and reflowable variants.
	 */
	Reflowable("E200"),

	/**
	 * Use when a particular e-publication type (specified using codes E100 and upwards) has both fixed format and reflowable variants.
	 */
	Fixed_format("E201"),

	/**
	 * All e-publication resources are included within the e-publication package.
	 */
	Readable_offline("E202"),

	/**
	 * E-publication requires a network connection to access some resources (eg an enhanced e-book where video clips are not stored within the e-publication package itself, but are delivered via an internet connection).
	 */
	Requires_network_connection("E203"),

	/**
	 * Resources (eg images) present in other editions have been removed from this product, eg due to rights issues.
	 */
	Content_removed("E204"),

	/**
	 * Whole product laminated (eg laminated map, fold-out chart, wallchart, etc): use B415 for book with laminated cover.
	 */
	Laminated("L101"),

	/**
	 * Use with Product Form code PC.
	 */
	Desk_calendar("P101"),

	/**
	 * Use with Product Form code PC.
	 */
	Mini_calendar("P102"),

	/**
	 * Use with Product Form code PC.
	 */
	Engagement_calendar("P103"),

	/**
	 * Use with Product Form code PC.
	 */
	Day_by_day_calendar("P104"),

	/**
	 * Use with Product Form code PC.
	 */
	Poster_calendar("P105"),

	/**
	 * Use with Product Form code PC.
	 */
	Wall_calendar("P106"),

	/**
	 * Use with Product Form code PC.
	 */
	Perpetual_calendar("P107"),

	/**
	 * Use with Product Form code PC.
	 */
	Advent_calendar("P108"),

	/**
	 * Use with Product Form code PC.
	 */
	Bookmark_calendar("P109"),

	/**
	 * Use with Product Form code PC.
	 */
	Student_calendar("P110"),

	/**
	 * Use with Product Form code PC.
	 */
	Project_calendar("P111"),

	/**
	 * Use with Product Form code PC.
	 */
	Almanac_calendar("P112"),

	/**
	 * A calendar that is not one of the types specified elsewhere: use with Product Form code PC.
	 */
	Other_calendar("P113"),

	/**
	 * A product that is associated with or ancillary to a calendar or organiser, eg a deskstand for a calendar, or an insert for an organiser: use with Product Form code PC or PS.
	 */
	Other_calendar_or_organiser_product("P114"),

	/**
	 * Stationery item in hardback book format.
	 */
	Hardback_stationery("P201"),

	/**
	 * Stationery item in paperback/softback book format.
	 */
	Paperback___softback_stationery("P202"),

	/**
	 * Stationery item in spiral-bound book format.
	 */
	Spiral_bound_stationery("P203"),

	/**
	 * Stationery item in leather-bound book format, or other fine binding.
	 */
	Leather___fine_binding_stationery("P204"),

	/**
	 * TV standard for video or DVD.
	 */
	PAL("V201"),

	/**
	 * TV standard for video or DVD.
	 */
	NTSC("V202"),

	/**
	 * TV standard for video or DVD.
	 */
	SECAM("V203");

	public final String code;

	private ProductFormDetails(String code)
	{
		this.code = code;
	}

	private static ProductFormDetails[] values = ProductFormDetails.values();
	public static ProductFormDetails fromCode(String code)
	{
		if (code != null && !code.isEmpty())
			for (ProductFormDetails item : values)
				if (item.code.equals(code))
					return item;
		return null;
	}
}

