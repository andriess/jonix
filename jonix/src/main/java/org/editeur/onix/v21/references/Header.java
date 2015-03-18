//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:12 AM IST 
//


package org.editeur.onix.v21.references;

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
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromEANNumber"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromSAN" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SenderIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromCompany" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromSAN"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SenderIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromCompany" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SenderIdentifier" maxOccurs="unbounded"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromCompany" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromCompany"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromPerson" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}FromEmail" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ToEANNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ToSAN" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}AddresseeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ToCompany" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ToPerson" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}MessageNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}MessageRepeat" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SentDate"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}MessageNote" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}DefaultLanguageOfText" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}DefaultPriceTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}DefaultCurrencyCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}DefaultLinearUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}DefaultWeightUnit" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}DefaultClassOfTrade" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/reference}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="Header" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="header" />
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
@XmlRootElement(name = "Header")
public class Header {

    @XmlElementRefs({
        @XmlElementRef(name = "DefaultLanguageOfText", namespace = "http://www.editeur.org/onix/2.1/reference", type = DefaultLanguageOfText.class, required = false),
        @XmlElementRef(name = "SentDate", namespace = "http://www.editeur.org/onix/2.1/reference", type = SentDate.class, required = false),
        @XmlElementRef(name = "FromCompany", namespace = "http://www.editeur.org/onix/2.1/reference", type = FromCompany.class, required = false),
        @XmlElementRef(name = "MessageRepeat", namespace = "http://www.editeur.org/onix/2.1/reference", type = MessageRepeat.class, required = false),
        @XmlElementRef(name = "MessageNumber", namespace = "http://www.editeur.org/onix/2.1/reference", type = MessageNumber.class, required = false),
        @XmlElementRef(name = "ToPerson", namespace = "http://www.editeur.org/onix/2.1/reference", type = ToPerson.class, required = false),
        @XmlElementRef(name = "FromSAN", namespace = "http://www.editeur.org/onix/2.1/reference", type = FromSAN.class, required = false),
        @XmlElementRef(name = "DefaultCurrencyCode", namespace = "http://www.editeur.org/onix/2.1/reference", type = DefaultCurrencyCode.class, required = false),
        @XmlElementRef(name = "ToSAN", namespace = "http://www.editeur.org/onix/2.1/reference", type = ToSAN.class, required = false),
        @XmlElementRef(name = "DefaultWeightUnit", namespace = "http://www.editeur.org/onix/2.1/reference", type = DefaultWeightUnit.class, required = false),
        @XmlElementRef(name = "DefaultPriceTypeCode", namespace = "http://www.editeur.org/onix/2.1/reference", type = DefaultPriceTypeCode.class, required = false),
        @XmlElementRef(name = "DefaultLinearUnit", namespace = "http://www.editeur.org/onix/2.1/reference", type = DefaultLinearUnit.class, required = false),
        @XmlElementRef(name = "MessageNote", namespace = "http://www.editeur.org/onix/2.1/reference", type = MessageNote.class, required = false),
        @XmlElementRef(name = "ToCompany", namespace = "http://www.editeur.org/onix/2.1/reference", type = ToCompany.class, required = false),
        @XmlElementRef(name = "SenderIdentifier", namespace = "http://www.editeur.org/onix/2.1/reference", type = SenderIdentifier.class, required = false),
        @XmlElementRef(name = "DefaultClassOfTrade", namespace = "http://www.editeur.org/onix/2.1/reference", type = DefaultClassOfTrade.class, required = false),
        @XmlElementRef(name = "FromEmail", namespace = "http://www.editeur.org/onix/2.1/reference", type = FromEmail.class, required = false),
        @XmlElementRef(name = "ToEANNumber", namespace = "http://www.editeur.org/onix/2.1/reference", type = ToEANNumber.class, required = false),
        @XmlElementRef(name = "FromPerson", namespace = "http://www.editeur.org/onix/2.1/reference", type = FromPerson.class, required = false),
        @XmlElementRef(name = "FromEANNumber", namespace = "http://www.editeur.org/onix/2.1/reference", type = FromEANNumber.class, required = false),
        @XmlElementRef(name = "AddresseeIdentifier", namespace = "http://www.editeur.org/onix/2.1/reference", type = AddresseeIdentifier.class, required = false)
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
    @XmlAttribute(name = "textformat")
    protected String textformat;
    @XmlAttribute(name = "textcase")
    protected String textcase;
    @XmlAttribute(name = "language")
    protected List74 language;
    @XmlAttribute(name = "textscript")
    protected List121 textscript;
    @XmlAttribute(name = "collationkey")
    protected String collationkey;
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
     * The field name "FromSAN" is used by two different parts of a schema. See: 
     * line 2205 of file:/C:/DEV/projects/jonix/doc/Onix2.1.4/schema/ONIX_BookProduct_Release2.1_reference.xsd
     * line 2200 of file:/C:/DEV/projects/jonix/doc/Onix2.1.4/schema/ONIX_BookProduct_Release2.1_reference.xsd
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
     * {@link FromCompany }
     * {@link SentDate }
     * {@link DefaultLanguageOfText }
     * {@link MessageNumber }
     * {@link MessageRepeat }
     * {@link ToPerson }
     * {@link FromSAN }
     * {@link ToSAN }
     * {@link DefaultCurrencyCode }
     * {@link DefaultPriceTypeCode }
     * {@link DefaultWeightUnit }
     * {@link MessageNote }
     * {@link DefaultLinearUnit }
     * {@link ToCompany }
     * {@link SenderIdentifier }
     * {@link DefaultClassOfTrade }
     * {@link FromEmail }
     * {@link ToEANNumber }
     * {@link FromPerson }
     * {@link AddresseeIdentifier }
     * {@link FromEANNumber }
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
            return "Header";
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
            return "header";
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
     * Gets the value of the textscript property.
     * 
     * @return
     *     possible object is
     *     {@link List121 }
     *     
     */
    public List121 getTextscript() {
        return textscript;
    }

    /**
     * Sets the value of the textscript property.
     * 
     * @param value
     *     allowed object is
     *     {@link List121 }
     *     
     */
    public void setTextscript(List121 value) {
        this.textscript = value;
    }

    /**
     * Gets the value of the collationkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollationkey() {
        return collationkey;
    }

    /**
     * Sets the value of the collationkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollationkey(String value) {
        this.collationkey = value;
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
