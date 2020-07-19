
public abstract class Ants {
	
	private String Spiece;
	protected Sexe sexe;
	
	public Ants(String Spiece,Sexe sexe) {
		
		this.Spiece=Spiece;
		this.sexe=sexe;
	}

	@Override
	public abstract String toString();

	public String getSpiece() {
		return this.Spiece;
	}

	
	public Sexe getSexe() {
		return this.sexe;
	}
	
	public boolean isFemale() {
		return (this.getSexe()==sexe.Female);
	}

	public boolean isSameSpice(Ants A) {
		return (this.Spiece.equalsIgnoreCase(A.getSpiece()));
	}
	
	

}
