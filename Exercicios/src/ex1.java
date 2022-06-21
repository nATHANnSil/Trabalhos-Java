import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double salario, salario_1, salario_2, porcentagem_1, porcentagem_2;
		
		System.out.println("Digite o valor do salário");
		salario = ler.nextInt();
		
		if (salario>=1200) {
			porcentagem_1=salario*0.05;
			salario_1=salario+porcentagem_1;
			System.out.println("O valor atualizado do salario é de R$ " +salario_1);
		}
		 
		 
		else {
			porcentagem_2=salario*0.10;
			salario_2=salario+porcentagem_2;
			System.out.println("O valor atualizado do salario é de R$" +salario_2);
			
		}
		
}		

}
