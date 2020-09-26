
public class Locomotive extends Wagon {
	
	private int NombreConducteur;

	public Locomotive(double poidsAVide,int NombreConducteur) {
		
		super(poidsAVide);
		this.NombreConducteur=NombreConducteur;
	}
	
	

	@Override
	public String toString() {
		return "Wagon [poidsAVide=" + this.getPoidAVide() + "] Locomotive [NombreConducteur=" + NombreConducteur + "]";
	}

	

	public int getNombreConducteur() {
		return this.NombreConducteur;
	}



	public void setNombreConducteur(int nombreConducteur) {
		this.NombreConducteur = nombreConducteur;
	}



	@Override
	public double poidEnchrage()  {
		
		double poids=(this.getPoidAVide()+((double)(NombreConducteur))*70);
		
		return poids;
	}

}
