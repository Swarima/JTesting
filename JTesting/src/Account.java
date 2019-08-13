
public class Account {
private int accno;
private String name;
private int bal=5000;

public int deposit(int amount)
{
	return bal+amount;
}

public int withdraw(int amount)
{
	return bal-amount;
}

}
