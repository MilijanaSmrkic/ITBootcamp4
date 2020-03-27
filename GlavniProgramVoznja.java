package voznja;

public class GlavniProgramVoznja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Covek c1 = new Covek("Marko", "Markovic");
		Vozac v1= new Vozac("Jovan", "Jovanovic", "sofer", true);
		Putnik p1 = new Putnik (400);
		Putnik p2 = new Putnik(800);
		Putnik p3 = new Putnik(200);
		Autobus a1 = new Autobus ("Lasta", 300);
		a1.dodajPutnika(p1);
		p1.dodajNovac(300);
		System.out.println(p1.getNovac());
		a1.dodajPutnika(p2);
		a1.dodajPutnika(p3);
		a1.naplatiKartu(p1);
		

	}

}
