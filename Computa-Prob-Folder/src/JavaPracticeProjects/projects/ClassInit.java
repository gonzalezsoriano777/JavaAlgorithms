package JavaPracticeProjects.projects;

public class ClassInit {

	public static void main(String[] args) {

		// 
		CarProject CarCreator = new CarProject("Audi", " RS7", 2021, "Dark-Grey");
		CarCreator.CarIdentifier(4);
		System.out.println(" && ");
		System.out.println(CarCreator.CarDescription());

	}

}
