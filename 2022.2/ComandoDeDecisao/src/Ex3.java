/**
 * 
 */

/**
 * @author Nathan
 *
 */
public class Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vel, i = 0, m = 0, multa;

		for (i = 0; i <= 4; i++) {

			vel = MyIO.readInt("Digite a velocidade do veículo: ");

			if (vel > 60) {
				m++;
			}

		}

		MyIO.println("A quantidade de carros multados foi de:" + m);

		multa = m * 150;

		MyIO.println("O valor das multas será de R$" + multa);

	}

}