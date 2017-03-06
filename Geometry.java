public class Geometry {
	//Method to calculate are of circle
	public static double areaCircle(double num){
		double area = 0;
		if(num < 0)
			System.out.println("No negative values may be accepted.");
		else
			area = (num * num) * Math.PI;
		return area;	
	}
	//method to calculate area of rectangle
	public static double areaRectangle(double length, double width){
		double area = 0;
		if(length < 0 || width < 0)
			System.out.println("No negative values may be accepted.");
		else
			area = length * width;
		return area;
	}
	//method to calculate area of triangle
	public static double areaTriangle(double base, double height){
		double area = 0;
		if(base < 0 || height < 0)
			System.out.println("No negative values may be accepted.");
		else
			area = (base * height)/2;
		return area;
	}
	//Constructor
	public Geometry() {
		
	}
}
