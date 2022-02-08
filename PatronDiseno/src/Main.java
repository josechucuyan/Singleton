
public class Main {
	public static void main(String[] args) {
	ClaseSingleton pepe = ClaseSingleton.getSingletonInstance("PEPE");
	
	System.out.println(pepe.getNombre());
	}
}
