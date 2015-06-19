/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.codelist;

import java.util.HashMap;
import java.util.Map;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

/**
 * Enum that corresponds to ONIX's CodeList59
 * <p>
 * Price type qualifier
 * 
 * @see <a href="http://www.editeur.org/14/code-lists/">http://www.editeur.org/14/code-lists/</a>
 */
public enum PriceTypeQualifiers
{
	/**
	 * Price applies to all customers that do not fall within any other group with a specified group-specific qualified price.
	 */
	Unqualified_price("00"), //

	/**
	 * Price applies to a designated group membership.
	 */
	Member_subscriber_price("01"), //

	/**
	 * Price applies to sales outside the territory in which the supplier is located.
	 */
	Export_price("02"), //

	/**
	 * Use in cases where there is no combined price, but a lower price is offered for each part if the whole set / series / collection is
	 * purchased (either at one time, as part of a continuing commitment, or in a single purchase).
	 */
	Reduced_price_applicable_when_the_item_is_purchased_as_part_of_a_set_or_series_or_collection("03"), //

	/**
	 * In the Netherlands (or any other market where similar arrangements exist): a reduced fixed price available for a limited time on
	 * presentation of a voucher or coupon published in a specified medium, eg a newspaper. Should be accompanied by Price Type code 13 and
	 * additional detail in <PriceTypeDescription>, and by validity dates in <PriceEffectiveFrom> and <PriceEffectiveUntil> (ONIX 2.1) or in
	 * the <PriceDate> composite (ONIX 3.0).
	 */
	Voucher_price("04"), //

	/**
	 * Price for individual consumer sale only.
	 */
	Consumer_price("05"), //

	/**
	 * Price for sale to libraries or other corporate or institutional customers.
	 */
	Corporate_price("06"), //

	/**
	 * Price valid for a specified period prior to publication. Orders placed prior to the end of the period are guaranteed to be delivered
	 * to the retailer before the nominal publication date. The price may or may not be different from the ‘normal’ price, which carries no
	 * such delivery guarantee. Must be accompanied by a <PriceEffectiveUntil> date (or equivalent <PriceDate> composite in ONIX 3), and
	 * should also be accompanied by a ‘normal’ price.
	 */
	Reservation_order_price("07"), //

	/**
	 * Temporary ‘Special offer’ price. Must be accompanied by <PriceEffectiveFrom> and <PriceEffectiveUntil> dates (or equivalent
	 * <PriceDate> composites in ONIX 3), and may also be accompanied by a ‘normal’ price.
	 */
	Promotional_offer_price("08"), //

	/**
	 * Price requires purchase with, or proof of ownership of another product. Further details of purchase or ownership requirements must be
	 * given in <PriceTypeDescription>.
	 */
	Linked_price("09");

	public final String value;

	private PriceTypeQualifiers(String value)
	{
		this.value = value;
	}

	private static Map<String, PriceTypeQualifiers> map;

	private static Map<String, PriceTypeQualifiers> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (PriceTypeQualifiers e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static PriceTypeQualifiers byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
