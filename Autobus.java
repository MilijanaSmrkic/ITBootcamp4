package voznja;

import java.util.ArrayList;

public class Autobus {
	/*
	 * Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime
	 * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
	 * dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima
	 * samo ako je vozac prisutan. Autobus ispisati u sledecem obliku: Naziv ( vozac
	 * - Putnik1[novac], Putnik2 [novac],... )
	 * 
	 */

	private String naziv;
	private Vozac vozac;
	private int cenaKarte;
	private ArrayList<Putnik> putnici;

	public Autobus(String naziv, int cenaKarte) {

		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		putnici = new ArrayList<Putnik>();

	}

	@Override
	public String toString() {
		String ispis = "p";
		for (int i = 0; i < putnici.size(); i++) {
			Putnik p1 = putnici.get(i);
			int p2 = putnici.get(i).getNovac();
			ispis = " (" + p1 + "[" + "], " + p2;

		}
		return naziv + ispis;

	}

	public boolean naplatiKartu(Putnik p) {
		if (vozac.isPrisutnost() == true) {
			p.uzmiNovac(cenaKarte);
			return true;

		} else
			return false;
	}

	public void dodajPutnika(Putnik p) {
		putnici.add(p);
	}

	public void udaljiPutnika(int i) {
		putnici.remove(i);
	}

}
