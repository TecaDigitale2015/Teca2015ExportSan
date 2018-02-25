package mx.randalf.san;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class CatImportNamespacePrefix extends NamespacePrefixMapper {

	public CatImportNamespacePrefix() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion,
			boolean requirePrefix) {
		String result = null;
		if (namespaceUri.equals("http://san.mibac.it/cat-import")){
			result = suggestion;
		} else if (namespaceUri.equals("http://san.mibac.it/eac-san/")){
			result = "eac";
		} else if (namespaceUri.equals("http://www.w3.org/1999/xlink")){
			result = "xlink";
		} else if (namespaceUri.equals("http://san.mibac.it/scons-san/")){
			result = "scons";
		} else if (namespaceUri.equals("http://san.mibac.it/ead-san/")){
			result = "ead";
		} else if (namespaceUri.equals("http://san.mibac.it/ricerca-san/")){
			result = "ricerca";
		} else if (namespaceUri.equals("http://www.w3.org/2001/XMLSchema-instance")){
			result = "xsi";
		} else {
			System.out.println("namespaceUri: "+namespaceUri+"\tsuggestion: "+suggestion+"\trequirePrefix: "+requirePrefix);
		}
		return result;
	}

}
