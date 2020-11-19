
public class Superheroe {
private String nombre;
private String sobrenombre;
private String debilidades;
private Superpoder poder;

	
	
	public Superheroe(String nombre,String sobrenombre, String debilidades, Superpoder poder) {
		
		this.nombre = nombre;
		this.debilidades = debilidades;
		this.sobrenombre = sobrenombre;
		this.poder = poder;
	}

	public Superheroe() { //método constructor
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) { //método main
		// TODO Auto-generated method stub
		Superpoder po1 = new Superpoder("Superfuerza", 30);
		Superpoder po2 = new Superpoder("Superfuerza", 30);
		
		Superheroe s1 = new Superheroe("Peter Parker", "Spiderman", "",po1);  //creando objeto, instanciando
		Superheroe s2 = new Superheroe("Bruce Wayne", "Batman", "",po2);  //creando objeto, instanciando
		
		quienGana(s1,s2);
		
		
		}

	public static void quienGana(Superheroe s1, Superheroe s2) {
		if(s1.getPoder().getNivelPoder() == s2.getPoder().getNivelPoder()) {
			System.out.print("empate");
		}
		else if (s1.getPoder().getNivelPoder() > s2.getPoder().getNivelPoder()) {
			System.out.print("Gana " +  s1.getNombre());
		}
		else {
			System.out.print("Gana " +  s2.getNombre());
		}
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSobrenombre() {
		return sobrenombre;
	}

	public void setSobrenombre(String sobrenombre) {
		this.sobrenombre = sobrenombre;
	}

	public String getDebilidades() {
		return debilidades;
	}

	public void setDebilidades(String debilidades) {
		this.debilidades = debilidades;
	}

	public Superpoder getPoder() {
		return poder;
	}

	public void setPoder(Superpoder poder) {
		this.poder = poder;
	}
	
	

}
