import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class bankAccount {
	
	private int balance;
	private Lock lock;
	private Condition waitForFunds;

	public bankAccount() {
		
		balance = 0;
		lock = new ReentrantLock();
		waitForFunds = lock.newCondition();
	}

	public void deposit() throws InterruptedException {
		
		int plus = RndGenerator.num(true);
		
		lock.lock();
		balance += plus;
		
		System.out.println("Thread " + Thread.currentThread().getName() + " deposits $" + plus + "\t\t\t\t\t\t (+)  Balance is $" + balance);
		
		waitForFunds.signalAll();
		lock.unlock();
	}

	public void withdrawal() throws InterruptedException {
		
		int minus = RndGenerator.num(false);
		lock.lock();
		
		if (balance > minus) {
			
			balance -= minus;
			System.out.println("\t\t\t\tThread " + Thread.currentThread().getName() + " withdraws $" + minus + "\t\t (-)  Balance is $" + balance);  
		}
	  
		else {
			while (balance < minus) {
				
				System.out.println("\t\t\t\tThread " + Thread.currentThread().getName() + " withdraws $" + minus + "\t\t (******) WITHDRAWAL BLOCKED - INSUFFICIENT FUNDS");
				waitForFunds.await();
			}
		}
	
		lock.unlock();

	}
	
}
