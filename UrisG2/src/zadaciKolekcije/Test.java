package zadaciKolekcije;

public class Test {

	public static void main(String[] args) {
							// ZADATAK 1
		/*int[] niz = {4,5,6,7,8};
		for(int i = niz.length - 1; i>=0; i--) {
			System.out.print(niz[i] + " ");
		}*/
		
							//ZADATAK 2
		/*int[] niz = {4, 20, 33, 222, 88, 5};
		if(niz[2] > niz[3]) {
			System.out.println("Treci element je veci od cetvrtog za: " + (niz[2] - niz[3]));
		}else {
			System.out.println("Cetvrti element je veci od treceg za: " + (niz[3] - niz[2]));
		}*/
		
							//ZADATAK 3
		
		/*int[]niz = {2,4,6,8,10,12,14,16,18,20};
		for(int i=0; i<niz.length; i++) {
			niz[i] *= 5;
			//niz[i] =  niz[i] * 5;
			System.out.println(niz[i]);
		}*/
		
		int[] niz = {15,13,77,18,24,66,48,12,31};
		int najveciBroj = 0;
		int najmanjiBroj = 0;
		int drugiNajveci = 0;
		int drugiNajmanji = 0;
		for(int i = 0 ; i< niz.length; i++) {
			if(niz[i] > najveciBroj) {
				najveciBroj = niz[i];
			}
			if(niz[i] < najmanjiBroj || najmanjiBroj == 0) {
				najmanjiBroj = niz[i];
			}
			for(int k = i+1; k<niz.length; k++) {
				if(k == niz.length) {
					break;
				}
				else {
					if(niz[k]<najveciBroj && niz[k] > drugiNajveci) {
						drugiNajveci = niz[k];
					}
					if((niz[k]>najmanjiBroj && niz[k]<drugiNajmanji) || drugiNajmanji==0) {
						drugiNajmanji = niz[k];
					}
				}
			}
		}
		System.out.println("Najveci broj u nizu je: " + najveciBroj);
		System.out.println("Najmanji broj u nizu je: " + najmanjiBroj);
		System.out.println("Drugi najveci broj u nizu je: " + drugiNajveci);
		System.out.println("Drugi najmanji broj u nizu je: " + drugiNajmanji);
	}

}
