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
 * <p>Java class for av.render.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="av.render">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="altrender"/>
 *     &lt;enumeration value="bold"/>
 *     &lt;enumeration value="bolddoublequote"/>
 *     &lt;enumeration value="bolditalic"/>
 *     &lt;enumeration value="boldsinglequote"/>
 *     &lt;enumeration value="boldsmcaps"/>
 *     &lt;enumeration value="boldunderline"/>
 *     &lt;enumeration value="doublequote"/>
 *     &lt;enumeration value="italic"/>
 *     &lt;enumeration value="nonproport"/>
 *     &lt;enumeration value="singlequote"/>
 *     &lt;enumeration value="smcaps"/>
 *     &lt;enumeration value="sub"/>
 *     &lt;enumeration value="super"/>
 *     &lt;enumeration value="underline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "av.render")
@XmlEnum
public enum AvRender {

    @XmlEnumValue("altrender")
    ALTRENDER("altrender"),
    @XmlEnumValue("bold")
    BOLD("bold"),
    @XmlEnumValue("bolddoublequote")
    BOLDDOUBLEQUOTE("bolddoublequote"),
    @XmlEnumValue("bolditalic")
    BOLDITALIC("bolditalic"),
    @XmlEnumValue("boldsinglequote")
    BOLDSINGLEQUOTE("boldsinglequote"),
    @XmlEnumValue("boldsmcaps")
    BOLDSMCAPS("boldsmcaps"),
    @XmlEnumValue("boldunderline")
    BOLDUNDERLINE("boldunderline"),
    @XmlEnumValue("doublequote")
    DOUBLEQUOTE("doublequote"),
    @XmlEnumValue("italic")
    ITALIC("italic"),
    @XmlEnumValue("nonproport")
    NONPROPORT("nonproport"),
    @XmlEnumValue("singlequote")
    SINGLEQUOTE("singlequote"),
    @XmlEnumValue("smcaps")
    SMCAPS("smcaps"),
    @XmlEnumValue("sub")
    SUB("sub"),
    @XmlEnumValue("super")
    SUPER("super"),
    @XmlEnumValue("underline")
    UNDERLINE("underline");
    private final String value;

    AvRender(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvRender fromValue(String v) {
        for (AvRender c: AvRender.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
