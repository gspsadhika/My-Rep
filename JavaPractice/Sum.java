import java.util.Scanner;

public class Sum {
	public static void main(String[] args)
	{
		int n, i, sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of n numbers is: " +sum);
	}

}
