import java.util.Scanner;
public class PayrollLauncher {

	public static void main(String[] args) {
		//Scanner Object
		Scanner keyboard = new Scanner(System.in);
		
		//Method to get user input for hours worked and pay rate
		for(int i = 0; i < Payroll.getIdArray().length; i++){
			System.out.print("What are the hours for employee "+ Payroll.getId(i) + ": ");
			Payroll.setHours(keyboard.nextInt(), i);
			//Input validation to not accept negative values
			while(Payroll.getHours(i) < 0){
				System.out.print("Cannot accept negative value.\nWhat are the hours for employee "+ Payroll.getId(i) + ": ");
				Payroll.setHours(keyboard.nextInt(), i);
			}
			System.out.print("What is the pay rate for employee " + Payroll.getId(i) + ": ");
			Payroll.setPayRate(keyboard.nextDouble(), i);
			//Input validation to not accept value less than 6.00
			while(Payroll.getPayRate(i) < 6.00){
				System.out.print("Cannot accept value less than 6.00. \nWhat is the pay rate for employee " + Payroll.getId(i) + ": ");
				Payroll.setPayRate(keyboard.nextDouble(), i);
			}
			//set wages
			Payroll.setWages(Payroll.getHours(i), Payroll.getPayRate(i), i);
		}
		//Print employee id and their wages earned
		for(int i = 0; i < Payroll.getIdArray().length; i++){
			System.out.printf("Employee: %d \tWage: $%.02f \n\n", Payroll.getId(i), Payroll.getWages(i));
		}
		

	}

}
