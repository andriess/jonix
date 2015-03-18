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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x426"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x427" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}d104" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}d107" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}b374" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}x428" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/short}contentdate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/short}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="TextContent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="textcontent"/>
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
    "x426",
    "x427",
    "d104",
    "d107",
    "b374",
    "x428",
    "contentdate"
})
@XmlRootElement(name = "textcontent")
public class Textcontent {

    @XmlElement(required = true)
    protected X426 x426;
    @XmlElement(required = true)
    protected List<X427> x427;
    @XmlElement(required = true)
    protected List<D104> d104;
    protected List<D107> d107;
    protected B374 b374;
    protected X428 x428;
    protected List<Contentdate> contentdate;
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
     * Gets the value of the x426 property.
     * 
     * @return
     *     possible object is
     *     {@link X426 }
     *     
     */
    public X426 getX426() {
        return x426;
    }

    /**
     * Sets the value of the x426 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X426 }
     *     
     */
    public void setX426(X426 value) {
        this.x426 = value;
    }

    /**
     * Gets the value of the x427 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the x427 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getX427().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link X427 }
     * 
     * 
     */
    public List<X427> getX427() {
        if (x427 == null) {
            x427 = new ArrayList<X427>();
        }
        return this.x427;
    }

    /**
     * Gets the value of the d104 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d104 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD104().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D104 }
     * 
     * 
     */
    public List<D104> getD104() {
        if (d104 == null) {
            d104 = new ArrayList<D104>();
        }
        return this.d104;
    }

    /**
     * Gets the value of the d107 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the d107 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getD107().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link D107 }
     * 
     * 
     */
    public List<D107> getD107() {
        if (d107 == null) {
            d107 = new ArrayList<D107>();
        }
        return this.d107;
    }

    /**
     * Gets the value of the b374 property.
     * 
     * @return
     *     possible object is
     *     {@link B374 }
     *     
     */
    public B374 getB374() {
        return b374;
    }

    /**
     * Sets the value of the b374 property.
     * 
     * @param value
     *     allowed object is
     *     {@link B374 }
     *     
     */
    public void setB374(B374 value) {
        this.b374 = value;
    }

    /**
     * Gets the value of the x428 property.
     * 
     * @return
     *     possible object is
     *     {@link X428 }
     *     
     */
    public X428 getX428() {
        return x428;
    }

    /**
     * Sets the value of the x428 property.
     * 
     * @param value
     *     allowed object is
     *     {@link X428 }
     *     
     */
    public void setX428(X428 value) {
        this.x428 = value;
    }

    /**
     * Gets the value of the contentdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contentdate }
     * 
     * 
     */
    public List<Contentdate> getContentdate() {
        if (contentdate == null) {
            contentdate = new ArrayList<Contentdate>();
        }
        return this.contentdate;
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
