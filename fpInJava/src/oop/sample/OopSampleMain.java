package oop.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OopSampleMain {
	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car(1000, CAR_TYPE.BMW));
		cars.add(new Car(3000, CAR_TYPE.KIA));
		cars.add(new Car(4000, CAR_TYPE.HONDA));
		
		Seller seller = new Seller(cars);
		seller.showSellingList();
		
		Buyer buyer = new Buyer("Nick");
		Optional<Car> car = seller.sellCar();
		if(car.isPresent()){
			buyer.purchase(car.get());
		}
		
		System.out.println("owned car - " + buyer.ownedCars());
	}
}
