package Interface;

public class Fish implements Prey, Predator {
	
	public void hunt() {
		System.out.println("HUNT FISH");
	}
	
	public void flee() {
		System.out.println("FLEE FROM FISH");
	}

}
