import java.util.Scanner;

public class GCD {
public static void main(String args[])
{
	int n1, n2,i,gcd = 0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the first number : ");
	n1=sc.nextInt();
	System.out.println("Enter the second number : ");
	n2=sc.nextInt();
	for(i=1;((i<=n1)&&(i<=n2));i++)
	{
		if(n1%i==0&&n2%i==0)
		gcd=i;
	}
	System.out.println("The greatest common divisor is: " +gcd);
	
}
}
