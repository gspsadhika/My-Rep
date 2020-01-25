import java.util.Scanner;

public class Power {
	public static void main(String args[])
	{   int number, power;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a base number");
		number=sc.nextInt();
		System.out.println("Enter a power");
		power=sc.nextInt();
		 double result= Math.pow(number,power);
		 System.out.println(+ number + " raisen to " + power + " is " +result);
	}

}
