
public abstract class Question {
	
	private String Texte;
	private int Points;
	
	public Question(String Texte,int Point) {
		this.Texte=Texte;
		this.Points=Point;
	}

	@Override
	public String toString() {
		return "Question [Texte=" + Texte + ", Points=" + Points + "]";
	}

	public String getTexte() {
		return this.Texte;
	}

	public void setTexte(String texte) {
		this.Texte = texte;
	}

	public int getPoints() {
		return this.Points;
	}

	public void setPoints(int points) {
		this.Points = points;
	}
	
	public abstract boolean toAnswer();
	
	
	
	

}
