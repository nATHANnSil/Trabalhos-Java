import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.*;

class Inteiro {

	private int valor;

	Inteiro(int valor) {
		this.valor = valor;
	}

	Inteiro() {
		this.valor = 0;
	}

	public int getValor() {
		return this.valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void imprimir() {
		System.out.println(valor);
	}
}

class TabelaHash {

	private int M;
	private Inteiro tabelaHash[];

	public TabelaHash(int tamanho) {

		this.M = tamanho;

		tabelaHash = new Inteiro[this.M];
		for (int i = 0; i < this.M; i++)
			tabelaHash[i] = null;
	}

	private int funcaoHash(int chave, int i) {

		return (((chave % this.M) + i) % this.M);
	}

	public void inserir(Inteiro novo) throws Exception {

		int posicao, tentativa;
		boolean inseriu = false;

		tentativa = 0;

		while ((!inseriu) && (tentativa < this.M)) {
			posicao = funcaoHash(novo.getValor(), tentativa);

			if (tabelaHash[posicao] == null) {
				tabelaHash[posicao] = novo;
				inseriu = true;
			} else if (tabelaHash[posicao].getValor() == novo.getValor())
				throw new Exception(
						"Erro ao tentar inserir o novo elemento na tabela hash: o elemento já foi inserido anteriormente!");
			else
				// colisão
				tentativa++;
		}
	}

	public Inteiro pesquisar(int chave) {

		int posicao, tentativa;

		tentativa = 0;

		while (tentativa < this.M) {
			posicao = funcaoHash(chave, tentativa);

			if ((tabelaHash[posicao] == null) || (tabelaHash[posicao].getValor() == chave))
				return tabelaHash[posicao];
			else
				// colisão
				tentativa++;
		}

		return null;
	}

	public void imprimir() {

		System.out.println("Conteúdo da tabela hash:");
		for (int i = 0; i < this.M; i++) {
			System.out.print("Posição: " + i + " --> ");
			if (tabelaHash[i] != null)
				tabelaHash[i].imprimir();
			else
				System.out.println("posição vazia");
		}
	}
}

class ArquivoTextoEscrita {
	private BufferedWriter saida;

	ArquivoTextoEscrita(String nomeArquivo) {

		try {
			saida = new BufferedWriter(new FileWriter(nomeArquivo));
		} catch (FileNotFoundException excecao) {
			System.out.println("Arquivo nao encontrado");
		} catch (IOException excecao) {
			System.out.println("Erro na abertura do arquivo de escrita: " + excecao);
		}
	}

	public void fecharArquivo() {

		try {
			saida.close();
		} catch (IOException excecao) {
			System.out.println("Erro no fechamento do arquivo de escrita: " + excecao);
		}
	}

	public void escrever(String textoEntrada) {

		try {
			saida.write(textoEntrada);
			saida.newLine();
		} catch (IOException excecao) {
			System.out.println("Erro de entrada/saída " + excecao);
		}
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		TabelaHash T;
		Inteiro novo, pesquisado;
		ArquivoTextoEscrita escrita;
		String nomeArquivoLeitura;
		String textoLeitura;

/*		String fileName = "/temp/data.txt";
		Scanner scan = new Scanner(new File(fileName));
		while (scan.hasNextLine()) {
			String line = scan.nextLine();*/
		}
	}
