
public class Retangulo {
	private double base, altura;

	Retangulo() {
		this.base = 0;
		this.altura = 0;
	}

	// colocar this.

	Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// GET
	// SET -> Passar por parametro

	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// clone e impressão

	public Retangulo cloneRetangulo() {
		Retangulo novoRetangulo = new Retangulo();
		novoRetangulo.base = this.base;
		novoRetangulo.altura = this.altura;

		return novoRetangulo;

	}

	public void imprimir() {
		System.out.println("Base: " + this.base);
		System.out.println("Altura: " + this.altura);

	}

	public double getArea() {
		double area = this.base * this.altura;
		return area;
	}

	public double getPerimetro() {
		return (this.base*2) + (this.altura*2);
	}

}
