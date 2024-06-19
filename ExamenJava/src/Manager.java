import java.util.List;

public class Manager extends Angajat {
    private List<Muncitor> muncitori;

    public Manager(String nume, String prenume, int salariu, int vechime, String functie, List<Muncitor> muncitori) {
		super(nume, prenume, salariu, vechime, functie);
		this.muncitori = muncitori;
	}
	public void adaugaMuncitor(Muncitor muncitor){
        if (getFunctie().equals("Manager")) {
                this.muncitori.add(muncitor);
            System.out.println("Muncitor adaugat cu succes!");
        } else {
            System.out.println("Nu puteti adauga muncitori!");
        }
    }
}

