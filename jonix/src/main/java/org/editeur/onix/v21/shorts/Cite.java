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
import javax.xml.bind.annotation.XmlID;
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
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="dir">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ltr"/>
 *             &lt;enumeration value="rtl"/>
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
    "content"
})
@XmlRootElement(name = "cite")
public class Cite {

    @XmlElementRefs({
        @XmlElementRef(name = "bdo", namespace = "http://www.editeur.org/onix/2.1/short", type = Bdo.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.editeur.org/onix/2.1/short", type = Strong.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.editeur.org/onix/2.1/short", type = org.editeur.onix.v21.shorts.Object.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.editeur.org/onix/2.1/short", type = A.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.editeur.org/onix/2.1/short", type = Cite.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.editeur.org/onix/2.1/short", type = Span.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.editeur.org/onix/2.1/short", type = Small.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.editeur.org/onix/2.1/short", type = B.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.editeur.org/onix/2.1/short", type = Img.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.editeur.org/onix/2.1/short", type = Br.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.editeur.org/onix/2.1/short", type = I.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.editeur.org/onix/2.1/short", type = Q.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.editeur.org/onix/2.1/short", type = Samp.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.editeur.org/onix/2.1/short", type = Var.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.editeur.org/onix/2.1/short", type = Acronym.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.editeur.org/onix/2.1/short", type = Big.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.editeur.org/onix/2.1/short", type = Dfn.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.editeur.org/onix/2.1/short", type = Map.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.editeur.org/onix/2.1/short", type = Em.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.editeur.org/onix/2.1/short", type = Code.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.editeur.org/onix/2.1/short", type = Abbr.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.editeur.org/onix/2.1/short", type = Sup.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.editeur.org/onix/2.1/short", type = Tt.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.editeur.org/onix/2.1/short", type = Sub.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.editeur.org/onix/2.1/short", type = Kbd.class, required = false)
    })
    @XmlMixed
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;

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
     * {@link Bdo }
     * {@link Strong }
     * {@link org.editeur.onix.v21.shorts.Object }
     * {@link A }
     * {@link Cite }
     * {@link String }
     * {@link Span }
     * {@link Small }
     * {@link B }
     * {@link Img }
     * {@link Br }
     * {@link I }
     * {@link Q }
     * {@link Samp }
     * {@link Var }
     * {@link Acronym }
     * {@link Big }
     * {@link Dfn }
     * {@link Map }
     * {@link Em }
     * {@link Code }
     * {@link Abbr }
     * {@link Sup }
     * {@link Tt }
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

}
