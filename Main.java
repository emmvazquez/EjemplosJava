
public class Main extends FuncionesBasicas {
	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mate obj = new Mate();
		double  valor = 3;
		
		imprimir(obj.getCenFa(1.8));
		imprimir(obj.getMtCm(2.5));
		imprimir(valor + " metros a pulgadas: " + obj.getMetrosPulgadas(valor));
		imprimir("pulgadas a cm " + obj.getPulgadasCentimetros(valor));
		imprimir(valor + "metros a millas " + obj.getMetrosMillas(valor));
		
	}
}
