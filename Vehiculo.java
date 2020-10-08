
public class Vehiculo {
	
	private String Color;
	private int Velocidad;
	private String Marca;
	private int Anio;

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vehiculo obj1 = new Vehiculo();
		obj1.Color = "Rojo";
		obj1.Velocidad = 0;
		obj1.Marca = "Ford";
		obj1.Anio = 2020;
		
		Vehiculo obj2 = new Vehiculo();
		obj2.Color = "Azul";
		obj2.Velocidad = 0;
		obj2.Marca = "Chevrolet";
		obj2.Anio = 2010;
		
		
		
		//GET obtener los valores
		//SET insertar nuevos valores 
	}
	
	
	// 1. acceso [public, private, protected]
	// 2. opcional static
	// 3. tipo de método [void = vacio, int, String , float, Double ]
	public void encender() {
		System.out.println(this.getMarca() + " Está encendido" );
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(int velocidad) {
		Velocidad = velocidad;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getAnio() {
		return Anio;
	}

	public void setAnio(int anio) {
		Anio = anio;
	}
	
	

}
