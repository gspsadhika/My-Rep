import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		int rem, num, reverse=0; 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		num=sc.nextInt();
		while(num!=0)
		{
			rem= num%10;
			reverse= reverse*10+rem;
			num= num/10;
		}
		System.out.println("The reversed number is: " +reverse);
	}
	

}
