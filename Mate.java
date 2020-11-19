
public class Mate {

	public Mate() {
		// TODO Auto-generated constructor stub
	}
	//función para convertir de grados centigrados a
	//grados Fahrenheit
	public double getCenFa(double centigrados) {
		double Fa=0;
		Fa = (centigrados * (9/5)) + 32;
		return Fa;
	}
	
	//función que convierte de metros a centimetros
	public double getMtCm(double mt) {
		return mt*100;
	}
	
	public double getMetrosPulgadas(double mt) {
		return mt*39.37;
	}

	public double getPulgadasCentimetros(double pl) {
		return pl * 2.54; 
	}
	
	public double getMetrosMillas(double metros) {
		return metros/1609;
	}
}
