import java.util.*;

//   DIRECTIONS 
//   Create a program that sorts 3 of the same ArrayLists with Bubble Sort, Selection Sort, and Insertion Sort 
//   Each ArrayList should have 100 values that range from 0-100 randomly

//   Once sorted, print out the median of the ArrayList
class starter {
	public static void main(String args[]) {
		ArrayList <Integer> array = new ArrayList<Integer>(); 
		ArrayList <Integer> arr1 = new ArrayList<Integer>();
		ArrayList <Integer> arr2 = new ArrayList<Integer>(); 
		ArrayList <Integer> arr3 = new ArrayList<Integer>(); 
		for(int i = 0; i < 100; i++){
			array.add((int)(Math.random()*100)); 
			arr1.add(array.get(i));
			arr2.add(array.get(i));
			arr3.add(array.get(i));
		}
		System.out.println("-----------------ORIGINAL (3 ARRAYLISTS)------------------"); 
		for(int a = 0; a < 100; a++){
			System.out.print(array.get(a) + " "); 
		}
		System.out.println(); 
		System.out.println("-----------------WITH BUBBLE-----------------"); 
		for(int outer = 0; outer < arr1.size()-1; outer++){
			for(int inner = 0; inner < arr1.size()-outer-1; inner++){
				if(arr1.get(inner) > arr1.get(inner+1)){
					int temp = arr1.get(inner); 
					arr1.set(inner, arr1.get(inner+1)); 
					arr1.set(inner+1, temp);  
				}
			}
		}
		for(int x = 0; x < 100; x++){
			System.out.print(arr1.get(x) + " "); 
		}
		System.out.println(); 
		System.out.println("-----------------WITH SELECTION-----------------"); 
		int outer, inner, min_index; 
		for(outer = 0; outer < arr2.size(); outer++){
			min_index = outer; 
			for(inner = outer+1; inner < arr2.size(); inner++){
				if(arr2.get(inner) < arr2.get(min_index)){
					min_index = inner; 
				}
			}
			int temp = arr2.get(outer); 
			arr2.set(outer, arr2.get(min_index));
			arr2.set(min_index, temp);
		}
		for(int y = 0; y < 100; y++){
			System.out.print(arr2.get(y) + " "); 
		}
		System.out.println(); 
		System.out.println("-----------------WITH INSERTION-----------------"); 
		int key; 
		for(outer = 1; outer < arr3.size(); outer++){
			key = arr3.get(outer);
			inner = outer-1; 
			while(inner >= 0 && arr3.get(inner) > key){
				arr3.set(inner+1, arr3.get(inner));
				inner = inner -1; 
			}
			arr3.set(inner + 1, key);
		}
		for(int c = 0; c < 100; c++){
			System.out.print(arr3.get(c) + " "); 
		}
		System.out.println(); 
		double median; 
		if(arr1.size() % 2 != 1){
			median = (arr1.get(arr1.size()/2) + arr1.get(arr1.size()/2-1))/2; 
		}
		else{
			median = arr1.get(arr1.size()/2);
		}
		System.out.println("The Median of the ArrayList is: " + median); 
		
	}
}
