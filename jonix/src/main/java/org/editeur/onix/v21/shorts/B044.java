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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}p"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}h1"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}h2"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}h3"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}h4"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}h5"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}h6"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}div"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}ul"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}ol"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}dl"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}pre"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}hr"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}blockquote"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}address"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}table"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}a"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}br"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}span"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}bdo"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}object"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}img"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}map"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}tt"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}i"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}b"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}big"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}small"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}em"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}strong"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}dfn"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}code"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}q"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}sub"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}sup"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}samp"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}kbd"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}var"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}cite"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}abbr"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}acronym"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.editeur.org/onix/2.1/short}generalAttributes"/>
 *       &lt;attribute name="refname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="BiographicalNote" />
 *       &lt;attribute name="shortname" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="b044" />
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
@XmlRootElement(name = "b044")
public class B044 {

    @XmlElementRefs({
        @XmlElementRef(name = "h2", namespace = "http://www.editeur.org/onix/2.1/short", type = H2 .class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.editeur.org/onix/2.1/short", type = Ol.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.editeur.org/onix/2.1/short", type = Bdo.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.editeur.org/onix/2.1/short", type = Strong.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.editeur.org/onix/2.1/short", type = A.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.editeur.org/onix/2.1/short", type = org.editeur.onix.v21.shorts.Object.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.editeur.org/onix/2.1/short", type = Cite.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.editeur.org/onix/2.1/short", type = H6 .class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.editeur.org/onix/2.1/short", type = P.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.editeur.org/onix/2.1/short", type = Hr.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.editeur.org/onix/2.1/short", type = Blockquote.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.editeur.org/onix/2.1/short", type = Span.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.editeur.org/onix/2.1/short", type = Small.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.editeur.org/onix/2.1/short", type = Dl.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.editeur.org/onix/2.1/short", type = B.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.editeur.org/onix/2.1/short", type = H5 .class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.editeur.org/onix/2.1/short", type = Img.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.editeur.org/onix/2.1/short", type = Br.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.editeur.org/onix/2.1/short", type = Pre.class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.editeur.org/onix/2.1/short", type = H3 .class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.editeur.org/onix/2.1/short", type = Samp.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.editeur.org/onix/2.1/short", type = Q.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.editeur.org/onix/2.1/short", type = I.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.editeur.org/onix/2.1/short", type = Div.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.editeur.org/onix/2.1/short", type = Address.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.editeur.org/onix/2.1/short", type = Var.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.editeur.org/onix/2.1/short", type = H4 .class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.editeur.org/onix/2.1/short", type = Acronym.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.editeur.org/onix/2.1/short", type = Dfn.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.editeur.org/onix/2.1/short", type = Big.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.editeur.org/onix/2.1/short", type = Ul.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.editeur.org/onix/2.1/short", type = H1 .class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.editeur.org/onix/2.1/short", type = Map.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.editeur.org/onix/2.1/short", type = Em.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.editeur.org/onix/2.1/short", type = Code.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.editeur.org/onix/2.1/short", type = Abbr.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.editeur.org/onix/2.1/short", type = Sup.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.editeur.org/onix/2.1/short", type = Table.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.editeur.org/onix/2.1/short", type = Tt.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.editeur.org/onix/2.1/short", type = Sub.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.editeur.org/onix/2.1/short", type = Kbd.class, required = false)
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
     * {@link H2 }
     * {@link Bdo }
     * {@link Ol }
     * {@link Strong }
     * {@link org.editeur.onix.v21.shorts.Object }
     * {@link A }
     * {@link H6 }
     * {@link Cite }
     * {@link P }
     * {@link Hr }
     * {@link String }
     * {@link Blockquote }
     * {@link Span }
     * {@link Small }
     * {@link Dl }
     * {@link H5 }
     * {@link B }
     * {@link Img }
     * {@link Br }
     * {@link Pre }
     * {@link H3 }
     * {@link I }
     * {@link Q }
     * {@link Samp }
     * {@link Address }
     * {@link Div }
     * {@link H4 }
     * {@link Var }
     * {@link Acronym }
     * {@link Big }
     * {@link Dfn }
     * {@link Ul }
     * {@link H1 }
     * {@link Map }
     * {@link Em }
     * {@link Code }
     * {@link Abbr }
     * {@link Sup }
     * {@link Tt }
     * {@link Table }
     * {@link Sub }
     * {@link Kbd }
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
            return "BiographicalNote";
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
            return "b044";
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
