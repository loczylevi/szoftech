package butor;

public class Szek extends Butor {
	private String nev;
	private int labak;
	
	public Szek(String n, int labak) {
		if (n.equals("Ivó") || n.equals("Luca")) {
			this.nev = n;
			this.labak = labak;
		}
		else {
			throw new IllegalArgumentException();
		}
		
		if(( 3 <=  this.labak || this.labak <= 4 ) && this.nev.equals("Ivó")) {
			System.out.println();
		}
		else {
			throw new IllegalArgumentException();
		}
		
		
	}
	
	public String getNev() {
		return this.nev;
	}
	
	public int getLabak() {
		return this.labak;
	}
	
	
	public String Kiir() {
		return "Szék neve és lábak száma " + this.nev + " " + this.labak;
		
	}

}
