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
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}param"/>
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
        @XmlElementRef(name = "span", namespace = "http://www.editeur.org/onix/2.1/reference", type = Span.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.editeur.org/onix/2.1/reference", type = Object.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.editeur.org/onix/2.1/reference", type = B.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.editeur.org/onix/2.1/reference", type = Br.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.editeur.org/onix/2.1/reference", type = Sup.class, required = false),
        @XmlElementRef(name = "param", namespace = "http://www.editeur.org/onix/2.1/reference", type = Param.class, required = false),
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
        @XmlElementRef(name = "pre", namespace = "http://www.editeur.org/onix/2.1/reference", type = Pre.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.editeur.org/onix/2.1/reference", type = Hr.class, required = false),
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
     * {@link Object }
     * {@link Span }
     * {@link B }
     * {@link Br }
     * {@link Param }
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
     * {@link Hr }
     * {@link Pre }
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
