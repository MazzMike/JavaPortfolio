public class Odometer {
	//Fields
	private static double currentMileage = 0; //for current mileage
	
	//method to get current mileage
	public double getCurrentMileage(){
		return currentMileage;
	}
	
	//method to increase mileage
	public void increaseMileage(){
		if(currentMileage < 999999)
		++currentMileage;
		else if(currentMileage > 999999)
			currentMileage = 0;
	}
	//method to decrease fuel after 24 miles
	public void decreaseGallon(FuelGauge fuelGauge){
		FuelGauge car = new FuelGauge(fuelGauge);
		for(int count = 1; count <= 24; count++){
			increaseMileage();
		}
		car.decreaseFuel();
	}
	//Constructors
	public Odometer() {
		// TODO Auto-generated constructor stub
	}

}
