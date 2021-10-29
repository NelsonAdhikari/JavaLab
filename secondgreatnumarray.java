package JavaLabPractical;
import java.util.Scanner;
public class secondgreatnumarray {
	public static void main(String[] args){
		int array[] = {12, 4, 17, 9};
		int size=array.length;
		int temp;
		for(int i = 0; i<size; i++)
		{
		for(int j = i+1; j<size; j++)
		{
		if(array[i] < array[j])
		{
		 temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		}
		}
		}
		System.out.println("Second greatest number is: " + array[1]);
		}
}
