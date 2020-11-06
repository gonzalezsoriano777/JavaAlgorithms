package objectOrientedPractice;

//import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

	// private ArrayList<Room> rooms;
	private String hotelName;
	private int numRooms;

	public Hotel(String HotelName, int NumRooms) {
		this.hotelName = HotelName;
		this.numRooms = NumRooms;
	}

	public String getHotelName() {
		return hotelName;
	}

	public int findAllNumRooms() {
		return numRooms;
	}

	public void hotelProcess() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hi there! Welcome to " + getHotelName() + " !");
		System.out.println("Rooms available : " + numRooms);

		Room room = new Room(150);

		System.out.println("Would you like to purchase a room? 1 = Y || 2 = N");
		int answer = scanner.nextInt();

		if (answer == 1) {
			numRooms--;
			room.roomOccupied();

			System.out.println("Room cost : " + room.getRoomPrice() + " / per night ");
			System.out.println("Room availability : " + numRooms);
		}

		else {
			System.out.println("Have a great night, hope we see you another time!");
		}

	}

}
