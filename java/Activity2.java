package javaActivity2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float arr[]= {10, 77, 10, 54, -11, 10};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==10) sum+=arr[i];
		}
		if (sum==30) 
			System.out.println("True");
		else
			System.out.println("False");
		}
	}

