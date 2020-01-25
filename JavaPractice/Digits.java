import java.util.Scanner;

public class Digits {
	public static void main(String args[])
	{
		int y,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		y=sc.nextInt();
		while(y!=0)
		{
			y=y/10;
			count++;
		}
		System.out.println("The number of digits: " +count);
	}

}
