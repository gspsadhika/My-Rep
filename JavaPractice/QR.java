import java.util.Scanner;

public class QR {
	public static void main(String args[])
	{   int x, y;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number: ");
	x= sc.nextInt();
	System.out.println("Enter second number: ");
	y=sc.nextInt();
	int quotient= x/y;
	System.out.println("The quotient is: " +quotient);
	int remainder = x%y;
	System.out.println("The remainder is: " +remainder);		
		
	}

}
