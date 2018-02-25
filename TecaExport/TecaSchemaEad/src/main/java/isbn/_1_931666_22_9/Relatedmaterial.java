//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.27 at 02:54:19 PM CEST 
//


package isbn._1_931666_22_9;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for relatedmaterial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="relatedmaterial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="head" type="{urn:isbn:1-931666-22-9}head" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;group ref="{urn:isbn:1-931666-22-9}m.blocks"/>
 *           &lt;group ref="{urn:isbn:1-931666-22-9}m.refs"/>
 *           &lt;element name="relatedmaterial" type="{urn:isbn:1-931666-22-9}relatedmaterial"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.common"/>
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="encodinganalog" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedmaterial", propOrder = {
    "head",
    "addressOrChronlistOrList"
})
public class Relatedmaterial {

    protected Head head;
    @XmlElements({
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "chronlist", type = Chronlist.class),
        @XmlElement(name = "list", type = isbn._1_931666_22_9.List.class),
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "blockquote", type = Blockquote.class),
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "ref", type = Ref.class),
        @XmlElement(name = "extref", type = Extref.class),
        @XmlElement(name = "linkgrp", type = Linkgrp.class),
        @XmlElement(name = "bibref", type = Bibref.class),
        @XmlElement(name = "title", type = Title.class),
        @XmlElement(name = "archref", type = Archref.class),
        @XmlElement(name = "relatedmaterial", type = Relatedmaterial.class)
    })
    protected java.util.List<Object> addressOrChronlistOrList;
    @XmlAttribute(name = "type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;
    @XmlAttribute(name = "encodinganalog")
    @XmlSchemaType(name = "anySimpleType")
    protected String encodinganalog;
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
     * Gets the value of the addressOrChronlistOrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressOrChronlistOrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressOrChronlistOrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * {@link Chronlist }
     * {@link isbn._1_931666_22_9.List }
     * {@link Note }
     * {@link Table }
     * {@link Blockquote }
     * {@link P }
     * {@link Ref }
     * {@link Extref }
     * {@link Linkgrp }
     * {@link Bibref }
     * {@link Title }
     * {@link Archref }
     * {@link Relatedmaterial }
     * 
     * 
     */
    public java.util.List<Object> getAddressOrChronlistOrList() {
        if (addressOrChronlistOrList == null) {
            addressOrChronlistOrList = new ArrayList<Object>();
        }
        return this.addressOrChronlistOrList;
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
     * Gets the value of the encodinganalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodinganalog() {
        return encodinganalog;
    }

    /**
     * Sets the value of the encodinganalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodinganalog(String value) {
        this.encodinganalog = value;
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
