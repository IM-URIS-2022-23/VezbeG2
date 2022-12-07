package zadaci;

public class Automobil {

	private String marka;
	private int brzina;
	private boolean ukljucen;
	
	public Automobil(boolean ukljucen) {
		this.ukljucen = ukljucen;
	}
	
	public Automobil(boolean ukljucen, int brzina) {
		this(ukljucen);
		if(brzina<= 6) {
			this.brzina = brzina;
		}
	}
	
	public int getBrzina() {
		return brzina;
	}
	
	public void promeniBrzinu(int brzina) {
		if(brzina - this.brzina > 1 || brzina - this.brzina<0) {
			System.out.println("Nedozvoljen prenos");
		}else 
			this.brzina = brzina;
	}
	
}
