import java.util.Scanner;
public class Factorial {
	public static void main(String[] args)
	{
		int fact=1, i=1, n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("The factorial is: " +fact);
	}

}
