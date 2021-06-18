public class main {

	public static void main(String[] args) {
			  
		System.out.println("Deposit Threads \t\tWithdrawal Threads \t\t Balance\t\t");
		System.out.println("--------------- \t\t------------------ \t\t --------------- \t\t");
		
		bankAccount bnkAcc = new bankAccount();
		Withdrawal withdrawal = new Withdrawal(bnkAcc);
		Depositor deposit = new Depositor(bnkAcc);

		Thread W1 = new Thread(withdrawal, "W1");
		Thread W2 = new Thread(withdrawal, "W2");
		Thread W3 = new Thread(withdrawal, "W3");
		Thread W4 = new Thread(withdrawal, "W4");
		Thread W5 = new Thread(withdrawal, "W5");
		Thread W6 = new Thread(withdrawal, "W6");
		Thread W7 = new Thread(withdrawal, "W7");
		Thread W8 = new Thread(withdrawal, "W8");
		Thread W9 = new Thread(withdrawal, "W9");

		
		Thread D1 = new Thread(deposit, "D1");
		Thread D2 = new Thread(deposit, "D2");
		Thread D3 = new Thread(deposit, "D3");
		Thread D4 = new Thread(deposit, "D4");
		Thread D5 = new Thread(deposit, "D5");


		W1.start();
		W2.start();
		W3.start();
		W4.start();
		W5.start();
		W6.start();
		W7.start();
		W8.start();
		W9.start();
		
		D1.start();
		D2.start();
		D3.start();
		D4.start();
		D5.start();
	}

}
