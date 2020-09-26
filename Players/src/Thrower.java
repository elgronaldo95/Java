import java.util.Random;
public class Thrower extends Player {
	
	private int Strength;

	public Thrower(String Name,int Number,int Strength) {
		super(Name,Number);
		this.Strength=Strength;
	}

	@Override
	public String toString() {
		return "Player [Name=" + this.getName() + ", Number=" + this.getNumber() + "] Thrower [Strength=" + Strength + "]";
	}

	public int getStrength() {
		return this.Strength;
	}
	
	public int toThrow() {
		
		Random Throw=new Random();
		
		return (Throw.nextInt(this.Strength+1));
		
	}

	
	

}
