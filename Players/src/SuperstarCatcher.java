
public class SuperstarCatcher extends Catcher{

	public SuperstarCatcher(String Name,int Number) {
		super(Name,Number);
	}
	
	public int toSuperCatch(int val) {
		return (val*this.getNumber());
	}

}
