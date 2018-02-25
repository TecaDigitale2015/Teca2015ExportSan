package mx.randalf.ead;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;
import org.xml.sax.SAXParseException;

import isbn._1_931666_22_9.Ead;
import mx.randalf.digest.MD5;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.parser.Parser;
import mx.randalf.parser.exception.ParserException;
import mx.randalf.xsd.ReadXsd;
import mx.randalf.xsd.exception.XsdException;

/**
 * 
 */

/**
 * @author massi
 *
 */
public class EadXsd extends ReadXsd<Ead> {

	Logger log = Logger.getLogger(EadXsd.class);

	/**
	 * 
	 */
	public EadXsd() {
	}

	@SuppressWarnings("unused")
	public boolean writeArchivesSpace(Ead obj, File fMag) throws XsdException, PubblicaException {
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
			schemaLocation = "urn:isbn:1-931666-22-9 http://www.loc.gov/ead/ead.xsd";
			write(obj, fMag, new EadNamespacePrefixArchivesSpace(), null, null, schemaLocation);

			errors = new ParserException();
			parser = new Parser(fMag.getAbsolutePath(), errors, true);
			if (errors.getNumErr() == 0) {
				result = true;
				md5Tools = new MD5(fMag);
				md5 = md5Tools.getDigest();

				fCert = new File(fMag.getAbsolutePath() + ".cert");
				fw = new FileWriter(fCert);
				bw = new BufferedWriter(fw);
				bw.write(md5);
			} else {
				for (SAXParseException e : errors.getMsgErr()) {
					log.error(e.getMessage(), e);
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

	@SuppressWarnings("unused")
	public boolean write(Ead obj, File fMag) throws XsdException, PubblicaException {
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
			schemaLocation = "urn:isbn:1-931666-22-9 http://www.loc.gov/ead/ead.xsd";
			write(obj, fMag, new EadNamespacePrefix(), null, null, schemaLocation);

			errors = new ParserException();
			parser = new Parser(fMag.getAbsolutePath(), errors, true);
			if (errors.getNumErr() == 0) {
				result = true;
				md5Tools = new MD5(fMag);
				md5 = md5Tools.getDigest();

				fCert = new File(fMag.getAbsolutePath() + ".cert");
				fw = new FileWriter(fCert);
				bw = new BufferedWriter(fw);
				bw.write(md5);
			} else {
				for (SAXParseException e : errors.getMsgErr()) {
					log.error(e.getMessage(), e);
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

	public String write(Ead obj) throws XsdException {
		return write(obj, true);
	}

	public String write(Ead obj, boolean interstazione) throws XsdException {
		String schemaLocation = null;
		String result = null;

		try {
			schemaLocation = "urn:isbn:1-931666-22-9 http://www.loc.gov/ead/ead.xsd";
			result = write(obj, new EadNamespacePrefix(), null, null, schemaLocation);
			if (!interstazione) {
				result = result.substring(55);
			}
		} catch (XsdException e) {
			log.error(e.getMessage(), e);
			throw e;
		}
		return result;
	}

}
