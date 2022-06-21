
public class Retangulo {

	private double base;
	private double altura;
	private double area;
	public double perimetro;

	public Retangulo() {
		this.base = 0;
		this.altura = 0;

	}

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		calculaArea();
		calculaPerimetro();

	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getBase() {
		return this.base;

	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

	private void calculaArea() {
		this.area = this.base * this.altura;

	}

	private void calculaPerimetro() {
		this.perimetro = (2 * this.base) + (2 * this.altura);

	}

	public double getArea() {
		calculaArea();
		return this.area;
	}

	public double getPerimetro() {
		calculaPerimetro();
		return this.perimetro;
	}

	public Retangulo cloneRetangulo() {
		Retangulo clonado = new Retangulo();
		clonado.base = this.base;
		clonado.altura = this.altura;
		clonado.area = this.area;
		clonado.perimetro = this.perimetro;

		return clonado;

	}

	public void imprimir() {
		System.out.println("A base do retângulo é de: " + this.base);
		System.out.println("A altura do retângulo é de: " + this.altura);
		System.out.println("A área do retângulo é de:" +this.area);
		System.out.println("O perímetro do retângulo é de: " +this.perimetro);
		
	}

}
