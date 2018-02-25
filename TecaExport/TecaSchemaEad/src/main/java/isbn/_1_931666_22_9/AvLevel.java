//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.27 at 02:54:19 PM CEST 
//


package isbn._1_931666_22_9;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for av.level.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="av.level">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="class"/>
 *     &lt;enumeration value="collection"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="fonds"/>
 *     &lt;enumeration value="item"/>
 *     &lt;enumeration value="otherlevel"/>
 *     &lt;enumeration value="recordgrp"/>
 *     &lt;enumeration value="series"/>
 *     &lt;enumeration value="subfonds"/>
 *     &lt;enumeration value="subgrp"/>
 *     &lt;enumeration value="subseries"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "av.level")
@XmlEnum
public enum AvLevel {

    @XmlEnumValue("class")
    CLASS("class"),
    @XmlEnumValue("collection")
    COLLECTION("collection"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("fonds")
    FONDS("fonds"),
    @XmlEnumValue("item")
    ITEM("item"),
    @XmlEnumValue("otherlevel")
    OTHERLEVEL("otherlevel"),
    @XmlEnumValue("recordgrp")
    RECORDGRP("recordgrp"),
    @XmlEnumValue("series")
    SERIES("series"),
    @XmlEnumValue("subfonds")
    SUBFONDS("subfonds"),
    @XmlEnumValue("subgrp")
    SUBGRP("subgrp"),
    @XmlEnumValue("subseries")
    SUBSERIES("subseries");
    private final String value;

    AvLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvLevel fromValue(String v) {
        for (AvLevel c: AvLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}