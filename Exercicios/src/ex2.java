import java.util.Scanner;

public class ex2 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int i,nota_1,nota_2,nota_3,media;
		
		for (i=0; i<3; i++) {
			
			System.out.println("Digite o valor da primeira nota:");
			nota_1 = ler.nextInt();
				
			System.out.println("Digite o valor da segunda nota:");
			nota_2 = ler.nextInt();
			
			System.out.println("Digite o valor da terceira nota:");
			nota_3 = ler.nextInt();
						
			media=(nota_1+nota_2+nota_3)/3;
			
			if ((media>=0) && (media<4)) {
				System.out.println("Reprovado");
				}
			else if ((media>=4) && (media<6)) {
				System.out.println("Exame Especial");
				}
			else if ((media>=6) && (media<=10)) {
				System.out.println("Aprovado");
			}		
	  }
	}
	
}
