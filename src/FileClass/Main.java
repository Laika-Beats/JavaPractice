package FileClass;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("Document.rtf");
		
		if (file.exists()) {
			System.out.println("That file exists.");
		}
		else {
			System.out.println("That file does not exist.");
		}

	}

}
