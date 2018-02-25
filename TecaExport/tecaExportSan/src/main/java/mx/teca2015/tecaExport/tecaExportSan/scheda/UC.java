package mx.teca2015.tecaExport.tecaExportSan.scheda;

import java.io.File;
import java.util.Vector;

import mx.teca2015.tecaExport.tecaExportSan.scheda.exception.JFileException;
import jxl.Cell;

public class UC {
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
	private String root = null;
	private String rootDesc = null;
	private String tipologiaMateriale = null;
	private String titolo = null;
	private String lingua = null;
	private String dataCronica = null;
	private String dataTopica = null;
	private String supporto = null;
	private String[] tecniche = null;
	private String dimensione = null;
	private String scala = null;
	private String statoConservazione = null;
	private Vector<String> autori = null;
	private String[] datiFruizione = null;
	private String compilatore = null;
	private String dataCompilazione = null;
	private String note = null;
	private Integer pagine = null;

	public UC(Cell[] riga, File fOri) throws JFileException{
		String tmp = null;
		String[] values = null;
		String[] qualifiche = null;

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

			root =  ToolsXsl.analizza(riga[2]);
			if (root != null){
//				readRoot(fOri);
			}

			tipologiaMateriale =  ToolsXsl.analizza(riga[16]);
			if (tipologiaMateriale ==null){
				throw new JFileException("Asssente la Tipologia di materiale");
			}

			titolo =  ToolsXsl.analizza(riga[17]);
			if (titolo ==null){
				throw new JFileException("Asssente il Titolo");
			}

			lingua =  ToolsXsl.analizza(riga[18]);
			if (lingua ==null){
				throw new JFileException("Asssente la Lingua");
			}

			dataCronica = ToolsXsl.analizza(riga[19]);
			if (dataCronica == null){
				dataCronica = ToolsXsl.analizza(riga[20]);
				if (dataCronica == null){
					dataCronica = ToolsXsl.analizza(riga[21]);
					if (dataCronica == null){
						dataCronica = ToolsXsl.analizza(riga[22]);
						if (dataCronica == null){
							throw new JFileException("Asssente la Data cronica");
						}
					}
				} else {
					dataCronica = dataCronica.replace(".0", "");
				}
			}

			dataTopica = ToolsXsl.analizza(riga[23]);

			supporto =  ToolsXsl.analizza(riga[26]);
			if (supporto ==null){
				throw new JFileException("Asssente il Supporto");
			}

			if (ToolsXsl.analizza(riga[27]) == null){
				throw new JFileException("Asssente la Tecnica");
			} else {
				tecniche = ToolsXsl.analizza(riga[27]).split(" ; ");
			}

			if (ToolsXsl.analizza(riga[28]) == null ||
					ToolsXsl.analizza(riga[29]) == null){
				throw new JFileException("Asssente la Dimensione");
			} else {
				dimensione = ToolsXsl.analizza(riga[28]).replace(".0", "")+" x "+ToolsXsl.analizza(riga[29]).replace(".0", "");
			}

			scala =  ToolsXsl.analizza(riga[30]);
			if (scala ==null){
				throw new JFileException("Asssente la Scala");
			}

			statoConservazione =  ToolsXsl.analizza(riga[31]);
			if (statoConservazione ==null){
				throw new JFileException("Asssente lo Stato di conservazione");
			}

			if (ToolsXsl.analizza(riga[24]) != null ||
					ToolsXsl.analizza(riga[25]) != null){
				values = ToolsXsl.analizza(riga[24]).split(" ; ");
				qualifiche = ToolsXsl.analizza(riga[25]).split(" ; ");
				if (values.length==qualifiche.length){
					autori = new Vector<String>();
					for (int x=0; x<values.length;x++){
						autori.add(values[x].trim()+" ("+qualifiche[x].trim()+")");
					}
				} else if (qualifiche.length==0 || (qualifiche.length==1 && qualifiche[0].trim().equals(""))){
					autori = new Vector<String>();
					for (int x=0; x<values.length;x++){
						autori.add(values[x].trim());
					}
				} else {
					throw new JFileException("Il numero di Autori non corrisponde alle qualifiche indicate");
				}
			} else {
				throw new JFileException("Errata compilazione Scheda Autore");
			}

			tmp =  ToolsXsl.analizza(riga[33]);
			if (tmp ==null){
				throw new JFileException("Asssente i dati di fruizione");
			} else {
				datiFruizione =tmp.split(" ; ");
			}

			compilatore =  ToolsXsl.analizza(riga[35]);
			if (compilatore ==null){
				throw new JFileException("Asssente il nome del compilatore");
			}

			dataCompilazione =  ToolsXsl.analizza(riga[36]);
			if (dataCompilazione ==null){
				throw new JFileException("Asssente la data compilazione");
			}

			note =  ToolsXsl.analizza(riga[32]);
			
			if (ToolsXsl.analizza(riga[34]) ==null){
				throw new JFileException("Asssente il numero di pagine associate");
			} else if (ToolsXsl.analizza(riga[34]).trim().equals("")){
				pagine = 0;
			} else {
				pagine = new Integer(ToolsXsl.analizza(riga[34]).replace(".0", ""));
//				genMag(fOri);
			}
		} catch (NumberFormatException e) {
			throw new JFileException(e.getMessage(), e);
		} catch (JFileException e) {
			throw e;
		}
	}

//
//	private void readRoot(File fOri) throws JFileException{
//		Workbook wb = null;
//		Sheet finestra = null;
//		Cell[] riga = null;
//		File f = null;
//		
//		try {
//			f = new File(fOri.getParentFile().getAbsolutePath()+
//					File.separator+
//					root.trim()+".xls");
//			if (f.exists()){
//				// Apro il file xlsx
//				wb = JUC.openFileXls(f.getAbsolutePath());
//
//				// Leggo le infomrazioni della 1 finestra
//				finestra = wb.getSheet(0);
//				riga = finestra.getRow(1);
//				rootDesc = ToolsXsl.analizza(riga[17]);
//			} else {
//				throw new JFileException("Il file ["+f.getAbsolutePath()+"] non esiste");
//			}
//		} catch (BiffException e) {
//			throw new JFileException(e.getMessage(),e);
//		} catch (IndexOutOfBoundsException e) {
//			throw new JFileException(e.getMessage(),e);
//		} catch (IOException e) {
//			throw new JFileException(e.getMessage(),e);
//		} catch (JFileException e) {
//			throw e;
//		}  finally {
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
	 * @return the root
	 */
	public String getRoot() {
		return root;
	}

	/**
	 * @return the rootDesc
	 */
	public String getRootDesc() {
		return rootDesc;
	}

	/**
	 * @return the tipologiaMateriale
	 */
	public String getTipologiaMateriale() {
		return tipologiaMateriale;
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
	 * @return the dataCronica
	 */
	public String getDataCronica() {
		return dataCronica;
	}

	/**
	 * @return the dataTopica
	 */
	public String getDataTopica() {
		return dataTopica;
	}

	/**
	 * @return the supporto
	 */
	public String getSupporto() {
		return supporto;
	}

	/**
	 * @return the tecniche
	 */
	public String[] getTecniche() {
		return tecniche;
	}

	/**
	 * @return the dimensione
	 */
	public String getDimensione() {
		return dimensione;
	}

	/**
	 * @return the scala
	 */
	public String getScala() {
		return scala;
	}

	/**
	 * @return the statoConservazione
	 */
	public String getStatoConservazione() {
		return statoConservazione;
	}

	/**
	 * @return the autori
	 */
	public Vector<String> getAutori() {
		return autori;
	}

	/**
	 * @return the datiFruizione
	 */
	public String[] getDatiFruizione() {
		return datiFruizione;
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

}
