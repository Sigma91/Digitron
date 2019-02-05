package Zadatak1;

import java.util.Scanner;

public class Aritmetika {

	public static void main(String[] args) {
		

	Scanner unos = new Scanner(System.in);
    System.out.println("Unesite prvi broj:");
    Digitron digitron = new Digitron();
    digitron.a=unos.nextInt();
    System.out.println("Unesite drugi broj:");
    digitron.b=unos.nextInt();
    
    digitron.izracunajZbir();
    digitron.izracunajRazliku();
    digitron.izracunajProizvod();
    digitron.izracunajProsek();
    digitron.ispisRezultata();
    
 
  

	}

}
