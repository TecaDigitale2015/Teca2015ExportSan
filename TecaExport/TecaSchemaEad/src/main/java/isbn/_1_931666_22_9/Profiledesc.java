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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for profiledesc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="profiledesc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creation" type="{urn:isbn:1-931666-22-9}creation" minOccurs="0"/>
 *         &lt;element name="langusage" type="{urn:isbn:1-931666-22-9}langusage" minOccurs="0"/>
 *         &lt;element name="descrules" type="{urn:isbn:1-931666-22-9}descrules" minOccurs="0"/>
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
@XmlType(name = "profiledesc", propOrder = {
    "creation",
    "langusage",
    "descrules"
})
public class Profiledesc {

    protected Creation creation;
    protected Langusage langusage;
    protected Descrules descrules;
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
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link Creation }
     *     
     */
    public Creation getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creation }
     *     
     */
    public void setCreation(Creation value) {
        this.creation = value;
    }

    /**
     * Gets the value of the langusage property.
     * 
     * @return
     *     possible object is
     *     {@link Langusage }
     *     
     */
    public Langusage getLangusage() {
        return langusage;
    }

    /**
     * Sets the value of the langusage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Langusage }
     *     
     */
    public void setLangusage(Langusage value) {
        this.langusage = value;
    }

    /**
     * Gets the value of the descrules property.
     * 
     * @return
     *     possible object is
     *     {@link Descrules }
     *     
     */
    public Descrules getDescrules() {
        return descrules;
    }

    /**
     * Sets the value of the descrules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descrules }
     *     
     */
    public void setDescrules(Descrules value) {
        this.descrules = value;
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
