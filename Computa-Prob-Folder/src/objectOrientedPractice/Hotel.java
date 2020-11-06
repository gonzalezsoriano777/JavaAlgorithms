package objectOrientedPractice;

import java.util.ArrayList;

public class Hotel {
	
	//private ArrayList<Room> rooms;
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
	

}
