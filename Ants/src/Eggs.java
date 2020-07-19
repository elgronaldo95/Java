
public class Eggs extends Ants {
	
	private int Health;

	public Eggs(String Spiece,Sexe sexe,int Health) {
		
		super(Spiece,sexe);
		this.Health=10;
	}
	
	@Override
	public String toString() {
		return "Ants [Spiece=" + this.getSpiece() + ", sexe=" + sexe + "] Eggs [Health=" + Health + "]";
	}
	
	
	
	public int getHealth() {
		return this.Health;
	}


	public boolean isDead() {
		
		return (this.Health==0);
		
	}
	
	public void toHeal(int h) {
		
		this.Health=Math.min(10,this.Health+h);
	}
	
	
	public void toHurt(int h) {
		this.Health=Math.max(0,this.Health-h);
	}
	
	



	

}
