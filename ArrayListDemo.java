import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		//Create an ArrayList
		ArrayList<String> nameList = new ArrayList<String>();
		
		//Add to ArrayList
		nameList.add("Michael");
		nameList.add("John");
		nameList.add("Mazzola");
		
		//Display Contents
		for(int index = 0; index < nameList.size(); index++)
			System.out.println(nameList.get(index));
		
		//Remove from ArrayList
		nameList.remove(1);
		System.out.println("");
		
		//Display Contents
		for(int index = 0; index < nameList.size(); index++)
			System.out.println(nameList.get(index));
		
	
	}
		

}
