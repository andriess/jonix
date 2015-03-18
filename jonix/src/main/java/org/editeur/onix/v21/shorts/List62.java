//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List62.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List62">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List62")
@XmlEnum
public enum List62 {


    /**
     * Specifies that tax is applied at a higher rate than standard.
     * 
     */
    H,

    /**
     * Under Italian tax rules, VAT on books may be paid at source by the publisher, and subsequent transactions through the supply chain are tax-exempt.
     * 
     */
    P,

    /**
     * Specifies that tax is applied at a lower rate than standard.
     * 
     */
    R,
    S,
    Z;

    public String value() {
        return name();
    }

    public static List62 fromValue(String v) {
        return valueOf(v);
    }

}
