import java.util.*;

class starter {
	public static void removeDup(ArrayList<Integer> array, int cap){
		for(int i = 0; i < cap; i++){
			for(int a = i+1; a < cap; a++){
				if(array.get(i) == array.get(a)){
					array.remove(a);
				}
			}
		}
	}
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1,5);		//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
}
