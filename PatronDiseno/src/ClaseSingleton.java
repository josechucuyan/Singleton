
public class ClaseSingleton {
	private static ClaseSingleton singleton;
	private String nombre;

	private ClaseSingleton(String nombre) {
		this.nombre = nombre;
	}

	public static ClaseSingleton getSingletonInstance(String nombre) {

		singleton = new ClaseSingleton(nombre);

		return singleton;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
