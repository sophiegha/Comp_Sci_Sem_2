import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		System.out.println("Before sort: "); 
		int[] array = new int[200];
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100); 
			System.out.print(array[i] + " "); 
		}
		System.out.println(); 
		System.out.println(); 
		System.out.println("After sort: "); 
		int outer, inner, min_index; 
		for(outer = 0; outer < array.length; outer++){
			min_index = outer; 
			for(inner = outer+1; inner < array.length; inner++){
				if(array[inner] < array[min_index]){
					min_index = inner; 
				}
			}
			int temp = array[outer];
			array[outer] = array[min_index];
			array[min_index] = temp; 
		}
		
		for(int a = 0; a < array.length; a++){
			System.out.print(array[a] + " "); 
		}


		
	}
}
