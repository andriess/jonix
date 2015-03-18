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

package com.tectonica.jonix.onix2.model;

import com.tectonica.jonix.onix2.DU;
import com.tectonica.jonix.onix2.codelist.List138;
import com.tectonica.jonix.onix2.codelist.List14;
import com.tectonica.jonix.onix2.codelist.List3;
import com.tectonica.jonix.onix2.codelist.List34;
import com.tectonica.jonix.onix2.codelist.List74;

public class ConferenceSponsor
{
	public static final String refname = "ConferenceSponsor";
	public static final String shortname = "conferencesponsor";

	public List34 textformat;
	public List14 textcase;
	public List74 language;
	public List138 transliteration;
	public String datestamp; // DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public ConferenceSponsorIdentifier conferenceSponsorIdentifier; // Required
	public PersonName personName; // Optional
	public CorporateName corporateName; // Optional

	public static ConferenceSponsor fromDoc(org.w3c.dom.Element element)
	{
		final ConferenceSponsor x = new ConferenceSponsor();

		x.textformat = List34.byValue(DU.getAttribute(element, "textformat"));
		x.textcase = List14.byValue(DU.getAttribute(element, "textcase"));
		x.language = List74.byValue(DU.getAttribute(element, "language"));
		x.transliteration = List138.byValue(DU.getAttribute(element, "transliteration"));
		x.datestamp = DU.getAttribute(element, "datestamp");
		x.sourcetype = List3.byValue(DU.getAttribute(element, "sourcetype"));
		x.sourcename = DU.getAttribute(element, "sourcename");

		DU.forElementsOf(element, new DU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equalsIgnoreCase(ConferenceSponsorIdentifier.refname)
						|| name.equalsIgnoreCase(ConferenceSponsorIdentifier.shortname))
					x.conferenceSponsorIdentifier = ConferenceSponsorIdentifier.fromDoc(element);
				else if (name.equalsIgnoreCase(PersonName.refname) || name.equalsIgnoreCase(PersonName.shortname))
					x.personName = PersonName.fromDoc(element);
				else if (name.equalsIgnoreCase(CorporateName.refname) || name.equalsIgnoreCase(CorporateName.shortname))
					x.corporateName = CorporateName.fromDoc(element);
			}
		});

		return x;
	}
}
