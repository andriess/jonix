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

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * Enum that corresponds to ONIX's <b>CodeList177</b>
 * <p>
 * Person / organization date role
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">http://www.editeur.org/14/code-lists</a>
 */
public enum PersonOrganizationDateRoles
{
	Date_of_birth("50"), //

	Date_of_death("51");

	public final String value;

	private PersonOrganizationDateRoles(String value)
	{
		this.value = value;
	}

	public static PersonOrganizationDateRoles byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (PersonOrganizationDateRoles e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}
