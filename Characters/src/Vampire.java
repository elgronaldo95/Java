
public class Vampire extends Be {
	
	int Toxicity;

	public Vampire(String Name,int Level,int Health,int Toxicity) {
		
		super(Name,Level,Health);
		
		this.Toxicity=Toxicity;
	}

	@Override
	public String toString() {
		return "Be [Name=" + this.getName() + ", Level=" + this.getLevel() + ", Health=" + this.getHealth() + "]Vampire [Toxicity=" + Toxicity + "]";
	}
	
	public void toHurt(int h) {
		
		if(this.getLevel()>10) {
			
			this.Health=Math.max(0,this.Health-(h/2));
		}else {
			this.Health=Math.max(0,this.Health-h);
		}
		
	}

	public int getToxicity() {
		return this.Toxicity;
	}

	public void toBite(Be A) {
		
		if(!this.isDead()) {
			
			if(A.getHealth()<=this.Toxicity) {
				
				this.toHeal(A.getHealth());
				
				A.toKill();
			}else {
				
				this.toHeal(this.Toxicity);
				
				A.toHurt(this.Toxicity);
			}
			
			
		}
	}
	
	
	
	
	
	

}
