public class Area {
	//Variables
	private double length; //for shape's length
	private double width;  //for shape's width
	private double radius; //for shape's radius
	private double area; //holds area of shape
	private double height; //for shapes height
	
	//Methods to calculate area
	public static double getArea(double radius, String circle){
		//overloaded for area of circle
		return Math.PI * (radius * radius);
	}
	public static double getArea(double length, double width){
		//overloaded for area of rectangle
		return length * width;
	}
	public static double getArea(double radius, double height, String circle){
		//overloaded for area of cylinder
		return Math.PI * (radius * radius) * height;
	}
	
	//Constructors
	public Area() {
		
	}

}
