package mx.teca2015.tecaExport.tecaExportSan.ead;

import isbn._1_931666_22_9.Archdesc;
import isbn._1_931666_22_9.AvLevel;
import isbn._1_931666_22_9.Did;
import isbn._1_931666_22_9.Ead;
import isbn._1_931666_22_9.Eadheader;
import isbn._1_931666_22_9.Eadid;
import isbn._1_931666_22_9.Filedesc;
import isbn._1_931666_22_9.Titleproper;
import isbn._1_931666_22_9.Titlestmt;
import isbn._1_931666_22_9.Unitid;
import isbn._1_931666_22_9.Unittitle;

import java.io.File;

import mx.randalf.ead.EadXsd;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.xsd.exception.XsdException;

public class Fondo {

	public Fondo() {
	}

	public static void genFondoEad(String id, String descrizione, String path, boolean isFondo) throws XsdException, PubblicaException{
		Ead ead = null;
		EadXsd eadXsd = null;
		File fXml = null;
		File fXmlCert = null;
		
		try {
			fXmlCert = new File(path+
					File.separator+
					id+
					".xml.cert");
			if (!fXmlCert.exists()){
				fXml = new File(path+
						File.separator+
						id+
						".xml");
				ead = new Ead();
				ead.setEadheader(genEadheader(id));
				ead.setArchdesc(genArchdesc(id, descrizione, isFondo));

				eadXsd = new EadXsd();
				eadXsd.write(ead, fXml);
			}
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
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

	private static Archdesc genArchdesc(String id, String descrizione, boolean isFondo){
		Archdesc archdesc = null;
		Did did = null;
		Unitid unitId = null;
		Unittitle unittitle = null;

		archdesc = new Archdesc();
		archdesc.setLevel((isFondo?AvLevel.FONDS:AvLevel.SUBFONDS));

		did = null;
		did = new Did();
		unitId = new Unitid();
		unitId.setType("reference code");
		unitId.setCountrycode("IT");
		unitId.setIdentifier(id);
		did.getMDid().add(unitId);

		unittitle = new Unittitle();
		unittitle.setLabel(descrizione);
		did.getMDid().add(unittitle);
		archdesc.setDid(did);
		return archdesc;
	}
}
