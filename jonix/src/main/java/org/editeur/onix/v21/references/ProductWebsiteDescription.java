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
import javax.xml.bind.annotation.XmlMixed;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}p"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h1"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h2"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h3"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h4"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h5"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h6"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}div"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ul"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ol"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}dl"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}pre"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}hr"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}blockquote"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}address"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}table"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}a"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}br"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}span"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}bdo"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}object"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}img"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}map"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}tt"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}i"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}b"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}big"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}small"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}em"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}strong"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}dfn"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}code"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}q"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}sub"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}sup"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}samp"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}kbd"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}var"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}cite"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}abbr"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}acronym"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/reference}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="ProductWebsiteDescription" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="f170" />
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
@XmlRootElement(name = "ProductWebsiteDescription")
public class ProductWebsiteDescription {

    @XmlElementRefs({
        @XmlElementRef(name = "span", namespace = "http://www.editeur.org/onix/2.1/reference", type = Span.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.editeur.org/onix/2.1/reference", type = org.editeur.onix.v21.references.Object.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.editeur.org/onix/2.1/reference", type = B.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.editeur.org/onix/2.1/reference", type = Br.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.editeur.org/onix/2.1/reference", type = Sup.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.editeur.org/onix/2.1/reference", type = Small.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.editeur.org/onix/2.1/reference", type = Sub.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.editeur.org/onix/2.1/reference", type = Big.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.editeur.org/onix/2.1/reference", type = Cite.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.editeur.org/onix/2.1/reference", type = Em.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.editeur.org/onix/2.1/reference", type = Dfn.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.editeur.org/onix/2.1/reference", type = H1 .class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.editeur.org/onix/2.1/reference", type = Samp.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.editeur.org/onix/2.1/reference", type = Strong.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.editeur.org/onix/2.1/reference", type = P.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.editeur.org/onix/2.1/reference", type = Code.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.editeur.org/onix/2.1/reference", type = A.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.editeur.org/onix/2.1/reference", type = I.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.editeur.org/onix/2.1/reference", type = Map.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.editeur.org/onix/2.1/reference", type = Table.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.editeur.org/onix/2.1/reference", type = Bdo.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.editeur.org/onix/2.1/reference", type = Abbr.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.editeur.org/onix/2.1/reference", type = H5 .class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.editeur.org/onix/2.1/reference", type = Hr.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.editeur.org/onix/2.1/reference", type = Pre.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.editeur.org/onix/2.1/reference", type = Ol.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.editeur.org/onix/2.1/reference", type = Blockquote.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.editeur.org/onix/2.1/reference", type = Acronym.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.editeur.org/onix/2.1/reference", type = Var.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.editeur.org/onix/2.1/reference", type = Ul.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.editeur.org/onix/2.1/reference", type = Img.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.editeur.org/onix/2.1/reference", type = Kbd.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.editeur.org/onix/2.1/reference", type = Dl.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.editeur.org/onix/2.1/reference", type = Tt.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.editeur.org/onix/2.1/reference", type = Address.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.editeur.org/onix/2.1/reference", type = H2 .class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.editeur.org/onix/2.1/reference", type = Q.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.editeur.org/onix/2.1/reference", type = Div.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.editeur.org/onix/2.1/reference", type = H6 .class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.editeur.org/onix/2.1/reference", type = H4 .class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.editeur.org/onix/2.1/reference", type = H3 .class, required = false)
    })
    @XmlMixed
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
     * {@link org.editeur.onix.v21.references.Object }
     * {@link Span }
     * {@link B }
     * {@link Br }
     * {@link Sup }
     * {@link Small }
     * {@link Sub }
     * {@link Big }
     * {@link Cite }
     * {@link Em }
     * {@link H1 }
     * {@link Dfn }
     * {@link Samp }
     * {@link P }
     * {@link Strong }
     * {@link Code }
     * {@link A }
     * {@link I }
     * {@link Map }
     * {@link Bdo }
     * {@link Table }
     * {@link H5 }
     * {@link Abbr }
     * {@link Pre }
     * {@link Hr }
     * {@link Blockquote }
     * {@link Ol }
     * {@link Acronym }
     * {@link Var }
     * {@link String }
     * {@link Ul }
     * {@link Img }
     * {@link Kbd }
     * {@link Tt }
     * {@link Dl }
     * {@link Address }
     * {@link H2 }
     * {@link Div }
     * {@link Q }
     * {@link H6 }
     * {@link H4 }
     * {@link H3 }
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
            return "ProductWebsiteDescription";
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
            return "f170";
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
