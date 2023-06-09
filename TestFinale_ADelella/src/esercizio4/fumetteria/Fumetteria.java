package esercizio4.fumetteria;

import java.util.Arrays;

public class Fumetteria {
	
	//Attributi
	private String nome;
	private String via;
	private String titolare;
	private int numeroDiFumettiMassimi;
	private Fumetto[] fumetti;
	
	//Costruttore parametrizzato
	public Fumetteria(String nome, String via, String titolare, int numeroDiFumettiMassimi, Fumetto[] fumetti){
		this.nome = nome;
		this.via = via;
		this.titolare = titolare;
		this.numeroDiFumettiMassimi = numeroDiFumettiMassimi;
		this.fumetti = fumetti;
	}
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}

	public int getNumeroDiFumettiMassimi() {
		return numeroDiFumettiMassimi;
	}

	public void setNumeroDiFumettiMassimi(int numeroDiFumettiMassimi) {
		this.numeroDiFumettiMassimi = numeroDiFumettiMassimi;
	}

	public Fumetto[] getFumetti() {
		return fumetti;
	}

	public void setFumetti(Fumetto[] fumetti) {
		this.fumetti = fumetti;
	}
	
	public void stampaDati() {
		System.out.println(this.toString());
	}


	@Override
	public String toString() {
		return "Fumetteria [nome=" + nome + ", via=" + via + ", titolare=" + titolare + ", numeroDiFumettiMassimi="
				+ numeroDiFumettiMassimi + ", fumetti=" + Arrays.toString(fumetti) + "]";
	}
	
	
	
}
