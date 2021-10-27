
public class Driver {
	
	String name;
	String homeCity;
	int age;
	
	Driver(String name, String homeCity, int age){
		this.name = name;
		this.homeCity = homeCity;
		this.age = age;
		
	}
	
	public String toString() {
		return "This racer is " + name + ", a " + age + " year old from " + homeCity + ".";
	}
}
