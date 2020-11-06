package objectOrientedPractice;

class Main {
	
	// Init. Hotel && Num of rooms
	static Hotel hotel = new Hotel("Hotel del pauir", 20);
	static int numOfRooms = hotel.findAllNumRooms();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hotelProcess();
		
	}
	
	public static void hotelProcess() {
		
		System.out.println("Hi there! Welcome to " + hotel.getHotelName() + " !");
		System.out.println();
		System.out.println();

		
	}

}
