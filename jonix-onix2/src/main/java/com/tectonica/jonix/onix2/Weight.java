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
 * <h1>Unit weight</h1><p>The weight of a single unit of the product, in the units specified in the message header,
 * &lt;DefaultWeightUnit&gt; field, defined in the <cite>ONIX for Books – Product Information Message – XML Message
 * Specification</cite>. Optional and non-repeating. <strong>The &lt;Measure&gt; composite on a previous page provides a
 * more general method of handling weights, and is to be preferred.</strong></p><table border='1'
 * cellpadding='3'><tr><td>Format</td><td>Variable length real number, with an explicit decimal point when required,
 * suggested maximum length 6 characters including a decimal point.</td></tr><tr><td>Reference
 * name</td><td>&lt;Weight&gt;</td></tr><tr><td>Short tag</td><td>&lt;c099&gt;</td></tr><tr><td>Example</td><td>&lt;c099&gt;180&lt;/c099&gt;</td></tr></table>
 */
public class Weight implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "Weight";
    public static final String shortname = "c099";

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
     * Raw Format: Variable length real number, with an explicit decimal point when required, suggested maximum length 6
     * characters including a decimal point.<p> (type: NonEmptyString)
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
    public static final Weight EMPTY = new Weight();

    public Weight() {
        exists = false;
    }

    public Weight(org.w3c.dom.Element element) {
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
