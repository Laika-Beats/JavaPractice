
public class Car {
	String make;
	int year;
	double price;
	
	Car(String make, int year, double price){
		this.make = make;
		this.year = year;
		this.price = price;
	};
	
	public String toString() {
		return  make + "\n" + year + "\n" + price;
	}

}
