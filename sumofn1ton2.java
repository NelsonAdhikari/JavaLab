package JavaLabPractical;
import java.util.Scanner;
public class sumofn1ton2 {
	public static void main(String[] args){
		int sum = 0;
		Scanner r = new Scanner(System.in);
		System.out.print("Enter n1: ");
		int n1 = r.nextInt();
		System.out.print("Enter n2: ");
		int n2 = r.nextInt();
		for(int i=n1;i<=n2;i++)
		{
		sum=sum+i;
		}
		System.out.println("Sum of " + n1 + " to " + n2 + " is " + sum);
		}
}
