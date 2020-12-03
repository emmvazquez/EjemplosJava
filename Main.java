
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "LA CADENA a convertir";
		Cadenas obj = new Cadenas();
		Personaje objP = new Personaje("Homero",40);
		
		obj.imprimir(obj.convierteMayusculas(objP.getNombreCompleto()));
		obj.imprimir(obj.convierteMinusculas(cadena));
		obj.imprimir(obj.convierteHash(cadena));

	} 

}
