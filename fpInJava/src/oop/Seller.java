package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Seller {
	private List<Car> cars = new ArrayList<Car>();

	public Seller(List<Car> cars) {
		this.cars = cars;
	}

	public Optional<Car> sellCar() {
		if (cars.size() > 0) {
			return Optional.of(cars.remove(cars.size() - 1));
		} else {
			System.out.println("no car to sell!");
			return Optional.empty();
		}
	}

	public void showSellingList(){
		System.out.println(cars.stream()
				.map(c -> c.getCarType().toString())
				.collect(Collectors.joining("-")));
	}
}
