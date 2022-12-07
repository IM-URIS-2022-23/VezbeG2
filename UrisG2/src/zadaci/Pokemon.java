package zadaci;

public class Pokemon {

	public static int brojPokemona;
	private String imePokemona;
	private String tipPokemona;
	private int redniBroj;
	public static final char generacija = 'X';
	
	public Pokemon(String imePokemona, String tipPokemona) {
		this.imePokemona = imePokemona;
		if(tipPokemona.equalsIgnoreCase("elektricni") ||
				tipPokemona.equalsIgnoreCase("vodeni") ||
				tipPokemona.equalsIgnoreCase("vatreni") ||
				tipPokemona.equalsIgnoreCase("zemljani")) {
			this.tipPokemona = tipPokemona;
		}
		Pokemon.brojPokemona++;
		this.redniBroj = Pokemon.brojPokemona;
	}
	
	@Override
	public String toString() {
		return imePokemona + " je pokemon " + Pokemon.generacija + 
				" generacije, on je " + tipPokemona + 
				" tip i u ovom programu kreiran je kao " + redniBroj
				+ " od trenutno postojecih " + Pokemon.brojPokemona + 
				" Pokemona.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pokemon) {
			Pokemon temp = (Pokemon)obj;
			if(this.imePokemona.equalsIgnoreCase(temp.getImePokemona())
					&& this.tipPokemona.equalsIgnoreCase(temp.getTipPokemona())) {
				if(this.redniBroj == temp.getRedniBroj()) {
					System.out.println("Poredjenje sa samim sobom");
				}
				return true;
			}
			else if(this.tipPokemona.equalsIgnoreCase(temp.getTipPokemona())) {
				System.out.println("Srodni Pokemoni");
			}
		}
		return false;
	}
	
	
	public String getImePokemona() {
		return imePokemona;
	}
	public String getTipPokemona() {
		return tipPokemona;
	}
	public int getRedniBroj() {
		return redniBroj;
	}
	public int getBrojPokemona() {
		return Pokemon.brojPokemona;
	}
	
	
}
