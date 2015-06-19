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
 * Enum that corresponds to ONIX's CodeList28
 * <p>
 * Audience code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists/">http://www.editeur.org/14/code-lists/</a>
 */
public enum Audiences
{
	/**
	 * For a non-specialist adult audience.
	 */
	General_trade("01"), //

	/**
	 * For a juvenile audience, not specifically for any educational purpose.
	 */
	Children_juvenile("02"), //

	/**
	 * For a teenage audience, not specifically for any educational purpose.
	 */
	Young_adult("03"), //

	/**
	 * Kindergarten, pre-school, primary/elementary or secondary/high school education.
	 */
	Primary_and_secondary_elementary_and_high_school("04"), //

	/**
	 * For universities and colleges of further and higher education.
	 */
	College_higher_education("05"), //

	/**
	 * For an expert adult audience, including academic research.
	 */
	Professional_and_scholarly("06"), //

	/**
	 * Intended for use in teaching English as a second language.
	 */
	ELT_ESL("07"), //

	/**
	 * For centres providing academic, vocational or recreational courses for adults.
	 */
	Adult_education("08");

	public final String value;

	private Audiences(String value)
	{
		this.value = value;
	}

	private static Map<String, Audiences> map;

	private static Map<String, Audiences> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (Audiences e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static Audiences byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
