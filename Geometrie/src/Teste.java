
public class Teste {

	public static void main(String[] args) {
		
		Droite D1=new Droite(1,1,1);
		
		Droite D2=new Droite(2,4,6);
		
		Point A=new Point(-1,-1);
		Point B=new Point(7,-5);
		Point C=new Point(4,-9);
		
		System.out.println(D1.passePar(A));
		System.out.println(D1.isParallelle(D2));
		
		Trajectoire T=new Trajectoire();
		
		T.ajouterPoint(A);
		T.ajouterPoint(B);
		T.retirerPoint(1);
		T.ajouterPoint(C);
		T.ajouterPoint(B);
		System.out.println(T.tailleTrajectoire());
		System.out.println(T.longueurTrajectoir());
		

	}

}
