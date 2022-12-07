package zadaci;

public class TestAutomobil {

	public static void main(String[] args) {
		Automobil auto1 = new Automobil(false);
		
		Automobil auto2 =  new Automobil(true, 3);
		auto2.promeniBrzinu(5);
		System.out.println(auto2.getBrzina());
	}
}
