package esercizio4.fumetteria;

public class Libro {
	
	//Attributi
	private String titolo;
	private String autore;
	private String annoDiPubblicazione;
	private String costo;
	private String editore;
	
	
	//Costruttore parametrizzato
	public Libro(String titolo, String autore, String annoDiPubblicazione,
					String costo, String editore) {
		this.titolo = titolo;
		this.autore = autore;
		this.annoDiPubblicazione = annoDiPubblicazione;
		this.costo = costo;
		this.editore = editore;
		
	}

	
	
	//Getters and Setters
	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public String getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}


	public void setAnnoDiPubblicazione(String annoDiPubblicazione) {
		this.annoDiPubblicazione = annoDiPubblicazione;
	}


	public String getCosto() {
		return costo;
	}


	public void setCosto(String costo) {
		this.costo = costo;
	}


	public String getEditore() {
		return editore;
	}


	public void setEditore(String editore) {
		this.editore = editore;
	}



	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", annoDiPubblicazione=" + annoDiPubblicazione
				+ ", costo=" + costo + ", editore=" + editore + "]";
	}
	
	
	
	
	
	
	
}
