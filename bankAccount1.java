
public class bankAccount1 {
	private double balance;
	public bankAccount1()
	{
	balance = 0.0;
	}
	public bankAccount1(double startBalance)
	{
		balance = startBalance;
	}
			
	public bankAccount1(String str)
	{
		balance = Double.parseDouble(str);
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void deposit(String str)
	{
		balance += Double.parseDouble(str);
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void withdraw(String str)
	{
		balance -= Double.parseDouble(str);
	}
	
	public void setBalance(double b)
	{
		balance = b;
	}
	
	public void setBalance(String str)
	{
		balance = Double.parseDouble(str);
	}
	
	public double getBalance()
	{
		return balance;
	}
	
		}

