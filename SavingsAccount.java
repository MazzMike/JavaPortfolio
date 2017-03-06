public class SavingsAccount {
	//Set Variables
	private double annualInterestRate; //account interest rate
	private double monthlyInterestRate; //monthly interest rate
	private double balance; //account balance
	private double withdraw = 0; //amount withdrawn from balance
	private double deposit = 0; // amount deposited into account
	private double monthlyInterest; //amount of monthly interest added to account
	private double totalInterest = 0; //total interest earned
	
	//Methods to set variables
	public void setAnnualInterestRate(double ai){
		annualInterestRate = ai / 100;
	}
	public void setBalance(double b){
		balance = b;
	}
	
	//Methods to get variables
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public double getBalance(){
		return balance;
	}
	public double getDeposit(){
		return deposit;
	}
	public double getWithdraw(){
		return withdraw;
	}
	public double getInterest(){
		return totalInterest;
	}
	
	//Method to perform actions on the account balance
	public void subtractWithdrawal(double withdraw){
		this.withdraw += withdraw;
		balance -= withdraw;
		
	}
	public void addDeposit(double deposit){
		this.deposit += deposit;
		balance += deposit;
	}
	
	public void addMonthlyInterest(){
		monthlyInterestRate = annualInterestRate / 12;
		monthlyInterest = (balance * monthlyInterestRate);
		balance += monthlyInterest;
		totalInterest += monthlyInterest;
	}

	//Constructor accepting starting balance
	public SavingsAccount(double startingBalance) {
		this.balance = startingBalance;
	}

}
