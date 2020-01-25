import java.util.Scanner;

public class PN {
public static void main(String args[])
{
	int x;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number");
	x=sc.nextInt();
	if(x>0)
		System.out.println("Number is positive");
	else
		System.out.println("Negative");
}
}
