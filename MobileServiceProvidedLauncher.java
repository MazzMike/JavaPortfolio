//Lab #11 & #12 
import java.util.Scanner;

public class MobileServiceProvidedLauncher {
	public static void main(String[] args) {	
		//Create Objects
		Scanner keyboard = new Scanner(System.in);
		MobileServiceProvider customer = new MobileServiceProvider();
		
		//Ask User Input
		System.out.print("Do you have mobile package A, B, or C? ");
		customer.setMobilePackage(keyboard.nextLine());
		System.out.print("How many minutes did you use this month? ");
		customer.setMinutes(keyboard.nextDouble());
		
		switch(customer.getMobilePackage())
		{
		case 'a':
		case 'A':
			System.out.printf("Your bill for this month is $%.2f. \n ", customer.getMonthlyBill(39.99, 450, .45));
			if(customer.getMonthlyBill(39.99, 450, .45) > customer.getMonthlyBill(59.99, 900, .40))
				System.out.printf("You could save $%.2f by switching to package B",
									(customer.getMonthlyBill(39.99, 450, .45) - customer.getMonthlyBill(59.99, 900, .40)));
			if(customer.getMonthlyBill(39.99, 450, .45) > customer.getMonthlyBill(69.99, 0, 0))
				System.out.printf(" and you could save $%.2f by switching to package C.",
					(customer.getMonthlyBill(39.99, 450, .45) - customer.getMonthlyBill(69.99, 0, 0)));
			break;
		case 'b':
		case 'B':
			System.out.printf("Your bill for this month is $%.2f ", customer.getMonthlyBill(59.99, 900, .40));
			if(customer.getMonthlyBill(59.99, 900, .40) > customer.getMonthlyBill(69.99, 0, 0))
				System.out.printf("You could save  $%.2f by switching to package C.",
					(customer.getMonthlyBill(59.99, 900, .40) - customer.getMonthlyBill(69.99, 0, 0)));
			break;
		case 'c':
		case 'C':
			System.out.printf("Your bill for this month is $%.2f ",customer.getMonthlyBill(69.99, 0, 0));
			break;
		default:
			System.out.println("Invalid Choice.");
		}
	}
}
