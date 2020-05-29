import java.util.ArrayList; 
public class Virus {
	private ArrayList<String> symptoms = new ArrayList<String>();
	private String transmission;
	private String name;
	public Virus() {
		
	}
	
	public String getName() {
		return name; 
	}
	
	public String getTransmission() {
		return transmission;
	}
	
	public ArrayList <String> getSymptoms() {
		return symptoms;
	}
	
}
