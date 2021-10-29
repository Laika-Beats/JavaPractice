package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rabbit rabbit = new Rabbit();
		
		Hawk hawk = new Hawk();
		
		Fish fish = new Fish();
		
		rabbit.flee();
		
		hawk.hunt();
		
		fish.flee();
		fish.hunt();

	}

}
