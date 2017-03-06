
public class ChargeAccount {
	//array containing account numbers
	static int[] account= {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,
	                       8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
	                       1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
	static boolean found = false;		
	static int index = 0;
	
	public static int[] getArray(){
		return account;
	}
	
	//Sequential Search to find if accounts Match
	public static boolean compareAccount(int[] array, int n){
		while(!found && index < array.length ){
			if(array[index] == n){
				found = true;
			}
		index++;
		}
		return found;
	}
	
}
