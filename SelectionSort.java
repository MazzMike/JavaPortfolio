
public class SelectionSort {

	public static void main(String[] args) {
		//Create array
		int[] array = {5, 7, 2, 8, 9, 1};
		
		//Print unsorted array
		System.out.println("Unsorted Array: ");
		for(int val : array)
			System.out.print(val + " ");
		System.out.println("");
		
		//Algorithm to display Selection Sort
		int startScan, index, minIndex, minValue;
		for(startScan = 0; startScan < (array.length-1); startScan++){
			minIndex= startScan;
			minValue = array[startScan];
			for(index = startScan + 1; index < array.length; index++){
				if(array[index] < minValue){
					minValue = array[index];
					minIndex = index;
				}
			}
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
		System.out.println("Sorted Array: ");
		for(int val : array)
			System.out.print(val + " ");

	}

}
