import java.util.Scanner;

public class MTable {
	public static void main(String args[])
	{
		int i, end, no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		no=sc.nextInt();
		System.out.println("enter the limiter");		
		end=sc.nextInt();
		 for(i=1; i <= end; i++)
	        {
	            System.out.println(i+" * "+no+" = "+i*no);
	        }
		
		
	}
}