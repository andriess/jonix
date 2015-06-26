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

package com.tectonica.jonix.onix3;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.ExtentTypes;
import com.tectonica.jonix.codelist.ExtentUnits;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixExtent;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class Extent implements OnixDataComposite, Serializable
{
	public static final String refname = "Extent";
	public static final String shortname = "extent";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public ExtentType extentType; // Required
	public ExtentValue extentValue; // Required
	public ExtentValueRoman extentValueRoman; // Optional
	public ExtentUnit extentUnit; // Required

	public Extent()
	{}

	public Extent(org.w3c.dom.Element element)
	{
		this.datestamp = JPU.getAttribute(element, "datestamp");
		this.sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		this.sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(ExtentType.refname) || name.equals(ExtentType.shortname))
					extentType = new ExtentType(element);
				else if (name.equals(ExtentValue.refname) || name.equals(ExtentValue.shortname))
					extentValue = new ExtentValue(element);
				else if (name.equals(ExtentValueRoman.refname) || name.equals(ExtentValueRoman.shortname))
					extentValueRoman = new ExtentValueRoman(element);
				else if (name.equals(ExtentUnit.refname) || name.equals(ExtentUnit.shortname))
					extentUnit = new ExtentUnit(element);
			}
		});
	}

	public ExtentTypes getExtentTypeValue()
	{
		return (extentType == null) ? null : extentType.value;
	}

	public Double getExtentValueValue()
	{
		return (extentValue == null) ? null : extentValue.value;
	}

	public String getExtentValueRomanValue()
	{
		return (extentValueRoman == null) ? null : extentValueRoman.value;
	}

	public ExtentUnits getExtentUnitValue()
	{
		return (extentUnit == null) ? null : extentUnit.value;
	}

	public JonixExtent asJonixExtent()
	{
		JonixExtent x = new JonixExtent();
		x.extentType = getExtentTypeValue();
		x.extentUnit = getExtentUnitValue();
		x.extentValue = getExtentValueValue();
		return x;
	}
}
