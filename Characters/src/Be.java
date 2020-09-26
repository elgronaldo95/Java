
public abstract class Be {
	
	private String Name;
	protected int Level;
	protected int Health;
	
	public Be(String Name,int Level,int Health) {
		this.Name=Name;
		this.Level=Level;
		this.Health=Health;
	}

	@Override
	public abstract String toString();

	public String getName() {
		return this.Name;
	}


	public int getLevel() {
		return this.Level;
	}


	public void setLevel(int level) {
		this.Level = level;
	}

	public int getHealth() {
		return this.Health;
	}

	public boolean isDead() {
		return (this.Health==0);
	}
	
	public void toHeal(int h) {
		this.Health+=h;
	}
	
	public abstract void toHurt(int h);
	
	public int toKill() {
		this.Health=0;
		return this.Level;
	}
	
	

}
