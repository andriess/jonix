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
import com.tectonica.jonix.ListOfOnixDataComposite;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixOnOrderDetail;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Stock quantity composite</h1><p>A repeatable group of data elements which together specify a quantity of stock
 * and, where a supplier has more than one warehouse, a supplier location. Optional.</p><table border='1'
 * cellpadding='3'><tr><td>Reference name</td><td>&lt;Stock&gt;</td></tr><tr><td>Short
 * tag</td><td>&lt;stock&gt;</td></tr></table>
 */
public class Stock implements OnixSuperComposite, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "Stock";
    public static final String shortname = "stock";

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
    // CONSTRUCTION
    /////////////////////////////////////////////////////////////////////////////////

    private boolean initialized;
    private final boolean exists;
    private final org.w3c.dom.Element element;
    public static final Stock EMPTY = new Stock();

    public Stock() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public Stock(org.w3c.dom.Element element) {
        exists = true;
        initialized = false;
        this.element = element;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
    }

    @Override
    public void _initialize() {
        if (initialized) {
            return;
        }
        initialized = true;

        JPU.forElementsOf(element, e -> {
            final String name = e.getNodeName();
            switch (name) {
                case LocationIdentifier.refname:
                case LocationIdentifier.shortname:
                    locationIdentifier = new LocationIdentifier(e);
                    break;
                case LocationName.refname:
                case LocationName.shortname:
                    locationName = new LocationName(e);
                    break;
                case StockQuantityCoded.refname:
                case StockQuantityCoded.shortname:
                    stockQuantityCoded = new StockQuantityCoded(e);
                    break;
                case OnHand.refname:
                case OnHand.shortname:
                    onHand = new OnHand(e);
                    break;
                case OnOrder.refname:
                case OnOrder.shortname:
                    onOrder = new OnOrder(e);
                    break;
                case CBO.refname:
                case CBO.shortname:
                    cbo = new CBO(e);
                    break;
                case OnOrderDetail.refname:
                case OnOrderDetail.shortname:
                    onOrderDetails = JPU.addToList(onOrderDetails, new OnOrderDetail(e));
                    break;
                default:
                    break;
            }
        });
    }

    @Override
    public boolean exists() {
        return exists;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private LocationIdentifier locationIdentifier = LocationIdentifier.EMPTY;

    /**
     * (this field is optional)
     */
    public LocationIdentifier locationIdentifier() {
        _initialize();
        return locationIdentifier;
    }

    private LocationName locationName = LocationName.EMPTY;

    /**
     * (this field is optional)
     */
    public LocationName locationName() {
        _initialize();
        return locationName;
    }

    private StockQuantityCoded stockQuantityCoded = StockQuantityCoded.EMPTY;

    /**
     * (this field is required)
     */
    public StockQuantityCoded stockQuantityCoded() {
        _initialize();
        return stockQuantityCoded;
    }

    private OnHand onHand = OnHand.EMPTY;

    /**
     * (this field is optional)
     */
    public OnHand onHand() {
        _initialize();
        return onHand;
    }

    private OnOrder onOrder = OnOrder.EMPTY;

    /**
     * (this field is optional)
     */
    public OnOrder onOrder() {
        _initialize();
        return onOrder;
    }

    private CBO cbo = CBO.EMPTY;

    /**
     * (this field is optional)
     */
    public CBO cbo() {
        _initialize();
        return cbo;
    }

    private ListOfOnixDataComposite<OnOrderDetail, JonixOnOrderDetail> onOrderDetails = ListOfOnixDataComposite.empty();

    /**
     * (this list may be empty)
     */
    public ListOfOnixDataComposite<OnOrderDetail, JonixOnOrderDetail> onOrderDetails() {
        _initialize();
        return onOrderDetails;
    }
}
