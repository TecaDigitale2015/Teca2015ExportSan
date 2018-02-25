/**
 * 
 */
package mx.teca2015.tecaExport.tecaExportSan.scheda;

import java.io.File;
import java.util.Hashtable;

import jxl.Cell;
import mx.teca2015.tecaExport.tecaExportSan.scheda.exception.JFileException;

/**
 * @author massi
 *
 */
public class UD {

	private String bid = null;
	private String soggettoConservatore = null;
	private String soggettoConservatoreKey = null;
	private String fondo = null;
	private String fondoKey = null;
	private String subFondo = null;
	private String subFondoKey = null;
	private String collocazione = null;
	private String cCol01 = null;
	private String cCol01Sigla = null;
	private String cCol01Desc = null;
	private String cCol01Value = null;
	private String cCol02 = null;
	private String cCol02Sigla = null;
	private String cCol02Desc = null;
	private String cCol02Value = null;
	private String cCol02Value2 = null;
	private String tipologiaUnitaArchivistica = null;
	private String titolo = null;
	private String lingua = null;
	private String annoIniziale = null;
	private String annoFinale = null;
	private String secoloIniziale = null;
	private String secoloFinale = null;
	private String supporto = null;
	private String consistenzaCarte = null;
	private String statoConservazione = null;
	private String documentiCartografici = null;
	private Hashtable<String, String> children = null;
	private String compilatore = null;
	private String dataCompilazione = null;
	private String note = null;
	private Integer pagine = null;
	
//	private Metadigit mag = null;

	public UD(Cell[] riga, File fOri) throws JFileException{
		String tmp = null;

		try {
			bid =ToolsXsl.analizza(riga[0]);
			if (bid ==null){
				throw new JFileException("Asssente il Codice di identificazione");
			}
			
			soggettoConservatoreKey =  ToolsXsl.analizza(riga[3]);
			
			soggettoConservatore =  ToolsXsl.analizza(riga[4]);
			if (soggettoConservatore.equalsIgnoreCase("Biblioteca Pubblica Arcivescovile \"Annibale De Leo\"") ||
					soggettoConservatore.equalsIgnoreCase("Biblioteca Arcivescovile A. De Leo Brindisi")){
				soggettoConservatore = "Biblioteca pubblica arcivescovile Annibale De Leo";
			}

			if (soggettoConservatoreKey ==null ||
					soggettoConservatore == null){
				throw new JFileException("Asssente il Sogetto conservatore");
			}
			
			fondoKey =  ToolsXsl.analizza(riga[5]);
			
			fondo =  ToolsXsl.analizza(riga[6]);
			
			fondo = fondo.replace("Consiglio d'Intendenza di Capitanata", "Consiglio di Intendenza di Capitanata");
			fondo = fondo.replace("Gran corte criminale di Capitanata", "Gran Corte criminale di Capitanata");
			fondo = fondo.replace("Tribunale civile di Terra d'Otranto", "Tribunale Civile di Terra d'Otranto");
			fondo = fondo.replace("Tribunale civile e penale di Lucera", "Tribunale Civile e Penale di Lucera");
			if (fondoKey ==null ||
					fondo == null){
				throw new JFileException("Asssente il Fondo");
			}
			
			subFondoKey =  ToolsXsl.analizza(riga[7]);
			
			subFondo =  ToolsXsl.analizza(riga[8]);

			if (subFondo != null){
				subFondo = subFondo.replace("Serie II", "II Serie");
				subFondo = subFondo.replace("Archivio comunale di Brindisi-Ctg X-Cl 9", "Archivio comunale di Brindisi-Ctg X-Classe 9");
				subFondo = subFondo.replace("Affari Comunali", "Affari comunali");
				subFondo = subFondo.replace("Archivio comunale di Brindisi-Ctg X-Cl 23", "Archivio comunale di Brindisi-Ctg X-Classe 23");
				subFondo = subFondo.replace("Archivio comunale di Brindisi-Ctg I-Cl 12", "Archivio comunale di Brindisi-Ctg I-Classe 12");
				subFondo = subFondo.replace("Archivio comunale di Brindisi-Ctg. X-Cl25", "Archivio comunale di Brindisi-Ctg X-Classe 25");
				subFondo = subFondo.replace("Archivio comunele di Brindisi-Ctg III-Classe 3", "Archivio comunale di Brindisi-Ctg III-Classe 3");
				subFondo = subFondo.replace("Archivio comunele di Brindisi-Ctg IV-Cl 7", "Archivio comunale di Brindisi-Ctg IV-Cl 7");
				subFondo = subFondo.replace("Ammnistrazione del Beneficio di San Pietro in Cuppis", "Amministrazione del Beneficio di San Pietro in Cuppis");
			}
			
			cCol01 = ToolsXsl.analizza(riga[9]);
			cCol01Sigla = ToolsXsl.analizza(riga[9]);
			cCol01Desc = ToolsXsl.analizza(riga[10]);
			collocazione =  ToolsXsl.analizza(riga[10]);
			tmp = ToolsXsl.analizza(riga[11]);
			if (collocazione ==null ||
					tmp == null){
				throw new JFileException("Asssente la Collocazione");
			} else {
				cCol01Value = tmp.replace(".0", "");
				cCol01 += tmp.replace(".0", "");
				collocazione += " "+tmp.replace(".0", "");
			}
			
			cCol02 = ToolsXsl.analizza(riga[12]);
			tmp = ToolsXsl.analizza(riga[13]);
			if (tmp != null){
				cCol02Sigla = ToolsXsl.analizza(riga[12]);
				cCol02Desc = ToolsXsl.analizza(riga[13]);
				collocazione += " "+tmp;

				tmp = ToolsXsl.analizza(riga[14]);
				if (collocazione ==null ||
						tmp == null){
					throw new JFileException("Asssente la Collocazione");
				} else {
					cCol02Value = tmp.replace(".0", "");
					cCol02 += tmp.replace(".0", "");
					collocazione += " "+tmp.replace(".0", "");
				}

				tmp = ToolsXsl.analizza(riga[15]);
				if (tmp != null){
					cCol02Value2 = ToolsXsl.analizza(riga[15]);
					cCol02 += "."+tmp;
					collocazione += "."+tmp;
				}
			}

			tipologiaUnitaArchivistica =  ToolsXsl.analizza(riga[16]);
			if (tipologiaUnitaArchivistica ==null){
				throw new JFileException("Asssente la Tipologia Unità Archivistica");
			}

			titolo =  ToolsXsl.analizza(riga[17]);
			if (titolo ==null){
				throw new JFileException("Asssente il Titolo");
			}

			lingua =  ToolsXsl.analizza(riga[18]);
			if (lingua ==null){
				throw new JFileException("Asssente la Lingua");
			}

			if (ToolsXsl.analizza(riga[19])!=null){
				annoIniziale = ToolsXsl.analizza(riga[19]).replace(".0", "");
			}

			if (ToolsXsl.analizza(riga[20])!=null){
				annoFinale =  ToolsXsl.analizza(riga[20]).replace(".0", "");
			}

			secoloIniziale =  ToolsXsl.analizza(riga[21]);

			secoloFinale =  ToolsXsl.analizza(riga[22]);

			supporto =  ToolsXsl.analizza(riga[23]);
			if (supporto ==null){
				throw new JFileException("Asssente il Supporto");
			}

			consistenzaCarte =  ToolsXsl.analizza(riga[24]);
			if (consistenzaCarte ==null){
				throw new JFileException("Asssente la Consistenza carte scritte");
			}

			statoConservazione =  ToolsXsl.analizza(riga[25]);
			if (statoConservazione ==null){
				throw new JFileException("Asssente lo Stato di conservazione");
			}

			documentiCartografici =  ToolsXsl.analizza(riga[27]);

			if (ToolsXsl.analizza(riga[2]) != null){
//				readChildren(ToolsXsl.analizza(riga[2]), fOri);
			}

			compilatore =  ToolsXsl.analizza(riga[29]);
			if (compilatore ==null){
				throw new JFileException("Asssente il nome del compilatore");
			}

			dataCompilazione =  ToolsXsl.analizza(riga[30]);
			if (dataCompilazione ==null){
				throw new JFileException("Asssente la data compilazione");
			}

			note =  ToolsXsl.analizza(riga[26]);
			
			if (ToolsXsl.analizza(riga[28]) ==null){
				throw new JFileException("Asssente il numero di pagine associate");
			} else {
				pagine = new Integer(ToolsXsl.analizza(riga[28]).replace(".0", ""));
//				genMag(fOri);
			}

		} catch (NumberFormatException e) {
			throw new JFileException(e.getMessage(), e);
		} catch (JFileException e) {
			throw e;
		}
	}

//	private void readChildren(String children, File fOri) throws JFileException{
//		Workbook wb = null;
//		Sheet finestra = null;
//		Cell[] riga = null;
//		File f = null;
//		String[] st = null;
//		
//		st = children.split(" ; ");
//		this.children = new Hashtable<String, String>();
//		for (int x=0; x<st.length; x++){
//			try {
//				f = new File(fOri.getParentFile().getAbsolutePath()+
//						File.separator+
//						st[x].trim()+".xls");
//				if (f.exists()){
//					// Apro il file xlsx
//					wb = JUC.openFileXls(f.getAbsolutePath());
//	
//					// Leggo le infomrazioni della 1 finestra
//					finestra = wb.getSheet(0);
//					riga = finestra.getRow(1);
//					this.children.put(st[x].trim(), ToolsXsl.analizza(riga[17]));
//				} else {
//					throw new JFileException("Il file ["+f.getAbsolutePath()+"] non esiste");
//				}
//			} catch (BiffException e) {
//				throw new JFileException(e.getMessage(),e);
//			} catch (IndexOutOfBoundsException e) {
//				throw new JFileException(e.getMessage(),e);
//			} catch (IOException e) {
//				throw new JFileException(e.getMessage(),e);
//			} catch (JFileException e) {
//				throw e;
//			}  finally {
//				if (wb != null){
//					wb.close();
//				}
//			}
//		}
//	}
	
//	private void genMag(File fOri) throws JFileException{
//		Workbook wb = null;
//		Sheet finestra = null;
//		Cell[] riga = null;
//		File f = null;
//		Gen gen = null;
//		Bib bib = null;
//		SimpleLiteral identifier = null;
//		MagXsd magXsd = null;
//		Img img = null;
//		String[] st = null;
//		String folderImg = null;
//		File fImg = null;
//		Link file = null;
//		Altimg altImg = null;
//
//		try {
//			st = fOri.getName().replace(".xls", "").split("_");
//			fImg = new File(fOri.getParentFile().getAbsolutePath()+
//					File.separator+
//					st[st.length-1]);
//			if (fImg.exists()){
//				folderImg = "./"+st[st.length-1]+"/";
//			} else {
//				folderImg = "./";
//			}
//			f = new File(fOri.getParentFile().getAbsolutePath()+
//					File.separator+
//					fOri.getName().replace(".xls", "_Nomenclatura.xls"));
//			if (f.exists()){
//				// Apro il file xlsx
//				wb = JUD.openFileXls(f.getAbsolutePath());
//
//				// Leggo le infomrazioni della 1 finestra
//				finestra = wb.getSheet(0);
//				if (finestra.getRows()==(pagine+1)){
//					mag = new Metadigit();
//
//					gen = new Gen();
//					gen.setAccessRights(new BigInteger("1"));
//					gen.setAgency("Agency");
//					gen.setCollection("Collection");
//					gen.setCompleteness(new BigInteger("0"));
//					gen.setCreation(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
//					gen.setLastUpdate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
//					gen.setStprog("Stprog");
//					mag.setGen(gen);
//					
//					bib = new Bib();
//					identifier  = new SimpleLiteral();
//					identifier.getContent().add(bid);
//					bib.getIdentifier().add(identifier);
//					mag.setBib(bib);
//					
//					magXsd = new MagXsd();
//					for (int x=1; x<finestra.getRows(); x++){
//						riga = finestra.getRow(x);
//						img = new Img();
//						img.setNomenclature(ToolsXsl.analizza(riga[1]));
//						img.getUsage().add("1");
//						file = new Link();
//						file.setHref(folderImg+"TIF/"+ToolsXsl.analizza(riga[0]));
//						img.setFile(file);
//
//						altImg = new Altimg();
//						altImg.getUsage().add("2");
//						file = new Link();
//						file.setHref(folderImg+"300/"+ToolsXsl.analizza(riga[0]).replace(".tif", ".jpg"));
//						altImg.setFile(file);
//						img.getAltimg().add(altImg);
//
//						altImg = new Altimg();
//						altImg.getUsage().add("3");
//						file = new Link();
//						file.setHref(folderImg+"150/"+ToolsXsl.analizza(riga[0]).replace(".tif", ".jpg"));
//						altImg.setFile(file);
//						img.getAltimg().add(altImg);
//
//						magXsd.calcImg(img, fOri.getParentFile().getAbsolutePath());
//						mag.getImg().add(img);
//					}
//				} else {
//					throw new JFileException("Il numero di pagine indicate come digitalizzate non corrispondono alle nomenclate");
//				}
//			} else {
//				throw new JFileException("Il file ["+f.getAbsolutePath()+"] non esiste");
//			}
//		} catch (BiffException e) {
//			throw new JFileException(e.getMessage(), e);
//		} catch (IndexOutOfBoundsException e) {
//			throw new JFileException(e.getMessage(), e);
//		} catch (IOException e) {
//			throw new JFileException(e.getMessage(), e);
//		} catch (DatatypeConfigurationException e) {
//			throw new JFileException(e.getMessage(), e);
//		} catch (XsdException e) {
//			throw new JFileException(e.getMessage(), e);
//		} catch (JFileException e) {
//			throw e;
//		} finally {
//			if (wb != null){
//				wb.close();
//			}
//		}
//	}

	/**
	 * @return the bid
	 */
	public String getBid() {
		return bid.replace(" ", "_");
	}

	/**
	 * @return the soggettoConservatore
	 */
	public String getSoggettoConservatore() {
		return soggettoConservatore;
	}

	/**
	 * @return the soggettoConservatoreKey
	 */
	public String getSoggettoConservatoreKey() {
		return soggettoConservatoreKey;
	}

	/**
	 * @return the fondo
	 */
	public String getFondo() {
		return fondo;
	}

	/**
	 * @return the fondoKey
	 */
	public String getFondoKey() {
		return fondoKey;
	}

	/**
	 * @return the subFondo
	 */
	public String getSubFondo() {
		return subFondo;
	}

	/**
	 * @return the subFondoKey
	 */
	public String getSubFondoKey() {
		return subFondoKey;
	}

	/**
	 * @return the collocazione
	 */
	public String getCollocazione() {
		return collocazione;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @return the lingua
	 */
	public String getLingua() {
		return lingua;
	}

	/**
	 * @return the supporto
	 */
	public String getSupporto() {
		return supporto;
	}

	/**
	 * @return the statoConservazione
	 */
	public String getStatoConservazione() {
		return statoConservazione;
	}

	/**
	 * @return the compilatore
	 */
	public String getCompilatore() {
		return compilatore;
	}

	/**
	 * @return the dataCompilazione
	 */
	public String getDataCompilazione() {
		return dataCompilazione;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @return the pagine
	 */
	public Integer getPagine() {
		return pagine;
	}

	/**
	 * @return the tipologiaUnitaArchivistica
	 */
	public String getTipologiaUnitaArchivistica() {
		return tipologiaUnitaArchivistica;
	}

	/**
	 * @return the annoIniziale
	 */
	public String getAnnoIniziale() {
		return annoIniziale;
	}

	/**
	 * @return the annoFinale
	 */
	public String getAnnoFinale() {
		return annoFinale;
	}

	/**
	 * @return the secoloIniziale
	 */
	public String getSecoloIniziale() {
		return secoloIniziale;
	}

	/**
	 * @return the secoloFinale
	 */
	public String getSecoloFinale() {
		return secoloFinale;
	}

	/**
	 * @return the consistenzaCarte
	 */
	public String getConsistenzaCarte() {
		return consistenzaCarte;
	}

	/**
	 * @return the documentiCartografici
	 */
	public String getDocumentiCartografici() {
		return documentiCartografici;
	}

	/**
	 * @return the children
	 */
	public Hashtable<String, String> getChildren() {
		return children;
	}

	public String getcCol01() {
		return cCol01;
	}

	public String getcCol02() {
		return cCol02;
	}

	public String getcCol01Sigla() {
		return cCol01Sigla;
	}

	public String getcCol01Desc() {
		return cCol01Desc;
	}

	public String getcCol01Value() {
		return cCol01Value;
	}

	public String getcCol02Sigla() {
		return cCol02Sigla;
	}

	public String getcCol02Desc() {
		return cCol02Desc;
	}

	public String getcCol02Value() {
		return cCol02Value;
	}

	public String getcCol02Value2() {
		return cCol02Value2;
	}

	/**
	 * @return the mag
	 */
//	public Metadigit getMag() {
//		return mag;
//	}
}
