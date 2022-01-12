/**
 * 
 */
package mx.teca2015.tecaExport.tecaExportSan;

import java.io.File;
import java.io.FileFilter;

//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mx.randalf.configuration.Configuration;
import mx.randalf.configuration.exception.ConfigurationException;

/**
 * @author massi
 *
 */
public class TecaExportSan {

	private Logger log = LogManager.getLogger(TecaExportSan.class);

	/**
	 * 
	 */
	public TecaExportSan() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TecaExportSan tecaExport = null;
		
		if (args.length==2){
			tecaExport = new TecaExportSan();
			tecaExport.esegui(args[0], args[1]);
		} else {
			System.out.println("E' necessario indicare i seguenti parametri:");
			System.out.println("1) Path file di configurazione");
			System.out.println("2) Path da analizzare");
		}
	}

	public void esegui(String fileConf, String path){
		File f = null;
		try {
			Configuration.init(fileConf);
			f= new File(path);
			if (f.exists()){
				if (f.isDirectory()){
					scanFolder(f, f);
				} else {
					elaboraFile(f, f.getParentFile());
				}
			}
		} catch (ConfigurationException e) {
			log.error(e.getMessage(), e);
		}
	}

	private void scanFolder(File folder, File pathRoot){
		File[] files = null;
		files = folder.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				boolean result = false;
				File elabEad = null;
				File elabSun = null;
				if (pathname.isDirectory()){
					result = true;
				} else if (pathname.isFile()){
					if (!pathname.getName().startsWith(".") &&
							pathname.getName().endsWith(".xls") &&
							! pathname.getName().endsWith("_Nomenclatura.xls")){
						elabEad = new File(pathname.getParentFile().getAbsolutePath()+
								File.separator+pathname.getName().replace(".xls", "_ead.xml.cert"));
						elabSun = new File(pathname.getParentFile().getAbsolutePath()+
								File.separator+pathname.getName().replace(".xls", "_sun.xml.cert"));
						if (!(elabSun.exists() &&
								elabEad.exists())){
							result = true;
						}
					}
				}
				return result;
			}
		});
		for (int x=0; x<files.length; x++){
			if (files[x].isDirectory()){
				scanFolder(files[x], pathRoot);
			} else {
				elaboraFile(files[x], pathRoot);
			}
		}
	}

	private void elaboraFile(File fXml, File pathRoot){
		String[] st = null;
		TecaExportSanXls export = null;

		System.out.println("File: "+fXml.getAbsolutePath());
		st = fXml.getName().replace(".xls", "").split("_");
		if (st[st.length-1].startsWith("UC")){
			export = new TecaExportSanUC(fXml);
		} else if (st[st.length-1].startsWith("UD")){
			export = new TecaExportSanUD(fXml);
//			type = JUD.TYPE;
		}
		export.esegui(pathRoot);
	}
}
