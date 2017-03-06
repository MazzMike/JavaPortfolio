//Lab #9
import java.util.Scanner;

public class SpeedOfSoundLauncher {
	public static void main(String[] args) {
		//Set local variables
		String userInput;
		
		//Create objects
		Scanner keyboard = new Scanner(System.in);
		SpeedOfSound object = new SpeedOfSound();
		
		//Get user Input
		System.out.println("Please select the element your sound will be traveling through: \nAir \nWater \nSteel");
		userInput = keyboard.nextLine();
		
		//Determine if user selected element, print results
		if(userInput.equalsIgnoreCase("AIR")){
			System.out.println("What is the distance your message will be traveling?(in feet)");
			object.setDistance(keyboard.nextDouble());
			System.out.printf("It will take approx. %.0f seconds for your message to travel %.0f feet.", 
								object.getSpeedInAir(object.getDistance()), object.getDistance());			
		} else if(userInput.equalsIgnoreCase("WATER")){
			System.out.println("What is the distance your message will be traveling?(in feet)");
			object.setDistance(keyboard.nextDouble());
			System.out.printf("It will take approx. %.0f seconds for your message to travel %.0f feet.", 
								object.getSpeedInWater(object.getDistance()), object.getDistance());			
		} else if(userInput.equalsIgnoreCase("STEEL")){
			System.out.println("What is the distance your message will be traveling?(in feet)");
			object.setDistance(keyboard.nextDouble());
			System.out.printf("It will take approx. %.0f seconds for your message to travel %.0f feet.", 
								object.getSpeedInSteel(object.getDistance()), object.getDistance());			
		} else
			System.out.println("You did not select an element from the list.");
		
}
	}
