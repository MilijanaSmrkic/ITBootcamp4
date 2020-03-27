package voznja;

public class Putnik extends Covek {
	/*
	 * * Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu
	 * novca koja mu se zadaje prilikom kreiranja. Odredjena svota novca moze da mu
	 * se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
	 */

	private int novac;

	public Putnik(int novac) {
		super(ime, prezime);
		this.novac = novac;
	}
	

	public int getNovac() {
		return novac;
	}


	public boolean dodajNovac(int iznos) {
		if (iznos > 0) {
			this.novac += iznos;
			return true;
		} else
			return false;

	}

	public boolean uzmiNovac(int iznos) {
		if (iznos > 0 && iznos<=this.novac) {
			this.novac -= iznos;
			return true;
		} else
			return false;
	}

}
