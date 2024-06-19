
public class Oferta extends Act {
     private double valoareTotala;
     Client client;
     
	public Oferta(int iD, double valoareTotala, Client client) {
		super(iD);
		this.valoareTotala = valoareTotala;
		this.client = client;
	}

	
}
