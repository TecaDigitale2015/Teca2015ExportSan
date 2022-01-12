package mx.teca2015.tecaExport.tecaExportSan;

import it.mibac.san.cat_import.CatImport;
import it.mibac.san.cat_import.CatListRecords;
import it.mibac.san.cat_import.CatRecord;
import it.mibac.san.cat_import.CatRecordBody;
import it.mibac.san.cat_import.CatRecordHeader;
import it.mibac.san.cat_import.Catheader;
import it.mibac.san.cat_import.Contact;
import it.mibac.san.cat_import.Filedesc;
import it.mibac.san.eac_san.Control;
import it.mibac.san.eac_san.CpfDescription;
import it.mibac.san.eac_san.DateSet;
import it.mibac.san.eac_san.DateSet.Date;
import it.mibac.san.eac_san.Description;
import it.mibac.san.eac_san.EacCpf;
import it.mibac.san.eac_san.ExistDates;
import it.mibac.san.eac_san.Identity;
import it.mibac.san.eac_san.NameEntry;
import it.mibac.san.eac_san.OtherRecordId;
import it.mibac.san.eac_san.Source;
import it.mibac.san.eac_san.Sources;
import it.mibac.san.ead_san.Archdesc;
import it.mibac.san.ead_san.Datetype;
import it.mibac.san.ead_san.Did;
import it.mibac.san.ead_san.Ead;
import it.mibac.san.ead_san.Physdesc;
import it.mibac.san.ead_san.Relatedmaterial;
import it.mibac.san.ead_san.Repository;
import it.mibac.san.ead_san.Unitid;
import it.mibac.san.ead_san.Unittitle;
import it.mibac.san.scons_san.Identifier;
import it.mibac.san.scons_san.Localizzazione;
import it.mibac.san.scons_san.ObjectFactory;
import it.mibac.san.scons_san.Scons;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Vector;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;
import mx.randalf.configuration.Configuration;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.san.CatImportXsd;
import mx.randalf.xsd.exception.XsdException;
import mx.teca2015.tecaExport.tecaExportSan.eac.Istituto;
import mx.teca2015.tecaExport.tecaExportSan.ead.Fondo;

//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class TecaExportSanXls {

	private Logger log = LogManager.getLogger(TecaExportSanXls.class);

	public TecaExportSanXls() {
	}

	public Workbook openFileXls(String fileXls) throws BiffException, IndexOutOfBoundsException, IOException {
		File f = null;
		Workbook wb = null;
		WorkbookSettings wbs = null;

		try {
			f = new File(fileXls);
			if (f.exists()) {
				wbs = new WorkbookSettings();
				wbs.setEncoding("ISO-8859-1");
//				wbs.setEncoding("UTF-8");
				wb = Workbook.getWorkbook(f);
			} else {
				System.out.println("Il file [" + f.getAbsolutePath()
						+ "] non esiste");
			}
		} catch (BiffException e) {
			throw e;
		} catch (IndexOutOfBoundsException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
		return wb;
	}

	public abstract void esegui(File pathRoot);

	protected CatImport initCatImport(String id, String title){
		CatImport catImport = null;
		CatListRecords catListRecords =  null;
		Catheader catheader = null;
		Contact contact = null;
		Filedesc filedesc = null;

		
		try {
			catImport = new CatImport();

			catheader = new Catheader();
			catheader.setSystemId(id);
			
			contact = new Contact();
			contact.getMail().add("massimiliano.randazzo@it-present.com");
			catheader.setContact(contact);

			filedesc = new Filedesc();
			filedesc.setTitle(title);
			filedesc.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
			catheader.setFiledesc(filedesc);
			catImport.setCatheader(catheader);
			
			catListRecords = new CatListRecords();
			catImport.setCatListRecords(catListRecords);
		} catch (DatatypeConfigurationException e) {
			log.error(e.getMessage(), e);
		}
		return catImport;
	}
	
	protected void write(CatImport catImport, File file){
		CatImportXsd catImportXsd = null;
		File fSan = null;
		catImportXsd = new CatImportXsd();

		try {
			fSan = new File(file.getParentFile().getAbsolutePath()+
					File.separator+
					file.getName().replace(".xls", "_sun.xml"));
			catImportXsd.write(catImport, fSan);
		} catch (XsdException e) {
			log.error(e.getMessage(), e);
		} catch (PubblicaException e) {
			log.error(e.getMessage(), e);
		}
	}

	private CatRecord initCatRecord(String id, String type) throws DatatypeConfigurationException{
		CatRecord catRecord = null;
		
		CatRecordHeader catRecordHeader = null;
		CatRecordBody catRecordBody = null;

		catRecord = new CatRecord();

		catRecordHeader = new CatRecordHeader();
//		catRecordHeader.setStatus("new");
		catRecordHeader.setType(type);
		catRecordHeader.setId(id);
		catRecordHeader.setLastUpdate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));

		catRecord.setCatRecordHeader(catRecordHeader);

		catRecordBody = new CatRecordBody();
		
		catRecord.setCatRecordBody(catRecordBody);
		return catRecord;
	}

	protected CatRecord readIstituto(String id, String nomeIstituto, String pathIstituto) throws DatatypeConfigurationException, 
			XsdException, PubblicaException, Exception{
		CatRecord catRecord = null;
		Scons sCons = null;
		Identifier identifier = null;
		ObjectFactory of = null;
		Localizzazione localizzazione = null;
		String url = null;
		String tipologia = null;
		BigInteger cap = null;
		String comune = null;
		String paese = null;
		String provincia = null;
		String indirizzo = null;
		String orari = null;
		
		try {
			if (Configuration.getValue("istituto."+id+ ".tipologia") != null){
				url = Configuration.getValue("istituto."+id+ ".url");
				tipologia = Configuration.getValue("istituto."+id+ ".tipologia");
				cap = new BigInteger(Configuration.getValue("istituto."+id+ ".cap"));
				comune = Configuration.getValue("istituto."+id+ ".comune");
				paese = Configuration.getValue("istituto."+id+ ".paese");
				provincia = Configuration.getValue("istituto."+id+ ".provincia");
				indirizzo = Configuration.getValue("istituto."+id+ ".indirizzo");
				orari = Configuration.getValue("istituto."+id+ ".orari");
			} else {
				throw new Exception("Istituto non trovato");
			}
			of = new ObjectFactory();

			catRecord = initCatRecord(id, "soggetto conservatore");
			sCons = new Scons();
			

			sCons.getContent().add(of.createFormaautorizzata(nomeIstituto));

			identifier = new Identifier();
			identifier.setHref(url);
			identifier.setRecordId(id);
			identifier.setSistemaId(id);
			sCons.getContent().add(identifier);

			sCons.getContent().add(of.createSconsTipologia(tipologia));

			localizzazione = new Localizzazione();
			localizzazione.setCap(cap);
			localizzazione.setComune(comune);
			localizzazione.setPaese(paese);
			localizzazione.setProvincia(provincia);
			localizzazione.setValue(indirizzo);
			sCons.getContent().add(localizzazione);

			sCons.getContent().add(of.createSconsOrario(orari));
			
			sCons.getContent().add(of.createSconsConsultazione(Boolean.TRUE));
			
			catRecord.getCatRecordBody().getContent().add(sCons);
			
			Istituto.genIstitutoEac(id, nomeIstituto, cap, comune, paese, provincia, indirizzo, url, pathIstituto);
		} catch (DatatypeConfigurationException e) {
			throw e;
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
		return catRecord;
	}

	protected CatRecord readFondo(String id, String descrizione, String pathFondo, boolean isFondo) throws DatatypeConfigurationException, XsdException, PubblicaException{
		CatRecord catRecord = null;
		EacCpf eacCpf = null;
		CpfDescription cpfDescription = null;
		Identity identity = null;
		NameEntry nameEntry = null;
		Control control = null;
		OtherRecordId otherRecordId = null;
		Sources sources = null;
		Source source = null;
		Description description = null;
		ExistDates existDates = null;
		DateSet dateSet = null;
		Date date = null;

		try {

			eacCpf = new EacCpf();
			
			control = new Control();
			otherRecordId = new OtherRecordId();
			otherRecordId.setLocalType("It");
			otherRecordId.setValue(id);
			control.setOtherRecordId(otherRecordId);
			control.setMaintenanceStatus("scheda di prova");
			
			sources = new Sources();
			
			source = new Source();
			source.setHref("http://");
			sources.setSource(source);
			control.setSources(sources);
			eacCpf.setControl(control);
			
			
			cpfDescription = new CpfDescription();
			identity = new Identity();
			nameEntry = new NameEntry();
			nameEntry.getPart().add(descrizione);
			identity.getNameEntryOrNameEntryParallel().add(nameEntry);
			cpfDescription.setIdentity(identity);
			
			description = new Description();
			
			existDates = new ExistDates();
			
			dateSet = new DateSet();
			
			date = new Date();
			date.setLocalType("non indicata");
			date.setValue("0");
			dateSet.getDate().add(date);
			existDates.setDateSet(dateSet);
			description.setExistDates(existDates);
			cpfDescription.setDescription(description);
			
			eacCpf.setCpfDescription(cpfDescription);
			
			catRecord = initCatRecord(id, "soggetto produttore");
			catRecord.getCatRecordBody().getContent().add(eacCpf);
			Fondo.genFondoEad(id, descrizione, pathFondo, isFondo);
		} catch (DatatypeConfigurationException e) {
			throw e;
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		}
		
		return catRecord;
	}

	protected CatRecord readScheda(String id, String collocazione, String tipologiaMateriale, String titolo, String lingua, 
			Hashtable<String, String> data, String supporto, String[] tecnica, String dimensioni, String scala, String statoConservazione, 
			Vector<String> autore, String[] datiFruizione, String compilatore, String dataCompilazione, String note, String related,
			String repositoryID, String repositoryLabel){
		CatRecord catRecord = null;
		Ead ead = null;
		Archdesc archdesc = null;
		Relatedmaterial relatedmaterial = null;

		try {

			ead = new Ead();

			archdesc = new Archdesc();
			archdesc.setLevel("otherlevel");
			archdesc.setOtherlevel("1");
			
			archdesc.setDid(genDid(id, titolo, data, collocazione, repositoryID, repositoryLabel));

			archdesc.setProcessinfo("scheda di prova");

			relatedmaterial = new Relatedmaterial();
			relatedmaterial.setArchref(related);
			archdesc.setRelatedmaterial(relatedmaterial);
			ead.setArchdesc(archdesc);
			
			catRecord = initCatRecord(id, "complesso archivistico");
			catRecord.getCatRecordBody().getContent().add(ead);
		} catch (DatatypeConfigurationException e) {
			log.error(e.getMessage(), e);
		}
		
		return catRecord;
	}

	private Did genDid(String id, String titolo, Hashtable<String, String> date, String collocazione, String repositoryID, String repositoryLabel){
		Did did = null;
		Unitid unitid = null;
		Unittitle unittitle = null;
		Datetype unitdate = null;
		Physdesc physdesc = null;
		Repository repository = null;
		String key = null;
		String data = null;
		Enumeration<String> keys = null;

		did = new Did();
		
		unitid = new Unitid();
		unitid.setType("permanent_number");
		unitid.setIdentifier(id);
		unitid.setValue(id);
		did.setUnitid(unitid);

		unittitle = new Unittitle();
		unittitle.setValue((titolo==null || titolo.trim().equals("")?"Non presente":titolo));
		did.getUnittitle().add(unittitle);

		
		keys = date.keys();
		while(keys.hasMoreElements()){
			key =keys.nextElement();
			data = date.get(key);
			if (data != null){
				String dataN = data.replace("/", "");
				try{
					if (Integer.parseInt(data)>0){
						unitdate = new Datetype();
						unitdate.setDatechar("non indicata");
						unitdate.setNormal((dataN.length()==0?"00000000":(dataN.length()==4?"0000"+dataN:dataN)));
						unitdate.setValue(data);
						did.getUnitdate().add(unitdate);
					}
				} catch(Exception e){
				}
			}
		}
		if (did.getUnitdate().size()==0){
			unitdate = new Datetype();
			unitdate.setDatechar("non indicata");
			unitdate.setNormal("00000000");
			did.getUnitdate().add(unitdate);
		}
		physdesc = new Physdesc();
		physdesc.setExtent(collocazione);
		did.setPhysdesc(physdesc);

		repository = new Repository();
		repository.setId(repositoryID);
		repository.setLabel(repositoryID);
		did.getRepository().add(repository);
		return did;
	}
}