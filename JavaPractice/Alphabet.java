import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args)
	{   char c;
		System.out.println("enter any input");
		Scanner sc= new Scanner(System.in);
		c=sc.next().charAt(0);
		if(c>='a' && c<='z'|| c>='A' && c<='Z')
        System.out.println("The given input is an Alphabet");	
		else
		System.out.println("This is not an Alphabet");		
	}

}
