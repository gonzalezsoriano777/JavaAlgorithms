package JavaPracticeProjects.projects;

public class CarProject {
	
	private String Brand;
	private String Model;
	private int Year;
	private String Color;
	private boolean isOn = false;
	
	public CarProject(String brand, String model) {
		this.Brand = brand;
		this.Model = model;
	}
	
	public CarProject(String brand, String model, int year, String color) {
		this.Brand = brand;
		this.Model = model;
		this.Year = year;
		this.Color = color;
		isOn = false;
	}
	
	public String CarDescription() {
		return " This is a " + Brand + Model + " that is a newly yeared car being a " + Year + " car and is " + Color; 
	}
	
	// Identifies if this is either a sedan or coupe
	public void CarIdentifier(int n) {
		
		if(n != 4) {
			System.out.println("This car is a coupe");
		}
		
		System.out.println("This is a sedan");
		
	}
	
	public void setOn() {
		if(!isOn) {
			System.out.println("Turn on the car on");
		}
		
		System.out.println("Car is on and ready to go");
	}
	
	public void toggleOn() { 
		isOn = !isOn;
	}

}
