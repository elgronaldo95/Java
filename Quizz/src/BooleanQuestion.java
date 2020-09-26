import java.util.Scanner;
import java.util.ArrayList;
public class BooleanQuestion extends Question {
	
	private boolean Answer;
	private ArrayList<Boolean> multipleAnswer;

	public BooleanQuestion(String Texte, int Point,boolean Answer) {
		super(Texte, Point);
		this.Answer=Answer;
		multipleAnswer=new ArrayList<Boolean>();
	}
	

	public boolean getAnswer() {
		return this.Answer;
	}
	
	public void addMultipleAnswer(boolean B) {
		multipleAnswer.add(B);
	}
	
	public int numberMultipleAnswer() {
		return multipleAnswer.size();
	}

	@Override
	public boolean toAnswer() {
		
		if(this.numberMultipleAnswer()>=2) {
			
			int i=0;
			
			for (boolean B :multipleAnswer) {
				
				System.out.println(" Appuyez sur "+(i)+" pour "+ multipleAnswer.get(i));
				
				i+=1;
			}
			
			Scanner r=new Scanner(System.in);
			
			int userAnswer=r.nextInt();
			
			return (this.getAnswer()==multipleAnswer.get(userAnswer));
			
		}
		
		else {
			
			System.out.println("veuilliez donnez une réponse");
			Scanner r=new Scanner(System.in);
			boolean userAnswer=r.hasNext();
			
			return (this.getAnswer()==userAnswer);
		}
		
		
	}

	

}
