package week1.day2;

import java.util.Arrays;

public class LearnArray {
	
	
	public static void main(String[] args) {
	// int [] -> int 1D Array	
		// String [] -> String 1D Array	
		// data saved with indices
		// index starts with 0
		//Size of the array should be declared at the starting
		//to sort the array values -> Arrays.sort(arrayname)
	//size of arrays is fixed, it cannot able to change during the run time
		//size of array declared at the creation of an array
		//
//		int [] n = new int [3];
//		n[0]=1;
//		n[1]=2;
//		n[2]=3;
//		n[3]=4;
//		
		int [] nums = {20,23,10,150,350};  //memory will alocated the 0,1,2,3,4
		// Total number are allocated in memroy space
		System.out.println("Length of the arrays: "+nums.length);
		//to get the value of which memory space index is allocated
		System.out.println("The index of 0 values : "+nums[0]);
		//last index number to be displayed
		int lastindex = nums.length-1;
		System.out.println("the last index of the arrays : "+nums[lastindex]);
		
		//to sort the data in an array
		System.out.println("Sorting");
		Arrays.sort(nums);
		for (int i = 0; i<=nums.length; i++) {
			System.out.println(nums[i]);
		}
	
		
		// to print all the data
		System.out.println(" To printing all the data");
		for (int i = 0; i<=nums.length; i++) {
			System.out.println(nums[i]);
		}
	
	}
}
