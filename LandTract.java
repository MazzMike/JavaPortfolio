public class LandTract {
	//Fields
	private double length; //for length
	private double width; //for width
	private double area; //for area
	
	//Method to return area
	public double getArea(){
		area = length * width;
		return area;
	}
	//Method to return string
	public String toString(){
		String str = "Area: " + area;
		return str;
	}
	//Method to compare objects
	public boolean equals(LandTract object2){
		boolean status;
		if(area == object2.area)
			status = true;
		else 
			status = false;
		return status;
	}
	
	//Constructors
	public LandTract() {
	}
	public LandTract(double length, double width) {
		this.length = length;
		this.width = width;
	}

}
