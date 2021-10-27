
public class Car {
	
	String make;
	String model;
	int year;
	double price;
	
	Car(String make, String model, int year, double price){
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	};
	
	public String toString() {
		return make + "\n" + model + "\n" + year + "\n" + price;
	}

}
