import java.util.ArrayList;
import java.util.List;

public class Fabrica {
	List<Angajat> angajati = new ArrayList<>();
    List<Client> clienti = new ArrayList<>();
    List<Act> acte = new ArrayList<>();
    
	public void adaugaAngajat(Angajat angajat) {
		angajati.add(angajat);
	}
	public void concediereAngajat(Angajat angajat) {
		angajati.remove(angajat);
	}
	public void afisareAngajatiActivi() {
		for (Angajat angajat : angajati) {
			angajat.getFunctie();
		}
	}

	public void adaugaClient(Client client) {
		clienti.add(client);
	}

	public void afisareClienti() {
		for (Client client : clienti) {
			System.out.println(client.getNume());
		}
	}
	
                
    

}
