package mx.teca2015.tecaExport.tecaExportSan.ead;

import isbn._1_931666_22_9.Abbr;
import isbn._1_931666_22_9.Archdesc;
import isbn._1_931666_22_9.AvLevel;
import isbn._1_931666_22_9.Container;
import isbn._1_931666_22_9.Date;
import isbn._1_931666_22_9.Did;
import isbn._1_931666_22_9.Dimensions;
import isbn._1_931666_22_9.Ead;
import isbn._1_931666_22_9.Eadheader;
import isbn._1_931666_22_9.Eadid;
import isbn._1_931666_22_9.Emph;
import isbn._1_931666_22_9.Extent;
import isbn._1_931666_22_9.Filedesc;
import isbn._1_931666_22_9.Genreform;
import isbn._1_931666_22_9.Langmaterial;
import isbn._1_931666_22_9.Language;
import isbn._1_931666_22_9.Note;
import isbn._1_931666_22_9.ObjectFactory;
import isbn._1_931666_22_9.Origination;
import isbn._1_931666_22_9.P;
import isbn._1_931666_22_9.Persname;
import isbn._1_931666_22_9.Physdesc;
import isbn._1_931666_22_9.Physfacet;
import isbn._1_931666_22_9.Physloc;
import isbn._1_931666_22_9.Phystech;
import isbn._1_931666_22_9.Processinfo;
import isbn._1_931666_22_9.Title;
import isbn._1_931666_22_9.Titleproper;
import isbn._1_931666_22_9.Titlestmt;
import isbn._1_931666_22_9.Unitdate;
import isbn._1_931666_22_9.Unitid;
import isbn._1_931666_22_9.Unittitle;

import java.io.File;
import java.util.Hashtable;
import java.util.Vector;

import mx.randalf.configuration.Configuration;
import mx.randalf.configuration.exception.ConfigurationException;
import mx.randalf.ead.EadXsd;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.xsd.exception.XsdException;

public class Ua {

	public Ua() {
	}

	public static void genFondoEad(String id, String collocazione, String cCol01, String cCol01Sigla, String cCol01Desc,
			String cCol01Value, String cCol02, String cCol02Sigla, String cCol02Desc, String cCol02Value, String cCol02Value2,
			String root, String rootDesc, String tipologiaMateriale,
			String titolo, String lingua, String dataCronica, String dataTopica, String supporto, String[] tecniche,
			String dimensione, String scala, String statoConservazione, Vector<String> autori, String[] datiFruizione,
			String compilatore, String dataCompilazione, String note, String path, String nomeFile) 
					throws XsdException, PubblicaException, ConfigurationException{
		Ead ead = null;
		EadXsd eadXsd = null;
		File fXml = null;
		File fXmlCert = null;
		
		try {
			fXmlCert = new File(path+
					File.separator+
					nomeFile+
					".xml.cert");
			if (!fXmlCert.exists()){
				fXml = new File(path+
						File.separator+
						nomeFile+
						".xml");
				ead = new Ead();
				ead.setEadheader(genEadheader(id));
				ead.setArchdesc(genArchdesc(id, collocazione, cCol01, cCol01Sigla, cCol01Desc, cCol01Value, cCol02, cCol02Sigla, 
						cCol02Desc, cCol02Value, cCol02Value2, tipologiaMateriale,titolo, lingua, dataCronica, dataTopica, supporto, 
						tecniche, dimensione, scala, statoConservazione, autori, datiFruizione, compilatore, dataCompilazione, note));

				eadXsd = new EadXsd();
				eadXsd.write(ead, fXml);
			}
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		} catch (ConfigurationException e) {
			throw e;
		}
	}

	public static void genFondoEad(String id, String collocazione, String cCol01, String cCol01Sigla, String cCol01Desc,
			String cCol01Value, String cCol02, String cCol02Sigla, String cCol02Desc, String cCol02Value, String cCol02Value2,
			String tipologiaUnitaArchivistica, String titolo, String lingua, String annoIniziale, String annoFinale,
			String secoloIniziale, String secoloFinale, String supporto, String consistenzaCarte, String statoConservazione,
			String documentiCartografici, Hashtable<String, String> children, String compilatore, String dataCompilazione, 
			String note, String path, String nomeFile) 
					throws XsdException, PubblicaException, ConfigurationException{
		Ead ead = null;
		EadXsd eadXsd = null;
		File fXml = null;
		File fXmlCert = null;
		
		try {
			fXmlCert = new File(path+
					File.separator+
					nomeFile+
					".xml.cert");
			if (!fXmlCert.exists()){
				fXml = new File(path+
						File.separator+
						nomeFile+
						".xml");
				ead = new Ead();
				ead.setEadheader(genEadheader(id));
				ead.setArchdesc(genArchdesc(id, collocazione, cCol01, cCol01Sigla, cCol01Desc, cCol01Value, cCol02, cCol02Sigla, 
						cCol02Desc, cCol02Value, cCol02Value2, tipologiaUnitaArchivistica, titolo, lingua, annoIniziale, annoFinale,
						secoloIniziale, secoloFinale, supporto, consistenzaCarte, statoConservazione, documentiCartografici, children, 
						compilatore, dataCompilazione, note));

				eadXsd = new EadXsd();
				eadXsd.write(ead, fXml);
			}
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		} catch (ConfigurationException e) {
			throw e;
		}
	}

	private static Eadheader genEadheader(String id){
		Eadheader eadheader = null;
		Eadid eadid = null;
		Filedesc filedesc = null;
		Titlestmt titlestmt = null;
		Titleproper titleproper = null;

		eadheader = new Eadheader();

		eadid = new Eadid();
		eadid.setContent(id);
		eadheader.setEadid(eadid);

		filedesc = new Filedesc();
		titlestmt = new Titlestmt();
		titleproper = new Titleproper();
		titlestmt.getTitleproper().add(titleproper);
		filedesc.setTitlestmt(titlestmt);
		eadheader.setFiledesc(filedesc);
		return eadheader;
	}

	private static Archdesc genArchdesc(String id, String collocazione, String cCol01, String cCol01Sigla, String cCol01Desc,
			String cCol01Value, String cCol02, String cCol02Sigla, String cCol02Desc, String cCol02Value, String cCol02Value2,
			String tipologiaUnitaArchivistica, String titolo, String lingua, String annoIniziale, String annoFinale,
			String secoloIniziale, String secoloFinale, String supporto, String consistenzaCarte, String statoConservazione,
			String documentiCartografici, Hashtable<String, String> children, String compilatore, String dataCompilazione, 
			String note) throws ConfigurationException{
		Archdesc archdesc = null;
		Did did = null;

		archdesc = new Archdesc();
		archdesc.setLevel(AvLevel.FILE);

		did = new Did();

		did.getMDid().add(getUnitid(id));

		did.getMDid().add(getUnittitle(titolo));

		did.getMDid().add(genPhysloc(collocazione));

		did.getMDid().add(getContainer(cCol01Sigla, cCol01Desc, cCol01Value));

		if (cCol02Desc != null && !cCol02Desc.trim().equals("")){
			did.getMDid().add(getContainer(cCol02Sigla, cCol02Desc, cCol02Value+(cCol02Value2!=null?"."+cCol02Value2:"")));
		}

		did.getMDid().add(getPhysdesc(tipologiaUnitaArchivistica, supporto, null, null, null, consistenzaCarte));

		if (lingua != null && !lingua.trim().equals("")){
			String[] st = null;
			st = lingua.split(";");
			for (int x=0; x<st.length; x++){
				did.getMDid().add(getLangmaterial(st[x].trim()));
			}
		}

		if (annoIniziale != null){
			did.getMDid().add(getUnitdate(annoIniziale, "Anno Iniziale"));
		}

		if (annoFinale != null){
			did.getMDid().add(getUnitdate(annoFinale, "Anno Finale"));
		}

		if (secoloIniziale != null){
			did.getMDid().add(getUnitdate(secoloIniziale, "Secolo Iniziale"));
		}

		if (secoloFinale != null){
			did.getMDid().add(getUnitdate(secoloFinale, "Secolo Finale"));
		}

		
//		documentiCartografici

		archdesc.setDid(did);
		archdesc.getMDescFull().add(getPhystech("physical conditions",statoConservazione));
		
		if (note != null){
			archdesc.getMDescFull().add(getNote(note));
		}

		archdesc.getMDescFull().add(getProcessinfo(compilatore, dataCompilazione));

		return archdesc;
	}

	private static Archdesc genArchdesc(String id, String collocazione, String cCol01, String cCol01Sigla, String cCol01Desc,
			String cCol01Value, String cCol02, String cCol02Sigla, String cCol02Desc, String cCol02Value, String cCol02Value2, 
			String tipologiaMateriale, String titolo, String lingua, String dataCronica, String dataTopica, String supporto, 
			String[] tecniche, String dimensione, String scala, String statoConservazione, Vector<String> autori, String[] datiFruizione,
			String compilatore, String dataCompilazione, String note) throws ConfigurationException{
		Archdesc archdesc = null;
		Did did = null;

		archdesc = new Archdesc();
		archdesc.setLevel(AvLevel.FILE);

		did = new Did();

		did.getMDid().add(getUnitid(id));

		did.getMDid().add(getUnittitle(titolo));

		did.getMDid().add(genPhysloc(collocazione));

		did.getMDid().add(getContainer(cCol01Sigla, cCol01Desc, cCol01Value));

		if (cCol02Desc != null && !cCol02Desc.trim().equals("")){
			did.getMDid().add(getContainer(cCol02Sigla, cCol02Desc, cCol02Value+(cCol02Value2!=null?"."+cCol02Value2:"")));
		}

		did.getMDid().add(getPhysdesc(tipologiaMateriale, supporto, tecniche, dimensione, scala, null));

		if (lingua != null && !lingua.trim().equals("")){
			String[] st = null;
			st = lingua.split(";");
			for (int x=0; x<st.length; x++){
				did.getMDid().add(getLangmaterial(st[x].trim()));
			}
		}

		if (dataCronica != null){
			did.getMDid().add(getUnitdate(dataCronica, "Data Cronica"));
		}

		if (dataTopica != null){
			did.getMDid().add(getUnitdate(dataTopica, "Data Topica"));
		}

		if (autori != null && autori.size()>0){
			did.getMDid().add(getOrigination(autori));
		}

		archdesc.setDid(did);
		archdesc.getMDescFull().add(getPhystech("physical conditions",statoConservazione));
		
		if (note != null){
			archdesc.getMDescFull().add(getNote(note));
		}
		if (datiFruizione != null && datiFruizione.length>0){
			for (int x=0; x<datiFruizione.length; x++){
				archdesc.getMDescFull().add(getNote(datiFruizione[x]));
			}
		}

		archdesc.getMDescFull().add(getProcessinfo(compilatore, dataCompilazione));

		return archdesc;
	}
	
	private static Unitid getUnitid(String id){
		Unitid unitId = null;

		unitId = new Unitid();
		unitId.setType("permanent number");
		unitId.setIdentifier(id);
		return unitId;
	}
	
	private static Unittitle getUnittitle(String titolo){
		Unittitle unittitle = null;

		unittitle = new Unittitle();
		unittitle.setLabel(titolo);
		return unittitle;
	}

	private static Container getContainer(String sigla, String desc, String value){
		Container container = null;
		Abbr abbr = null;
		ObjectFactory of = null;

		of = new ObjectFactory();
		
		container = new Container();
		container.setType(desc);
		abbr = new Abbr();
		abbr.setContent(sigla);
		container.getContent().add(of.createContainerAbbr(abbr));
		container.setLabel(value);
		return container;
	}

	private static Physloc genPhysloc(String collocazione){
		Physloc physloc = null;
		Title title = null;
		ObjectFactory of = null;

		of = new ObjectFactory();

		physloc = new Physloc();
		title = new Title();
		title.setTitle(collocazione);
		physloc.getContent().add(of.createPhyslocTitle(title));
		return physloc;
	}

	private static Physdesc getPhysdesc(String tipologiaMateriale, String supporto, String[] tecniche, String dimensione, String scala, String consistenzaCarte){
		Physdesc physdesc = null;
		Genreform genreform = null;
		Physfacet physfacet = null;
		Dimensions dimensions = null;
		Emph emph = null;
		Title title = null;
		ObjectFactory of = null;
		Extent extent = null;

		of = new ObjectFactory();
		
		physdesc = new Physdesc();
		genreform = new Genreform();
		genreform.setType("documentary form");
		emph = new Emph();
		title = new Title();
		title.setTitle(tipologiaMateriale);
		emph.getContent().add(of.createPhysdescTitle(title));
		genreform.getContent().add(of.createPhysdescEmph(emph));
		physdesc.getContent().add(of.createPhysdescGenreform(genreform));

		physfacet = new Physfacet();
		physfacet.setLabel(supporto);
		physdesc.getContent().add(of.createPhysdescPhysfacet(physfacet));
		
		if (tecniche != null){
			for (int x=0; x<tecniche.length; x++){
				physfacet = new Physfacet();
				physfacet.setEncodinganalog("Scheda F - MTC");
				physfacet.setLabel(tecniche[x]);
				physdesc.getContent().add(of.createPhysdescPhysfacet(physfacet));
			}
		}

		if (dimensione != null && scala != null){
			dimensions = new Dimensions();
			dimensions.setType("size");
			dimensions.setLabel(dimensione);
			dimensions.setUnit(scala);
			physdesc.getContent().add(of.createPhysdescDimensions(dimensions));
		}
		
		if (consistenzaCarte != null){
			extent = new Extent();
			extent.setUnit("sheets");
			extent.setLabel(consistenzaCarte);
			physdesc.getContent().add(of.createPhysdescExtent(extent));
		}
		return physdesc;
	}

	private static Langmaterial getLangmaterial(String lingua) throws ConfigurationException{
		Langmaterial langmaterial = null;
		Language language = null;
		ObjectFactory of = null;

		of = new ObjectFactory();
		
		langmaterial = new Langmaterial();
		
		language = new Language();
		language.setLangcode(Configuration.getValueDefault("lingua."+lingua, lingua));
		language.setEncodinganalog(lingua);
		langmaterial.getContent().add(of.createLangmaterialLanguage(language));
		return langmaterial;
	}

	private static Unitdate getUnitdate(String date, String encodinganalog){
		Unitdate unitdate = null;
		
		unitdate = new Unitdate();
		unitdate.setLabel(date);
		unitdate.setEncodinganalog(encodinganalog);
		return unitdate;
	}

	private static Phystech getPhystech(String type, String value){
		Phystech phystech = null;
		P p = null;
		Title title = null;
		ObjectFactory of = null;

		of = new ObjectFactory();
		
		phystech = new Phystech();
		phystech.setType(type);
		p = new P();
		
		title = new Title();
		title.setTitle(value);
		p.getContent().add(of.createPTitle(title));
		phystech.getAddressOrChronlistOrList().add(p);
		return phystech;
	}

	private static Origination getOrigination(Vector<String> autori){
		Origination origination = null;
		Persname persname = null;
		ObjectFactory of = null;

		of = new ObjectFactory();
		
		origination = new Origination();
		for (int x=0;x<autori.size(); x++){
			persname = new Persname();
			persname.setEncodinganalog(autori.get(x));
			origination.getContent().add(of.createOriginationPersname(persname));
		}
		return origination;
	}
	
	private static Note getNote(String value){
		Note note = null;
		P p = null;
		Title title = null;
		ObjectFactory of = null;

		of = new ObjectFactory();
		
		note = new Note();
		p = new P();
		
		title = new Title();
		title.setTitle(value);
		p.getContent().add(of.createPTitle(title));
		note.getMBlocks().add(p);
		return note;
	}

	private static Processinfo getProcessinfo(String compilatore, String dataCompilazione){
		Processinfo processinfo = null;
		P p = null;
		Persname persname = null;
		Date date = null;
		ObjectFactory of = null;

		of = new ObjectFactory();
		
		processinfo = new Processinfo();
		p = new P();
		persname = new Persname();
		persname.setNormal(compilatore);
		p.getContent().add(of.createPPersname(persname));
		date = new Date();
		date.setEncodinganalog(dataCompilazione);
		p.getContent().add(of.createPDate(date));
		processinfo.getAddressOrChronlistOrList().add(p);
		return processinfo;
	}
}
