//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.25 at 07:25:38 AM CEST 
//


package it.mibac.san.eac_san;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="date" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://san.mibac.it/eac-san/>stringNotEmpty">
 *                 &lt;attGroup ref="{http://san.mibac.it/eac-san/}date"/>
 *                 &lt;attribute name="localType" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="non indicata"/>
 *                       &lt;enumeration value="data di nascita"/>
 *                       &lt;enumeration value="data di morte"/>
 *                       &lt;enumeration value="date di esistenza"/>
 *                       &lt;enumeration value="data di istituzione"/>
 *                       &lt;enumeration value="data di soppressione"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "date"
})
@XmlRootElement(name = "dateSet")
public class DateSet {

    @XmlElement(required = true)
    protected List<DateSet.Date> date;

    /**
     * Gets the value of the date property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the date property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateSet.Date }
     * 
     * 
     */
    public List<DateSet.Date> getDate() {
        if (date == null) {
            date = new ArrayList<DateSet.Date>();
        }
        return this.date;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://san.mibac.it/eac-san/>stringNotEmpty">
     *       &lt;attGroup ref="{http://san.mibac.it/eac-san/}date"/>
     *       &lt;attribute name="localType" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="non indicata"/>
     *             &lt;enumeration value="data di nascita"/>
     *             &lt;enumeration value="data di morte"/>
     *             &lt;enumeration value="date di esistenza"/>
     *             &lt;enumeration value="data di istituzione"/>
     *             &lt;enumeration value="data di soppressione"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Date {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "localType", required = true)
        protected String localType;
        @XmlAttribute(name = "standardDate")
        protected String standardDate;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the localType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocalType() {
            return localType;
        }

        /**
         * Sets the value of the localType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocalType(String value) {
            this.localType = value;
        }

        /**
         * Gets the value of the standardDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStandardDate() {
            return standardDate;
        }

        /**
         * Sets the value of the standardDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStandardDate(String value) {
            this.standardDate = value;
        }

    }

}
