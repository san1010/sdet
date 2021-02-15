//insertion sort 

package javaActivity3;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,4,18,1,9,20,14,5};
		System.out.println("Array before sorting"+ Arrays.toString(arr));
		insertionAscending(arr);
		System.out.println("Array after sorting"+ Arrays.toString(arr));	
	}
	
	static void insertionAscending(int iArray[])
	{
		int size=iArray.length,i;

		for (i = 0; i < size; i++) {
			
			int pivot=iArray[i];
			int j=i-1;
			while(j>=0 && pivot<iArray[j]){
				iArray[j+1]=iArray[j];	
				j=j-1;
			}
			iArray[j+1]=pivot;
		}		
	}
}
