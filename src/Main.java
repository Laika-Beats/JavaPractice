

public class Main {

	public static void main(String[] args) {
		String[][] cars = new String[3][3];
		
		cars[0][0] = "Lexus";
		cars[0][1] = "Toyota";
		cars[0][2] = "Ferari";
		cars[1][0] = "Cadillac";
		cars[1][1] = "Cadillac";
		cars[1][2] = "Cadillac";
		cars[2][0] = "Lambo";
		cars[2][1] = "Lambo";
		cars[2][2] = "Lambo";
		
		for (int i = 0; i < cars.length; i++ ) {
			System.out.println();
			for (int j = 0; j < cars[i].length; j++) {
				System.out.println(cars[i][j]);
				
			}
		}
		
		
		
		
		
	}

}
