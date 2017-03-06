public class PoliceOfficer {
	//Fields
	private String name; //officers name
	private int badgeNum; //officers badge number
	private ParkedCar parkedCar; //parked car
	private ParkingMeter parkingMeter; //parking meter
	private ParkingTicket parkingTicket; // parking ticket
	private PoliceOfficer policeOfficer; //police officer

	//method to examine if car is parked too long
	public void examineCar(ParkedCar car, ParkingMeter meter, ParkingTicket ticket, PoliceOfficer police){
		parkedCar = new ParkedCar(car);
		parkingMeter = new ParkingMeter(meter);
		policeOfficer = new PoliceOfficer(police);
		if(parkedCar.getMinutesParked() > parkingMeter.getMinutesPurchased())
			issueTicket(ticket);		
		else
			System.out.println("No ticket given.");
	}
	//method to issue ticket
	public void issueTicket(ParkingTicket ticket){
		parkingTicket = new ParkingTicket(ticket);
		parkingTicket.getFine(parkedCar, parkingMeter);
		System.out.println(parkingTicket.toString(parkedCar, policeOfficer));
	}
	
	//method to write officer name and badgenumber
	public String toString(){
		String str = "Police Officer: " + name +
						"\nBadge Number: " + badgeNum;
		return str;
	}
	//Constructors
	public PoliceOfficer() {
			name = "";
			badgeNum = 0;
	}
	public PoliceOfficer(String name, int badgeNum){
		this.name = name;
		this.badgeNum = badgeNum;
		
	}
	public PoliceOfficer(ParkingTicket ticket){
		parkingTicket = new ParkingTicket(ticket);
	}

	public PoliceOfficer(PoliceOfficer policeOfficer){
		this.name = policeOfficer.name;
		this.badgeNum = policeOfficer.badgeNum;
	}

}
