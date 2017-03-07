
public class Month {
	//Fields
	int monthNumber; //for month number
	String monthName; //for month name
	
	//Set month name to number
	enum MonthName {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
		JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}
	
	//Constructors
	public Month() {
		monthNumber = 1;
	}
	public Month(int num) {
		try{
		if(num < 1 || num > 12)
			throw new InvalidMonthNum();
		}
		catch(InvalidMonthNum e){
			System.out.println(e.getMessage());
		}
				
		monthNumber = num;
	}
	public Month(String name){
		//compare name to monthName
		name = name.toUpperCase();
		try
		{
		switch(name)
			{
		case "JANUARY":
			monthNumber = MonthName.JANUARY.ordinal()+1;
			break;
		case "FEBRUARY":
			monthNumber = MonthName.FEBRUARY.ordinal()+1;
			break;
		case "MARCH":
			monthNumber = MonthName.MARCH.ordinal()+1;
			break;
		case "APRIL":
			monthNumber = MonthName.APRIL.ordinal()+1;
			break;
		case "MAY":
			monthNumber = MonthName.MAY.ordinal()+1;
			break;
		case "JUNE":
			monthNumber = MonthName.JUNE.ordinal()+1;
			break;
		case "JULY":
			monthNumber = MonthName.JULY.ordinal()+1;
			break;
		case "AUGUST":
			monthNumber = MonthName.AUGUST.ordinal()+1;
			break;
		case "SEPTEMBER":
			monthNumber = MonthName.SEPTEMBER.ordinal()+1;
			break;
		case "OCTOBER":
			monthNumber = MonthName.OCTOBER.ordinal()+1;
			break;
		case "NOVEMBER":
			monthNumber = MonthName.NOVEMBER.ordinal()+1;
			break;
		case "DECEMBER":
			monthNumber = MonthName.DECEMBER.ordinal() +1;
			break;
		default :
			throw new InvalidMonthName();
			}
		}
		catch(InvalidMonthName e){
			System.out.println(e.getMessage());
		}
	}
	//method to set month number
	public void setMonthNumber(int num){
		if(num < 1 || num > 12)
			monthNumber = 1;
		else		
		monthNumber = num;
	}
	//method to get month number
	public int getMonthNumber(){
		return monthNumber;
	}
	//method to get month name
	public String getMonthName(){
		switch(monthNumber){
		case 1:
			monthName = MonthName.JANUARY.toString();
			break;
		case 2:
			monthName = MonthName.FEBRUARY.toString();
			break;
		case 3:
			monthName = MonthName.MARCH.toString();
			break;
		case 4:
			monthName = MonthName.APRIL.toString();
			break;
		case 5:
			monthName = MonthName.MAY.toString();
			break;
		case 6:
			monthName = MonthName.JUNE.toString();
			break;
		case 7:
			monthName = MonthName.JULY.toString();
			break;
		case 8:
			monthName = MonthName.AUGUST.toString();
			break;
		case 9:
			monthName = MonthName.SEPTEMBER.toString();
			break;
		case 10:
			monthName = MonthName.OCTOBER.toString();
			break;
		case 11:
			monthName = MonthName.NOVEMBER.toString();
			break;
		case 12:
			monthName = MonthName.DECEMBER.toString();
			break;
		}
		return monthName;
	}
	//Method to put into string
	public String toString(){
		String str = "Month Name: " + monthName;
		return str;
	}
	//Method to compare object names
	public boolean equals(Month object2){
		boolean status;
		if(monthName.equals(object2.getMonthName()))
			status = true;
		else
			status = false;
		return status;
		
	}
	//Method to compare object numbers
	public boolean greaterThan(Month object2){
		boolean status;
		if(monthNumber > object2.getMonthNumber())
			status = true;
		else
			status = false;
		return status;
	}
	public boolean lessThan(Month object2){
		boolean status;
		if(monthNumber < object2.getMonthNumber())
			status = true;
		else
			status = false;
		return status;
	}

}
