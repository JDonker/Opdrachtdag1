
public class Speeltuin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bezem harrysBezem = new Bezem("Nimbus 2000",180,1400);
		Bezem ronsBezem = new Bezem("Nimbus 2001",210,2300);
		Bezem hermionesBezem = new Bezem("Firebolt Supreme ",230,2800);
		
		harrysBezem.vlieg(20);
		harrysBezem.vlieg(40);
		ronsBezem.vlieg(40);
		hermionesBezem.vlieg(40);
			
	}
}



class Bezem {
	String type;
	int snelheid; // mijlen per uur
	int prijs;
		
	public Bezem(String type,int snelheid, int prijs) {
		this.type=type;
		this.snelheid=snelheid;
		this.prijs = prijs;		
	}
	
	public void vlieg(int mijlen) {
		// snelheid per minuut
		double spm = (double)this.snelheid/60;
		double tijd = (double)mijlen/spm;
		
		String tijdString = String.format("%.2f", tijd);
		System.out.println("Je vliegt " + mijlen + " mijl in " + tijdString + " minuten op de " + this.type);
		
	}
	
	
}
	