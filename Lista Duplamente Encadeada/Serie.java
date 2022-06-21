import java.util.Scanner;

public class Serie {

	private String nome;
	private String formato;
	private String duracao;
	private String paisorigem;
	private String idiomaorigem;
	private String emissoraoriginal;
	private String transmissaooriginal;
	private int numtemp;
	private int numep;

	public Serie() {

	}

	public Serie(String nome, String formato, String duracao, String paisorigem, String idiomaorigem,
			String emissoraoriginal, String transmissaooriginal, int numtemp, int numep) {
		this.nome = nome;
		this.formato = formato;
		this.duracao = duracao;
		this.paisorigem = paisorigem;
		this.idiomaorigem = idiomaorigem;
		this.emissoraoriginal = emissoraoriginal;
		this.transmissaooriginal = transmissaooriginal;
		this.numtemp = numtemp;
		this.numep = numep;
	}

	// gets e sets

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getFormato() {
		return this.formato;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getDuracao() {
		return this.duracao;
	}

	public void setPaisOrigem(String paisorigem) {
		this.paisorigem = paisorigem;
	}

	public String getPaisOrigem() {
		return this.paisorigem;
	}

	public void setIdiomaOrigem(String idiomaorigem) {
		this.idiomaorigem = idiomaorigem;
	}

	public String getIdiomaOrigem() {
		return this.idiomaorigem;
	}

	public void setEmissoraOriginal(String emissoraoriginal) {
		this.emissoraoriginal = emissoraoriginal;
	}

	public String getEmissoraOriginal() {
		return this.emissoraoriginal;
	}

	public void setTransmissaoOriginal(String transmissaooriginal) {
		this.transmissaooriginal = transmissaooriginal;
	}

	public String getTransmissaoOriginal() {
		return this.transmissaooriginal;
	}

	public void setNumTemp(int numtemp) {
		this.numtemp = numtemp;
	}

	public int getNumTemp() {
		return this.numtemp;
	}

	public void setNumEp(int numep) {
		this.numep = numep;
	}

	public int getNumEp() {
		return this.numep;
	}

	// 2 construtores

	public Serie(String nome) {
		this.nome = "Os Simpsons";

	}

	public Serie(String nome, int numtemp, int numep) {
		this.nome = "Narcos";
		this.numtemp = numtemp;
		this.numep = numep;
	}

	// clone

	public Serie cloneSerie() {
		Serie clonada = new Serie();
		clonada.nome = this.nome;
		clonada.formato = this.formato;
		clonada.duracao = this.duracao;
		clonada.paisorigem = this.paisorigem;
		clonada.idiomaorigem = this.idiomaorigem;
		clonada.emissoraoriginal = this.emissoraoriginal;
		clonada.transmissaooriginal = this.transmissaooriginal;
		clonada.numtemp = this.numtemp;
		clonada.numep = this.numep;

		return clonada;
	}

	// imprimir

	public Serie imprimir() {
		System.out.print("nome" + this.nome);
		System.out.print("formato" + this.formato);
		System.out.print("duração" + this.duracao);
		System.out.print("país de origem" + this.paisorigem);
		System.out.print("idioma de origem" + this.idiomaorigem);
		System.out.print("emissora de televisão original" + this.emissoraoriginal);
		System.out.print("data de início da transmissão original" + this.transmissaooriginal);
		System.out.print("número de temporadas" + this.numtemp);
		System.out.print("número de episódios" + this.numep);

		return imprimir();

	}
	
	public static void main(String[] args) {
		
	}

/*	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i;

		System.out.println("Digite a quantidade de séries:");
		int n = ler.nextInt();

		for (i = 0; i <= n; i++) {
			System.out.println("Digite o nome da série:");
			String ser = ler.nextLine();
		}

		System.out.println(
				"Black Mirror ## Série ## 44–89 minutos ## Reino Unido ## Inglês ## Channel 4 (2011–2014) ## 4 de dezembro de 2011(2011-12-04) – presente ## 3 ## 13");
		System.out.println(
				"Castle ## Série ## 43 minutos ## Estados Unidos ## Inglês ##  ABC ## 9 de março de 2009 – 16 de maio de 2016 ## 8 ## 173\r\n"
						+ "");
		System.out.println(
				"The Fresh Prince of Bel-Air ## Sitcom ## aprox. 23 mim. ## Estados Unidos ## Inglês ## NBC ## 10 de Setembro de 1990 – 20 de Maio de 1996 ## 6 ## 148\r\n"
						+ "");
		System.out.println(
				"How I Met Your Mother ## Sitcom ## 23 min. aprox. ## Estados Unidos ## Inglês ##  CBS ## 19 de setembro de 2005–31 de março de 2014 ## 9 ## 208\r\n"
						+ "");
		System.out.println(
				"Criminal Minds ## Série ## 45 minutos ## Estados Unidos ## Inglês ## CBS ## 22 de Setembro de 2005 – Presente ## 12 ## 277\r\n"
						+ "");
		System.out.println(
				"Downton Abbey ## Série ## 45-67 min ## Reino Unido ## Inglês ##  ITV ## 26 de setembro de 2010 - 25 de dezembro de 2015 ## 6 ## 52\r\n"
						+ "");
		System.out.println(
				"Once Upon a Time ## Série ## 43 minutos ## Estados Unidos ## Inglês ## ABC ## 23 de outubro de 2011 – atualmente ## 6 ## 133\r\n"
						+ "");
		System.out.println(
				"Narcos ## Série ## 43 a 57 minutos ## Estados Unidos ## Inglês ##  Netflix ## 28 de agosto de 2015 - presente ## 2 ## 20\r\n"
						+ "");
		System.out.println(
				"Arrow ## Série ## 40–43 minutos ## Estados Unidos ## Inglês ## The CW ## 10 de outubro de 2012(2012-10-10) – presente ## 5 ## 115\r\n"
						+ "");
		System.out.println(
				"The Originals ## Série ## 45 minutos (aproximadamente) ## Estados Unidos ## Inglês ##  The CW ## 3 de outubro de 2013 - presente ## 4 ## 79\r\n"
						+ "");
		System.out.println(
				"Orange Is the New Black ## Série ## 51–92 minutos ## Estados Unidos ## Inglês ## Netflix ## 11 de julho de 2013(2013-07-11) – presente ## 5 ## 65\r\n"
						+ "");
		System.out.println(
				"The Big Bang Theory ## Série ## 23 min. aprox. ## Estados Unidos ## inglês ##  CBS ## 24 de setembro de 2007 - presente ## 10 ## 231\r\n"
						+ "");
		System.out.println(
				"Outlander ## Série ## 50 min. ## Reino Unido ## inglês ## Starz ## 9 de agosto de 2014 - presente ## 2 ## 29\r\n"
						+ "");
		System.out.println(
				"Doctor Who ## Série ## Episódios regulares ## Reino Unido ## Inglês ## BBC One ## 23 de novembro de 1963 – atualmente ## 26 ## 819\r\n"
						+ "");
		System.out.println(
				"Os Simpsons ## Série de desenho animado ## 21–24 minutos ## Estados Unidos ## Inglês ## Fox ## 17 de dezembro de 1989 – presente ## 28 ## 618");
	}
*/
}
