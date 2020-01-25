import java.util.Scanner;
public class Program4 {
	public static void main(String[] args)
	{
	       char x;
		   System.out.println("Enter a character: ");
		   Scanner sc= new Scanner(System.in);
		   x=sc.next().charAt(0);	
		   int ascii= 'x';
		   System.out.println("The ascii value of" +x+ "is:" +ascii );
		}

	}

