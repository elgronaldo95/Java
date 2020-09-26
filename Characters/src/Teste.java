
public class Teste {

	public static void main(String[] args) {
		
		Abe Abe1=new Abe("Alpha",10,100);
		Chaman S1=new Chaman("Inca",10,200,7);
		Vampire V1=new Vampire("Vlad",10,40,5);
		
		V1.toBite(Abe1);
		try {
			S1.shamanHeal(Abe1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		V1.toBite(S1);
		try {
			S1.shamanHeal(V1);
		} catch (Exception a) {
			// TODO Auto-generated catch block
			System.out.println(a);
		}
		try {
			S1.shamanHeal(S1);
		} catch (Exception c) {
			// TODO Auto-generated catch block
			System.out.println(c);
		}
		
		Abe1.toKill();
		S1.toKill();
		V1.toKill();

	}

}
