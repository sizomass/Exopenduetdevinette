package penduCorrig;

import java.util.Scanner;


public class Game {



	static char [] motVersTab (String s) {
		char [] tab = new char [s.length()];
		for (int i = 0; i < s.length(); i++) {
			tab[i] = s.charAt(i);
		}
		return tab;
	}

	static void affichage(char[] mot, boolean [] vu) {
		int i;
		for (i= 0; i < mot.length; i++) {
			if(vu[i] == true ) {

				System.out.print(mot[i]);
			} else

				System.out.print('?');

		}

	}

	static boolean[] metAJour(char[] mot, boolean[] vu, char c) {

		for(int i = 0; i < mot.length; i++) {
			if (mot[i] == c) {
				vu[i] = true;
			}
		}
		return vu;
	}

	static boolean partieFinie(boolean vu[]) {

		for(int i = 0; i < vu.length; i++)	{

			if( vu[i] == false) {

				return false;
			}
		}
		return true;
	}	

	static void partie(String mot) { 

		int x = motVersTab(mot).length;
		
		boolean[] vu = new boolean[x];

		affichage(motVersTab(mot), vu);		
		
		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.println("\r Tapez une lettre pour tenter votre chance");
			
			char essai = sc.nextLine().charAt(0);
			metAJour(motVersTab(mot), vu, essai);
			affichage(motVersTab(mot), vu);

		} while ( partieFinie(vu) == false);

		System.out.println("\r La partie est terminée!");			
	}

}
