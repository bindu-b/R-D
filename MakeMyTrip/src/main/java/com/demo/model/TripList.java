package com.demo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;







public class TripList {
	
	 ArrayList<Flight> list = new ArrayList();
	 
	 
	 public void add(Flight flight) {
         list.add(flight);
  }
	 
	 public ArrayList<Flight> deleteFlightByID(int flightNo) {
         for(Flight acc:list) {
              if(acc.getFlightNo()==flightNo)
                      list.remove(flightNo);
                     return list;
              
        }
        throw new RuntimeException("Flight not found"); 
        } 
	 
	 public ArrayList<Flight> updateFlight(int flightNo, String flightName) {
		 for(Flight acc:list) {
             if(acc.getFlightNo()==flightNo) {
            	 acc.setFlightName(flightName);
             }
		 }
             return list;
		 }
	 
	 public ArrayList<Flight> getAllFlights() {
	        return list;
	        
	 }
	 
	/* public ArrayList<Flight> getMorningFlight(){
		 Collections.sort(list,new Comparator<Flight>() {

				public int compare(Flight acc1, Flight acc2) {
					// TODO Auto-generated method stub
					return acc1.getArrivalTime().compareTo(acc2.getArrivalTime());
				}
	 		   
	 		   
	 	   });
	 	   return list;
	    }*/
	 public ArrayList<Flight> sortFlightByDuration(String originCity,String DestnCity){
         list.sort((trip1, trip2)->trip1.getRouteTime().compareTo(trip2.getRouteTime()));
         return list;
                }
  
  public ArrayList<Flight> sortFlightByPrice(String source,String destination){
         list.sort((trip1, trip2)->trip1.getCost().compareTo(trip2.getCost()));
         ArrayList<Flight> cheapflight=new ArrayList<Flight>();
         
         for(Flight fly : list){
                if(fly.getOrigin().equals(source) && fly.getDestination().equals(destination)){
                      cheapflight.add(fly);
                }
                }
         return cheapflight;
  }
  
         public ArrayList<Flight> sortFlightByTime(String source,String destination){
                list.sort((trip1, trip2)->trip1.getRouteTime().compareTo(trip2.getRouteTime()));
                ArrayList<Flight> flightTime=new ArrayList<Flight>();
                
                for(Flight fly : list){
                      if(fly.getOrigin().equals(source) && fly.getDestination().equals(destination)){
                             flightTime.add(fly);
                      }
                      }
                return flightTime;
}
         
  /*public ArrayList<Flight> morningFlight(String source,String destination){
         ArrayList<Flight> morningTime=new ArrayList<Flight>();
         
         for(Flight fly : list){
                if(fly.getArrivalTime()<12 && fly.getDepartureTime()<12)
                      morningTime.add(fly);
         }
         return morningTime;
  }*/


	 public ArrayList<Flight> getCheapestCost(){
		 Collections.sort(list,new Comparator<Flight>() {

				public int compare(Flight acc1, Flight acc2) {
					// TODO Auto-generated method stub
					return acc1.getCost().compareTo(acc2.getCost());
				}
	 		   
	 		   
	 	   });
	 	   return list;
	    }
	 
	 public static void main(String[] args)
     {
		 TripList trip=new TripList();
		 trip.add(new Flight("Air India","Banglore","Delhi","7:00:00","10:00:00","3:00:00","8000"));
		 trip.add(new Flight("Jet Airways","Banglore","Chennai","10:00:00","12:00:00","2:00:00","5000"));
		 trip.add(new Flight("Kingfisher","Delhi","Mumbai","14:00:00","18:30:00","3:30:00","3000"));
		 
		 for(Flight acc:trip.getAllFlights()) {
		       System.out.println(acc);
		       }
		 System.out.println("-----------------");
		 System.out.println(trip.deleteFlightByID(1));
		 System.out.println("-------------------");
		 
		 for(Flight acc:trip.updateFlight(2,"Jet")) {
		       System.out.println(acc);
		       }
		 System.out.println("------------------");
		 /*for(Flight acc:trip.getMorningFlight()) {
		       System.out.println(acc);
		       }*/
		 System.out.println("------------------");
		 for(Flight acc:trip.getCheapestCost()) {
		       System.out.println(acc);
		       }
		 System.out.println("------------------");
		 for(Flight acc:trip.sortFlightByDuration("Banglore","Chennai")) {
		       System.out.println(acc);
		       }
		 System.out.println("------------------");
		 for(Flight acc:trip.sortFlightByPrice("Banglore","Chennai")) {
		       System.out.println(acc);
		       }
		 System.out.println("------------------");
		 for(Flight acc:trip.sortFlightByTime("Banglore","Chennai")) {
		       System.out.println(acc);
		       }
		 System.out.println("------------------");
		 
     }

}
