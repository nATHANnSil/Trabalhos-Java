package teste;

public class Main {

	public static void main(String[] args) {
		String textoEntrada;
		String nomeArquivoEscrita;
		ArquivoTextoEscrita escrita;
		ArquivoTextoLeitura leitura;
		String nomeArquivoLeitura;
		String textoLeitura;

		System.out.println("Informe o nome do arquivo:");
		nomeArquivoEscrita = MyIO.readString();

		System.out.println("Informe um texto:");
		textoEntrada = MyIO.readLine();

		escrita = new ArquivoTextoEscrita(nomeArquivoEscrita);
		escrita.escrever(textoEntrada);
		escrita.fecharArquivo();

		System.out.println("Arquivo Criado!");

		System.out.println("Digite o nome do Arquivo para Leitura:");
		nomeArquivoLeitura = MyIO.readString();

		leitura = new ArquivoTextoLeitura(nomeArquivoLeitura);
		textoLeitura = leitura.ler();
		leitura.fecharArquivo();
		
		System.out.println(textoLeitura);
		System.out.println("Aplicação finalizada");	

		// System.out.println(textoEntrada);

	}

}
