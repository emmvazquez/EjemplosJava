
public class Reproductor {
private int volumen;
private int duracion;
private int velocidad;
private String video;


	public Reproductor() {
		
	}
	public Reproductor(String v, int d, int vl) {
		// TODO Auto-generated constructor stub
		video = v;
		duracion = d;
		velocidad = vl;	
		volumen=50;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reproductor obj = new Reproductor("Luisito comunica Viaje a chiapas",600,384);
		Reproductor obj2 = new Reproductor("Scorpion dorado, shalala ",560, 384);
		obj.reproducir();
		obj2.reproducir();
		
		Reproductor obj3 = new Reproductor();
		obj3.setVideo("Yulay  viaje de 5 pesos");
		obj3.setDuracion(400);
		obj3.setVolumen(50);
		obj3.setVelocidad(384);
		obj3.reproducir();
		}

	public void reproducir() {
		System.out.println("Reproduciendo .." + this.getVideo());
	}
	
	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

}
