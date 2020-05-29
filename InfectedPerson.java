import java.util.ArrayList;
public class InfectedPerson {
	private Virus virus; 
	private String name;
	public InfectedPerson(Virus virus) {
		this.virus = virus;
		name = generateName();
	}
	
	public String generateName() {
		return "yes";
	}
	
	public String getName() {
		return name;
	}
	
	public String getVirusName() {
		return virus.getName();
	}
	
	public String getVirusTransmission() {
		return virus.getTransmission();
	}
	
	public ArrayList<String> getVirusSymptoms(){
		return virus.getSymptoms();
	}
}
