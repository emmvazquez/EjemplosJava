
public class Mascota {
private int edad;
private String nombre;


	public Mascota() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota Tuf = new Mascota();
		Tuf.setEdad(0);
		Tuf.setNombre("Tuf");
		Tuf.cumpleAnios();
		Tuf.cumpleAnios();
		
	}

	public void cumpleAnios() {
		this.setEdad(this.getEdad() + 1);
		System.out.println(this.getNombre() +
				" cumplió " + this.getEdad());
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
