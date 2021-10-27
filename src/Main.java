
public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car("Lexus", "IS350 Sport", 2021, 50000.01);
		Car car2 = new Car("Subaru", "WRX STI", 2021, 50000.01);
		
		Garage garage = new Garage();
		
//		System.out.println(car2);
//		System.out.println(car1);
		

		garage.park(car1);
}}