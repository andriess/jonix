//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:39 AM IST 
//


package org.editeur.onix.v30.references;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List98.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List98">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLK"/>
 *     &lt;enumeration value="BLU"/>
 *     &lt;enumeration value="BRN"/>
 *     &lt;enumeration value="BUR"/>
 *     &lt;enumeration value="CRE"/>
 *     &lt;enumeration value="FCO"/>
 *     &lt;enumeration value="FCS"/>
 *     &lt;enumeration value="GLD"/>
 *     &lt;enumeration value="GRN"/>
 *     &lt;enumeration value="GRY"/>
 *     &lt;enumeration value="MUL"/>
 *     &lt;enumeration value="NAV"/>
 *     &lt;enumeration value="ORG"/>
 *     &lt;enumeration value="PNK"/>
 *     &lt;enumeration value="PUR"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="SLV"/>
 *     &lt;enumeration value="TAN"/>
 *     &lt;enumeration value="WHI"/>
 *     &lt;enumeration value="YEL"/>
 *     &lt;enumeration value="ZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List98")
@XmlEnum
public enum List98 {

    BLK,
    BLU,
    BRN,
    BUR,
    CRE,
    FCO,
    FCS,
    GLD,
    GRN,
    GRY,

    /**
     * Use <ProductFormFeatureDescription> to add brief details if required.
     * 
     */
    MUL,
    NAV,
    ORG,
    PNK,
    PUR,
    RED,
    SLV,
    TAN,
    WHI,
    YEL,
    ZZZ;

    public String value() {
        return name();
    }

    public static List98 fromValue(String v) {
        return valueOf(v);
    }

}
