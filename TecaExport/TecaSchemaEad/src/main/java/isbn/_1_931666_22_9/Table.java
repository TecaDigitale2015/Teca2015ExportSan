//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.27 at 02:54:19 PM CEST 
//


package isbn._1_931666_22_9;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for table complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="table">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="head" type="{urn:isbn:1-931666-22-9}head" minOccurs="0"/>
 *         &lt;element name="tgroup" type="{urn:isbn:1-931666-22-9}tgroup" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.common"/>
 *       &lt;attribute name="frame">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="top"/>
 *             &lt;enumeration value="bottom"/>
 *             &lt;enumeration value="topbot"/>
 *             &lt;enumeration value="all"/>
 *             &lt;enumeration value="sides"/>
 *             &lt;enumeration value="none"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="colsep" type="{urn:isbn:1-931666-22-9}yesorno" />
 *       &lt;attribute name="rowsep" type="{urn:isbn:1-931666-22-9}yesorno" />
 *       &lt;attribute name="pgwide" type="{urn:isbn:1-931666-22-9}yesorno" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table", propOrder = {
    "head",
    "tgroup"
})
public class Table {

    protected Head head;
    @XmlElement(required = true)
    protected List<Tgroup> tgroup;
    @XmlAttribute(name = "frame")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String frame;
    @XmlAttribute(name = "colsep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String colsep;
    @XmlAttribute(name = "rowsep")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rowsep;
    @XmlAttribute(name = "pgwide")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String pgwide;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "altrender")
    @XmlSchemaType(name = "anySimpleType")
    protected String altrender;
    @XmlAttribute(name = "audience")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String audience;

    /**
     * Gets the value of the head property.
     * 
     * @return
     *     possible object is
     *     {@link Head }
     *     
     */
    public Head getHead() {
        return head;
    }

    /**
     * Sets the value of the head property.
     * 
     * @param value
     *     allowed object is
     *     {@link Head }
     *     
     */
    public void setHead(Head value) {
        this.head = value;
    }

    /**
     * Gets the value of the tgroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tgroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTgroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tgroup }
     * 
     * 
     */
    public List<Tgroup> getTgroup() {
        if (tgroup == null) {
            tgroup = new ArrayList<Tgroup>();
        }
        return this.tgroup;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrame(String value) {
        this.frame = value;
    }

    /**
     * Gets the value of the colsep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColsep() {
        return colsep;
    }

    /**
     * Sets the value of the colsep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColsep(String value) {
        this.colsep = value;
    }

    /**
     * Gets the value of the rowsep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowsep() {
        return rowsep;
    }

    /**
     * Sets the value of the rowsep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowsep(String value) {
        this.rowsep = value;
    }

    /**
     * Gets the value of the pgwide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPgwide() {
        return pgwide;
    }

    /**
     * Sets the value of the pgwide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPgwide(String value) {
        this.pgwide = value;
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
     * Gets the value of the altrender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrender() {
        return altrender;
    }

    /**
     * Sets the value of the altrender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrender(String value) {
        this.altrender = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

}
