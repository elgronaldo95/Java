import java.util.ArrayList;
import java.util.Scanner;
public class IntQuestion extends Question {
	
	private int Answer;
	private ArrayList<Integer> multipleAnswer;

	public IntQuestion(String Texte, int Point,int Answer) {
		super(Texte, Point);
		this.Answer=Answer;
		multipleAnswer=new ArrayList<Integer>();
	}
	

	public int getAnswer() {
		return this.Answer;
	}
	
	public void addMultipleAnswer(int I) {
		multipleAnswer.add(I);
	}
	
	public int numberMultipleAnswer() {
		return multipleAnswer.size();
	}


	@Override
	public boolean toAnswer() {
		
		if(this.numberMultipleAnswer()>=2) {
			
			int i=0;
			
			for (int I:multipleAnswer) {
				
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
			
			int userAnswer=r.nextInt();
			
			return (this.getAnswer()==userAnswer);
		}
		
	}

	

}
