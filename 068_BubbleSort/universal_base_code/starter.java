import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] array = new int[200];
		System.out.println("Before sort:"); 
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
			System.out.print(array[i] + " "); 
		}
		System.out.println(); 
		System.out.println(); 
		System.out.println("After sort:"); 
		for(int outer = 0; outer < array.length; outer++){
			for(int inner = 0; inner < array.length-outer-1; inner++){
				if(array[inner] > array[inner+1]){
					int temp = array[inner];
					array[inner] = array[inner+1];
					array[inner+1] = temp; 
				}
			}
		}
		for(int a = 0; a < array.length; a++){
			System.out.print(array[a] + " ");
		}
	}
}