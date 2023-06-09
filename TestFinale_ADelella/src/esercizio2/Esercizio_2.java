package esercizio2;

import java.util.Scanner;
import java.util.ArrayList;

public class Esercizio_2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> voti = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int voto;
	
	//ciclo richiesta voti fino a inserimento di -1
	do {	
		System.out.println("Inserire un voto o inserire -1 per uscire\n");
		voto = sc.nextInt();
	
		
	//verifica che il voto rispetta i requisiti richiesti	
		if(voto>=18 && voto<=30 && voto!=-1) {
			voti.add(voto);
			System.out.println("Voto inserito con successo!\n");
		}
		
		else if(voto!=-1) {
			System.out.println("Voto inserito non valido\n");
		}
		
	}while(voto!=-1);
	
	sc.close();
	
	
	//verifica che sono stati inseriti voti
	if (voti.size()>0){
		double somma = 0;
		for(int i : voti) {
			somma += i;
		}
		double media = somma/voti.size();
		System.out.println("La media dei voti è: "+media);
	}
	else {
		System.out.println("Non è stato inserito nessun voto");
	}
	}
}
