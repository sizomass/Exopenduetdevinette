package devinette;

import java.util.Scanner;

public class Game {


	static int generenb() {
		int N = 1000 - 1;
		int secretNb = (int) ((Math.random() * N) + 1);
		return secretNb;
	}


	static boolean verif(int secretnb, int x) {

		if (x < secretnb) {
			System.out.println("Your Guess is smaller than the secret number...");
			return false;
		} else if (x > secretnb){
			System.out.println("Your guess is bigger than the secret number...");
			return false;
		} else {
			System.out.println("Your Guess is correct, congratulations!");
			return true;
		}
	}

	static void partyT( ) {

		int secretNb = generenb();
		int essai = 0;
		int x;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Enter a guess (1 - 1000) : ");
			x = sc.nextInt();
			essai ++;
		} while( verif(secretNb, x) == false && essai < 11);

	}

}
