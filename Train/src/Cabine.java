
public class Cabine extends Wagon {
	
	private String Numero;
	private int NombrePassager;
	

	public Cabine(double poidAVide,String Numero,int NombrePassager) {
		super(poidAVide);
		this.Numero=Numero;
		this.NombrePassager=NombrePassager;
	}

	@Override
	public String toString() {
		return "Wagon [poidAVide=" + this.getPoidAVide() + "] Cabine [Numero=" + Numero + ", NombrePassager=" + NombrePassager + "]";
	}
	

	public String getNumero() {
		return this.Numero;
	}

	public void setNumero(String numero) {
		this.Numero = numero;
	}

	public int getNombrePassager() {
		return this.NombrePassager;
	}

	public void setNombrePassager(int nombrePassager) {
		this.NombrePassager = nombrePassager;
	}

	@Override
	public double poidEnchrage() {
		double poids=(this.getPoidAVide()+((double)this.NombrePassager*70));
		return poids;
	}

}
