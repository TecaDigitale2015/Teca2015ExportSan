/**
 * 
 */
package mx.randalf.san;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;
import org.xml.sax.SAXParseException;

import it.mibac.san.cat_import.CatImport;
import mx.randalf.digest.MD5;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.parser.Parser;
import mx.randalf.parser.exception.ParserException;
import mx.randalf.xsd.ReadXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class CatImportXsd extends ReadXsd<CatImport> {

	private Logger log = Logger.getLogger(CatImportXsd.class);

	/**
	 * 
	 */
	public CatImportXsd() {
	}

	@SuppressWarnings("unused")
	public boolean write(CatImport obj, File fMag) throws XsdException,
			PubblicaException {
		ParserException errors = null;
		Parser parser = null;
		String schemaLocation = null;
		MD5 md5Tools = null;
		String md5 = null;
		File fCert = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		boolean result = false;

		try {
			schemaLocation = "http://san.mibac.it/cat-import http://www.san.beniculturali.it/tracciato/cat-import.xsd";
			write(obj, fMag, new CatImportNamespacePrefix(), null, null,
					schemaLocation);

			errors = new ParserException();
			parser = new Parser(fMag.getAbsolutePath(), errors, true);
			if (errors.getNumErr() == 0) {
				result = true;
				md5Tools = new MD5();
				md5 = md5Tools.getDigest(fMag);

				fCert = new File(fMag.getAbsolutePath() + ".cert");
				fw = new FileWriter(fCert);
				bw = new BufferedWriter(fw);
				bw.write(md5);
			} else {
				for (SAXParseException e : errors.getMsgErr()) {
					log.error(e);
				}
			}
		} catch (SAXParseException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} catch (FileNotFoundException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} catch (PubblicaException e) {
			throw e;
		} catch (IOException e) {
			log.error(e.getMessage(), e);
			throw new XsdException(e.getMessage(), e);
		} finally {
			try {
				if (bw != null) {
					bw.flush();
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				log.error(e.getMessage(), e);
				throw new XsdException(e.getMessage(), e);
			}
		}
		return result;
	}
}
