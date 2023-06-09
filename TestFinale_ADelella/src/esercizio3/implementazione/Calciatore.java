package esercizio3.implementazione;

import esercizio3.interfaccia.GiocatoreProfessionista;

public class Calciatore implements GiocatoreProfessionista {

	//Attributi
	private String nome;
	private String cognome;
	private String annoDiNascita;
	private String luogoDiNascita;
	private String squadra;
	private String ruolo;
	private String costoCartellino;
	private String anniDiContratto;
	private double stipendioAnnuo;
	
	
	//Costruttore parametrizzato
	public Calciatore(String nome, String cognome, String annoDiNascita, String luogoDiNascita,
			String squadra, String ruolo, String costoCartellino, String anniDiContratto,
			double stipendioAnnuo) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoDiNascita = annoDiNascita;
		this.luogoDiNascita = luogoDiNascita;
		this.squadra = squadra;
		this.ruolo = ruolo;
		this.costoCartellino = costoCartellino;
		this.anniDiContratto = anniDiContratto;
		this.stipendioAnnuo = stipendioAnnuo;
	}
	
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getAnnoDiNascita() {
		return annoDiNascita;
	}


	public void setAnnoDiNascita(String annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}


	public String getLuogoDiNascita() {
		return luogoDiNascita;
	}


	public void setLuogoDiNascita(String luogoDiNascita) {
		this.luogoDiNascita = luogoDiNascita;
	}


	public String getSquadra() {
		return squadra;
	}


	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}


	public String getRuolo() {
		return ruolo;
	}


	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}


	public String getCostoCartellino() {
		return costoCartellino;
	}


	public void setCostoCartellino(String costoCartellino) {
		this.costoCartellino = costoCartellino;
	}


	public String getAnniDiContratto() {
		return anniDiContratto;
	}


	public void setAnniDiContratto(String anniDiContratto) {
		this.anniDiContratto = anniDiContratto;
	}


	public double getStipendioAnnuo() {
		return stipendioAnnuo;
	}


	public void setStipendioAnnuo(double stipendioAnnuo) {
		this.stipendioAnnuo = stipendioAnnuo;
	}


	
	
	//Implementazione e override dei metodi come richiesto dalla traccia
	
	@Override
	public void stampaDati() {
		System.out.println(this.toString());
	}

	@Override
	public double calcolaStipendioMensile() {
		return stipendioAnnuo/12;
	}

	@Override
	public String toString() {
		return "Calciatore [nome=" + nome + ", cognome=" + cognome + ", annoDiNascita=" + annoDiNascita
				+ ", luogoDiNascita=" + luogoDiNascita + ", squadra=" + squadra + ", ruolo=" + ruolo
				+ ", costoCartellino=" + costoCartellino + ", anniDiContratto=" + anniDiContratto + ", stipendioAnnuo="
				+ stipendioAnnuo + "]";
	}
	
	

}
