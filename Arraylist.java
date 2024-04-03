package Arraylist1;
// change the index of the array
import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,12,45,32,15};
		System.out.println(Arrays.toString(arr));
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
		
		static void change(int nums[]) {
			nums[0]=99;
		}
	}

