//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.25 at 07:25:38 AM CEST 
//


package it.mibac.san.eac_san;

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
 *         &lt;element ref="{http://san.mibac.it/eac-san/}relationEntry"/>
 *       &lt;/sequence>
 *       &lt;attribute name="resourceRelationType" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="creatorOf" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "relationEntry"
})
@XmlRootElement(name = "resourceRelation")
public class ResourceRelation {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String relationEntry;
    @XmlAttribute(name = "resourceRelationType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String resourceRelationType;

    /**
     * Gets the value of the relationEntry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationEntry() {
        return relationEntry;
    }

    /**
     * Sets the value of the relationEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationEntry(String value) {
        this.relationEntry = value;
    }

    /**
     * Gets the value of the resourceRelationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceRelationType() {
        if (resourceRelationType == null) {
            return "creatorOf";
        } else {
            return resourceRelationType;
        }
    }

    /**
     * Sets the value of the resourceRelationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceRelationType(String value) {
        this.resourceRelationType = value;
    }

}
