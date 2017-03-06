
public class ShipLauncher {

	public static void main(String[] args) {
		//Fields
		Ship[] ships = new Ship[3]; //Create Ship Array
		
		//Create Objects
		ships[0] = new Ship("Basic Ship" , "1989"); //create Ship object
		ships[1] = new CruiseShip("Cruise Ship", "1990", 500); //create CruiseShip object
		ships[2] = new CargoShip("Cargo Ship", "1991", 200); //create CargoShip object
		
		//Display Ships in a for loop
		for(int i = 0; i < ships.length; i++){
			System.out.println(ships[i].toString());
		}
		

	}

}
