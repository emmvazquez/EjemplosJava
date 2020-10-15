
public class Persona {
private String nombre;
private int edad;
private String sexo;


	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona obj = new Persona();
		obj.setNombre("Emmanuel");
		obj.setEdad(36);
		obj.setSexo("H");
		obj.saludar();
		obj.brincar();
		
		Persona ob2 = new Persona();
		ob2.setNombre("Ailyn");
		ob2.setEdad(10);
		ob2.setSexo("M");
		ob2.saludar();
		ob2.brincar();
		
		Persona obj3 = new Persona();
		obj3.setNombre("Emmanuel 2");
		obj3.saludar();
		obj3.nombre = "Emmanuel 2";
		
		
		
	}
	
	// 1 nivel acceso public, private, protected
		// 2 static opcional
		// 3 tipo de método 
				// void : no regresa nada el método
				// int : regresa un valor entero
				// Double : regresa un valor Double 21376.9843
				// String : regresa una cadena 
		// 4 Nombre del método  no contiene espacios en blanco
		// 5 paréntesis 
		// 6 dentro de los paréntesis los parámetros o argumentos
		// 7 las llaves {  }
		
	//	1 2  3    4 5         6     7  
	
	public void saludar() {
		System.out.println(this.getNombre() + " dice hola " );
	}
	
	public void brincar() {
		System.out.println(this.getNombre() + " está saltando");
	
		//Imprimir "cadena que queremos imprimir"
		//System.out.println("cadena que queremos imprimir");
	
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	

}
