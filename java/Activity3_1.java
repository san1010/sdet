package allActivities;

import java.util.ArrayList;
import java.util.List;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList=new ArrayList<>();
		myList.add("rohit");
		myList.add("shikhar");
		myList.add("virat");
		myList.add("kl");
		myList.add("pant");
		
		myList.add(2, "Surya");
		
		System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element : "+myList.get(2));
        System.out.println("Is" + myList.get(3) +"present ?" + myList.contains("kl"));
        System.out.println("Total names : "+myList.size());
        myList.remove("kl");
        System.out.println("Total names : "+myList.size());
	}

}
