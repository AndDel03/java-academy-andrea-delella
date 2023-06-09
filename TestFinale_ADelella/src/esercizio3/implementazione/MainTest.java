package esercizio3.implementazione;

public class MainTest {
	public static void main(String[] args) {
		
		Calciatore c1 = new Calciatore("Leo", "Messi", "19.19.1995",
										"Argentina", "Barcellona",
										"Attaccante", "1Milione", "6 anni", 36);
		
		c1.stampaDati();
		
		//Non richiesta dalla traccia - inserita per agevolare la verifica
		System.out.println(c1.calcolaStipendioMensile());
		
	}
}
