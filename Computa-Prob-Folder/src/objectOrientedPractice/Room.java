package objectOrientedPractice;

import java.util.Scanner;

public class Room {

	Scanner scanner = new Scanner(System.in);
	private String roomType;
	private boolean isOccupied;

	public Room(String RoomType, boolean IsOccupied) {
		
		this.roomType = RoomType;
		this.isOccupied = IsOccupied;
		
	}
	
	public void checkIn() {
		System.out.println("Please enter name for reservation: ");
		String input = scanner.nextLine();
		System.out.println("Enter room type (Normal || Premium || Deluxe): ");
		roomType = scanner.nextLine();
		isOccupied = true;
		System.out.println("Thank you, " + input + ", for choosing the " + roomType + " room.");
	}

	public void checkOut() {
		System.out.println("Thank you for choosing AVA Hotels");
		isOccupied = false;
	}

}
