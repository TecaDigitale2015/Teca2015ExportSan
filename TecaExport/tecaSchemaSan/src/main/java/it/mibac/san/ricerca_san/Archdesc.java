//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.25 at 07:25:38 AM CEST 
//


package it.mibac.san.ricerca_san;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://san.mibac.it/ricerca-san/}did"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "did"
})
@XmlRootElement(name = "archdesc")
public class Archdesc {

    @XmlElement(required = true)
    protected Did did;

    /**
     * Gets the value of the did property.
     * 
     * @return
     *     possible object is
     *     {@link Did }
     *     
     */
    public Did getDid() {
        return did;
    }

    /**
     * Sets the value of the did property.
     * 
     * @param value
     *     allowed object is
     *     {@link Did }
     *     
     */
    public void setDid(Did value) {
        this.did = value;
    }

}
