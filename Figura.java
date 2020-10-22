
public class Figura {
private int numeroLados;
private int l1;
private int l2;
private int l3;


	public Figura() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f1 = new Figura();
		f1.setNumeroLados(3);
		f1.setL1(3);
		f1.setL2(2);
		f1.setL3(4);
		f1.queFiguraEs();
		f1.elPerimetroEs();
		
		
		Figura f2 = new Figura();
		f2.setNumeroLados(2);
		f2.setL1(3);
		f2.setL2(5);
		f2.setL3(8);
		f2.queFiguraEs();
		f2.elPerimetroEs();
	}
	
	public void elPerimetroEs() {
		int perimetro=0;
		if(this.getNumeroLados()<3) {
			System.out.println("No es una fígura y no se puede calcular el perímetro");
		}
		else if(this.getNumeroLados()==3) {
			perimetro = this.getL1()+this.getL2()+this.getL3();
		}
		else if(this.getNumeroLados()==4) {
			if(this.getL1() == this.getL2()) {
				perimetro = this.getL1()*4;
			}
			else {
				perimetro = (this.getL1()*2) + (this.getL2()*2);
								
			}
		}
		else if(this.getNumeroLados()==5) {
			perimetro = this.getL1()*5;
		}
		System.out.println("el perímetro es: " + perimetro);
	}
	
	public void queFiguraEs() {
		if(this.getNumeroLados()<3) {
			System.out.println("No es una fígura");
		}
		else if(this.getNumeroLados()==3) {
			System.out.println("es un triángulo");
		}
		else if(this.getNumeroLados()==4) {
			if(this.getL1() == this.getL2()) {
				System.out.println("es un cuadrado");
			}
			else {
				System.out.println("es un rectángulo");
			}
		}
		else if(this.getNumeroLados()==5) {
			System.out.println("es un pentágono");
		}
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getL1() {
		return l1;
	}

	public void setL1(int l1) {
		this.l1 = l1;
	}

	public int getL2() {
		return l2;
	}

	public void setL2(int l2) {
		this.l2 = l2;
	}

	public int getL3() {
		return l3;
	}

	public void setL3(int l3) {
		this.l3 = l3;
	}

}
