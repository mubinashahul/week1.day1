package week1.day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
	int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
	Arrays.sort(a);
	System.out.println("The duplicate values are:");
		for ( int i =0; i<=a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
			
		}
	}

}
