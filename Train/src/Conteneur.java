
public class Conteneur extends Wagon {
	
	private String NomMarchandise;
	private double PoidMarchandise;

	public Conteneur(double poidAVide,String NomMarchandise,double PoidMarchandise) {
		super(poidAVide);
		this.NomMarchandise=NomMarchandise;
		this.PoidMarchandise=PoidMarchandise;
	}

	@Override
	public String toString() {
		return "Wagon [poidAVide=" + this.getPoidAVide() + "] Conteneur [NomMarchandise=" + NomMarchandise + ", PoidMarchandise=" + PoidMarchandise + "]";
	}
	

	public String getNomMarchandise() {
		return this.NomMarchandise;
	}

	public void setNomMarchandise(String nomMarchandise) {
		this.NomMarchandise = nomMarchandise;
	}

	public double getPoidMarchandise() {
		return this.PoidMarchandise;
	}

	public void setPoidMarchandise(double poidMarchandise) {
		this.PoidMarchandise = poidMarchandise;
	}

	@Override
	public double poidEnchrage() {
		double poids=this.getPoidAVide()+this.PoidMarchandise;
		return poids;
	}

}
