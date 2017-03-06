public class ParkingMeter {
	//Fields
	private int minutesPurchased; //minutes that have been purchased on meter
	
	//method to get minutes purchased
	public int getMinutesPurchased(){
		return minutesPurchased;
	}
	//Method to write minutes purchased
	public String toString(){
		String str = "Minutes Purchased: " + minutesPurchased;
		return str;
	}
	//Constructors
	public ParkingMeter() {
		minutesPurchased = 0;
	}
	public ParkingMeter(int mp){
		this.minutesPurchased = mp;
	}
	public ParkingMeter(ParkingMeter parkingMeter){
		this.minutesPurchased = parkingMeter.minutesPurchased;
	}

}
