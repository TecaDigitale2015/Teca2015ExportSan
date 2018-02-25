package mx.randalf.eac;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class EacNamespacePrefix extends NamespacePrefixMapper {

	public EacNamespacePrefix() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion,
			boolean requirePrefix) {
		String result = null;
		if (namespaceUri.equals("http://www.w3.org/XML/1998/namespace")){
			result = "xml";
		} else if (namespaceUri.equals("urn:isbn:1-931666-33-4")){
			result = "eac";
		} else if (namespaceUri.equals("http://www.w3.org/1999/xlink")){
			result = "xlink";
		} else if (namespaceUri.equals("http://www.w3.org/2001/XMLSchema-instance")){
			result = "xsi";
		} else {
			System.out.println("namespaceUri: "+namespaceUri+"\tsuggestion: "+suggestion+"\trequirePrefix: "+requirePrefix);
		}
		return result;
	}

}
