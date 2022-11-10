package initial;

public class Vezbe4 {

	public static void main(String[] args) {
		bmi(180,80);
		palindrom("Marko");

	}
	
	public static int sabiranje(int broj1, int broj2) {
		int sabiranje = broj1+broj2;
		return sabiranje;
	}
	
	public static void bmi(double visina, double tezina) {
		double rezultat = (tezina/visina/visina)*10000;
		if(rezultat<18.5) {
			System.out.println(rezultat + " je pothranjenost");
		}
		else if(rezultat>=18.5 && rezultat<25) {
			System.out.println(rezultat + " je normalan");
		}
		else if(rezultat>=25 && rezultat<30) {
			System.out.println(rezultat + " je povecana tezina");
		}
		else {
			System.out.println(rezultat + " je gojaznost");
		}
	}
	
	public static void palindrom(String rec) {
		String palindrom = "";
		for(int i = rec.length()-1; i>=0; i--) {
			palindrom = palindrom + rec.charAt(i);
		}
		if(palindrom.equalsIgnoreCase(rec)) {
			System.out.println(rec);
		}else {
			System.out.println("Uneta rec nije palindrom");
		}
		
		
	}
	
	

}
