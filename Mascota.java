
public class Mascota {
private int edad;
private String nombre;


	public Mascota() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mascota Tuf = new Mascota();
		Tuf.nacio();
		Tuf.registrar("Tuf");
		Tuf.cumpleAnios();
		Tuf.cumpleAnios();
		
		Mascota Dante = new Mascota();
		Dante.nacio();
		Dante.registrar("Dante");
		Dante.cumpleAnios();
	}
	
	public void registrar(String nombre) {
		this.setNombre(nombre);
		System.out.println("tu mascota ahora "
				+ "se llama" + nombre );
	}
	
	public void nacio() {
		this.setEdad(0);
		System.out.println( " nació");
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
