import java.util.ArrayList;
public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Eggs>Nurssery;
		
		Nurssery=new ArrayList<Eggs>();
		
		Qween Q=new Qween("Lasius niger",Sexe.Female,"Killer");
		Nounou N=new Nounou("Lasius niger",Sexe.Male,0);
		
		for(int i=0;i<100;i++) {
			
			Nurssery.add(Q.toLay());
					
		}
		
		for(Eggs e:Nurssery) {
			
			e.toHurt(e.getHealth()/2);
			N.soigner(e);
			
			System.out.println(e.toString());
			
		}
		
		System.out.println(Nurssery.size());
		
		System.out.println(Q.isFemale());
		
		
	}

}
