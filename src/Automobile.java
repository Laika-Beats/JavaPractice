
public class Automobile extends Driver {
	
	String carMake;
	String carModel;
	int carYear;
	
	Automobile(String name, String homeCity, int age, String carMake, String carModel, int carYear){
		super(name, homeCity, age);
		this.carMake = carMake;
		this.carModel = carModel;
		this.carYear = carYear;
	}

	public String toString() {
		return super.toString() + " Currently they are driving a " + carYear + " " + carMake + " " + carModel + ".";
	}
	
	void readyToRace() {
		System.out.println(name + " is ready to race!");
	}
	
}
