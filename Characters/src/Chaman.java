
public class Chaman extends Be {
	
	private int Stregnth;

	public Chaman(String Name,int Level,int Health,int Strength) {
		
		super(Name,Level,Health);
		this.Stregnth=Math.min(0,Math.max(100,Strength));
		
	}

	@Override
	public String toString() {
		return "Be [Name=" + this.getName() + ", Level=" + this.getLevel() + ", Health=" + this.getHealth() + "] Chaman [Stregnth=" + Stregnth + "]";
	}
	
	
	public int getStregnth() {
		return this.Stregnth;
	}
	
	public void toHurt(int h) {
		this.Health=Math.max(0,this.Health-h);
		
	}


	public void shamanHeal(Be A) throws Exception {
		
		if(!this.isDead()) {
			
			if((A instanceof Vampire)||(A==this)) {
				
				throw new Exception("veuilliez soignez une autre perssone");
				
			}
			
			if(A instanceof Chaman)  {
				
				if(((Chaman) A).getStregnth()>this.getStregnth()) {
					
					throw new Exception("veuilliez soignez une autre perssone");
					
				}else {
					if(!A.isDead()) {
						
						A.toHeal((A.getHealth()*this.Stregnth)/100);
					}else {
						
						A.toHeal(this.getHealth());
						
						A.setLevel(1);
						
						this.Level+=1;
					}
					
				}
			}else {
				if(!A.isDead()) {
					
					A.toHeal((A.getHealth()*this.Stregnth)/100);
				}else {
					
					A.toHeal(this.getHealth());
					
					A.setLevel(1);
					
					this.Level+=1;
				}
			}
			
			
			
			
		}
		
	}
	
	
	
	

}
