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
 * <h1>Main description</h1><p>Descriptive text about the product, audience unspecified. Optional and
 * non-repeating.</p><p><strong>The &lt;OtherText&gt; composite on the next page provides a more general method of
 * handling descriptions, and is to be preferred.</strong></p><p>The &lt;MainDescription&gt; element may carry any of
 * the following ONIX attributes: textformat, language, transliteration, textcase.</p><table border='1'
 * cellpadding='3'><tr><td>Format</td><td>Variable-length text, suggested maximum 2,000 characters (XHTML is enabled in
 * this element - see ONIX for Books - Product Information Message - XML Message Specification, Section
 * 7)</td></tr><tr><td>Reference name</td><td>&lt;MainDescription&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;d101&gt;</td></tr><tr><td>Example</td><td>&lt;MainDescription&gt;This volume tells the story of
 * Europe, East and West, from prehistory to the present day. It lays down the chronological and geographical grid on
 * which the dramas of European history have been played out. It zooms in from the distant focus of Chapter One, which
 * explores the first five million years of the continent's evolution, to the close focus of the last two chapters,
 * which cover the 20th century at roughly one page per year. Alongside Europe's better-known stories - human, national
 * and continental - it brings into focus areas often ignored or misunderstood, remembering the stateless nation as well
 * as the nation-state. Minority communities, from heretics and lepers to Jews, Romanies and Muslims have not been
 * forgotten. This history reveals not only the rich variety of Europe's past but also the many and rewarding prisms
 * through which it can be viewed. Each chapter contains a selection of telephoto &#8220;capsules&#8221;, illustrating
 * narrower themes and topics that cut across the chronological flow. It then concludes with a wide-angle
 * &#8220;snapshot&#8221; of the whole continent as seen from one particular vantage
 * point.&lt;/MainDescription&gt;</td></tr></table>
 */
public class MainDescription implements OnixElement<String>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "MainDescription";
    public static final String shortname = "d101";

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
     * Raw Format: Variable-length text, suggested maximum 2,000 characters (XHTML is enabled in this element - see ONIX
     * for Books - Product Information Message - XML Message Specification, Section 7)<p> (type: XHTML)
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
    public static final MainDescription EMPTY = new MainDescription();

    public MainDescription() {
        exists = false;
    }

    public MainDescription(org.w3c.dom.Element element) {
        exists = true;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = JPU.getChildXHTML(element, true);
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
