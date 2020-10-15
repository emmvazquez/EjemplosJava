
public class Figura {
private int numeroLados;
private Double l1;
private Double l2;
private Double l3;

	
	public Figura() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura obj = new Figura();
		obj.setNumeroLados(5);
		obj.queFiguraEs();
		
		Figura obj2 = new Figura();
		obj2.setNumeroLados(4);
		obj2.queFiguraEs();		
		
	}
	
	public void queFiguraEs() {
		/*
		 			  llaves de apertura
		if(Condición) {
			Acciones en caso de ser verdadero
		}  llaves de cierre
		
		*/
		
		//this
		
		if(this.getNumeroLados()==3) {
			System.out.println("Es un triángulo");
		}
		else if(this.getNumeroLados()==4) {
			System.out.println("Es un cuadro");
		}
		else if(this.getNumeroLados()==5) {
			System.out.println("Es un pentágono");
		}
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public Double getL1() {
		return l1;
	}

	public void setL1(Double l1) {
		this.l1 = l1;
	}

	public Double getL2() {
		return l2;
	}

	public void setL2(Double l2) {
		this.l2 = l2;
	}

	public Double getL3() {
		return l3;
	}

	public void setL3(Double l3) {
		this.l3 = l3;
	}
	
	
	

}
