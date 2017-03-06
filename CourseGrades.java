public class CourseGrades implements Analyzable {
	//Fields
	GradedActivity[] grades = new GradedActivity[4]; //Graded Activity array to store grades
	
	
	//Methods to set Grades
	public void setLab(GradedActivity obj){
		grades[0] = obj;
	}
	public void setPassFailExam(PassFailExam obj){
		grades[1] = obj;
	}
	public void setEssay(Essay obj){
		grades[2] = obj;
	}
	public void setFinalExam(FinalExam obj){
		grades[3] = obj;
	}
	
	//to string method to display grades
	public String toString(){
		String str = "";
		for(int i = 0; i < grades.length; i++){
			str += grades[i].getScore() + " " + grades[i].getGrade() + "\n";
		}
		return str;
		
	}
	//Method to get average score
	public double getAverage() {
		double total = 0;
		for(int i = 0; i < grades.length; i++){
			total += grades[i].getScore();
		}
		double average = total / grades.length;
		return average;
	}
	//Method to get highest score
	public GradedActivity getHighest() {
		GradedActivity highest = grades[0];
		for(int i = 1; i < grades.length; i++){
			if(grades[i].getScore() > highest.getScore())
				highest = grades[i];
		}
		return highest;
	}
	//Method to get lowest score
	public GradedActivity getLowest() {
		GradedActivity lowest = grades[0];
		for(int i = 1; i < grades.length; i++){
			if(grades[i].getScore() < lowest.getScore())
				lowest = grades[i];
		}
		return lowest;
	}

}
