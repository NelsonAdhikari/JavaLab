package JavaLabPractical;
import java.util.Scanner;

public class qn33 {
	public static void main(String[] args){
		Scanner q = new Scanner(System.in);
		String name, address,email;
		Long phoneNo;
		System.out.println("Enter your Details");
		System.out.print("What is your name? ");
		name = q.nextLine();

		System.out.print("Enter your full address: ");
		address = q.nextLine();

		System.out.print("Enter your email: ");
		email = q.nextLine();

		System.out.print("Enter your phone Number: ");
		phoneNo = q.nextLong();

		System.out.println("\n\nYour Personal Details");
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNo);
		System.out.println("Email: " + email);
		}
}
