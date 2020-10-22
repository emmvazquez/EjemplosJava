
public class Parametros {
private String item;
private int contador;

	
	public Parametros() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parametros obj = new Parametros();
		obj.setItem("Estafeta");
		obj.setContador(0);
		obj.pasoItem(obj.getItem());
		obj.pasoItem("Item");
		
		
	}
	
	public void pasoItem(String i) {
		System.out.println("Recibí " + i);
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

}
