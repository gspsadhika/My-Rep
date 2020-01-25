import java.util.Scanner;
public class Float1 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first floating point number: ");
		float f1= sc.nextFloat();
		System.out.println("Enter second floating point number: ");
		float f2= sc.nextFloat();
		float multiply= f1*f2;
		System.out.println("The result is : " +multiply);
		
	}

}
