package prc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPax){
		
		maxPassengers=maxPax;
		passengers=new ArrayList<>();
	}
	
	public int totalPax() {
		return passengers.size();
	}
	public int maxPax() {
		return maxPassengers;
	}
	public void onboard(String pax) {
		passengers.add(pax);
		
	}
	public Date takeOff() {
		lastTimeTookOf=new Date();
		return lastTimeTookOf;
		
	}
	public Date land() {
		lastTimeLanded=new Date();
		return lastTimeTookOf;
		
	}
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	public List<String> getPassengers(){
		return passengers;
	}
}

public class Activity2_2 {
	public static void main(String[] args) throws InterruptedException {
		Plane plane=new Plane(10);
		plane.onboard("Sandeep");	
		plane.onboard("Archana");
		plane.onboard("Arnav");
		System.out.println("Plane takeof at -> " + plane.takeOff());
		System.out.println("Capacity of this plane is-> "+plane.maxPax());
		System.out.println("Total number of passengers -> " + plane.totalPax());
		System.out.println("Passenger list -> "+ plane.getPassengers());
		Thread.sleep(5000);
		plane.land();
		System.out.println("Plane landed at ->"+ plane.getLastTimeLanded());
	}
}
