import java.util.Scanner;
import java.io.*;

public class GreatestLeastLauncher {

	public static void main(String[] args) throws IOException {
		//Create Objects
		Scanner keyboard = new Scanner(System.in); //for user input
		GreatestLeast object = new GreatestLeast(); //for object we create
		
		//Ask user for number
		System.out.print("Enter a number or -99 to exit: ");
		object.setNumber(keyboard.nextInt());
		object.setHighest(object.getNumber());
		object.setLowest(object.getNumber());
		//Continually ask for number until user enters -99
		do{
			System.out.print("Enter a number or -99 to exit: ");
			object.setNumber(keyboard.nextInt());
			
			if(object.getNumber() > object.getHighest()){ //check if current number higher than highest
				object.setHighest(object.getNumber());
			}
			
			if(object.getNumber() < object.getLowest() && object.getNumber() != -99){ //check if current number lower than lowest
				object.setLowest(object.getNumber());
			}
		}while(object.getNumber() != -99);
		//Print highest and lowest numbers
		System.out.printf("Highest Number: %d \nLowest Number: %d", object.getHighest(), object.getLowest());
		
	}

}
