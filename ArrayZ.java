import java.util.Arrays;


public class ArrayZ {

	public static void main(String[] args) {
		//Arrays: printing Numbers
		int numbers[]={51,8,7};//Sort Arrays Smallest in the front
		for(int i=0;i<numbers.length;i++)
		{
			Arrays.sort(numbers);
			System.out.println(numbers[i]);
		}
	}

}
