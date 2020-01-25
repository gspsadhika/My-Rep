import java.util.Scanner;
public class Swap {
	public static void main(String[] args)
	{
		int first, second;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number");
		first= sc.nextInt();
		System.out.println("enter the second number");
		second= sc.nextInt();
		int temp=first;
		first=second;
		second=temp;
		System.out.println("First number after swapping is: " +first);
		System.out.println("Second number after swapping is: " +second);
		
	}

}
