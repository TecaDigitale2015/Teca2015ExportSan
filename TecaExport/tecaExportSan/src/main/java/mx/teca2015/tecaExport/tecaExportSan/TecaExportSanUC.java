package mx.teca2015.tecaExport.tecaExportSan;

import it.mibac.san.cat_import.CatImport;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.xml.datatype.DatatypeConfigurationException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import mx.teca2015.tecaExport.tecaExportSan.ead.Ua;
import mx.teca2015.tecaExport.tecaExportSan.scheda.UC;
import mx.teca2015.tecaExport.tecaExportSan.scheda.exception.JFileException;

import org.apache.log4j.Logger;

public class TecaExportSanUC extends TecaExportSanXls {

	private Logger log = Logger.getLogger(TecaExportSanUC.class);
	private File fXml = null;
	
	
	public TecaExportSanUC(File fXml) {
		this.fXml = fXml;
	}


	@Override
	public void esegui(File pathRoot) {
		Workbook wb = null;
		Sheet finestra = null;
		UC uc = null;
		CatImport catImport = null;
		Hashtable<String, String> date = new Hashtable<String, String>();
		String related = null;
		String repositoryID = null;
		String repositoryLabel = null;
		File pathIstituto = null;
		File pathFondo = null;
		File pathSubFondo = null;
		
		try {
			if (fXml.exists()){
				wb = openFileXls(fXml.getAbsolutePath());

				// Leggo le infomrazioni della 1 finestra
				finestra = wb.getSheet(0);

				uc = new UC(finestra.getRow(1), fXml);

//				pathSubFondo = fXml.getParentFile();

				pathIstituto = pathRoot; 
				pathFondo = new File(pathIstituto.getAbsolutePath()+File.separator+uc.getSoggettoConservatoreKey());
				if ((uc.getSubFondoKey() != null && !uc.getSubFondoKey().trim().equals("")) &&
						(uc.getSubFondo() != null && !uc.getSubFondo().trim().equals(""))){
					pathSubFondo  = new File(pathFondo.getAbsolutePath()+File.separator+uc.getSubFondoKey());
				}
//				if (uc.getcCol02()!= null && !uc.getcCol02().trim().equals("")){
//					= pathSubFondo.getParentFile(); 
//				}
//
//				if (uc.getcCol01()!= null && !uc.getcCol01().trim().equals("")){
//					pathSubFondo = pathSubFondo.getParentFile(); 
//				}
//
//				if (uc.getSubFondoKey()!= null && !uc.getSubFondoKey().trim().equals("")){
//					pathFondo = pathSubFondo.getParentFile(); 
//				} else {
//				}
//
//				if (uc.getFondoKey()!= null && !uc.getFondoKey().trim().equals("")){
//				}

				catImport = initCatImport(uc.getBid(), uc.getTitolo());
				catImport.getCatListRecords().getCatRecord().add(readIstituto(uc.getSoggettoConservatoreKey(), 
						uc.getSoggettoConservatore(), pathIstituto.getAbsolutePath()));
				catImport.getCatListRecords().getCatRecord().add(readFondo(uc.getFondoKey(), 
						uc.getFondo(), pathFondo.getAbsolutePath(), true));

				if ((uc.getSubFondoKey() != null && !uc.getSubFondoKey().trim().equals("")) &&
						(uc.getSubFondo() != null && !uc.getSubFondo().trim().equals(""))){
					catImport.getCatListRecords().getCatRecord().add(readFondo(uc.getSubFondoKey(), 
							uc.getSubFondo(), pathSubFondo.getAbsolutePath(), false));
				}

				if (uc.getDataCronica() != null){
					date.put("data cronica", uc.getDataCronica());
				}
				if (uc.getDataTopica() != null){
					date.put("data topica", uc.getDataTopica());
				}
				if (uc.getSubFondoKey()==null || uc.getSubFondoKey().trim().equals("")){
					repositoryID = uc.getFondoKey();
					repositoryLabel = uc.getFondo();
					related = uc.getFondoKey();
				} else {
					repositoryID = uc.getFondoKey()+"_"+uc.getSubFondoKey();
					repositoryLabel = uc.getFondo()+" / "+uc.getSubFondo();
					related = uc.getSubFondoKey();
				}
				catImport.getCatListRecords().getCatRecord().add(
						readScheda(uc.getBid(), uc.getCollocazione(), uc.getTipologiaMateriale(), uc.getTitolo(), uc.getLingua(),
								date, uc.getSupporto(), uc.getTecniche(), uc.getDimensione(), uc.getScala(), uc.getStatoConservazione(),
								uc.getAutori(), uc.getDatiFruizione(), uc.getCompilatore(),uc.getDataCompilazione(), uc.getNote(), related,
								repositoryID, repositoryLabel));
				write(catImport, fXml);
				
				Ua.genFondoEad(uc.getBid(), uc.getCollocazione(), uc.getcCol01(), uc.getcCol01Sigla(), uc.getcCol01Desc(),
						uc.getcCol01Value(), uc.getcCol02(), uc.getcCol02Sigla(), uc.getcCol02Desc(), uc.getcCol02Value(), 
						uc.getcCol02Value2(), uc.getRoot(), uc.getRootDesc(), uc.getTipologiaMateriale(), 
						uc.getTitolo(), uc.getLingua(), uc.getDataCronica(), uc.getDataTopica(), uc.getSupporto(), uc.getTecniche(), 
						uc.getDimensione(), uc.getScala(), uc.getStatoConservazione(), uc.getAutori(), uc.getDatiFruizione(), 
						uc.getCompilatore(), uc.getDataCompilazione(), uc.getNote(), fXml.getParentFile().getAbsolutePath(), 
						uc.getBid()+"_ead");
			}
		} catch (BiffException e) {
			log.error(e.getMessage(), e);
		} catch (IndexOutOfBoundsException e) {
			log.error(e.getMessage(), e);
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		} catch (JFileException e) {
			log.error(e.getMessage(), e);
		} catch (DatatypeConfigurationException e) {
			log.error(e.getMessage(), e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		} finally{
			if (wb != null){
				wb.close();
			}
		}

		
	
	}

	
}
