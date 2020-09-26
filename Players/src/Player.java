
public abstract class Player {
	
	private String Name;
	private int Number;
	
	public Player(String Name,int Number) {
		
		this.Name=Name;
		this.Number=Math.max(0, Number);
	}

	@Override
	public abstract String toString();

	public String getName() {
		return this.Name;
	}


	public int getNumber() {
		return this.Number;
	}
	
	

}
