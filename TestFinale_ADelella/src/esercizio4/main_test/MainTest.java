package esercizio4.main_test;

import esercizio4.fumetteria.*;

public class MainTest {
	public static void main(String[] args) {
		
		//Array di fumetti
		Fumetto[] fumetti = new Fumetto[3];
		
		//Riempimento array di fumetti
		fumetti[0] = new Fumetto("Batman", "Autore1", "data1", "10€", 
				"editore1", "nome1", "disegnatore1");
		
		fumetti[1] = new Fumetto("Batman2", "Autore2", "data2", "20€", 
				"editore2", "nome2", "disegnatore2");
		
		fumetti[2] = new Fumetto("Batman3", "Autore3", "data3", "30€", 
				"editore3", "nome3", "disegnatore3");
		
		//Oggetto fumetteria
		Fumetteria fum = new Fumetteria("Mondadori", "Via Manzoni", "Andrea", 3, fumetti);
		
		
		fum.stampaDati();
	}
}
