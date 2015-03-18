//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:33 PM IST 
//


package org.editeur.onix.v21.references;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List94.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List94">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cm"/>
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="mm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List94")
@XmlEnum
public enum List94 {


    /**
     * Millimeters are the preferred metric unit of length.
     * 
     */
    @XmlEnumValue("cm")
    CM("cm"),
    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("mm")
    MM("mm");
    private final String value;

    List94(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static List94 fromValue(String v) {
        for (List94 c: List94 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
