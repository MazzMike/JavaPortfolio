
public class Payroll {
	//Field Arrays
	static int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	static int[] hours = new int[7];
	static double[] payRate = new double[7];
	static double[] wages = new double[7];
	
	//Methods to set values in arrays
	public static void setHours(int h, int i){
		hours[i] = h;
	}
	public static void setPayRate(double p, int i){
		payRate[i] = p;
	}
	public static void setWages(int h, double p, int i){
		wages[i] = h * p;
	}
	
	//Methods to return values in arrays
	public static int getId(int i){
		return employeeId[i];
	}
	public static int getHours(int i){
		return hours[i];
	}
	public static  double getWages(int i){
		return wages[i];
	}
	public static double getPayRate(int i){
		return payRate[i];
	}
	
	public static int[] getIdArray(){
		return employeeId;
	}
	
}
