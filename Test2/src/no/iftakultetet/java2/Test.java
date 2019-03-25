package no.iftakultetet.java2;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Hallo verden!");
		
		
		// Java 8 - Gammeldags kode
		ArrayList<String> navn = new ArrayList<>();
		navn.add("Ola");
		navn.add("Kari");
		navn.add("Petter");
		navn.add("Hans");
		
		for (String person : navn) {
			System.out.println("Navn: "+person);
		}
		
		System.out.println("--------------------------------------");
		
		// Java 11 - mer konsis kode
		List<String> navn2 = List.of("Ola", "Kari", "Petter", "Hans"); // lager en liste
		navn2.forEach(System.out::println); //skriver ut listen til skjerm
		
	}

}
