package week1.day2;

public class ArmStrong {

	public static void main(String[] args) {

		int n = 153;
		int orgNum = n;
		int sum = 0;
		while (n>0) {
			int rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n /10;
		}
		if (sum == orgNum) {
			System.out.println( sum + " number is armstrong");
		}
		else {
			System.out.println(sum +" number is not armstrong");
		}
	}

}
