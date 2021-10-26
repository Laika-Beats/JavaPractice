
public class Main {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza("deep dish crust", "tomato", "mozzerella");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		
	}
}