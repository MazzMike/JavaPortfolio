public class Ship {
	//Fields
	private String name; //name of ship
	private String year; //year ship made
	
	//Methods to set fields
	public void setName(String name){
		this.name = name;
	}
	public void setYear(String year){
		this.year = year;
	}
	
	//Methods to get fields
	public String getName(){
		return name;
	}
	public String getYear(){
		return year;
	}
	
	//To string method
	public String toString(){
		String str;
		str = "Name: " + name + "\nYear: " + year;
		return str;
	}
	//Constructors
	public Ship(){
		
	}
	public Ship(String name, String year){
		this.name = name;
		this.year = year;
	}
}
