//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b367" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}f170" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}f123"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/short}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="ProductWebsite" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="productwebsite" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "b367",
    "f170",
    "f123"
})
@XmlRootElement(name = "productwebsite")
public class Productwebsite {

    protected B367 b367;
    protected F170 f170;
    @XmlElement(required = true)
    protected F123 f123;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String shortname;
    @XmlAttribute(name = "textformat")
    protected String textformat;
    @XmlAttribute(name = "textcase")
    protected String textcase;
    @XmlAttribute(name = "language")
    protected List74 language;
    @XmlAttribute(name = "transliteration")
    protected List138 transliteration;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    protected String sourcename;

    /**
     * Gets the value of the b367 property.
     * 
     * @return
     *     possible object is
     *     {@link B367 }
     *     
     */
    public B367 getB367() {
        return b367;
    }

    /**
     * Sets the value of the b367 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B367 }
     *     
     */
    public void setB367(B367 value) {
        this.b367 = value;
    }

    /**
     * Gets the value of the f170 property.
     * 
     * @return
     *     possible object is
     *     {@link F170 }
     *     
     */
    public F170 getF170() {
        return f170;
    }

    /**
     * Sets the value of the f170 property.
     * 
     * @param value
     *     allowed object is
     *     {@link F170 }
     *     
     */
    public void setF170(F170 value) {
        this.f170 = value;
    }

    /**
     * Gets the value of the f123 property.
     * 
     * @return
     *     possible object is
     *     {@link F123 }
     *     
     */
    public F123 getF123() {
        return f123;
    }

    /**
     * Sets the value of the f123 property.
     * 
     * @param value
     *     allowed object is
     *     {@link F123 }
     *     
     */
    public void setF123(F123 value) {
        this.f123 = value;
    }

    /**
     * Gets the value of the refname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefname() {
        if (refname == null) {
            return "ProductWebsite";
        } else {
            return refname;
        }
    }

    /**
     * Sets the value of the refname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefname(String value) {
        this.refname = value;
    }

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        if (shortname == null) {
            return "productwebsite";
        } else {
            return shortname;
        }
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the textformat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextformat() {
        if (textformat == null) {
            return "00";
        } else {
            return textformat;
        }
    }

    /**
     * Sets the value of the textformat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextformat(String value) {
        this.textformat = value;
    }

    /**
     * Gets the value of the textcase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextcase() {
        if (textcase == null) {
            return "00";
        } else {
            return textcase;
        }
    }

    /**
     * Sets the value of the textcase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextcase(String value) {
        this.textcase = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link List74 }
     *     
     */
    public List74 getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link List74 }
     *     
     */
    public void setLanguage(List74 value) {
        this.language = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link List138 }
     *     
     */
    public List138 getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link List138 }
     *     
     */
    public void setTransliteration(List138 value) {
        this.transliteration = value;
    }

    /**
     * Gets the value of the datestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestamp() {
        return datestamp;
    }

    /**
     * Sets the value of the datestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestamp(String value) {
        this.datestamp = value;
    }

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcetype() {
        if (sourcetype == null) {
            return "00";
        } else {
            return sourcetype;
        }
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcetype(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the sourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcename() {
        return sourcename;
    }

    /**
     * Sets the value of the sourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcename(String value) {
        this.sourcename = value;
    }

}
