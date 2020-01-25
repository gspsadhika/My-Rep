import java.util.Scanner;
public class Palindrome {
		public static void main(String args[])
		{
			int rem, num, reverse=0,num1=0; 
			Scanner sc= new Scanner(System.in);
			System.out.println("enter any number");
			num=sc.nextInt();
			num1=num;
			while(num!=0)
			{
				rem= num%10;
				reverse= reverse*10+rem;
				num= num/10;
			}
			System.out.println("The reversed number is: " +reverse);
			if(reverse==num1)
			{
				System.out.println("The given number is a palindrome");
			}
				
		}
		

	}

