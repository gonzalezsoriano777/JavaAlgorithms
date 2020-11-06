package objectOrientedPractice;

import java.util.ArrayList;

public class Hotel {
	
	private ArrayList<Room> rooms;
	
	public Hotel(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	
	public ArrayList<Room> displayableRoom(){
		
		return rooms;
		
	}

}
