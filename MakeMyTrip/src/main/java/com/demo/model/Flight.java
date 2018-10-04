package com.demo.model;

import java.sql.Time;

public class Flight {
	int flightNo;
	String flightName,origin,destination;
	String departureTime,arrivalTime,routeTime;
	String cost;
	static int autoFlightNoGen;
	{
		flightNo=++autoFlightNoGen;
	}
	public Flight() {
		super();
		
	}
	@Override
	public String toString() {
		return "Flight [flightNo=" + flightNo + ", flightName=" + flightName + ", origin=" + origin + ", destination="
				+ destination + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", routeTime="
				+ routeTime + ", cost=" + cost + "]";
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getRouteTime() {
		return routeTime;
	}
	public void setRouteTime(String routeTime) {
		this.routeTime = routeTime;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public static int getAutoFlightNoGen() {
		return autoFlightNoGen;
	}
	public static void setAutoAccNoGen(int autoAccNoGen) {
		Flight.autoFlightNoGen = autoAccNoGen;
	}
	public Flight(String flightName, String origin, String destination, String departureTime,
			String arrivalTime, String routeTime, String cost) {
		super();
		
		this.flightName = flightName;
		this.origin = origin;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.routeTime = routeTime;
		this.cost = cost;
	}

}
