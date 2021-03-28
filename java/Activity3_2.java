package allActivities;

import java.util.HashSet;
import java.util.Set;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs=new HashSet<>();
		hs.add("rohit");
		hs.add("shikhar");
		hs.add("virat");
		hs.add("kl");
		hs.add("pant");
		hs.add("Surya");
		
        System.out.println("Total names : "+hs.size());
        System.out.println(hs);
        hs.remove("kl");
        
        if(hs.remove("rahane"))
        	{System.out.println("rahane removed");}
        else {System.out.println("rahane not present");}
        
        System.out.println("Checking if hardik is present: " + hs.contains("hardik"));
        System.out.println("Total names : "+hs.size());
        System.out.println(hs);
        
	}

}
