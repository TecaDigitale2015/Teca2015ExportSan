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
 *         &lt;element ref="{urn:isbn:1-931666-33-4}recordId"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}otherRecordId" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}maintenanceStatus"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}publicationStatus" minOccurs="0"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}maintenanceAgency"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}languageDeclaration" minOccurs="0"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}conventionDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}localTypeDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}localControl" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}maintenanceHistory"/>
 *         &lt;element ref="{urn:isbn:1-931666-33-4}sources" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}id"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "recordId",
    "otherRecordId",
    "maintenanceStatus",
    "publicationStatus",
    "maintenanceAgency",
    "languageDeclaration",
    "conventionDeclaration",
    "localTypeDeclaration",
    "localControl",
    "maintenanceHistory",
    "sources"
})
@XmlRootElement(name = "control")
public class Control {

    @XmlElement(required = true)
    protected RecordId recordId;
    protected List<OtherRecordId> otherRecordId;
    @XmlElement(required = true)
    protected MaintenanceStatus maintenanceStatus;
    protected PublicationStatus publicationStatus;
    @XmlElement(required = true)
    protected MaintenanceAgency maintenanceAgency;
    protected LanguageDeclaration languageDeclaration;
    protected List<ConventionDeclaration> conventionDeclaration;
    protected List<LocalTypeDeclaration> localTypeDeclaration;
    protected List<LocalControl> localControl;
    @XmlElement(required = true)
    protected MaintenanceHistory maintenanceHistory;
    protected Sources sources;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link RecordId }
     *     
     */
    public RecordId getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordId }
     *     
     */
    public void setRecordId(RecordId value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the otherRecordId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRecordId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRecordId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherRecordId }
     * 
     * 
     */
    public List<OtherRecordId> getOtherRecordId() {
        if (otherRecordId == null) {
            otherRecordId = new ArrayList<OtherRecordId>();
        }
        return this.otherRecordId;
    }

    /**
     * Gets the value of the maintenanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceStatus }
     *     
     */
    public MaintenanceStatus getMaintenanceStatus() {
        return maintenanceStatus;
    }

    /**
     * Sets the value of the maintenanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceStatus }
     *     
     */
    public void setMaintenanceStatus(MaintenanceStatus value) {
        this.maintenanceStatus = value;
    }

    /**
     * Gets the value of the publicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationStatus }
     *     
     */
    public PublicationStatus getPublicationStatus() {
        return publicationStatus;
    }

    /**
     * Sets the value of the publicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationStatus }
     *     
     */
    public void setPublicationStatus(PublicationStatus value) {
        this.publicationStatus = value;
    }

    /**
     * Gets the value of the maintenanceAgency property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceAgency }
     *     
     */
    public MaintenanceAgency getMaintenanceAgency() {
        return maintenanceAgency;
    }

    /**
     * Sets the value of the maintenanceAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceAgency }
     *     
     */
    public void setMaintenanceAgency(MaintenanceAgency value) {
        this.maintenanceAgency = value;
    }

    /**
     * Gets the value of the languageDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDeclaration }
     *     
     */
    public LanguageDeclaration getLanguageDeclaration() {
        return languageDeclaration;
    }

    /**
     * Sets the value of the languageDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDeclaration }
     *     
     */
    public void setLanguageDeclaration(LanguageDeclaration value) {
        this.languageDeclaration = value;
    }

    /**
     * Gets the value of the conventionDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conventionDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConventionDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConventionDeclaration }
     * 
     * 
     */
    public List<ConventionDeclaration> getConventionDeclaration() {
        if (conventionDeclaration == null) {
            conventionDeclaration = new ArrayList<ConventionDeclaration>();
        }
        return this.conventionDeclaration;
    }

    /**
     * Gets the value of the localTypeDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localTypeDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalTypeDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalTypeDeclaration }
     * 
     * 
     */
    public List<LocalTypeDeclaration> getLocalTypeDeclaration() {
        if (localTypeDeclaration == null) {
            localTypeDeclaration = new ArrayList<LocalTypeDeclaration>();
        }
        return this.localTypeDeclaration;
    }

    /**
     * Gets the value of the localControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalControl }
     * 
     * 
     */
    public List<LocalControl> getLocalControl() {
        if (localControl == null) {
            localControl = new ArrayList<LocalControl>();
        }
        return this.localControl;
    }

    /**
     * Gets the value of the maintenanceHistory property.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceHistory }
     *     
     */
    public MaintenanceHistory getMaintenanceHistory() {
        return maintenanceHistory;
    }

    /**
     * Sets the value of the maintenanceHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceHistory }
     *     
     */
    public void setMaintenanceHistory(MaintenanceHistory value) {
        this.maintenanceHistory = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * @return
     *     possible object is
     *     {@link Sources }
     *     
     */
    public Sources getSources() {
        return sources;
    }

    /**
     * Sets the value of the sources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sources }
     *     
     */
    public void setSources(Sources value) {
        this.sources = value;
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
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

}
