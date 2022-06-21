
public class ListaDuplamenteEncadeada {
	
	//Constructor

	public ListaDuplamenteEncadeada() {

	}
	
	//Funcões e Paramentros

	void inserirInicio(Serie serie) {

	}

	void inserir(Serie serie, int posicao) {

	}

	void inserirFim(Serie serie) {

	}

	Serie removerInicio() {
		return null;

	}

	Serie remover(int posicao) {
		return null;

	}

	Serie removerFim() {
		return null;

	}

	void mostrar() {

	}
	
	//main


	public static void main(String[] args) {
		
		ArquivoTextoLeitura leitura;
		String nomeArquivoLeitura;
		System.out.println("Digite o nome do Arquivo para Leitura:");
		nomeArquivoLeitura = MyIO.readString();

		leitura = new ArquivoTextoLeitura(nomeArquivoLeitura);
		leitura.ler();
		leitura.fecharArquivo();

		String opcao=null;
		
		System.out.println("Digite a opção:");
		opcao = MyIO.readLine();

		switch (opcao) {
		case "II":
			
			break;

		case "I*":
			
			break;

		case "IF":
			
			break;

		case "RI":
			
			break;

		case "R*":

			break;

		case "RF":
			

			break;

		}

	}
}
