/**
 * 
 */
package mx.teca2015.tecaExport.tecaExportSan.eac;

import isbn._1_931666_33_4.Address;
import isbn._1_931666_33_4.AddressLine;
import isbn._1_931666_33_4.AgencyName;
import isbn._1_931666_33_4.Agent;
import isbn._1_931666_33_4.AgentType;
import isbn._1_931666_33_4.Control;
import isbn._1_931666_33_4.CpfDescription;
import isbn._1_931666_33_4.Description;
import isbn._1_931666_33_4.EacCpf;
import isbn._1_931666_33_4.EntityType;
import isbn._1_931666_33_4.EventDateTime;
import isbn._1_931666_33_4.EventType;
import isbn._1_931666_33_4.Identity;
import isbn._1_931666_33_4.Identity.NameEntry;
import isbn._1_931666_33_4.MaintenanceAgency;
import isbn._1_931666_33_4.MaintenanceEvent;
import isbn._1_931666_33_4.MaintenanceHistory;
import isbn._1_931666_33_4.MaintenanceStatus;
import isbn._1_931666_33_4.Part;
import isbn._1_931666_33_4.Place;
import isbn._1_931666_33_4.RecordId;

import java.io.File;
import java.math.BigInteger;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import mx.randalf.eac.EacXsd;
import mx.randalf.interfacException.exception.PubblicaException;
import mx.randalf.xsd.exception.XsdException;

/**
 * @author massi
 *
 */
public class Istituto {

	/**
	 * 
	 */
	public Istituto() {
	}


	public static void genIstitutoEac(String id, String nomeIstituto, BigInteger cap,
			String comune, String paese, String provincia, String indirizzo, String url,
			String pathIstituto) throws DatatypeConfigurationException, XsdException, PubblicaException{
		EacCpf eac = null;
		EacXsd eacXsd = null;
		File fIstituto = null;
		File fIstitutoCert = null;
		
		try {
			fIstitutoCert = new File(pathIstituto+
					File.separator+
					id+
					".xml.cert");
			if (!fIstitutoCert.exists()){
				fIstituto = new File(pathIstituto+
						File.separator+
						id+
						".xml");
	
				eac = new isbn._1_931666_33_4.EacCpf();
				
				eac.setControl(genIstitutoEacControl(id, nomeIstituto));
				
				eac.setCpfDescription(genIstitutoEacCpfDescription(id, nomeIstituto, cap, comune, paese, provincia, indirizzo, url));
				eacXsd = new EacXsd();
				eacXsd.write(eac, fIstituto);
			}
		} catch (DatatypeConfigurationException e) {
			throw e;
		} catch (XsdException e) {
			throw e;
		} catch (PubblicaException e) {
			throw e;
		}
	}

	private static Control genIstitutoEacControl(String id, String nomeIstituto) throws DatatypeConfigurationException{
		Control control = null;
		RecordId recordId = null;
		MaintenanceStatus maintenanceStatus = null;
		MaintenanceAgency maintenanceAgency = null;
		AgencyName agencyName = null;
		MaintenanceHistory maintenanceHistory = null;
		MaintenanceEvent maintenanceEvent = null;
		EventType eventType = null;
		EventDateTime eventDateTime = null;
		AgentType agentType = null;

		try {
			control = new Control();

			recordId = new RecordId();
			recordId.setValue(id);
			control.setRecordId(recordId);
			
			maintenanceStatus = new MaintenanceStatus();
			maintenanceStatus.setValue("new");
			control.setMaintenanceStatus(maintenanceStatus);

			maintenanceAgency = new MaintenanceAgency();
			agencyName = new AgencyName();
			agencyName.setContent(nomeIstituto);
			maintenanceAgency.setAgencyName(agencyName);
			control.setMaintenanceAgency(maintenanceAgency);

			maintenanceHistory = new MaintenanceHistory();
			maintenanceEvent = new MaintenanceEvent();

			eventType = new EventType();
			eventType.setValue("created");
			maintenanceEvent.setEventType(eventType);

			eventDateTime = new EventDateTime();
			eventDateTime.setContent(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()).toXMLFormat());
			maintenanceEvent.setEventDateTime(eventDateTime);

			agentType= new AgentType();
			agentType.setValue("machine");
			maintenanceEvent.setAgentType(agentType);

			maintenanceEvent.setAgent(new Agent());

			maintenanceHistory.getMaintenanceEvent().add(maintenanceEvent);
			control.setMaintenanceHistory(maintenanceHistory);
		} catch (DatatypeConfigurationException e) {
			throw e;
		}

		return control;
	}

	private static CpfDescription genIstitutoEacCpfDescription(String id, String nomeIstituto, BigInteger cap,
				String comune, String paese, String provincia, String indirizzo, String url){
		CpfDescription cpfDescription = null;
		Identity identity = null;
		EntityType entityType = null;
		NameEntry nameEntry = null;
		Part part = null;
		Description description = null;
		Place place = null;
		Address address = null;
		AddressLine addressLine = null;

		cpfDescription = new CpfDescription();
		
		identity = new Identity();

		entityType = new EntityType();
		entityType.setValue("corporateBody");
		identity.setEntityType(entityType);

		nameEntry = new NameEntry();
		part = new Part();
		part.setContent(nomeIstituto);
		nameEntry.getPart().add(part);
		identity.getNameEntryParallelOrNameEntry().add(nameEntry);
		cpfDescription.setIdentity(identity);

		description = new Description();
		if (indirizzo != null &&
				cap != null &&
				comune != null &&
				provincia != null &&
				paese != null &&
				url != null){
			place = new Place();
			address = new Address();
			if (indirizzo != null &&
					cap != null &&
					comune != null &&
					provincia != null &&
					paese != null){
				addressLine = new AddressLine();
				addressLine.setContent(indirizzo+"\n"+cap.toString()+" "+comune+" ("+provincia+") "+paese);
				address.getAddressLine().add(addressLine);
			}
			if (url != null){
				addressLine = new AddressLine();
				addressLine.setContent(url);
				address.getAddressLine().add(addressLine);
			}
			place.setAddress(address);
			description.getPlacesOrPlaceOrLocalDescription().add(place);
		}
		cpfDescription.setDescription(description);

		return cpfDescription;
	}
	
}
