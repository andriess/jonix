package com.tectonica.jonix.codelist;

/**
 * Enum that corresponds to Onix's CodeList 68
 * 
 * @author Zach Melamed
 * 
 */
public enum MarketPublishingStatuses
{
	/**
	 * Status is not specified (as distinct from unknown): the default if the <MarketPublishingStatus> element is not sent.
	 */
	Unspecified("00"),

	/**
	 * The product was announced for publication in this market, and subsequently abandoned.
	 */
	Cancelled("01"),

	/**
	 * Not yet published in this market, should be accompanied by expected local publication date..
	 */
	Forthcoming("02"),

	/**
	 * The product was announced for publication in this market, and subsequently postponed with no expected local publication date.
	 */
	Postponed_indefinitely("03"),

	/**
	 * The product was published in this market, and is still active in the sense that the publisher will accept orders for it, though it may or may not be immediately available, for which see <SupplyDetail>.
	 */
	Active("04"),

	/**
	 * Responsibility for the product in this market has been transferred elsewhere.
	 */
	No_longer_our_product("05"),

	/**
	 * The product was active, but is now inactive in the sense that (a) no further stock is expected to be made available in this market, though stock may still be available elsewhere in the supply chain, and (b) there are no current plans to bring it back into stock.
	 */
	Out_of_stock_indefinitely("06"),

	/**
	 * The product was active, but is now permanently inactive in the sense that (a) no further stock is expected to be made available in this market, though stock may still be available elsewhere in the supply chain, and (b) the product will not be made available again under the same ISBN.
	 */
	Out_of_print("07"),

	/**
	 * The product was active, but is now permanently or indefinitely inactive in the sense that no further stock is expected to be made available in this market, though stock may still be available elsewhere in the supply chain. Code 08 covers both of codes 06 and 07, and may be used where the distinction between those values is either unnecessary or meaningless.
	 */
	Inactive("08"),

	/**
	 * The sender of the ONIX record does not know the current publishing status in this market.
	 */
	Unknown("09"),

	/**
	 * The product is no longer available in this market from the local publisher, under the current ISBN, at the current price. It may be available to be traded through another channel, usually at a reduced price.
	 */
	Remaindered("10"),

	/**
	 * Withdrawn from sale in this market, typically for legal reasons.
	 */
	Withdrawn_from_sale("11"),

	/**
	 * Either no rights are held for the product in this market, or for other reasons the publisher has decided not to make it available in this market.
	 */
	Not_available_in_this_market("12"),

	/**
	 * The product is published in this market and active but, as a publishing decision, it is not sold separately – only in an assembly or as part of a package.
	 */
	Active__but_not_sold_separately("13"),

	/**
	 * The product is published in this market and active, but is not available to all customer types, typically because the market is split between exclusive sales agents for different market segments. In ONIX 2.1, should be accompanied by a free-text statement in <MarketRestrictionDetail> describing the nature of the restriction. In ONIX 3.0, the <SalesRestriction> composite in Group P.24 should be used.
	 */
	Active__with_market_restrictions("14"),

	/**
	 * Recalled in this market for reasons of consumer safety.
	 */
	Recalled("15"),

	/**
	 * Temporarily withdrawn from sale in this market, typically for quality or technical reasons. In ONIX 3.0, must be accompanied by expected availability date coded ‘22’ within the <MarketPublishingDate> composite, except in exceptional circumstances where no date is known.
	 */
	Temporarily_withdrawn_from_sale("16");

	public final String code;

	private MarketPublishingStatuses(String code)
	{
		this.code = code;
	}

	private static MarketPublishingStatuses[] values = MarketPublishingStatuses.values();
	public static MarketPublishingStatuses fromCode(String code)
	{
		if (code != null && !code.isEmpty())
			for (MarketPublishingStatuses item : values)
				if (item.code.equals(code))
					return item;
		return null;
	}
}

