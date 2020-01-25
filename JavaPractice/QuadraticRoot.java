import java.util.Scanner;

public class QuadraticRoot {
	public static void main(String[] args)
	{
		double rootOne=0, rootTwo=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a= sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b= sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c= sc.nextInt();
		double determinant = ((b*b)-(4*a*c));
		double sqrt= Math.sqrt(determinant);
		if(determinant>0)
		{
	     rootOne = ((-b + sqrt)/(2*a));
	     rootTwo = ((-b - sqrt)/(2*a));
	     System.out.println("Roots are :: "+ rootOne +" and "+rootTwo);
		}
		else
			System.out.println("Invalid");

}
}
