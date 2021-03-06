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

package com.tectonica.jonix.struct;

import com.tectonica.jonix.JonixKeyedStruct;
import com.tectonica.jonix.codelist.DateFormats;
import com.tectonica.jonix.codelist.PublishingDateRoles;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

@SuppressWarnings("serial")
public class JonixPublishingDate implements JonixKeyedStruct<PublishingDateRoles>, Serializable {
    public static JonixPublishingDate EMPTY = new JonixPublishingDate();

    /**
     * the key of this struct (by which it can be looked up)
     */
    public PublishingDateRoles publishingDateRole;

    public DateFormats dateFormat;

    /**
     * Raw Format: As specified by the value in the dateformat attribute, in &lt;DateFormat&gt;, or the default YYYYMMDD
     * <p> (type: dt.NonEmptyString)
     */
    public String date;

    @Override
    public PublishingDateRoles key() {
        return publishingDateRole;
    }
}
