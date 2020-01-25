import java.util.Scanner;
public class LCM {
	public static void main(String args[])
	{
		int n1, n2, lcm;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		n1=sc.nextInt();
		System.out.println("Enter the second number");
		n2=sc.nextInt();
		lcm= (n1>n2) ? n1:n2;
		while(true)
		{
	if(lcm%n1==0 && lcm%n2==0)
	 {
		System.out.println("The lcm is " +lcm);
		break;
	 }
	lcm++;
	}
	}

}
