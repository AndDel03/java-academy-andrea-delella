package esercizio4.fumetteria;

public class Fumetto extends Libro{
	
	
	//Attributi
	private String nome;  
	private String disegnatore;
	
	
	
	//Costruttore parametrizzato
	public Fumetto(String titolo, String autore, String annoDiPubblicazione,
						String costo, String editore, String nome, String disegnatore) {
		super(titolo, autore, annoDiPubblicazione, costo, editore);
		this.nome = nome;
		this.disegnatore = disegnatore;
		// TODO Auto-generated constructor stub
	}

	//Attributi
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisegnatore() {
		return disegnatore;
	}

	public void setDisegnatore(String disegnatore) {
		this.disegnatore = disegnatore;
	}

	@Override
	public String toString() {
		return super.toString() + "Fumetto [nome=" + nome + ", disegnatore=" + disegnatore + "]";
	}
	
	
	

	
	
}
