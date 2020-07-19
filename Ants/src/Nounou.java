
public class Nounou extends Ants {
	
	private int eggsHealed;

	public Nounou(String Spiece,Sexe sexe,int eggsHealed) {
		
		super(Spiece,sexe);
		this.eggsHealed=eggsHealed;
	}

	@Override
	public String toString() {
		return "Ants [Spiece=" + this.getSpiece() + ", sexe=" + sexe + "] Nounou [eggsHealed=" + eggsHealed + "]";
	}

	public int getEggsHealed() {
		return this.eggsHealed;
	}

	public boolean soigner(Eggs e) {
		
		if(this.isSameSpice(e)) {
			
			e.toHeal(1);
			
			this.eggsHealed+=1;
			
			return true;
			
		}else {
			
			return false;
		}
	}
	
	
	
	

}
