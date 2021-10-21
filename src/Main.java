
public class Main {

	public static void main(String[] args) {
		int a = add(3, 7, 9);

		
		System.out.println(a);
		
		
	}
	
	static int add(int x, int y) {
		System.out.println("This is overload method 1.");
		return x + y;
		
	}
	static int add(int x, int y, int z) {
		System.out.println("This is overload method 2.");
		return x + y + z;
		
	}

}
