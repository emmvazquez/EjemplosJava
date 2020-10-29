
public class Calculadora {
private int a;
private int b;

	public Calculadora(int a, int b) {
			this.a = a;
			this.b = b;
		}

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Calculadora obj = new Calculadora(89,9);
		System.out.print(obj.Sumar());
	}
	
	public int Sumar() {
		return this.getA() + this.getB();
	}
	
	public int Restar() {
		return this.getA() - this.getB();
	}
	
	public int Multiplicar() {
		return this.getA() * this.getB();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
