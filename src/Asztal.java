package butor;

/*A gyár asztalokat készít fából. Az asztaloknak van súlya és hossza. 
 * Az adatok a gyártást követően
nem változnak (azaz a súlya pl. nem változtatható meg az asztalnak)*/


/*2. Az asztalok közt vannak kinyithatóak, ill. hagyományos asztalok. 
 * A kinyitás során a teljes hossz
megnövekszik, de tárolni kell továbbra is a normál hosszát is.*/



public class Asztal extends Butor {
	private int suly;
	private int hossz;
	private int nyitott;
	private String tipus;
	private String fa_tipus;
	
	
	
	public Asztal(int suly, int hossz, String tipus, String fa_tipus) {
		
		if (fa_tipus.equals("Bükk") || fa_tipus.equals("Tölgy") || fa_tipus.equals("Fenyő") ){
			this.suly = suly;
			this.hossz = hossz;
			this.tipus = tipus;
			this.fa_tipus = fa_tipus;
		}
		else {
			throw new IllegalArgumentException("Hibás adat");
		}
		
		
		
	}
	
	public int getSuly() {
		return this.suly;
	}
	
	public int getHossz() {
		return this.hossz;
	}
	
	public int gettipus() {
		return this.nyitott;
	}
	public String fatipus() {
		return this.fa_tipus;
	}
	
	public void kinyitom() {
		if (tipus.equals("Hunor")) {
			this.nyitott = hossz * 2;
			
		}
		else {
			this.nyitott = hossz;
		}
	}
	
	
	public String Kiir() {
		if (tipus.equals("Hunor")) {
			return "suly, hossz: " + this.hossz + " " + this.suly + " " + this.fa_tipus +  "\nNyitott asztal hossza " + this.nyitott;
		}
		else {
			return "suly, hossz: " + this.hossz + " " + this.suly + " " + this.fa_tipus +  "\nEz egy hagyományos asztal";

		}
		 
	}
	
	
	
	

}
