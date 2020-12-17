package design.veracious.cmapi.entities.xml;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request")
public class TrackingRequest {

	private String trackingNumber;

	public TrackingRequest(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public TrackingRequest() {
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

}
