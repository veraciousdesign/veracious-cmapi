package design.veracious.cmapi.requests.base;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.responses.base.AbstractResponseImpl;

/**
 * Abstract implementation of the request interface that contains all the common
 * functionality of all possible requests.
 */
public abstract class AbstractRequestImpl<T extends AbstractResponseImpl<?>> implements Request<T> {

	protected static Logger LOGGER = LoggerFactory.getLogger("REQUEST");

	protected Class<T> clazz;
	protected CMApi api;

	public AbstractRequestImpl(Class<T> clazz, CMApi api) {
		this.clazz = clazz;
		this.api = api;
	}

	@Override
	public abstract Request<T> submit();

	@Override
	public boolean isSuccess() {
		return (api.getStatus() / 100 == 2);
	}

	@Override
	public String getError() {
		return String.format("%d %s", api.getStatus(), api.getLastError());
	}

	@Override
	public T getResponse() {
		return api.getResponse(clazz);
	}

	@Override
	public int getRemainingRequests() {
		return api.getRemainingRequests();
	}

	/**
	 * Converts the given object into an xml formatted String using the JAXB
	 * marshaller.
	 * 
	 * @param obj Object that needs to be converted
	 * @return String|null
	 */
	protected String createXML(Object obj) {
		try {
			Class<?> clazz = obj.getClass();

			JAXBContext context = JAXBContext.newInstance(clazz);

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
//			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			StringWriter sw = new StringWriter();
			marshaller.marshal(obj, sw);

			String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + sw.toString();

			System.out.println(xml);

			return xml;

		} catch (Exception e) {
			LOGGER.debug("Error while creating the .xml for the request: {}", e.getLocalizedMessage());
			e.printStackTrace();
		}
		return null;
	}

}
