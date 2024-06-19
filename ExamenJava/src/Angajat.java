
public class Angajat {
	private String nume;
	private String prenume;
	private int salariu;
	private int vechime;
	private String functie;
	
	public Angajat(String nume,String prenume, int salariu, int vechime,String functie) {
		this.nume = nume;
		this.prenume=prenume;
        this.salariu = salariu;
		this.vechime = vechime;
		this.functie=functie;
	}
	
	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public int getSalariu() {
		return salariu;
	}

	public int getVechime() {
		return vechime;
	}
	

	public String getFunctie() {
		return functie;
	}

	public int afisareSalariu() {
	      if(vechime < 1) {
             return salariu;
			} else {
				return salariu + (vechime * 10);
			}
	}

	public String numeFunctie() {
		return nume + prenume + "(" + functie + ")";
	}

}
