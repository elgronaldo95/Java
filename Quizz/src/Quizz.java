import java.util.ArrayList;
public class Quizz {
	
	private ArrayList<Question>Game;
	
	public Quizz() {
		Game=new ArrayList<Question>();
	}

	public void setGame(ArrayList<Question> game) {
		this.Game = game;
	}
	
	public void addQuestion(Question Q) {
		Game.add(Q);
	}
	
	public Question questionDetail(int i) {
		return Game.get(i);
	}
	
	public void removeQuestion(int i){
		Game.remove(i);
	}
	
	public int toPlay()  {
		
		int gain=0;
		
		for(Question Q:Game) {
			
			System.out.println(Q.getTexte() + " ( "+Q.getPoints()+" points )");
			
			if(Q.toAnswer()) {
				
				System.out.println(" Bonne Réponse ");
				
				gain+=Q.getPoints();
			}
			
			else {
				System.out.println(" Mauvaise Réponse ");
			}
			
		}
		
			
		return gain;
		
		
	}
		

}
