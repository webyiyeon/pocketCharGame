import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Character c = null;
		PlayGame pg = null;
		System.out.println("Choose your character. \n 1.Malrang 2.Dandan >");
		int charNum = scan.nextInt();
		
		//choose character
		switch(charNum) {
		case 1:
			c = new Malrang();
			break;
		case 2:
			c = new Dandan();
			break;
		default:
			System.out.println("You entered the wrong number.");
		}
		
		if(c == null) {
			System.out.println("Quit the game...");
			return;
		}else {
			pg = new PlayGame(c);
		}
		
		while(true) {
			pg.printMenu(scan);
			if(pg.isExit()) {
				System.out.println("Quit the game...");
				break;
			}
		}
	
	}

}
