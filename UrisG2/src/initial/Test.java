package initial;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//ZADATAK 1 - VEZBE 2
		
		/*int prviBroj = 24;
		int drugiBroj = 12;
		
		char operacija = '+';
		
		switch(operacija) {
		case '+':
			System.out.println(prviBroj + drugiBroj);
			break;
		case '-':
			System.out.println(prviBroj - drugiBroj);
			break;
		case '*':
			System.out.println(prviBroj * drugiBroj);
			break;
		case '/':
			System.out.println(prviBroj / drugiBroj);
			break;
		}*/
		
		//ZADATAK 2 - VEZBE 2 - Racunanje povrsine i obima kruga
		
		/*System.out.println("Unesite vrednost poluprecnika u konzolu");
		Scanner it = new Scanner(System.in);
		int poluprecnik = it.nextInt();
		
		if(poluprecnik > 0) {
			if(poluprecnik > 60) {
				System.out.println("Poluprecnik ne moze biti veci od 60");
			}else {
				System.out.println("Povrsina je: " + poluprecnik*poluprecnik* Math.PI);
				System.out.println("Obim je: " + 2*poluprecnik* Math.PI);
			}
		}else {
			System.out.println("Poluprecnik mora biti veci od 0");
		}*/
		
		// ZADATAK 3 - VEZBE 2
		/*System.out.println("Unesite broj u konzolu");
		Scanner it = new Scanner(System.in);
		int broj = it.nextInt();
		if(broj>200) {
			System.out.println("Broj ne moze biti veci od 200");
		}else {
			int rezultat = 0;
			for(int i = 0; i<=broj;i=i+2) {
				rezultat +=i;
				// rezultat = rezultat + i;
			}
			System.out.println("Zbir svih parnih brojeva je: " + rezultat);
		}*/
		
		//Izracunati broj prestupnih godina od 2022. do 2100.
		/*int zbir = 0;
		for(int i = 2022; i<=2100; i = i+4) {
			if(i == 2022) {
				i = i+2;
				zbir++;
			}else {
				zbir++;
			}
		}*/
		
		/*int zbir = 0;
		for(int i = 2022; i<=2100; i = i+2) {
			if(i%4 == 0) {
				zbir++;
			}
		}
		
		System.out.println("Broj prestupnih godina je: " +zbir);*/
		
		
		//Vezbe 3 - Zadatak 1
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj od 1 do 9");
		int number = sc.nextInt();
		
		int brojac = 1;
		while(brojac<10) {
			System.out.println(number*brojac);
			brojac++;
		}*/
		
		//Vezbe 3  - Zadatak 2
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Unesite trocifreni broj");
		int number = sc.nextInt();
		
		//654 
		if(number>=1000 || number<100) {
			System.out.println("Broj mora biti trocifren!!");
		}else {
			int stotina = number/100;
			int jedinica = number%10;
			System.out.println("Stotina je: " + stotina  + ",a jedinica: " + jedinica);
		}*/
		
		//Vezbe 3 - Zadatak 3
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite trocifreni broj");
		int number = sc.nextInt();
		
		//654 
		if(number>=1000 || number<100) {
			System.out.println("Broj mora biti trocifren!!");
		}else {
			int stotina = number/100; 
			int jedinica = number%10;
			int desetica = (number - stotina*100 - jedinica)/10;
			System.out.println("Suma cifara unetog broja: " +number+ " je: " +(jedinica+desetica+stotina));
		}
		
		
		
	}

}
