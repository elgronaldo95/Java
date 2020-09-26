
public abstract class Wagon {
	
	double poidAVide;
	
	public Wagon(double poidAVide) {
		this.poidAVide=poidAVide;
	}

	@Override
	public abstract String toString();

	public double getPoidAVide() {
		return this.poidAVide;
	}
	
	public abstract double poidEnchrage();
	
	
	
	

}
