
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Retangulo ret = new Retangulo();
		
		ret.imprimir();

		ret.setAltura(3);
		ret.setBase(5);

		ret.imprimir();
		
		double area=ret.getArea();
		System.out.println(area);


	}

}
