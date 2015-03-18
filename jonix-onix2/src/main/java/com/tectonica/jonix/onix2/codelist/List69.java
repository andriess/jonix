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
 * Agent role
 */
public enum List69
{
	/**
	 * Publisher’s exclusive sales agent in a specified territory.
	 */
	Exclusive_sales_agent("05"), //

	/**
	 * Publisher’s non-exclusive sales agent in a specified territory.
	 */
	Non_exclusive_sales_agent("06"), //

	/**
	 * Publisher for a specified territory.
	 */
	Local_publisher("07"), //

	/**
	 * Publisher’s sales agent in a specific territory. Use only where exclusive / non-exclusive status is not known. Prefer 05 or 06 as
	 * appropriate, where possible.
	 */
	Sales_agent("08");

	public final String value;

	private List69(String value)
	{
		this.value = value;
	}

	public static List69 byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (List69 e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}
