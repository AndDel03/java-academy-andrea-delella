package esercizio1;

public class Esercizio_1 {
	public static void main(String[] args) {
		
		int[] arr = {547, 87, 1, 24, 4, 9, 54, 37, 26, 19};
		double somma = 0;
		
		for(int i=0;i<arr.length;i++) {
			somma += arr[i];
		}
		
		double media = somma/arr.length;
		
		
		//Non richiesta ma messa per agevolare la verifica
		System.out.println(media);
		
	}
}
