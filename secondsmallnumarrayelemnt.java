package JavaLabPractical;

public class secondsmallnumarrayelemnt {
	public static void main(String[] args){
		int array[] = {12, 14,7,1,96};
		int size=array.length;
		for(int i = 0; i<size; i++)
		{
		for(int j = i+1; j<size; j++)
		{
		if(array[i] > array[j])
		{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		}
		}
		}
		System.out.println("Second smallest number is: " + array[1]);
		}
}
