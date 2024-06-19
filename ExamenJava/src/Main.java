import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> Responsabilitati = new ArrayList<>();
		Fabrica fabrica = new Fabrica();
		
		Angajat a1= new Angajat ("Ion" ,"Mihai", 1000, 5, "Manager");
		Angajat a2= new Angajat ("Vasile" ,"Mihai", 1000, 5, "Manager");
		Muncitor m1= new Muncitor ("Maria" ,"Mihai", 1000, 5, "Muncitor", Responsabilitati);
		
		fabrica.adaugaAngajat(a1);
		fabrica.adaugaAngajat(a2);
		fabrica.concediereAngajat(m1);
		
	
		
		

	}

}
