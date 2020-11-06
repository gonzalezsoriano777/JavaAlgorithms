package objectOrientedPractice;

import java.text.NumberFormat;
import java.util.Scanner;

public class Room {

	Scanner scanner = new Scanner(System.in);
	private int roomPrice;
	private boolean availability = true;

	public Room(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	public String getRoomPrice() {
		return NumberFormat.getCurrencyInstance().format(roomPrice);
	}
	
	public void roomOccupied() {
		availability = false;
	}
	
	public boolean roomAvailabilty() {
		return availability;
	}
	

}
