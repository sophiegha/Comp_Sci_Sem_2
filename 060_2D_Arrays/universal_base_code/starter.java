import pkg.*;
import java.util.*; 
import java.util.Scanner;
import java.util.Random;



class starter {
	public static double rowAverage(int[][] array, int row){
	double average = 0; 
	for(int i = 0; i < array[row].length; i++){
		average = average + array[row][i];
	}
	System.out.println("The row number is " + row ); 
	return average/ array[row].length; 
}

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows? ");
		int row = sc.nextInt();
		System.out.println("how many columns? "); 
		int col = sc.nextInt(); 
		int[][] array = new int[row][col];
		for(int x = 0; x < array.length; x++){
			for(int y = 0; y < array[0].length; y++){
				array[x][y] = ((int)(Math.random() * 10 +1)); 
				System.out.print(array[x][y] + " ");
			}
			System.out.println(); 
		}
		System.out.println(rowAverage(array, 0)); 


		
	}
}
