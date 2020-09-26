
public class Teste {

	public static void main(String[] args) {
		
		Quizz Q=new Quizz();
		StringQuestion Q1=new StringQuestion("Quel animal symbolise la Chine",2,"panda");
		Q1.addMultipleAnswer("chien");
		Q1.addMultipleAnswer("dragon");
		Q1.addMultipleAnswer("panda");
		Q1.addMultipleAnswer("serpent");
		
		
		IntQuestion Q2=new IntQuestion("En quelle année le 21e siècle a-t-il commencé",1,2001);
		Q2.addMultipleAnswer(2000);
		Q2.addMultipleAnswer(2001);
		Q2.addMultipleAnswer(2020);
		Q2.addMultipleAnswer(1999);
		
		BooleanQuestion Q3=new BooleanQuestion("La formule logique faux=>vrai est-elle vraie",3,true);
		Q3.addMultipleAnswer(true);
		Q3.addMultipleAnswer(false);
		
		Q.addQuestion(Q1);
		Q.addQuestion(Q2);
		Q.addQuestion(Q3);
		
		System.out.println("vos points : " + Q.toPlay());
		
		

	}

}
