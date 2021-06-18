
public class Depositor implements Runnable {
	
	private bankAccount bnkAcc;

	public Depositor(bankAccount bnkAcc2) {
		bnkAcc = bnkAcc2;
	}

	public void run() {
		
		try {
			while(true) {
				bnkAcc.deposit();
				Thread.sleep(6000);
			}
		} 
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
