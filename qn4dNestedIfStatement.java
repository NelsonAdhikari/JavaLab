package JavaLabPractical;

public class qn4dNestedIfStatement {
	public static void main(String[] args){
		int num = 1;
		if(num > 0)
		{
		if(num % 2 == 0)
		System.out.println(num + " is positive even number");
		else
		System.out.println(num + " is positive odd number");
		}
		else
		{
		if(num % 2 == 0)
		System.out.println(num + " is negative even number");
		else
		System.out.println(num + " is negative odd number");
		}
	}
		

}
