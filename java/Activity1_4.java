package javaActvity4;

import java.util.ArrayList;
import java.util.List;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList=new ArrayList<>(); 
		myList.add("Pujara");
		myList.add("Gill");
		myList.add("Ashwin");
		myList.add("Vihari");
		myList.add("Bumrah");
		
		//System.out.println(myList);
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		System.out.println("\nIn above list 3rd name is " + myList.get(2));
		System.out.println("Is list contains Siraj? "+ myList.contains("Siraj"));
		System.out.println("Current list Size is " + myList.size());
		myList.remove(2);
		System.out.println("Removed 3rd");
		System.out.println("New size of the list is " + myList.size());
		System.out.println("New List -> "+myList);

	}

}
