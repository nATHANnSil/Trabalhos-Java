/**
 * 
 */

/**
 * @author Nathan
 *
 */
public class Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota1, nota2, nota3;
		float media = 0;

		nota1 = MyIO.readInt("Digite a nota do aluno:");
		nota2 = MyIO.readInt("Digite a nota do aluno:");
		nota3 = MyIO.readInt("Digite a nota do aluno:");

		media = nota1 + nota2 + nota3 / 3;

		if (media < 4) {
			System.out.println("Reprovado");
		} else if ((media >= 4) && (media < 6)) {
			System.out.println("Exame Especial");
		} else if ((media >= 6) && (media <= 10)) {
			System.out.println("Aprovado!");
		}

	}

}
