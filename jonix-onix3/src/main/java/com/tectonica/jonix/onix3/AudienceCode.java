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

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.Audiences;
import com.tectonica.jonix.codelist.RecordSourceTypes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Audience code</h1><p>An ONIX code, derived from BISAC and BIC lists, which identifies the broad audience or
 * readership for which a product is intended. Optional, and repeatable if the product is intended for two or more
 * groups. Deprecated, in favor of providing the same information within the &lt;Audience&gt; composite using code 01
 * from List 29.</p><table border='1' cellpadding='3'><tr><td>Format</td><td>Fixed-length, two
 * digits</td></tr><tr><td>Codelist</td><td>List 28</td></tr><tr><td>Reference name</td><td>&lt;AudienceCode&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;b073&gt;</td></tr><tr><td>Cardinality</td><td>0&#8230;n</td></tr><tr><td>Example</td><td>&lt;AudienceCode&gt;04&lt;/AudienceCode&gt;
 * (Primary and secondary/elementary and high school)</td></tr></table>
 */
public class AudienceCode implements OnixElement<Audiences>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "AudienceCode";
    public static final String shortname = "b073";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    public Audiences value;

    /**
     * Internal API, use the {@link #value} field instead
     */
    @Override
    public Audiences _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final AudienceCode EMPTY = new AudienceCode();

    public AudienceCode() {
        exists = false;
    }

    public AudienceCode(org.w3c.dom.Element element) {
        exists = true;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = Audiences.byCode(JPU.getContentAsString(element));
    }

    @Override
    public boolean exists() {
        return exists;
    }
}
