package JavaLabPractical;
import java.util.Scanner;

public class printn1ton2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		int i;
		System.out.println("Number between first number and second");
		for(i=n1;i<=n2;i++)
		{
		System.out.println(i);
		}

     }
}