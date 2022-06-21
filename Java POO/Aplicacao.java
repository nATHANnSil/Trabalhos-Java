
public class Aplicacao {

	public static void main(String[] args) {

		Retangulo ret1 = new Retangulo();
		Retangulo ret2 = new Retangulo(2, 8);
		
		
		System.out.println("Retângulo 1");
		ret1.imprimir();
		
		System.out.println("\n");
		
		System.out.println("Retângulo 2");
		ret2.imprimir();
	}

}
