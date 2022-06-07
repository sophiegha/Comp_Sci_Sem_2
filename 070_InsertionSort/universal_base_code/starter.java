import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int[] array = new int[200];
		System.out.println("Before sorting: "); 
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100); 
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("After sorting "); 
		int outer, inner, key; 
		for(outer = 1; outer < array.length; outer++){
			key = array[outer];
			inner = outer-1; 
			while(inner >= 0 && array[inner] > key){
				array[inner+1] = array[inner];
				inner = inner -1; 
			}
			array[inner+1] = key; 
		}
		for(int a = 0; a < array.length; a++){
			System.out.print(array[a] + " ");
		}


		
	}
}
