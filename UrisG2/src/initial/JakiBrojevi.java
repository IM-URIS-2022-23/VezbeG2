package initial;

public class JakiBrojevi {

	public static void main(String[] args) {
		System.out.println("Jaki brojevi od 0 do 200 su: ");
		//Petlja koja prolazi kroz svaki broj od 1 do 200, za svaki od tih brojeva izvrsava
		// logiku koja je navedena unutar viticastih zagrada te petlje
		for(int i=0; i<=200; i++) {
			//promenljiva zbir faktorijela ce cuvati konacnu vrednost, ona se deklarise prilikom svake iteracije petlje sto znaci da je na pocetku uvek 0
			int zbirFaktorijela;
			//Sustina zadatka je shvatiti da od 0 do 200 imamo jednocifrene, dvocifrene i trocifrene brojeve
			// i shodno tome cemo izracunati zbir faktorijela njegovih cifara
			if(i<10) {
				// ukoliko je u pitanju jednocifren broj racunamo samo faktorijel tog broja
				zbirFaktorijela = faktorijel(i);
				// ukoliko se broj poklapa sa vrednoscu svog faktorijela, njega ispisujemo na konzoli kao jak broj
				if(i == zbirFaktorijela) {
					System.out.println(i);
				}
			}else {
				if(i<100) {
					// Dvocifreni broj razdvajamo na cifru koja predstavlja jedinicu i cifru koja predstavlja deseticu
					int jedinica = i%10;
					int desetica = (i-jedinica)/10;
					// Shodno tome racunamo faktorijel 2 cifre i onda ih sabiramo
					zbirFaktorijela = faktorijel(jedinica) + faktorijel(desetica);
					if(i == zbirFaktorijela) {
						System.out.println(i);
					}
				}else {
					// Ista prica kod trocifrenih brojeva stim da moramo izracunati i vrednost stotine
					int jedinica = i%10 ;
					int desetica = (i%100 - jedinica)/10 ;
					int stotina = (i - desetica*10 - jedinica)/100;
					zbirFaktorijela = faktorijel(jedinica) + faktorijel(desetica) + faktorijel(stotina);
					if(i == zbirFaktorijela) {
						System.out.println(i);
					}
				}
			}
		}
	}
	//Metoda koja racuna faktorijel broja koji se unosi kao parametar (int broj)
	public static int faktorijel(int broj) {
		//rezultat je promenljiva koja ce skladistiti vrednost faktorijela prilikom svake
		//iteracije for petlje
		int rezultat = 1;
		//U ovoj for petlji ne inicijalizujemo brojac vec koristimo parametar broj stoga u prvom delu potpisa for petlje stoji samo ;
		for(;broj>0; broj--) {
			rezultat = rezultat * broj;
		}
		//Iteracija gornje petlje za vrednost parametra 5 izgleda ovako:
		// 5>0 
		//rezultat = 1*5
		//5-- odnosno ostaje 4
		//4>0
		//rezultat=5*4
		//4--
		//3>0
		//rezultat = 20*3
		//itd
		return rezultat; //kada petlja prodje kroz sve vrednost vraca se faktorijel sacuvan u promenljivoj rezultat 
						// ovo je neophodno iz razloga sto je povratni tip metode int
	}

}
