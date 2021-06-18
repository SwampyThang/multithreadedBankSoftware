
public class Withdrawal implements Runnable {
	
	private bankAccount bnkAcc;

	public Withdrawal(bankAccount bnkAcc2) {
		bnkAcc = bnkAcc2;
	}

	public void run() {
		
		try {
			while(true) {
				bnkAcc.withdrawal();
				Thread.sleep(10);
			}
		} 
	
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
