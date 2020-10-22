public class Figuraanterior {
private int numeroLados;
private Double l1;
private Double l2;
private Double l3;

	
	public Figuraanterior() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figuraanterior obj = new Figuraanterior();
		obj.setNumeroLados(2);
		obj.setL1(3.5);
		obj.queFiguraEs();
		obj.elPerimetroEs();
		
		
		Figuraanterior obj2 = new Figuraanterior();
		obj2.setNumeroLados(4);
		obj2.setL1(56.3);
		obj2.setL2(10.0);
		obj2.queFiguraEs();
		obj2.elPerimetroEs();
		
	}
	
	public void elPerimetroEs() {
		Double perimetro= 0.0;
		//if(     l1 != l2        )
		if(this.getNumeroLados()==4) {
			if(this.getL1()!=this.getL2()) {
				perimetro = (this.getL1() * 2) + (this.getL2()*2);
						//  ( l1 * 2      )    + (         l2 * 2)
			}
		}
		else {
			perimetro = this.getNumeroLados()*this.getL1();
		}	
		System.out.println("El perímetro es : " + perimetro);
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
