import java.util.*;

class starter {
	//Methods go here
	public static void printArrayList(ArrayList<Integer> array){
		for(int i = 0; i < array.size(); i++){
			System.out.print(array.get(i) + " "); 
		}
		System.out.println(); 
	}
	public static void addValuesArrayList(ArrayList<Integer> array, int n){
		for(int i = 0; i < n; i++){
			double num = Math.random();
			array.add((int)(num * 100)); 
		}
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in); 
		System.out.println("how many values will you like to add to your array list? "); 
		int n = sc.nextInt(); 
		ArrayList<Integer> array = new ArrayList<Integer>();
		addValuesArrayList(array, n);
		printArrayList(array);


	}
}
