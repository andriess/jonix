//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.11 at 10:06:33 PM IST 
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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SequenceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ContributorRole"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}LanguageCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SequenceNumberWithinRole"/>
 *           &lt;sequence maxOccurs="unbounded">
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ContributorRole"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}LanguageCode" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;choice>
 *               &lt;sequence>
 *                 &lt;choice>
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonName"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonNameInverted" minOccurs="0"/>
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}TitlesBeforeNames" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}NamesBeforeKey" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PrefixToKey" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}KeyNames"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}NamesAfterKey" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SuffixToKey" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}LettersAfterNames" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}TitlesAfterNames" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Name" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonNameIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonNameInverted"/>
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}TitlesBeforeNames" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}NamesBeforeKey" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PrefixToKey" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}KeyNames"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}NamesAfterKey" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SuffixToKey" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}LettersAfterNames" minOccurs="0"/>
 *                       &lt;element ref="{http://www.editeur.org/onix/2.1/reference}TitlesAfterNames" minOccurs="0"/>
 *                     &lt;/sequence>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Name" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonNameIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}TitlesBeforeNames" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}NamesBeforeKey" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PrefixToKey" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}KeyNames"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}NamesAfterKey" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}SuffixToKey" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}LettersAfterNames" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}TitlesAfterNames" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Name" maxOccurs="unbounded" minOccurs="0"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonNameIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Name" maxOccurs="unbounded"/>
 *                     &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonNameIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonNameIdentifier" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/reference}PersonDate" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ProfessionalAffiliation" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;element ref="{http://www.editeur.org/onix/2.1/reference}CorporateName"/>
 *             &lt;/choice>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}BiographicalNote" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Website" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ProfessionalPosition" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}Affiliation" minOccurs="0"/>
 *             &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ContributorDescription" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}UnnamedPersons"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}CountryCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}RegionCode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/reference}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="Contributor" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="contributor" />
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
@XmlRootElement(name = "Contributor")
public class Contributor {

    @XmlElementRefs({
        @XmlElementRef(name = "SuffixToKey", namespace = "http://www.editeur.org/onix/2.1/reference", type = SuffixToKey.class, required = false),
        @XmlElementRef(name = "BiographicalNote", namespace = "http://www.editeur.org/onix/2.1/reference", type = BiographicalNote.class, required = false),
        @XmlElementRef(name = "Affiliation", namespace = "http://www.editeur.org/onix/2.1/reference", type = Affiliation.class, required = false),
        @XmlElementRef(name = "TitlesBeforeNames", namespace = "http://www.editeur.org/onix/2.1/reference", type = TitlesBeforeNames.class, required = false),
        @XmlElementRef(name = "Website", namespace = "http://www.editeur.org/onix/2.1/reference", type = Website.class, required = false),
        @XmlElementRef(name = "NamesBeforeKey", namespace = "http://www.editeur.org/onix/2.1/reference", type = NamesBeforeKey.class, required = false),
        @XmlElementRef(name = "RegionCode", namespace = "http://www.editeur.org/onix/2.1/reference", type = RegionCode.class, required = false),
        @XmlElementRef(name = "CorporateName", namespace = "http://www.editeur.org/onix/2.1/reference", type = CorporateName.class, required = false),
        @XmlElementRef(name = "SequenceNumberWithinRole", namespace = "http://www.editeur.org/onix/2.1/reference", type = SequenceNumberWithinRole.class, required = false),
        @XmlElementRef(name = "TitlesAfterNames", namespace = "http://www.editeur.org/onix/2.1/reference", type = TitlesAfterNames.class, required = false),
        @XmlElementRef(name = "PersonNameInverted", namespace = "http://www.editeur.org/onix/2.1/reference", type = PersonNameInverted.class, required = false),
        @XmlElementRef(name = "PrefixToKey", namespace = "http://www.editeur.org/onix/2.1/reference", type = PrefixToKey.class, required = false),
        @XmlElementRef(name = "Name", namespace = "http://www.editeur.org/onix/2.1/reference", type = Name.class, required = false),
        @XmlElementRef(name = "PersonNameIdentifier", namespace = "http://www.editeur.org/onix/2.1/reference", type = PersonNameIdentifier.class, required = false),
        @XmlElementRef(name = "NamesAfterKey", namespace = "http://www.editeur.org/onix/2.1/reference", type = NamesAfterKey.class, required = false),
        @XmlElementRef(name = "ContributorDescription", namespace = "http://www.editeur.org/onix/2.1/reference", type = ContributorDescription.class, required = false),
        @XmlElementRef(name = "CountryCode", namespace = "http://www.editeur.org/onix/2.1/reference", type = CountryCode.class, required = false),
        @XmlElementRef(name = "PersonDate", namespace = "http://www.editeur.org/onix/2.1/reference", type = PersonDate.class, required = false),
        @XmlElementRef(name = "LettersAfterNames", namespace = "http://www.editeur.org/onix/2.1/reference", type = LettersAfterNames.class, required = false),
        @XmlElementRef(name = "ProfessionalPosition", namespace = "http://www.editeur.org/onix/2.1/reference", type = ProfessionalPosition.class, required = false),
        @XmlElementRef(name = "ContributorRole", namespace = "http://www.editeur.org/onix/2.1/reference", type = ContributorRole.class, required = false),
        @XmlElementRef(name = "KeyNames", namespace = "http://www.editeur.org/onix/2.1/reference", type = KeyNames.class, required = false),
        @XmlElementRef(name = "ProfessionalAffiliation", namespace = "http://www.editeur.org/onix/2.1/reference", type = ProfessionalAffiliation.class, required = false),
        @XmlElementRef(name = "PersonName", namespace = "http://www.editeur.org/onix/2.1/reference", type = PersonName.class, required = false),
        @XmlElementRef(name = "LanguageCode", namespace = "http://www.editeur.org/onix/2.1/reference", type = LanguageCode.class, required = false),
        @XmlElementRef(name = "UnnamedPersons", namespace = "http://www.editeur.org/onix/2.1/reference", type = UnnamedPersons.class, required = false),
        @XmlElementRef(name = "SequenceNumber", namespace = "http://www.editeur.org/onix/2.1/reference", type = SequenceNumber.class, required = false)
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
     * The field name "PersonNameInverted" is used by two different parts of a schema. See: 
     * line 1100 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_reference.xsd
     * line 1085 of file:/C:/DEV/Projects/Jonix/onix_doc/v2.1/ONIX_BookProduct_Release2.1_reference.xsd
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
     * {@link SuffixToKey }
     * {@link BiographicalNote }
     * {@link Affiliation }
     * {@link TitlesBeforeNames }
     * {@link Website }
     * {@link NamesBeforeKey }
     * {@link RegionCode }
     * {@link CorporateName }
     * {@link SequenceNumberWithinRole }
     * {@link TitlesAfterNames }
     * {@link PersonNameInverted }
     * {@link PrefixToKey }
     * {@link Name }
     * {@link PersonNameIdentifier }
     * {@link NamesAfterKey }
     * {@link ContributorDescription }
     * {@link CountryCode }
     * {@link PersonDate }
     * {@link LettersAfterNames }
     * {@link ProfessionalPosition }
     * {@link ContributorRole }
     * {@link KeyNames }
     * {@link ProfessionalAffiliation }
     * {@link PersonName }
     * {@link UnnamedPersons }
     * {@link LanguageCode }
     * {@link SequenceNumber }
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
            return "Contributor";
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
            return "contributor";
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
