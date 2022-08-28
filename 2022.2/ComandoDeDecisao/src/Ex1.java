/**
 * 
 */

/**
 * @author Nathan
 *
 */
public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salario, salario_1, salario_2, porcentagem_1, porcentagem_2;

		System.out.println("Digite o valor do salário");
		salario = MyIO.readInt();

		if (salario <= 1200) {
			porcentagem_1 = (float) (salario * 0.10);
			salario_1 = salario + porcentagem_1;
			MyIO.println("O valor atualizado do salario é de R$ " + salario_1);
		} else {
			porcentagem_2 = (float) (salario * 0.05);
			salario_2 = salario + porcentagem_2;
			MyIO.println("O valor atualizado do salario é de R$" + salario_2);

		}

	}
}
