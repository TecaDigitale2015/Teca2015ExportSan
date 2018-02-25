//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.25 at 07:25:38 AM CEST 
//


package it.mibac.san.scons_san;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.mibac.san.scons_san package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Formaautorizzata_QNAME = new QName("http://san.mibac.it/scons-san/", "formaautorizzata");
    private final static QName _SconsTipologia_QNAME = new QName("http://san.mibac.it/scons-san/", "tipologia");
    private final static QName _SconsConsultazione_QNAME = new QName("http://san.mibac.it/scons-san/", "consultazione");
    private final static QName _SconsDescrizione_QNAME = new QName("http://san.mibac.it/scons-san/", "descrizione");
    private final static QName _SconsServizi_QNAME = new QName("http://san.mibac.it/scons-san/", "servizi");
    private final static QName _SconsAltroaccesso_QNAME = new QName("http://san.mibac.it/scons-san/", "altroaccesso");
    private final static QName _SconsOrario_QNAME = new QName("http://san.mibac.it/scons-san/", "orario");
    private final static QName _SconsAcronimo_QNAME = new QName("http://san.mibac.it/scons-san/", "acronimo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.mibac.san.scons_san
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Formeparallele }
     * 
     */
    public Formeparallele createFormeparallele() {
        return new Formeparallele();
    }

    /**
     * Create an instance of {@link Formeparallele.Formaautorizzata }
     * 
     */
    public Formeparallele.Formaautorizzata createFormeparalleleFormaautorizzata() {
        return new Formeparallele.Formaautorizzata();
    }

    /**
     * Create an instance of {@link Scons }
     * 
     */
    public Scons createScons() {
        return new Scons();
    }

    /**
     * Create an instance of {@link Identifier }
     * 
     */
    public Identifier createIdentifier() {
        return new Identifier();
    }

    /**
     * Create an instance of {@link Localizzazione }
     * 
     */
    public Localizzazione createLocalizzazione() {
        return new Localizzazione();
    }

    /**
     * Create an instance of {@link Sitoweb }
     * 
     */
    public Sitoweb createSitoweb() {
        return new Sitoweb();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://san.mibac.it/scons-san/", name = "formaautorizzata")
    public JAXBElement<String> createFormaautorizzata(String value) {
        return new JAXBElement<String>(_Formaautorizzata_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://san.mibac.it/scons-san/", name = "tipologia", scope = Scons.class)
    public JAXBElement<String> createSconsTipologia(String value) {
        return new JAXBElement<String>(_SconsTipologia_QNAME, String.class, Scons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://san.mibac.it/scons-san/", name = "consultazione", scope = Scons.class)
    public JAXBElement<Boolean> createSconsConsultazione(Boolean value) {
        return new JAXBElement<Boolean>(_SconsConsultazione_QNAME, Boolean.class, Scons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://san.mibac.it/scons-san/", name = "descrizione", scope = Scons.class)
    public JAXBElement<String> createSconsDescrizione(String value) {
        return new JAXBElement<String>(_SconsDescrizione_QNAME, String.class, Scons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://san.mibac.it/scons-san/", name = "servizi", scope = Scons.class)
    public JAXBElement<String> createSconsServizi(String value) {
        return new JAXBElement<String>(_SconsServizi_QNAME, String.class, Scons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://san.mibac.it/scons-san/", name = "altroaccesso", scope = Scons.class)
    public JAXBElement<String> createSconsAltroaccesso(String value) {
        return new JAXBElement<String>(_SconsAltroaccesso_QNAME, String.class, Scons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://san.mibac.it/scons-san/", name = "orario", scope = Scons.class)
    public JAXBElement<String> createSconsOrario(String value) {
        return new JAXBElement<String>(_SconsOrario_QNAME, String.class, Scons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://san.mibac.it/scons-san/", name = "acronimo", scope = Scons.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSconsAcronimo(String value) {
        return new JAXBElement<String>(_SconsAcronimo_QNAME, String.class, Scons.class, value);
    }

}
