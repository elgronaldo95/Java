
public class Teste {

	public static void main(String[] args) {
		
		Thrower N01=new Thrower("A",1,8);
		Thrower N02=new Thrower("B",2,3);
		Catcher N07=new Catcher("C",7);
		SuperstarCatcher N08= new SuperstarCatcher("Jean",10);
		
		System.out.println(N07.toCatch(N01.toThrow()));
		System.out.println(N08.toSuperCatch(N02.toThrow()));
		System.out.println(N08.toSuperCatch(N01.toThrow()));
		System.out.println(N07.toCatch(N01.toThrow()));
		
		Team T=new Team();
		
		T.addPlayer(N01);
		T.addPlayer(N02);
		T.addPlayer(N07);
		T.addPlayer(N08);
		
		System.out.println(T.getEquipe());
		System.out.println(T.toPlay(10));

	}

}
