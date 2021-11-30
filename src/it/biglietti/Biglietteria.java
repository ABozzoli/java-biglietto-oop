package it.biglietti;

import java.util.Scanner;

public class Biglietteria {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int km;
		int eta;
		
		System.out.print("Inserisci quanti km devi percorrere: ");
		km = scanner.nextInt();
		System.out.print("Inserisci la tua età: ");
		eta = scanner.nextInt();
		
		try {
			Biglietto b = new Biglietto(km, eta);
			System.out.print("Il tuo biglietto costa: " + b.calcolaPrezzo() +"€");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
			
		scanner.close();

	}

}
