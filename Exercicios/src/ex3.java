import java.util.Scanner;

public class ex3 {
	public static void main (String [] args) {
	Scanner ler = new Scanner(System.in);
	
	int vel1,vel2,vel3,vel4,vel5,veli,i,p,valor;
	
	for (i=0; i<5; i++) {
		for (p=0; p<5; p++) {
		
		System.out.println("Digite a velocidade do primeiro carro");
		vel1 = ler.nextInt();
			
		System.out.println("Digite a velocidade do segundo carro");
		vel2 = ler.nextInt();
		
		System.out.println("Digite a velocidade do terceiro carro");
		vel3 = ler.nextInt();
		
		System.out.println("Digite a velocidade do quarto carro");
		vel4 = ler.nextInt();
		
		System.out.println("Digite a velocidade do quinto carro");
		vel5 = ler.nextInt();
		
		if (vel1>60) {
			i++;
			p++;
		}else if (vel2>60) {
			i++;
			p++;
		}else if (vel3>60) {
			i++;
			p++;
		}else if (vel4>60) {
			i++;
			p++;
		}else if (vel5>60) {
			i++;
			p++;
		}
		
		System.out.println("A qtde é de:"+i);
		System.out.println("A qtde é de:"+p);
		
	 }
	}
	
	}
}
