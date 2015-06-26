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
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * Enum that corresponds to ONIX's <b>CodeList167</b>
 * <p>
 * Price condition type
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">http://www.editeur.org/14/code-lists</a>
 */
public enum PriceConditionTypes
{
	/**
	 * Allows positive indication that there are no conditions (the default if <PriceCondition> is omitted).
	 */
	No_conditions("00"), //

	/**
	 * Purchase at this price includes specified updates.
	 */
	Includes_updates("01"), //

	/**
	 * Purchase at this price requires commitment to purchase specified updates, not included in price.
	 */
	Must_also_purchase_updates("02"), //

	/**
	 * Updates may be purchased separately, no minimum commitment required.
	 */
	Updates_available("03"), //

	/**
	 * Purchase at this price requires prior purchase of other product.
	 */
	Linked_prior_purchase_price("05"), //

	/**
	 * Purchase at this price requires simultaneous purchase of other product.
	 */
	Linked_price("06"), //

	/**
	 * The duration of the rental to which the price applies.
	 */
	Rental_duration("10"), //

	/**
	 * Purchase at this price requires prior rental of the product. <PriceConditionQuantity> gives minimum prior rental
	 * period, and <ProductIdentifier> may be used if rental uses a different product identifier.
	 */
	Rental_to_purchase("11"), //

	/**
	 * Upgrade to longer rental duration. <PriceConditionQuantity> gives minimum prior rental duration. Separate price
	 * condition with rental duration (code 10) specifies the new combined rental duration.
	 */
	Rental_extension("12");

	public final String value;

	private PriceConditionTypes(String value)
	{
		this.value = value;
	}

	private static Map<String, PriceConditionTypes> map;

	private static Map<String, PriceConditionTypes> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (PriceConditionTypes e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static PriceConditionTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
