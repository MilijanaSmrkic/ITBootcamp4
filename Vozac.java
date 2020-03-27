package voznja;

public class Vozac extends Covek {
	/*
	 * Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	 */

	private String zvanje;
	private boolean prisutnost;

	public Vozac(String ime, String prezime, String zvanje, boolean prisutnost) {
		super(ime, prezime);
        
		this.zvanje = zvanje;
		this.prisutnost = true;

	}

	public String getZvanje() {
		return zvanje;
	}

	public boolean isPrisutnost() {
		return prisutnost;
	}
	

}
