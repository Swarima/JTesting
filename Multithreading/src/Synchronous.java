class Account
{
	private int balance;
	public Account(int b)
	{
		balance=b;
	}
	
	public void deposit(int amount)
	{
		synchronized(this)
		{
		try{
			Thread.sleep(30);
		}
		catch(InterruptedException e){
		}
	
		System.out.println("balance before deposit" +balance);
		balance=balance+amount;
		System.out.println("balance after deposit" +balance);
		try{
			Thread.sleep(30);
		
		}
		catch(InterruptedException e){
		}
	}
		
	}
	public synchronized void withdraw(int amount)
	{
		System.out.println("balance before withdraw" +balance);
		try{
			Thread.sleep(30);
		}
		catch(InterruptedException e){
		}
		balance=balance-amount;
		System.out.println("balance after withdraw" +balance);
		try{
			Thread.sleep(30);
		}
		catch(InterruptedException e){
		}
	}
}
class AccountUser extends Thread
{
	private String name,tot;
	private Account account;
	private  int amount;
	public AccountUser(Account acc,String n,String tt,int amt)
	{
		account=acc;
		name=n;
		tot=tt;
		amount=amt;
		
	}
	public void run()
	{
		if(tot.equals("deposit"))
		{
			account.deposit(amount);
		}
		else if(tot.equals("withdrawl"))
		{
			account.deposit(amount);
			
		}
	}
}
public class Synchronous {
public static void main(String [] args)
{
 Account acc=new Account(5000);
 AccountUser user1=new AccountUser(acc,"user1","deposit",5000);
 AccountUser user2=new AccountUser(acc,"user2","withdrawl",2000);
 user1.start();
 user2.start();
}
}
