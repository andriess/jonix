//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:45 AM IST 
//


package org.editeur.onix.v30.shorts;

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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}supplier"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}supplierowncoding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}returnsconditions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}j396"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}supplydate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}j144" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}newsupplier" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}stock" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}j145" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}j192"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/short}price" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}reissue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/short}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SupplyDetail"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="supplydetail"/>
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
    "supplier",
    "supplierowncoding",
    "returnsconditions",
    "j396",
    "supplydate",
    "j144",
    "newsupplier",
    "stock",
    "j145",
    "j192",
    "price",
    "reissue"
})
@XmlRootElement(name = "supplydetail")
public class Supplydetail {

    @XmlElement(required = true)
    protected Supplier supplier;
    protected List<Supplierowncoding> supplierowncoding;
    protected List<Returnsconditions> returnsconditions;
    @XmlElement(required = true)
    protected J396 j396;
    protected List<Supplydate> supplydate;
    protected J144 j144;
    protected Newsupplier newsupplier;
    protected List<Stock> stock;
    protected J145 j145;
    protected J192 j192;
    protected List<Price> price;
    protected Reissue reissue;
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
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the supplierowncoding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierowncoding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierowncoding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplierowncoding }
     * 
     * 
     */
    public List<Supplierowncoding> getSupplierowncoding() {
        if (supplierowncoding == null) {
            supplierowncoding = new ArrayList<Supplierowncoding>();
        }
        return this.supplierowncoding;
    }

    /**
     * Gets the value of the returnsconditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnsconditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnsconditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Returnsconditions }
     * 
     * 
     */
    public List<Returnsconditions> getReturnsconditions() {
        if (returnsconditions == null) {
            returnsconditions = new ArrayList<Returnsconditions>();
        }
        return this.returnsconditions;
    }

    /**
     * Gets the value of the j396 property.
     * 
     * @return
     *     possible object is
     *     {@link J396 }
     *     
     */
    public J396 getJ396() {
        return j396;
    }

    /**
     * Sets the value of the j396 property.
     * 
     * @param value
     *     allowed object is
     *     {@link J396 }
     *     
     */
    public void setJ396(J396 value) {
        this.j396 = value;
    }

    /**
     * Gets the value of the supplydate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplydate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplydate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Supplydate }
     * 
     * 
     */
    public List<Supplydate> getSupplydate() {
        if (supplydate == null) {
            supplydate = new ArrayList<Supplydate>();
        }
        return this.supplydate;
    }

    /**
     * Gets the value of the j144 property.
     * 
     * @return
     *     possible object is
     *     {@link J144 }
     *     
     */
    public J144 getJ144() {
        return j144;
    }

    /**
     * Sets the value of the j144 property.
     * 
     * @param value
     *     allowed object is
     *     {@link J144 }
     *     
     */
    public void setJ144(J144 value) {
        this.j144 = value;
    }

    /**
     * Gets the value of the newsupplier property.
     * 
     * @return
     *     possible object is
     *     {@link Newsupplier }
     *     
     */
    public Newsupplier getNewsupplier() {
        return newsupplier;
    }

    /**
     * Sets the value of the newsupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Newsupplier }
     *     
     */
    public void setNewsupplier(Newsupplier value) {
        this.newsupplier = value;
    }

    /**
     * Gets the value of the stock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stock }
     * 
     * 
     */
    public List<Stock> getStock() {
        if (stock == null) {
            stock = new ArrayList<Stock>();
        }
        return this.stock;
    }

    /**
     * Gets the value of the j145 property.
     * 
     * @return
     *     possible object is
     *     {@link J145 }
     *     
     */
    public J145 getJ145() {
        return j145;
    }

    /**
     * Sets the value of the j145 property.
     * 
     * @param value
     *     allowed object is
     *     {@link J145 }
     *     
     */
    public void setJ145(J145 value) {
        this.j145 = value;
    }

    /**
     * Gets the value of the j192 property.
     * 
     * @return
     *     possible object is
     *     {@link J192 }
     *     
     */
    public J192 getJ192() {
        return j192;
    }

    /**
     * Sets the value of the j192 property.
     * 
     * @param value
     *     allowed object is
     *     {@link J192 }
     *     
     */
    public void setJ192(J192 value) {
        this.j192 = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Price }
     * 
     * 
     */
    public List<Price> getPrice() {
        if (price == null) {
            price = new ArrayList<Price>();
        }
        return this.price;
    }

    /**
     * Gets the value of the reissue property.
     * 
     * @return
     *     possible object is
     *     {@link Reissue }
     *     
     */
    public Reissue getReissue() {
        return reissue;
    }

    /**
     * Sets the value of the reissue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reissue }
     *     
     */
    public void setReissue(Reissue value) {
        this.reissue = value;
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
