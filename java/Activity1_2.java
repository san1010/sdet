package javaActivity2;

import java.util.Arrays;


public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 77, 10, 54, -11, 10};
		System.out.println("Given Array :"+ Arrays.toString(arr));
		int search=10;
		int sumOfTen=30;
		System.out.println("output is :"+ isThreeTen(arr,search,sumOfTen));
	}
	public static boolean isThreeTen (int numbers[],int find, int sum)
		{	
			int tempSum=0;
			for(int i:numbers)
				{
				if(i==find) tempSum+=find;
				if(tempSum>sum) break;
				}
			return(tempSum==sum);
		}
	}

