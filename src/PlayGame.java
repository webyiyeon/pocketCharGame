import java.util.Scanner;

public class PlayGame {
	private Character c;
	private int menu;
	private boolean exit;
	
	public PlayGame(Character c) {
		this.c = c;
	}

	public void printMenu(Scanner scan) {
		System.out.println("-----------");
		System.out.println("1. feeding 2. sleeping 3. playing 4. training 5. Quit >");
		menu = scan.nextInt();
		play();
	}
	
	public void play() {
		switch(menu) {
		case 1:
			System.out.println("have a meal");
			c.eat();
			c.printInfo();
			break;
		case 2:
			System.out.println("sleep");
			c.sleep();
			c.printInfo();
			break;
		case 3:
			System.out.println("play");
			c.play();
			c.printInfo();
			break;
		case 4:
			System.out.println("train body");
			c.train();
			c.printInfo();
			break;
		case 5:
			exit = true;
		}
	}

	public Character getC() {
		return c;
	}

	public void setC(Character c) {
		this.c = c;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}
}
