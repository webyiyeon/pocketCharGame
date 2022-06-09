
public class Malrang extends Character{
	public Malrang(){
		exp = 20;
		energy = 50;
		System.out.println("You created Malrang.");
		printInfo();
	}

	@Override
	public void eat() {
		energy += 10;
	}

	@Override
	public void sleep() {
		energy += 5;
	}

	@Override
	public boolean play() {
		energy -= 5;
		exp += 5;
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy -= 15;
		exp += 15;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		if(exp>=40) {
			level++;
			exp -= 40;
		}
	}
	
}
