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

package com.tectonica.jonix.onix2;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>On sale date</h1><p>The date when a new product can be placed on sale by retailers in the market served by the
 * supplier. Optional and non-repeating. <strong>If the &lt;OnSaleDate&gt; element is used, it means that there is an
 * embargo on sales to consumers before the stated date. Otherwise, sales to consumers are permitted as soon as stocks
 * reach retailers.</strong> In the UK, publishers who are following the PA/BA Launch Dates Code of Practice should use
 * this element for the Launch Date.</p><table border='1' cellpadding='3'><tr><td>Format</td><td>Date as year, month,
 * day (YYYYMMDD)</td></tr><tr><td>Reference name</td><td>&lt;OnSaleDate&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;j143&gt;</td></tr><tr><td>Example</td><td>&lt;OnSaleDate&gt;20000616&lt;/OnSaleDate&gt;</td></tr></table>
 */
public class OnSaleDate implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "OnSaleDate";
    public static final String shortname = "j143";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    public TextFormats textformat;

    public TextCaseFlags textcase;

    public LanguageCodes language;

    public TransliterationSchemes transliteration;

    /**
     * (type: DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * Raw Format: Date as year, month, day (YYYYMMDD)<p> (type: NonEmptyString)
     */
    public String value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public String _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final OnSaleDate EMPTY = new OnSaleDate();

    public OnSaleDate() {
        exists = false;
    }

    public OnSaleDate(org.w3c.dom.Element element) {
        exists = true;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = JPU.getContentAsString(element);
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
