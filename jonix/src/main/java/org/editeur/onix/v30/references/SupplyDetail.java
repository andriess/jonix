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
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Supplier"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}SupplierOwnCoding" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ReturnsConditions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ProductAvailability"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}SupplyDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}OrderTime" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}NewSupplier" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Stock" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}PackQuantity" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}UnpricedItemType"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Price" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Reissue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/reference}generalAttributes"/>
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
    "supplierOwnCoding",
    "returnsConditions",
    "productAvailability",
    "supplyDate",
    "orderTime",
    "newSupplier",
    "stock",
    "packQuantity",
    "unpricedItemType",
    "price",
    "reissue"
})
@XmlRootElement(name = "SupplyDetail")
public class SupplyDetail {

    @XmlElement(name = "Supplier", required = true)
    protected Supplier supplier;
    @XmlElement(name = "SupplierOwnCoding")
    protected List<SupplierOwnCoding> supplierOwnCoding;
    @XmlElement(name = "ReturnsConditions")
    protected List<ReturnsConditions> returnsConditions;
    @XmlElement(name = "ProductAvailability", required = true)
    protected ProductAvailability productAvailability;
    @XmlElement(name = "SupplyDate")
    protected List<SupplyDate> supplyDate;
    @XmlElement(name = "OrderTime")
    protected OrderTime orderTime;
    @XmlElement(name = "NewSupplier")
    protected NewSupplier newSupplier;
    @XmlElement(name = "Stock")
    protected List<Stock> stock;
    @XmlElement(name = "PackQuantity")
    protected PackQuantity packQuantity;
    @XmlElement(name = "UnpricedItemType")
    protected UnpricedItemType unpricedItemType;
    @XmlElement(name = "Price")
    protected List<Price> price;
    @XmlElement(name = "Reissue")
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
     * Gets the value of the supplierOwnCoding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierOwnCoding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierOwnCoding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierOwnCoding }
     * 
     * 
     */
    public List<SupplierOwnCoding> getSupplierOwnCoding() {
        if (supplierOwnCoding == null) {
            supplierOwnCoding = new ArrayList<SupplierOwnCoding>();
        }
        return this.supplierOwnCoding;
    }

    /**
     * Gets the value of the returnsConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnsConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnsConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnsConditions }
     * 
     * 
     */
    public List<ReturnsConditions> getReturnsConditions() {
        if (returnsConditions == null) {
            returnsConditions = new ArrayList<ReturnsConditions>();
        }
        return this.returnsConditions;
    }

    /**
     * Gets the value of the productAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAvailability }
     *     
     */
    public ProductAvailability getProductAvailability() {
        return productAvailability;
    }

    /**
     * Sets the value of the productAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAvailability }
     *     
     */
    public void setProductAvailability(ProductAvailability value) {
        this.productAvailability = value;
    }

    /**
     * Gets the value of the supplyDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyDate }
     * 
     * 
     */
    public List<SupplyDate> getSupplyDate() {
        if (supplyDate == null) {
            supplyDate = new ArrayList<SupplyDate>();
        }
        return this.supplyDate;
    }

    /**
     * Gets the value of the orderTime property.
     * 
     * @return
     *     possible object is
     *     {@link OrderTime }
     *     
     */
    public OrderTime getOrderTime() {
        return orderTime;
    }

    /**
     * Sets the value of the orderTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderTime }
     *     
     */
    public void setOrderTime(OrderTime value) {
        this.orderTime = value;
    }

    /**
     * Gets the value of the newSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link NewSupplier }
     *     
     */
    public NewSupplier getNewSupplier() {
        return newSupplier;
    }

    /**
     * Sets the value of the newSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSupplier }
     *     
     */
    public void setNewSupplier(NewSupplier value) {
        this.newSupplier = value;
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
     * Gets the value of the packQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link PackQuantity }
     *     
     */
    public PackQuantity getPackQuantity() {
        return packQuantity;
    }

    /**
     * Sets the value of the packQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackQuantity }
     *     
     */
    public void setPackQuantity(PackQuantity value) {
        this.packQuantity = value;
    }

    /**
     * Gets the value of the unpricedItemType property.
     * 
     * @return
     *     possible object is
     *     {@link UnpricedItemType }
     *     
     */
    public UnpricedItemType getUnpricedItemType() {
        return unpricedItemType;
    }

    /**
     * Sets the value of the unpricedItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnpricedItemType }
     *     
     */
    public void setUnpricedItemType(UnpricedItemType value) {
        this.unpricedItemType = value;
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
