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

package com.tectonica.jonix;

import org.w3c.dom.Element;

public class JonixFactory {
    // TODO: these type of factory services should be externalized as SPI some day..

    public static OnixProduct productFromElement(Element productElement, JonixOnixVersion onixVersion) {
        switch (onixVersion) {
            case ONIX2:
                return new com.tectonica.jonix.onix2.Product(productElement);
            case ONIX3:
                return new com.tectonica.jonix.onix3.Product(productElement);
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static OnixHeader headerFromElement(Element headerElement, JonixOnixVersion onixVersion) {
        switch (onixVersion) {
            case ONIX2:
                return new com.tectonica.jonix.onix2.Header(headerElement);
            case ONIX3:
                return new com.tectonica.jonix.onix3.Header(headerElement);
            default:
                throw new UnsupportedOperationException();
        }
    }
}
