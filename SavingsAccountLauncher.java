import java.util.Scanner;

public class SavingsAccountLauncher {

	public static void main(String[] args) {
		//Create variables for account balance and months passed
		double startingBalance;
		int months;
		
		//Create Scanner Object for input
		Scanner keyboard = new Scanner(System.in);		
		
		//Get starting balance
		System.out.print("What is the starting account balance? ");
		startingBalance = keyboard.nextDouble();
		
		//Create Savings Account Object
		SavingsAccount account = new SavingsAccount(startingBalance);
		
		//Get annual interest rate and months passed
		System.out.print("What is the annual interest rate? ");
		account.setAnnualInterestRate(keyboard.nextDouble());
		System.out.print("How many months have passed since you opened this account? ");
		months = keyboard.nextInt();
		
		for(int count = 1; count <= months; count++){
			System.out.printf("Enter ammount deposited for month %d: ", count);
			account.addDeposit(keyboard.nextDouble());
			System.out.printf("Enter ammount withdrawn for month %d: ", count);
			account.subtractWithdrawal(keyboard.nextDouble());
			account.addMonthlyInterest();
		}
		System.out.println("*************");
		System.out.printf("Balance:     $%,.02f \n", account.getBalance());
		System.out.printf("Deposits:    $%,.02f \n", account.getDeposit());
		System.out.printf("Withdrawals: $%,.02f \n", account.getWithdraw());
		System.out.printf("Interest:    $%,.02f \n", account.getInterest());
		
	}

}
