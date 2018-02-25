//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.27 at 03:01:38 PM CEST 
//


package isbn._1_931666_33_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
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
 *         &lt;element ref="{urn:isbn:1-931666-33-4}agencyCode" minOccurs="0"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}otherAgencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}agencyName"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}descriptiveNote" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}id"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agencyCode",
    "otherAgencyCode",
    "agencyName",
    "descriptiveNote"
})
@XmlRootElement(name = "maintenanceAgency")
public class MaintenanceAgency {

    protected AgencyCode agencyCode;
    protected List<OtherAgencyCode> otherAgencyCode;
    @XmlElement(required = true)
    protected AgencyName agencyName;
    protected DescriptiveNote descriptiveNote;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCode }
     *     
     */
    public AgencyCode getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCode }
     *     
     */
    public void setAgencyCode(AgencyCode value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the otherAgencyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAgencyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAgencyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAgencyCode }
     * 
     * 
     */
    public List<OtherAgencyCode> getOtherAgencyCode() {
        if (otherAgencyCode == null) {
            otherAgencyCode = new ArrayList<OtherAgencyCode>();
        }
        return this.otherAgencyCode;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyName }
     *     
     */
    public AgencyName getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyName }
     *     
     */
    public void setAgencyName(AgencyName value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the descriptiveNote property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptiveNote }
     *     
     */
    public DescriptiveNote getDescriptiveNote() {
        return descriptiveNote;
    }

    /**
     * Sets the value of the descriptiveNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptiveNote }
     *     
     */
    public void setDescriptiveNote(DescriptiveNote value) {
        this.descriptiveNote = value;
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

}
