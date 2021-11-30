package it.biglietti;

import java.math.BigDecimal;

// ROOM 3

public class Biglietto {
	
	// costanti
	private final static BigDecimal COSTO_AL_KM = new BigDecimal("0.21");
	private final static BigDecimal SCONTO_OVER_65 = new BigDecimal("0.40");
	private final static BigDecimal SCONTO_UNDER_18 = new BigDecimal("0.20");
	
	// attributi
	private int km;
	private int eta;
	
	// costruttori
	public Biglietto(int km, int eta) throws Exception{
		if(km <= 0 || eta <= 0) {
			throw new Exception("uno dei dati è minore o uguale a zero");
		}
		this.km = km;
		this.eta = eta;
	}	
	
	// metodo privato per calcolare sconto
	private BigDecimal calcolaSconto() {
		BigDecimal sconto;
		if(eta < 18) {
			sconto = SCONTO_UNDER_18;
		} else if(eta >= 65) {
			sconto = SCONTO_OVER_65;
		} else {
			sconto = new BigDecimal("0");
		}
		return sconto;
	}	
	
	// metodo pubblico per calcolare prezzo
	public BigDecimal calcolaPrezzo() {
		BigDecimal kilometri = new BigDecimal(km);
		BigDecimal prezzo = kilometri.multiply(COSTO_AL_KM);
		return prezzo.subtract(prezzo.multiply(calcolaSconto()));
	}
	
}
