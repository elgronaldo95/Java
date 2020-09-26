import java.util.ArrayList;
public class Customer {
	
	private String Name;
	
	private ArrayList<Count> CustomerCount;
	
	public Customer(String Name) {
		
		this.Name=Name;
		
		CustomerCount = new ArrayList<Count>();
	}

	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", CustomerCount=" + CustomerCount + "]";
	}

	public String getName() {
		return this.Name;
	}


	public ArrayList<Count> getCustomerCount() {
		return this.CustomerCount;
	}
	
	public void addCount(Count c1) throws Exception {
		
		if(CustomerCount.size()<=10) {
			
			CustomerCount.add(c1);
			
			
		}
		
		else {
			
			throw new Exception("nombre de compte autorisé dépassé");
			
		}
		
		
		
	}
	
	public Count countDetail(int i) {
		
		return CustomerCount.get(i);
		
	}
	
	public void countCredit(int i,double Amount) {
		
		CustomerCount.get(i).toCredit(Amount);
		
	}
	
	public void countDebit(int i,double Amount) throws Exception  {
		
		try {
			CustomerCount.get(i).toDebit(Amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	
	public double totalBalance() {
		
		double somme=0;
		
		for(Count c1:CustomerCount) {
			
			somme+=c1.getBalance();
			
		}
		
		
		return somme;
		
	}

	
	
	

}
