
public class Qween extends Ants {
	
	private String name;

	public Qween (String Spiece,Sexe sexe,String name) {
		
		super(Spiece, sexe);
		this.sexe=sexe.Female;
		this.name=name;
		
	}
	
	
	@Override
	public String toString() {
		return "Ants [Spiece=" + this.getSpiece() + ", sexe=" + sexe + "] Qween [name=" + name + "]";
	}
	

	public String getName() {
		return this.name;
	}

	
	public Eggs toLay() {
		
		int random=0+(int)(Math.random()*((1-0)+1));
		
		if(random==0) {
			
			return new Eggs(this.getSpiece(),sexe.Female,10);
			
		}
		else {
			return new Eggs(this.getSpiece(),sexe.Male,10);
		}
		
	}

}
