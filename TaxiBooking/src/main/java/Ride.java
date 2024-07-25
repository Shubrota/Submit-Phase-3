import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ride")
public class Ride {

	String from;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Number getFare() {
		return fare;
	}
	public void setFare(Number fare) {
		this.fare = fare;
	}
	
	public Ride() {
		super();
	}
	public Ride(String from, String to, Number fare, Number distance) {
		super();
		this.from = from;
		this.to = to;
		this.fare = fare;
		Distance = distance;
	}
	public Number getDistance() {
		return Distance;
	}
	public void setDistance(Number distance) {
		Distance = distance;
	}
	String to;
	Number fare;
	Number Distance;
}
