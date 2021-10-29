package JavaLabPractical;

public class sumprimenumbetwn1to100 {
	public static void main(String[] args){
		int i,j,sum=0;
		for(i=1; i<=100; i++)
		{
		int a=0;
		for(j=1; j<=i; j++)
		{
		if(i%j==0)
		{
		a++;
		}
		if(a == 2) {
		sum+=i;
		}
		System.out.print("Sum of prime number between 1 to 100 is " + sum);
		}
}
	}
}
		
