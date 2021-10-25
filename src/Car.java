
public class Car {
	String make;
	int year;
	double price;
	
	Car(String make, int year, double price){
		this.make = make;
		this.year = year;
		this.price = price;
	};

	void drive() {
		System.out.println("You drive the " + this.year + " " + this.make);
	}

}
