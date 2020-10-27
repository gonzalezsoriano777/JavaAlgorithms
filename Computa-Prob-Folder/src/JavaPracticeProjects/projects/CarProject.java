package JavaPracticeProjects.projects;

public class CarProject {
	
	private String Brand;
	private String Model;
	private int Doors;
	private String Color;
	private boolean isOn = false
	
	public CarProject(String brand, String model) {
		this.Brand = brand;
		this.Model = model;
	}
	
	public CarProject(String brand, String model, int doors, String color) {
		this.Brand = brand;
		this.Model = model;
		this.Doors = doors;
		this.Color = color;
		isOn = false;
	}
	
	public void CarIdentifier() {
		
		int sedan = 4;
		int coupe = 2;
		
		if(sedan != coupe) {
			System.out.println("This car is a sedan");
		}
		
		System.out.println("This is a coupe");
		
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
