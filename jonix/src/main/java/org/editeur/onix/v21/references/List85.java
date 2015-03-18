//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:33 PM IST 
//


package org.editeur.onix.v21.references;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List85.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List85">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AW"/>
 *     &lt;enumeration value="BB"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="DR"/>
 *     &lt;enumeration value="DV"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GF"/>
 *     &lt;enumeration value="LP"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SU"/>
 *     &lt;enumeration value="WG"/>
 *     &lt;enumeration value="WM"/>
 *     &lt;enumeration value="YT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List85")
@XmlEnum
public enum List85 {


    /**
     * A Bible (or selected Biblical text) designed for presentation from a religious organization.
     * 
     */
    AW,

    /**
     * A Bible (or selected Biblical text) designed to be a gift to commemorate a child�s birth.
     * 
     */
    BB,

    /**
     * A special gift Bible (or selected Biblical text) designed for the bride on her wedding day. Usually white.
     * 
     */
    BR,

    /**
     * A Bible (or selected Biblical text) designed to be used in the confirmation reading or as a gift to a confirmand.
     * 
     */
    CF,

    /**
     * A text Bible (or selected Biblical text) designed in presentation and readability for a child.
     * 
     */
    CH,

    /**
     * A small Bible (or selected Biblical text) with a trim height of five inches or less.
     * 
     */
    CM,

    /**
     * A Bible (or selected Biblical text) which includes text conveying cross-references to related scripture passages.
     * 
     */
    CR,

    /**
     * A Bible (or selected Biblical text) laid out to provide readings for each day of the year.
     * 
     */
    DR,

    /**
     * A Bible (or selected Biblical text) containing devotional content together with the scripture.
     * 
     */
    DV,

    /**
     * A Bible (or selected Biblical text) containing family record pages and/or additional study material for family devotion.
     * 
     */
    FM,

    /**
     * A standard Bible (or selected Biblical text) of any version with no distinguishing characteristics beyond the canonical text.
     * 
     */
    GT,

    /**
     * A Bible (or selected Biblical text) designed for gift or presentation, often including a presentation page.
     * 
     */
    GF,

    /**
     * A large Bible (or selected Biblical text) with large print designed for use in reading scriptures in public worship from either the pulpit or lectern.
     * 
     */
    LP,

    /**
     * A Bible (or selected Biblical text) especially designed with helps and study guides oriented to the adult male.
     * 
     */
    MN,

    /**
     * A Bible (or selected Biblical text) designed for use in primary school.
     * 
     */
    PS,

    /**
     * Usually inexpensive but sturdy, a Bible (or selected Biblical text) designed for use in church pews.
     * 
     */
    PW,

    /**
     * A Bible (or selected Biblical text) including texts in Greek and/or Hebrew and designed for scholarly study.
     * 
     */
    SC,
    SL,

    /**
     * A Bible (or selected Biblical text) with study articles and helps especially for use in the classroom.
     * 
     */
    ST,

    /**
     * A Bible (or selected Biblical text) with many extra features, e.g. book introductions, dictionary, concordance, references, maps, etc., to help readers better understand the scripture.
     * 
     */
    SU,

    /**
     * A special gift Bible (or selected Biblical text) designed as a gift to the couple on their wedding day.
     * 
     */
    WG,

    /**
     * A devotional or study Bible (or selected Biblical text) with helps targeted at the adult woman.
     * 
     */
    WM,

    /**
     * A Bible (or selected Biblical text) containing special study and devotional helps designed specifically for the needs of teenagers.
     * 
     */
    YT;

    public String value() {
        return name();
    }

    public static List85 fromValue(String v) {
        return valueOf(v);
    }

}
