class RBIBank{
    int balance;
    
    void deposit(int amt) {
    	this.balance = this.balance + amt;
    	System.out.println("from RBI successfully deposited.....amount....."+ amt);
    	
    }
    void withdraw(int amt) {
    	this.balance = this.balance - amt;
    	System.out.println("from RBI successfully withdrawn.....amount....."+ amt);
    	
    }
    void checkbalance() {
      System.out.println("from RBI avl balance...." + this. balance);
    }
    
    }
class SBIbank extends RBIBank {
	public SBIbank(int balance) {
		this.balance = balance;
	}
	void deposite(int amt) {
		if(amt<50000) {
			this. balance = this.balance + amt;
			System.out.println("from RBI successfully deposited.....amount....."+ amt);
		}else {
				System.out.println("from SBI day limit exceeds");
				
			}
		}
		void withdraw (int amt) {
			if(amt<50000) {
				this.balance = this.balance-amt;
				System.out.println("from RBI successfully deposited.....amount....."+ amt);
				
			}else {
				System.out.println("from SBI day limit exceeds");
		}
	}
		class ICICbank extends RBIBank{
			public ICICbank(int balance) {
				this.balance = balance;
			}
			void deposite(int amt) {
				if(amt<200000) {
					this.balance = this.balance-amt;
					System.out.println("from ICICI successfully deposited.....amount....."+ amt);
					
				}else {
					System.out.println("from ICICI day limit exceeds");

				}
			}
			class HDFCbank extends RBIBank{
				public HDFCbank(int balance) {
					this.balance = balance;
				}
				void deposite(int amt) {
					if(amt<500000) {
						this.balance = this.balance-amt;
						System.out.println("from HDFC successfully deposited.....amount....."+ amt);
						
					}else {
						System.out.println("from HDFC day limit exceeds");
		}
}
public class testbalance {
   public static void main(String[]args) {
	   
	   SBIbank sbi =new SBIbank(10000);
	   ICICbank icici = new ICICIBank(75000);
	   HDFCbank hdfc = new HDFCbank(85000);
	   
	   System.out.println("for sbi bank starts....");
	   sbi.checkbalance();
	   sbi.deposite(6000);
	   sbi.checkbalance();
	   sbi.deposite(67000);
	   sbi.checkbalance();
	   System.out.println("for SBI bank ENDS.....");
	   
	   System.out.println("for icici bank starts....");
	   
	   icici.checkbalance();
	   icici.deposite(6000);
	   icici.checkbalance();
	   icici.deposite(67000);
	   icici.checkbalance();
	   System.out.println("for icici bank ends....");
	    System.out.println("for hdfc bank starts.....");
	    
	 hdfc.checkbalance();
	 hdfc.deposite(30000);
	 hdfc.checkbalance();
	 hdfc.deposite(67000);
	 hdfc.checkbalance();
	 
	 System.out.println("for the hdfc bank ends....");
   }
},vc
			}
		}
}

