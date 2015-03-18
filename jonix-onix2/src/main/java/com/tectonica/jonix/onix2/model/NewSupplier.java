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

import java.util.List;

import com.tectonica.jonix.onix2.DU;
import com.tectonica.jonix.onix2.codelist.List138;
import com.tectonica.jonix.onix2.codelist.List14;
import com.tectonica.jonix.onix2.codelist.List3;
import com.tectonica.jonix.onix2.codelist.List34;
import com.tectonica.jonix.onix2.codelist.List74;

public class NewSupplier
{
	public static final String refname = "NewSupplier";
	public static final String shortname = "newsupplier";

	public List34 textformat;
	public List14 textcase;
	public List74 language;
	public List138 transliteration;
	public String datestamp; // DateOrDateTime
	public List3 sourcetype;
	public String sourcename;

	public List<SupplierIdentifier> supplierIdentifiers; // ZeroOrMore
	public SupplierSAN supplierSAN; // Optional
	public SupplierEANLocationNumber supplierEANLocationNumber; // Required
	public SupplierName supplierName; // Optional
	public List<TelephoneNumber> telephoneNumbers; // ZeroOrMore
	public List<FaxNumber> faxNumbers; // ZeroOrMore
	public List<EmailAddress> emailAddresss; // ZeroOrMore

	public static NewSupplier fromDoc(org.w3c.dom.Element element)
	{
		final NewSupplier x = new NewSupplier();

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
				if (name.equalsIgnoreCase(SupplierIdentifier.refname) || name.equalsIgnoreCase(SupplierIdentifier.shortname))
					x.supplierIdentifiers = DU.addToList(x.supplierIdentifiers, SupplierIdentifier.fromDoc(element));
				else if (name.equalsIgnoreCase(SupplierSAN.refname) || name.equalsIgnoreCase(SupplierSAN.shortname))
					x.supplierSAN = SupplierSAN.fromDoc(element);
				else if (name.equalsIgnoreCase(SupplierEANLocationNumber.refname)
						|| name.equalsIgnoreCase(SupplierEANLocationNumber.shortname))
					x.supplierEANLocationNumber = SupplierEANLocationNumber.fromDoc(element);
				else if (name.equalsIgnoreCase(SupplierName.refname) || name.equalsIgnoreCase(SupplierName.shortname))
					x.supplierName = SupplierName.fromDoc(element);
				else if (name.equalsIgnoreCase(TelephoneNumber.refname) || name.equalsIgnoreCase(TelephoneNumber.shortname))
					x.telephoneNumbers = DU.addToList(x.telephoneNumbers, TelephoneNumber.fromDoc(element));
				else if (name.equalsIgnoreCase(FaxNumber.refname) || name.equalsIgnoreCase(FaxNumber.shortname))
					x.faxNumbers = DU.addToList(x.faxNumbers, FaxNumber.fromDoc(element));
				else if (name.equalsIgnoreCase(EmailAddress.refname) || name.equalsIgnoreCase(EmailAddress.shortname))
					x.emailAddresss = DU.addToList(x.emailAddresss, EmailAddress.fromDoc(element));
			}
		});

		return x;
	}
}
