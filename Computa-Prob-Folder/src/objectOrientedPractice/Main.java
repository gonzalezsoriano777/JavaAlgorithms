package objectOrientedPractice;

import java.util.Scanner;

class Main {

	private static Scanner scanner = new Scanner(System.in);

	// Init. Hotel && Num of rooms
	static Hotel hotel = new Hotel("Hotel del pauir", 20);
	static int numOfRooms = hotel.findAllNumRooms();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hotelProcess();

	}

	public static void hotelProcess() {

		System.out.println("Hi there! Welcome to " + hotel.getHotelName() + " !");
		System.out.println("Rooms available : " + numOfRooms);

		Room room = new Room(175);

		System.out.println("Would you like to purchase a room? 1 = Y || 2 = N");
		int answer = scanner.nextInt();

		if (answer == 1) {
			numOfRooms--;
			room.roomOccupied();
			
			System.out.println("Room cost : " + room.getRoomPrice() + " / per night ");
			System.out.println("Room availability : " + numOfRooms);
		} 
		
		else {
			System.out.println("Have a great night!");
		}

	}

}
