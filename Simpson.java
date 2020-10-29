
public class Simpson {
private String Nombre;
private String Genero;
private int Edad;
	
	

	public Simpson(String nombre, String genero, int edad) {
		Nombre = nombre;
		Genero = genero;
		Edad = edad;
	}

	public Simpson() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simpson obj = new Simpson("Bart","Hombre",10);
		Simpson obj2 = new Simpson("March","Mujer",38);
		Simpson obj3 = new Simpson("Lisa","Mujer",8);
		Simpson obj4 = new Simpson("Homero","Hombre",45);
		
		
		obj.saludaSimpson();
		obj2.saludaSimpson();
		obj4.saludaSimpson();
	}
	
	public void saludaSimpson() {
		System.out.println(this.getNombre() + " te dice hola");
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

}
