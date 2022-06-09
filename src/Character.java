
public abstract class Character {
	protected int exp;
	protected int level = 1;
	protected int energy;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract boolean play();
	public abstract boolean train();
	public abstract void levelUp();
	public boolean checkEnergy() {
		if(energy <= 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void printInfo() {
		System.out.println("Character Information");
		System.out.println("exp : "+exp);
		System.out.println("energy : "+energy);
		System.out.println("level : "+level);
	}
}
