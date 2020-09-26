import java.util.ArrayList;
public class Trajectoire {
	
	private ArrayList<Point>Direction;
	
	public Trajectoire() {
		
		Direction=new ArrayList<Point>();
	}
	
	public void ajouterPoint(Point A) {
		
		Direction.add(A);
	}
	
	public void retirerPoint(int i) {
		
		Direction.remove(i);
	}
	
	public int tailleTrajectoire() {
		
		return Direction.size();
	}
	
	public double longueurTrajectoir() {
		
		double somme=0;
		int i=0;
		
		for(Point A:Direction) {
			
			if(i<=this.tailleTrajectoire()-1) {
				
				somme+=A.Distance(Direction.get(i+1));
			}
			
		}
		
		return somme;
	}

}
