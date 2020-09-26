import java.util.ArrayList;
import java.util.Scanner;
public class StringQuestion extends Question {
	
	private String Answer;
	private ArrayList<String> multipleAnswer;

	public StringQuestion(String Texte, int Point,String Answer) {
		super(Texte, Point);
		this.Answer=Answer;
		multipleAnswer=new ArrayList<String>();
		
	}
	

	public String getAnswer() {
		return this.Answer;
	}
	
	public void addMultipleAnswer(String S) {
		multipleAnswer.add(S);
	}
	
	public int numberMultipleAnswer() {
		return multipleAnswer.size();
	}


	@Override
	public boolean toAnswer() {
		
		if(this.numberMultipleAnswer()>=2) {
			
			int i=0;
			for (String S:multipleAnswer) {
				
				System.out.println(" Appuyez sur "+(i)+" pour "+ multipleAnswer.get(i));
				
				i+=1;
			}
			
			Scanner r=new Scanner(System.in);
			
			int userAnswer=r.nextInt();
			
			return (this.getAnswer().equalsIgnoreCase(multipleAnswer.get(userAnswer)));
		}
		else {
			
			System.out.println("veuilliez donnez une réponse");
			Scanner r=new Scanner(System.in);
			String userAnswer=r.nextLine();
			
			return (this.getAnswer().equalsIgnoreCase(userAnswer));
		}
	}


	
				
			
			
				
		
		
		
		
	
	

}
