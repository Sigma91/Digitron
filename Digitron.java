package Zadatak1;

public class Digitron {
	int a,b,zbir,razlika,proizvod;
	double prosek;
	int apsolutnaVrednost = Math.abs(razlika);
	
	public void izracunajZbir() {
		zbir = a + b;
	}
	public void izracunajRazliku() {
		razlika = a - b;
	}
	public void izracunajProizvod() {
		proizvod = a * b;
	}
	public void izracunajProsek() {
		prosek = a % b;
	}
	
	public void ispisRezultata() {
		System.out.println("Zbir je: "+ zbir);
		System.out.println("Razlika je: "+ razlika);
		System.out.println("Proizvod je: "+ proizvod);
		System.out.println("Prosek je : "+ prosek);
		System.out.println("Apsolutna vrednost je: "+ apsolutnaVrednost);
	}
	
	
}   
