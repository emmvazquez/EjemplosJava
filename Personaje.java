public class Personaje {
private String Nombre;
private int Edad;

	public Personaje() {
		// TODO Auto-generated constructor stub
	}
	

	public Personaje(String nombre, int edad) {
		Nombre = nombre;
		Edad = edad;
	}

	public String getNombreCompleto() {
		return this.getNombre() + " " +this.getEdad();
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

}
