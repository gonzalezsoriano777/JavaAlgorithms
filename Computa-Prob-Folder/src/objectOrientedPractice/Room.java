package objectOrientedPractice;

import java.text.NumberFormat;
import java.util.Scanner;

public class Room {

	Scanner scanner = new Scanner(System.in);
	private int roomCost;
	private boolean availability = true;

	public Room(int roomCost) {
		this.roomCost = roomCost;
	}
	
	public String getRoomPrice() {
		return NumberFormat.getCurrencyInstance().format(roomCost);
	}
	
	public void roomOccupied() {
		availability = false;
	}
	
	public boolean roomAvailabilty() {
		return availability;
	}
	

}
