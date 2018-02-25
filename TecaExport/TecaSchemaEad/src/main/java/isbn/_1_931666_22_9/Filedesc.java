//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.27 at 02:54:19 PM CEST 
//


package isbn._1_931666_22_9;

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
 * <p>Java class for filedesc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filedesc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titlestmt" type="{urn:isbn:1-931666-22-9}titlestmt"/>
 *         &lt;element name="editionstmt" type="{urn:isbn:1-931666-22-9}editionstmt" minOccurs="0"/>
 *         &lt;element name="publicationstmt" type="{urn:isbn:1-931666-22-9}publicationstmt" minOccurs="0"/>
 *         &lt;element name="seriesstmt" type="{urn:isbn:1-931666-22-9}seriesstmt" minOccurs="0"/>
 *         &lt;element name="notestmt" type="{urn:isbn:1-931666-22-9}notestmt" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.common"/>
 *       &lt;attribute name="encodinganalog" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filedesc", propOrder = {
    "titlestmt",
    "editionstmt",
    "publicationstmt",
    "seriesstmt",
    "notestmt"
})
public class Filedesc {

    @XmlElement(required = true)
    protected Titlestmt titlestmt;
    protected Editionstmt editionstmt;
    protected Publicationstmt publicationstmt;
    protected Seriesstmt seriesstmt;
    protected Notestmt notestmt;
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
     * Gets the value of the titlestmt property.
     * 
     * @return
     *     possible object is
     *     {@link Titlestmt }
     *     
     */
    public Titlestmt getTitlestmt() {
        return titlestmt;
    }

    /**
     * Sets the value of the titlestmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Titlestmt }
     *     
     */
    public void setTitlestmt(Titlestmt value) {
        this.titlestmt = value;
    }

    /**
     * Gets the value of the editionstmt property.
     * 
     * @return
     *     possible object is
     *     {@link Editionstmt }
     *     
     */
    public Editionstmt getEditionstmt() {
        return editionstmt;
    }

    /**
     * Sets the value of the editionstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Editionstmt }
     *     
     */
    public void setEditionstmt(Editionstmt value) {
        this.editionstmt = value;
    }

    /**
     * Gets the value of the publicationstmt property.
     * 
     * @return
     *     possible object is
     *     {@link Publicationstmt }
     *     
     */
    public Publicationstmt getPublicationstmt() {
        return publicationstmt;
    }

    /**
     * Sets the value of the publicationstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Publicationstmt }
     *     
     */
    public void setPublicationstmt(Publicationstmt value) {
        this.publicationstmt = value;
    }

    /**
     * Gets the value of the seriesstmt property.
     * 
     * @return
     *     possible object is
     *     {@link Seriesstmt }
     *     
     */
    public Seriesstmt getSeriesstmt() {
        return seriesstmt;
    }

    /**
     * Sets the value of the seriesstmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Seriesstmt }
     *     
     */
    public void setSeriesstmt(Seriesstmt value) {
        this.seriesstmt = value;
    }

    /**
     * Gets the value of the notestmt property.
     * 
     * @return
     *     possible object is
     *     {@link Notestmt }
     *     
     */
    public Notestmt getNotestmt() {
        return notestmt;
    }

    /**
     * Sets the value of the notestmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notestmt }
     *     
     */
    public void setNotestmt(Notestmt value) {
        this.notestmt = value;
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
