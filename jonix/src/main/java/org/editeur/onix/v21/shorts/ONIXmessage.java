//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:39 PM IST 
//


package org.editeur.onix.v21.shorts;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;choice>
 *               &lt;sequence>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}m172"/>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}m173" minOccurs="0"/>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}senderidentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}m174" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;sequence>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}m173"/>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}senderidentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}m174" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;sequence>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}senderidentifier" maxOccurs="unbounded"/>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/short}m174" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/short}m174"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m175" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m283" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m176" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m177" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}addresseeidentifier" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m178" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m179" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m180" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m181" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m182"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m183" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m184" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m185" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m186" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m187" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m188" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/short}m193" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}header"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}product"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}mainseriesrecord"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/short}subseriesrecord"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/short}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="ONIXMessage" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="ONIXmessage" />
 *       &lt;attribute name="release" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "ONIXmessage")
public class ONIXmessage {

    @XmlElementRefs({
        @XmlElementRef(name = "m186", namespace = "http://www.editeur.org/onix/2.1/short", type = M186 .class, required = false),
        @XmlElementRef(name = "m181", namespace = "http://www.editeur.org/onix/2.1/short", type = M181 .class, required = false),
        @XmlElementRef(name = "header", namespace = "http://www.editeur.org/onix/2.1/short", type = Header.class, required = false),
        @XmlElementRef(name = "product", namespace = "http://www.editeur.org/onix/2.1/short", type = Product.class, required = false),
        @XmlElementRef(name = "m193", namespace = "http://www.editeur.org/onix/2.1/short", type = M193 .class, required = false),
        @XmlElementRef(name = "subseriesrecord", namespace = "http://www.editeur.org/onix/2.1/short", type = Subseriesrecord.class, required = false),
        @XmlElementRef(name = "m173", namespace = "http://www.editeur.org/onix/2.1/short", type = M173 .class, required = false),
        @XmlElementRef(name = "m183", namespace = "http://www.editeur.org/onix/2.1/short", type = M183 .class, required = false),
        @XmlElementRef(name = "m176", namespace = "http://www.editeur.org/onix/2.1/short", type = M176 .class, required = false),
        @XmlElementRef(name = "m175", namespace = "http://www.editeur.org/onix/2.1/short", type = M175 .class, required = false),
        @XmlElementRef(name = "m174", namespace = "http://www.editeur.org/onix/2.1/short", type = M174 .class, required = false),
        @XmlElementRef(name = "m178", namespace = "http://www.editeur.org/onix/2.1/short", type = M178 .class, required = false),
        @XmlElementRef(name = "m283", namespace = "http://www.editeur.org/onix/2.1/short", type = M283 .class, required = false),
        @XmlElementRef(name = "m180", namespace = "http://www.editeur.org/onix/2.1/short", type = M180 .class, required = false),
        @XmlElementRef(name = "senderidentifier", namespace = "http://www.editeur.org/onix/2.1/short", type = Senderidentifier.class, required = false),
        @XmlElementRef(name = "m187", namespace = "http://www.editeur.org/onix/2.1/short", type = M187 .class, required = false),
        @XmlElementRef(name = "addresseeidentifier", namespace = "http://www.editeur.org/onix/2.1/short", type = Addresseeidentifier.class, required = false),
        @XmlElementRef(name = "m182", namespace = "http://www.editeur.org/onix/2.1/short", type = M182 .class, required = false),
        @XmlElementRef(name = "m172", namespace = "http://www.editeur.org/onix/2.1/short", type = M172 .class, required = false),
        @XmlElementRef(name = "m185", namespace = "http://www.editeur.org/onix/2.1/short", type = M185 .class, required = false),
        @XmlElementRef(name = "m184", namespace = "http://www.editeur.org/onix/2.1/short", type = M184 .class, required = false),
        @XmlElementRef(name = "m188", namespace = "http://www.editeur.org/onix/2.1/short", type = M188 .class, required = false),
        @XmlElementRef(name = "mainseriesrecord", namespace = "http://www.editeur.org/onix/2.1/short", type = Mainseriesrecord.class, required = false),
        @XmlElementRef(name = "m179", namespace = "http://www.editeur.org/onix/2.1/short", type = M179 .class, required = false),
        @XmlElementRef(name = "m177", namespace = "http://www.editeur.org/onix/2.1/short", type = M177 .class, required = false)
    })
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String shortname;
    @XmlAttribute(name = "release")
    protected String release;
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
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "M173" is used by two different parts of a schema. See: 
     * line 102 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_short.xsd
     * line 97 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_short.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link M186 }
     * {@link M181 }
     * {@link Header }
     * {@link Product }
     * {@link M193 }
     * {@link Subseriesrecord }
     * {@link M173 }
     * {@link M183 }
     * {@link M176 }
     * {@link M175 }
     * {@link M174 }
     * {@link M178 }
     * {@link M283 }
     * {@link M180 }
     * {@link Senderidentifier }
     * {@link M187 }
     * {@link Addresseeidentifier }
     * {@link M182 }
     * {@link M172 }
     * {@link M185 }
     * {@link M184 }
     * {@link M188 }
     * {@link Mainseriesrecord }
     * {@link M179 }
     * {@link M177 }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
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
            return "ONIXMessage";
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
            return "ONIXmessage";
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
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        if (release == null) {
            return "2.1";
        } else {
            return release;
        }
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
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
