package JavaLabPractical;
import java.util.Scanner;

public class sumprimenumn1ton2 {
	public static void main(String[] args){
		int number,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = s.nextInt();
		System.out.print("Enter second number: ");
		int n2 = s.nextInt();
		for(number=n1; number<=n2; number++)
		{
		int b=0;
		for(int i=2; i<=number/2; i++)
		{
		if(number%i==0)
		{
		b++;
		break;
		}
		}
		if(b == 0 && number != 1)
		sum+=number;
		}
		System.out.print("Sum of prime number between " + n1+ " to " + n2 + " is " + sum);
		}
}
