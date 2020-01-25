import java.util.Scanner;
public class ConVow {
public static void main(String[] args)
{   char ch;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter any alphabet");
	ch=sc.next().charAt(0);
	if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u')
	{
		System.out.println("The given alphabet is a vowel");
	}
	System.out.println("The given alphabet is a constant");
	
	
}
}
