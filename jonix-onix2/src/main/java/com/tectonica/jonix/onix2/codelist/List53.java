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

package com.tectonica.jonix.onix2.codelist;

/**
 * Returns conditions code type
 */
public enum List53
{
	Proprietary("00"), //

	/**
	 * Maintained by CLIL (Commission Interprofessionnel du Livre). Returns conditions values in <ReturnsCode> should be taken from the CLIL
	 * list.
	 */
	French_book_trade_returns_conditions_code("01"), //

	/**
	 * Maintained by BISAC: Returns conditions values in <ReturnsCode> should be taken from List 66.
	 */
	BISAC_Returnable_Indicator_code("02"), //

	/**
	 * NOT CURRENTLY USED – BIC has decided that it will not maintain a code list for this purpose, since returns conditions are usually at
	 * least partly based on the trading relationship.
	 */
	UK_book_trade_returns_conditions_code("03"), //

	/**
	 * Returns conditions values in <ReturnsCode> should be taken from List 204.
	 */
	ONIX_Returns_conditions_code("04");

	public final String value;

	private List53(String value)
	{
		this.value = value;
	}

	public static List53 byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (List53 e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}
