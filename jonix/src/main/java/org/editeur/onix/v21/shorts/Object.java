//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:20 AM IST 
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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}param"/>
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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/short}ruby"/>
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
 *       &lt;attribute name="declare">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="declare"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="classid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codebase" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codetype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="archive" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="standby" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usemap" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="tabindex" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "object")
public class Object {

    @XmlElementRefs({
        @XmlElementRef(name = "p", namespace = "http://www.editeur.org/onix/2.1/short", type = P.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.editeur.org/onix/2.1/short", type = Hr.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.editeur.org/onix/2.1/short", type = Ol.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.editeur.org/onix/2.1/short", type = Samp.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.editeur.org/onix/2.1/short", type = Tt.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.editeur.org/onix/2.1/short", type = Address.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.editeur.org/onix/2.1/short", type = A.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.editeur.org/onix/2.1/short", type = Span.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.editeur.org/onix/2.1/short", type = Map.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.editeur.org/onix/2.1/short", type = Q.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.editeur.org/onix/2.1/short", type = Var.class, required = false),
        @XmlElementRef(name = "ruby", namespace = "http://www.editeur.org/onix/2.1/short", type = Ruby.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.editeur.org/onix/2.1/short", type = Cite.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.editeur.org/onix/2.1/short", type = Code.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.editeur.org/onix/2.1/short", type = Blockquote.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.editeur.org/onix/2.1/short", type = Big.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.editeur.org/onix/2.1/short", type = Strong.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.editeur.org/onix/2.1/short", type = Bdo.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.editeur.org/onix/2.1/short", type = Kbd.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.editeur.org/onix/2.1/short", type = H1 .class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.editeur.org/onix/2.1/short", type = Dfn.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.editeur.org/onix/2.1/short", type = H5 .class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.editeur.org/onix/2.1/short", type = Pre.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.editeur.org/onix/2.1/short", type = Dl.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.editeur.org/onix/2.1/short", type = I.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.editeur.org/onix/2.1/short", type = Acronym.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.editeur.org/onix/2.1/short", type = H2 .class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.editeur.org/onix/2.1/short", type = Table.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.editeur.org/onix/2.1/short", type = Br.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.editeur.org/onix/2.1/short", type = Object.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.editeur.org/onix/2.1/short", type = Sup.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.editeur.org/onix/2.1/short", type = H6 .class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.editeur.org/onix/2.1/short", type = Div.class, required = false),
        @XmlElementRef(name = "param", namespace = "http://www.editeur.org/onix/2.1/short", type = Param.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.editeur.org/onix/2.1/short", type = Sub.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.editeur.org/onix/2.1/short", type = Small.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.editeur.org/onix/2.1/short", type = B.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.editeur.org/onix/2.1/short", type = H4 .class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.editeur.org/onix/2.1/short", type = Ul.class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.editeur.org/onix/2.1/short", type = H3 .class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.editeur.org/onix/2.1/short", type = Em.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.editeur.org/onix/2.1/short", type = Abbr.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.editeur.org/onix/2.1/short", type = Img.class, required = false)
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
    @XmlAttribute(name = "declare")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String declare;
    @XmlAttribute(name = "classid")
    protected String classid;
    @XmlAttribute(name = "codebase")
    protected String codebase;
    @XmlAttribute(name = "data")
    protected String data;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "codetype")
    protected String codetype;
    @XmlAttribute(name = "archive")
    protected String archive;
    @XmlAttribute(name = "standby")
    protected String standby;
    @XmlAttribute(name = "height")
    protected String height;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "usemap")
    protected String usemap;
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;
    @XmlAttribute(name = "tabindex")
    protected String tabindex;

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
     * {@link Hr }
     * {@link P }
     * {@link Ol }
     * {@link Samp }
     * {@link A }
     * {@link Address }
     * {@link Tt }
     * {@link Map }
     * {@link Span }
     * {@link Q }
     * {@link Var }
     * {@link Cite }
     * {@link Ruby }
     * {@link Code }
     * {@link String }
     * {@link Blockquote }
     * {@link Big }
     * {@link Bdo }
     * {@link Strong }
     * {@link H1 }
     * {@link Kbd }
     * {@link Dfn }
     * {@link Pre }
     * {@link H5 }
     * {@link Dl }
     * {@link I }
     * {@link Acronym }
     * {@link Object }
     * {@link Br }
     * {@link Table }
     * {@link H2 }
     * {@link H6 }
     * {@link Sup }
     * {@link Param }
     * {@link Div }
     * {@link Sub }
     * {@link Small }
     * {@link B }
     * {@link H4 }
     * {@link Ul }
     * {@link H3 }
     * {@link Em }
     * {@link Abbr }
     * {@link Img }
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

    /**
     * Gets the value of the declare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclare() {
        return declare;
    }

    /**
     * Sets the value of the declare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclare(String value) {
        this.declare = value;
    }

    /**
     * Gets the value of the classid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassid() {
        return classid;
    }

    /**
     * Sets the value of the classid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassid(String value) {
        this.classid = value;
    }

    /**
     * Gets the value of the codebase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodebase() {
        return codebase;
    }

    /**
     * Sets the value of the codebase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodebase(String value) {
        this.codebase = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the codetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodetype() {
        return codetype;
    }

    /**
     * Sets the value of the codetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodetype(String value) {
        this.codetype = value;
    }

    /**
     * Gets the value of the archive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchive(String value) {
        this.archive = value;
    }

    /**
     * Gets the value of the standby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandby() {
        return standby;
    }

    /**
     * Sets the value of the standby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandby(String value) {
        this.standby = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the usemap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsemap() {
        return usemap;
    }

    /**
     * Sets the value of the usemap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsemap(String value) {
        this.usemap = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tabindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTabindex() {
        return tabindex;
    }

    /**
     * Sets the value of the tabindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTabindex(String value) {
        this.tabindex = value;
    }

}
