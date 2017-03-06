public class CruiseShip extends Ship{
	//Fields
	private int maxPassengers;
	
	//Methods to set fields
	public void setMaxPassengers(int mp){
		maxPassengers = mp;
	}
	
	//Methods to get fields
	public int getMaxPassengers(){
		return maxPassengers;
	}
	
	//To string method
	public String toString(){
		String str;
		str = "Name: "+ super.getName() + "\nMax Passengers: " + maxPassengers;
		return str;
	}
	
	//Constructors
	public CruiseShip(){
		
	}
	public CruiseShip(int mp){
		this.maxPassengers = mp;
	}
	public CruiseShip(String name, String year, int mp){
		super(name, year);
		this.maxPassengers = mp;
	}
	
}
