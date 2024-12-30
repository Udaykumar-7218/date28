import SBIbank.ICICbank;
import SBIbank.ICICbank.HDFCbank;

class Bank{
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
class Canarabank extends RBIBank {
	public Canarabank(int balance) {
		this.balance = balance;
	}
	void deposite(int amt) {
		if(amt<50000) {
			this. balance = this.balance + amt;
			System.out.println("from Bank successfully deposited.....amount....."+ amt);
		}else {
				System.out.println("from  Canara day limit exceeds");
				
			}
		}
		void withdraw (int amt) {
			if(amt<50000) {
				this.balance = this.balance-amt;
				System.out.println("from Bank successfully deposited.....amount....."+ amt);
				
			}else {
				System.out.println("from Canara day limit exceeds");
		}
	}
		class kotakbank extends RBIBank{
			public Kotakbank(int balance) {
				this.balance = balance;
			}
			void deposite(int amt) {
				if(amt<200000) {
					this.balance = this.balance-amt;
					System.out.println("from kotak successfully deposited.....amount....."+ amt);
					
				}else {
					System.out.println("from Kotak day limit exceeds");

				}
			}
			class Yesbank extends Bank{
				public Yesbank(int balance) {
					this.balance = balance;
				}
				void deposite(int amt) {
					if(amt<500000) {
						this.balance = this.balance-amt;
						System.out.println("from Yes successfully deposited.....amount....."+ amt);
						
					}else {
						System.out.println("from Yes day limit exceeds");
		}
}
public class testbalance {
   public static void main(String[]args) {
	   Bank=null;
	   Bank=new Bank
	   
	   System.out.println("for Canara bank starts....");
	   Canara.checkbalance();
	   Canara.deposite(6000);
	   Canara.checkbalance();
	   Canara.deposite(67000);
	   Canara.checkbalance();
	   System.out.println("for canara bank ENDS.....");
	   
	   System.out.println("for Kotak bank starts....");
	   
	   icici.checkbalance();
	   icici.deposite(6000);
	   icici.checkbalance();
	   icici.deposite(67000);
	   icici.checkbalance();
	   System.out.println("for Kotak bank ends....");
	    System.out.println("for Yes bank starts.....");
	    
	 hdfc.checkbalance();
	 hdfc.deposite(30000);
	 hdfc.checkbalance();
	 hdfc.deposite(67000);
	 hdfc.checkbalance();
	 
	 System.out.println("for the yes bank ends....");
   }
}
			}
		}
}

