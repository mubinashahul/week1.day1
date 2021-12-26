package week1.day2;

public class Calculator {
	public int add (int x, int y) {
		return x+y;
		
	}
	public double sub (double a, double b)
	{
		return a-b;
		
	}
	public double mul (double c, double d)
	{
		return c*d;
	}
	public int div (int s, int t)
	{
		return s/t;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		System.out.println( "Addition is " +result);
		double res = c.sub (1000, 550);
		System.out.println("Subtraction is " +res);
		double res1 = c.mul(120, 15);
		System.out.println("Multiplication is " +res1);
		int r = c.div(150, 10);
		System.out.println("Division is " +r);
		
	}

}
