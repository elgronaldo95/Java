
public class Abe extends Be {

	public Abe(String Name,int Level,int Health) {
		super(Name,Level,Health);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ABe [Name=" + this.getName() + ", Level=" + Level + ", Health=" + Health + "]";
	}

	@Override
	public void toHurt(int h) {
		this.Health=Math.max(0,this.Health-h);
		
	}

}
