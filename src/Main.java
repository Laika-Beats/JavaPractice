
public class Main {

	public static void main(String[] args) {
		
		Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("tacos");
		Food food2 = new Food("pizza");
		Food food3 = new Food("yogurt");
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
	}
}