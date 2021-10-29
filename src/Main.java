import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red sometimes. But other times they are pink or white.");
			writer.append("\n (A romantic poem.)");
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
}
