package JavaLabPractical;
import java.util.Scanner;

public class sumoddnumn1ton2 {
	public static void main(String[] args){
		int  n1,n2,sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		 n1 = s.nextInt();
		System.out.print("Enter second number: ");
		 n2 = s.nextInt();
		for(int i=n1;i<=n2;i++)
		{
		if(i%2==0)
		sum+=i;
		}
		System.out.println("Sum of even number between " + n1 + " to " + n2 + " is " + sum);
		}
}
