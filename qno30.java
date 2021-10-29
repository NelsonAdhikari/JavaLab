package JavaLabPractical;
import java.util.Scanner;

public class qno30 {
	public static void main(String[] args){
		int count=0, n;
		Scanner e = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		n = e.nextInt();
		int arrayVaar[] = {1, 8, 17, 9, 15, 9, 4, 7, 9, 2, 9};
		for(int i = 0; i < arrayVaar.length; i++){
		if(n == arrayVaar[i])
		count++;
		}
		if(count!=0)
		System.out.println(n + " is in array and repeated " + count + " times.");
		else
		System.out.println(n + " is not in array.");
		}
}
