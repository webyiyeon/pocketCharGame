
public class Dandan extends Character{
	public Dandan(){
		exp = 0;
		energy = 80;
		System.out.println("You created Dandan.");
		printInfo();
	}

	@Override
	public void eat() {
		energy += 5;
	}

	@Override
	public void sleep() {
		energy += 15;
	}

	@Override
	public boolean play() {
		energy -= 10;
		exp += 10;
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy -= 20;
		exp += 20;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		if(exp>=60) {
			level++;
			exp -= 60;
		}
	}
}
