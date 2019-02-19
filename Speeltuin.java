import java.util.ArrayList;
import java.util.List;

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
		
		TovenaarsWinkel HagridsShop = new TovenaarsWinkel();
		Bezem ronsNieuweBezem = HagridsShop.verkoopBezem();
		HagridsShop.vegen(ronsNieuweBezem);
		
			
	}
}


class TovenaarsWinkel {
	List<Bezem> assortiment;
	
	TovenaarsWinkel(){
		this.assortiment = new ArrayList<>();
		this.assortiment.add(new Bezem("Nimbus 2000",180,1400));
		this.assortiment.add(new Bezem("Nimbus 2000",180,1400));
		this.assortiment.add(new Bezem("Nimbus 2001",180,1600));
		this.assortiment.add(new Bezem("Nimbus 2001",180,1600));
		this.assortiment.add(new Bezem("Firebolt Supreme ",230,2800));
		this.assortiment.add(new Bezem("Firebolt Supreme ",230,2800));
		this.assortiment.add(new Bezem("Firebolt Supreme ",230,2800));
	}
	
	
	
	public Bezem verkoopBezem() {
		Bezem deze = this.assortiment.get(0);
		this.assortiment.remove(deze);
		return deze ;
	}
	
	
	static void vegen(Bezem bezem) {
		System.out.println("Je gaat toch niet meet je " + bezem.getType() + " vegen!");
		
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
	
	public String getType() {
		return this.type;
		
	}
}


	