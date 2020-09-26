import java.util.ArrayList;
import java.util.Iterator;
public class Train {
	
	private String Nom;
	private ArrayList<Wagon>Corp;
	private Locomotive Tete;
	
	public Train(String Nom,Locomotive Tete) {
		this.Nom=Nom;
		Corp=new ArrayList<Wagon>();
		this.Tete=Tete;
	}

	@Override
	public String toString() {
		return "Train [Nom=" + Nom + ", Corp=" + Corp + "]";
	}

	public String getNom() {
		return Nom;
	}


	public ArrayList<Wagon> getCorp() {
		return this.Corp;
	}

	public void setCorp(ArrayList<Wagon> corp) {
		this.Corp = corp;
	}
	
	public void ajouterWagon(Wagon W) {
		Corp.add(W);
	}
	
	public Wagon detailWagon(int i) {
		return Corp.get(i);
	}
	
	public int nombreDeWagon() {
		
		return Corp.size();
	}
	
	public void retirerWagon(int i) {
		Corp.remove(i);
	}
	
	public double poidAVide() {
		
		double poid=Tete.poidAVide;
		
		for(Wagon W:Corp) {
			
			poid+=W.getPoidAVide();
		}
		
		return poid;
	}
	
	public double poidEnCharge() {
		
		double poid=Tete.poidEnchrage();
		for(Wagon W:Corp) {
			
			poid+=W.poidEnchrage();
		}
		
		return poid;
	}
	
	public int compterCabine() {
		
		int nombreCabine=0;
		
		for(Wagon W:Corp) {
			
			if(W instanceof Cabine) {
				
				nombreCabine+=1;
				
			}
		}
		
		return nombreCabine;
	}
	
	public void deplacerWagon(Train T) {
		
		Iterator<Wagon> succes=Corp.iterator();
		
		while(succes.hasNext()) {
			
			Wagon W=succes.next();
			
			if(W instanceof Cabine) {
				
				T.ajouterWagon(W);
				
				succes.remove();
			}
		}
		
	}
	

}
