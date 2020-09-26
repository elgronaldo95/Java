
public class Teste {

	public static void main(String[] args) {
		
		Locomotive Loco1=new Locomotive(10000,2);
		Locomotive Loco2=new Locomotive(20000,3);
		Train T1=new Train("Tchou",Loco1);
		Train T2=new Train("T2",Loco2);
		Cabine C1=new Cabine(2000,"1",53);
		Conteneur CO1=new Conteneur(3000,"Sucre",1500);
		Cabine C2=new Cabine(2000,"2",27);
		Cabine C3=new Cabine(2000,"3",95);
		
		
		T1.ajouterWagon(C1);
		T1.ajouterWagon(CO1);
		T1.ajouterWagon(C2);
		T1.ajouterWagon(C3);
		
		System.out.println(T1.poidAVide());
		System.out.println(T1.poidEnCharge());
		
		System.out.println("la taille de Tchou avant separation " + T1.nombreDeWagon());
		T1.deplacerWagon(T2);
		System.out.println("la taille de Tchou apres separation " + T1.nombreDeWagon());
		System.out.println("taille de T2 "+T2.nombreDeWagon());
		
		
	}

}
