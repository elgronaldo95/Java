import java.util.ArrayList;
public class Count {
	
	private String Number; 
	private double Balance;
	private double TotalCredit;
	private double TotalDebit;
	private double Overdraft;
	
	
	public Count(String Number,double balance,double TotalCredit,double TotalDebit,double Overdraft) {
		
		this.Number=Number;
		this.Balance=0;
		this.TotalCredit=0;
		this.TotalDebit=0;
		this.Overdraft=Overdraft;
		
	}

	

	@Override
	public String toString() {
		return "Count [Number=" + Number + ", Balance=" + Balance + ", TotalCredit=" + TotalCredit + ", TotalDebit="
				+ TotalDebit + ", Overdraft=" + Overdraft + "]";
	}

	public String getNumber() {
		return this.Number;
	}

	public double getBalance() {
		return this.Balance;
	}
	

	public double getOverdraft() {
		return this.Overdraft;
	}


	public void setOverdraft(double overdraft) {
		this.Overdraft = overdraft;
	}



	public double getTotalCredit() {
		return this.TotalCredit;
	}


	public double getTotalDebit() {
		return this.TotalDebit;
	}


	public void toCredit(double Amount){
		
		this.Balance+=Amount;
		
		this.TotalCredit+=1;
	}
	
	public void toDebit(double Amount) throws Exception {
		
		
		if(this.Balance>this.Overdraft) {
			
			this.Balance-=Amount;
			this.TotalDebit+=1;
			
		}
		
		else {
			
			throw new Exception("montant insufisant");
		}
		
		
	}
	
	public void toTransfert(Count Another,double Amount) {
		
		try {
			this.toDebit(Amount);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		Another.toCredit(Amount);
		
	}
	
	
	
	


	

}
