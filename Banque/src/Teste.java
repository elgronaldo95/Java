import java.util.ArrayList;
public class Teste {

	public static void main(String[] args) {
		
		Count c1=new Count("00254", 0,0,0, -100);
		
		System.out.println(c1.getBalance());
		
		c1.toCredit(200);
		
		System.out.println(c1.getBalance());
		
		Count c2=new Count("00289",0, 0, 0, -100);
		c2.toCredit(70.47);
		
		try {
			c1.toDebit(2.5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		try {
			c2.toDebit(2.5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		c1.toTransfert(c2, c1.getBalance());
		
		c1=null;
		
		System.out.println(c2.getBalance());
		
		Customer CU1=new Customer("Lucie");
		
		Count c3=new Count("00123",0,0,0,(-1000));
		
		try {
			CU1.addCount(c3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		Count c4=new Count("00277",0,0,0,(-1000));
		
		
		try {
			CU1.addCount(c4);
		} catch (Exception b) {
			// TODO Auto-generated catch block
			System.out.println(b);
		}
		
		try {
			CU1.countDebit(1,20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		double somme=CU1.totalBalance();
		
		Customer CU2=new Customer("Antoine");
		
		try {
			CU2.addCount(c2);
		} catch (Exception c) {
			// TODO Auto-generated catch block
			System.out.println(c);
		}
		
		
		
		

	}

}
