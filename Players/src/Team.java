import java.util.ArrayList;
import java.util.Random;
public class Team {
	
	private ArrayList<Player>Equipe;
	
	public Team() {
		Equipe=new ArrayList<Player>();
	}

	@Override
	public String toString() {
		return "Team [Equipe=" + Equipe + "]";
	}

	public ArrayList<Player> getEquipe() {
		return this.Equipe;
	}

	public void setEquipe(ArrayList<Player> equipe) {
		this.Equipe = equipe;
	}
	
	public void addPlayer(Player P) {
		Equipe.add(P);
	}
	
	public int numberPlayers() {
		return (Equipe.size());
	}
	
	public Player playerDetail(int i) {
		return (Equipe.get(i));
	}
	
	public void removePlayer(int i) {
		Equipe.remove(i);
	}
	
	public int toPlay(int N) {
		int total=0;
		
		for(int i=0;i<N;i++) {
			
			Random r1=new Random();
			
			Player P1=this.playerDetail(r1.nextInt(this.numberPlayers()));
			
			if(P1 instanceof Thrower) {
				
				int Throw=((Thrower) P1).toThrow();
				
				Random r2=new Random();
				Player P2=this.playerDetail(r2.nextInt(this.numberPlayers()));
				
				if(P2 instanceof Catcher) {
					
					total+=((Catcher) P2).toCatch(Throw);
				}
				
				if(P2 instanceof SuperstarCatcher) {
					
					int random=0+(int)(Math.random()*((1-0)+1));
					
					if(random==0) {
						total+=((SuperstarCatcher) P2).toCatch(Throw);
					}
					else {
						total+=((SuperstarCatcher) P2).toSuperCatch(Throw);
					}
					
				}
			}
		}
		return total;
	}
	
	

}
