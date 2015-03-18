//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:39 AM IST 
//


package org.editeur.onix.v30.references;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ConferenceRole" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ConferenceName"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ConferenceAcronym" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ConferenceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ConferenceTheme" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ConferenceDate" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ConferencePlace" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ConferenceSponsor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Website" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/reference}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Conference"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="conference"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "conferenceRole",
    "conferenceName",
    "conferenceAcronym",
    "conferenceNumber",
    "conferenceTheme",
    "conferenceDate",
    "conferencePlace",
    "conferenceSponsor",
    "website"
})
@XmlRootElement(name = "Conference")
public class Conference {

    @XmlElement(name = "ConferenceRole")
    protected ConferenceRole conferenceRole;
    @XmlElement(name = "ConferenceName", required = true)
    protected ConferenceName conferenceName;
    @XmlElement(name = "ConferenceAcronym")
    protected ConferenceAcronym conferenceAcronym;
    @XmlElement(name = "ConferenceNumber")
    protected ConferenceNumber conferenceNumber;
    @XmlElement(name = "ConferenceTheme")
    protected ConferenceTheme conferenceTheme;
    @XmlElement(name = "ConferenceDate")
    protected ConferenceDate conferenceDate;
    @XmlElement(name = "ConferencePlace")
    protected ConferencePlace conferencePlace;
    @XmlElement(name = "ConferenceSponsor")
    protected List<ConferenceSponsor> conferenceSponsor;
    @XmlElement(name = "Website")
    protected List<Website> website;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shortname;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourcename;

    /**
     * Gets the value of the conferenceRole property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceRole }
     *     
     */
    public ConferenceRole getConferenceRole() {
        return conferenceRole;
    }

    /**
     * Sets the value of the conferenceRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceRole }
     *     
     */
    public void setConferenceRole(ConferenceRole value) {
        this.conferenceRole = value;
    }

    /**
     * Gets the value of the conferenceName property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceName }
     *     
     */
    public ConferenceName getConferenceName() {
        return conferenceName;
    }

    /**
     * Sets the value of the conferenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceName }
     *     
     */
    public void setConferenceName(ConferenceName value) {
        this.conferenceName = value;
    }

    /**
     * Gets the value of the conferenceAcronym property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceAcronym }
     *     
     */
    public ConferenceAcronym getConferenceAcronym() {
        return conferenceAcronym;
    }

    /**
     * Sets the value of the conferenceAcronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceAcronym }
     *     
     */
    public void setConferenceAcronym(ConferenceAcronym value) {
        this.conferenceAcronym = value;
    }

    /**
     * Gets the value of the conferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceNumber }
     *     
     */
    public ConferenceNumber getConferenceNumber() {
        return conferenceNumber;
    }

    /**
     * Sets the value of the conferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceNumber }
     *     
     */
    public void setConferenceNumber(ConferenceNumber value) {
        this.conferenceNumber = value;
    }

    /**
     * Gets the value of the conferenceTheme property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceTheme }
     *     
     */
    public ConferenceTheme getConferenceTheme() {
        return conferenceTheme;
    }

    /**
     * Sets the value of the conferenceTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceTheme }
     *     
     */
    public void setConferenceTheme(ConferenceTheme value) {
        this.conferenceTheme = value;
    }

    /**
     * Gets the value of the conferenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceDate }
     *     
     */
    public ConferenceDate getConferenceDate() {
        return conferenceDate;
    }

    /**
     * Sets the value of the conferenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceDate }
     *     
     */
    public void setConferenceDate(ConferenceDate value) {
        this.conferenceDate = value;
    }

    /**
     * Gets the value of the conferencePlace property.
     * 
     * @return
     *     possible object is
     *     {@link ConferencePlace }
     *     
     */
    public ConferencePlace getConferencePlace() {
        return conferencePlace;
    }

    /**
     * Sets the value of the conferencePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferencePlace }
     *     
     */
    public void setConferencePlace(ConferencePlace value) {
        this.conferencePlace = value;
    }

    /**
     * Gets the value of the conferenceSponsor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conferenceSponsor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConferenceSponsor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConferenceSponsor }
     * 
     * 
     */
    public List<ConferenceSponsor> getConferenceSponsor() {
        if (conferenceSponsor == null) {
            conferenceSponsor = new ArrayList<ConferenceSponsor>();
        }
        return this.conferenceSponsor;
    }

    /**
     * Gets the value of the website property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the website property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebsite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Website }
     * 
     * 
     */
    public List<Website> getWebsite() {
        if (website == null) {
            website = new ArrayList<Website>();
        }
        return this.website;
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
        return refname;
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
        return shortname;
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
        return sourcetype;
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
