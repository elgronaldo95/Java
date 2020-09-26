
public class Droite {
	
	private double X;
	private double Y;
	private double coefC;
	
	
	public Droite(double X,double Y,double coefC) {
		
		this.X=X;
		this.Y=Y;
		this.coefC=coefC;
	}


	@Override
	public String toString() {
		return "Droite [X=" + X + ", Y=" + Y + ", coefC=" + coefC + "]";
	}


	public double getX() {
		return this.X;
	}


	public void setX(double x) {
		this.X = x;
	}


	public double getY() {
		return this.Y;
	}


	public void setY(double y) {
		this.Y = y;
	}


	public double getCoefC() {
		return this.coefC;
	}


	public void setCoefC(double coefC) {
		this.coefC = coefC;
	}
	
	public double pente() {
		
		return (this.Y/this.X);
	}
	
	public boolean isVertical() {
		return (this.X==0);
	}
	
	public boolean isHorizontal() {
		
		return (this.Y==0);
	}
	
	public boolean passePar(Point A) {
		
		return (((this.X*A.getAbscisse())+(this.Y*A.getOrdonate())+this.coefC)==0);
	}
	
	public boolean isParallelle(Droite D) {
		
		return (((this.X*D.getX())+(this.Y*D.getY()))==0);
	}
	

}
