
public class Catcher extends Player {

	public Catcher(String Name,int Number) {
		super(Name,Number);
	}

	@Override
	public String toString() {
		
		return"Player [Name=" + this.getName() + ", Number=" + this.getNumber() + "]";
	}
	
	public int toCatch(int val) {
		
		return (val+this.getNumber());
	}
	
	

}
