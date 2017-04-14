package oop;

public class Car {
	private int price;
	private CAR_TYPE carType;

	public Car(int price, CAR_TYPE type) {
		this.price = price;
		this.carType = type;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public CAR_TYPE getCarType(){
		return this.carType;
	}
}
