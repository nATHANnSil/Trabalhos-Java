
/** PROGRAMA PARA CALCULAR O IMC **/

import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		String nome;
		float idade;
		float altura;
		float peso;
		float IMC;

		Scanner entrada = new Scanner(System.in);

		System.out.println("\n Digite seu nome:");
		nome = entrada.nextLine();

		System.out.println("\n Digite sua idade:");
		idade = entrada.nextInt();

		System.out.println("\n Digite sua altura, em centímetros:");
		altura = entrada.nextInt();

		System.out.println("\n Digite quantos quilos você possui:");
		peso = entrada.nextInt();

		IMC = peso / (altura * altura);

		System.out.println(
				"\n " + nome + " tem " + idade + " anos de idade, mede " + altura + " e o IMC é de " + IMC + " kg/m^2");

		entrada.close();

		if (IMC < 18.5) {
			System.out.println("\n Com esse IMC, você está na magreza.");
		} else if (IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("\n Com esse IMC, você está no peso normal");
		} else if (IMC >= 25 && IMC <= 29.9) {
			System.out.println("\n Com esse IMC, você está com sobrepeso");
		} else if (IMC >= 30 && IMC <= 34.9) {
			System.out.println("\n Com esse IMC, você está na Obesidade Grau I");
		} else if (IMC >= 35 && IMC <= 39.9) {
			System.out.println("\n Com esse IMC, você está na Obesidade Grau II");
		} else if (IMC >= 40) {
			System.out.println("\n Com esse IMC, voce está na Obesidade Grau III");
		}

		System.out.println("\n Fonte: TUA SAÚDE - Calculadora de IMC (e peso ideal)");

	}
}