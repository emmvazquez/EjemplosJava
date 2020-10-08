
public class Vehiculo {
	
	private String Color;
	private int Velocidad;
	private String Marca;
	private int Anio;
	private int Revoluciones;

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Vehiculo obj1 = new Vehiculo();
		obj1.Color = "Rojo";
		obj1.Velocidad = 0;
		obj1.Marca = "Ford";
		obj1.Anio = 2020;
		obj1.Revoluciones=0;
		
		Vehiculo obj2 = new Vehiculo();
		obj2.Color = "Azul";
		obj2.Velocidad = 0;
		obj2.Marca = "Chevrolet";
		obj2.Anio = 2010;
		obj2.Revoluciones=0;
		
		obj1.encender();
		obj1.acelerar();
		obj1.acelerar();
		
		
		obj2.encender();
		
		obj1.estado();
		obj2.estado();
		
		obj1.acelerar();
		obj1.estado();
		obj1.apagar();
		obj1.estado();
		
		
	}
	
	public void encender() {
		
		this.setRevoluciones(1000);
		System.out.println(this.getMarca() + " Está encendido" );

	}

	public void acelerar() {
		this.setRevoluciones(this.getRevoluciones()+500);
	}
	
	public void estado() {
		System.out.println("____________________");
		System.out.println(this.Marca);
		System.out.println("R/s: " + this.getRevoluciones() );
		System.out.println("____________________");
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

	public int getRevoluciones() {
		return Revoluciones;
	}

	public void setRevoluciones(int revoluciones) {
		Revoluciones = revoluciones;
	}
	
	public void apagar() {
		this.setRevoluciones(0);
		this.setVelocidad(0);
	}
	

}
