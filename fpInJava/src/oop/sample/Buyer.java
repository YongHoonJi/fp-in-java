package oop.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Buyer {
	private String buyerName;
	private List<Car> purchasedCars = new ArrayList<Car>();

	public Buyer(String buyerName) {
		this.buyerName = buyerName;
	}

	public void purchase(Car car) {
		System.out.println(buyerName + " purchases a car[" + car.getCarType().toString() + "]");
		this.purchasedCars.add(car);
	}
	
	public String ownedCars(){
		return this.purchasedCars.stream()
		.map(c -> c.getCarType().toString())
		.collect(Collectors.joining(","));
	}
}
