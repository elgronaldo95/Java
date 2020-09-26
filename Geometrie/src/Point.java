
public class Point {
	
	private double Abscisse;
	private double Ordonate;
	
	public Point(double Abscisse,double Ordonate) {
		
		this.Abscisse=Abscisse;
		this.Ordonate=Ordonate;
	}

	public double getAbscisse() {
		return this.Abscisse;
	}

	public void setAbscisse(double abscisse) {
		this.Abscisse = abscisse;
	}

	public double getOrdonate() {
		return this.Ordonate;
	}

	public void setOrdonate(double ordonate) {
		this.Ordonate = ordonate;
	}
	
	public double Distance(Point A) {
		
		return (Math.sqrt(Math.pow((A.getAbscisse()-this.Abscisse), 2)+Math.pow(A.getOrdonate()-this.Ordonate, 2)));
	}

	@Override
	public String toString() {
		return "Point [Abscisse=" + Abscisse + ", Ordonate=" + Ordonate + "]";
	}
	
	

}
