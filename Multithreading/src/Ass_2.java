import java.util.Scanner;
class MyThreadd extends Thread
{
	private int n1,n2;
	public MyThreadd(int no1,int no2)
	{
		n1=no1;
		n2=no2;
	}
	public void run()
	{ 
		int fact=n2;
		int i=0;
		while(!(i==n1))
		{
		fact=fact*(n2-1);
		n2--;
		i++;
		}
	System.out.println(fact);
	}
}
class MyThreadd2 extends Thread
{
	private int n1,n2;
public MyThreadd2(int no1,int no2)
{
	n1=no1;
	n2=no2;
}
public void run()
{ 
	int sum=n2;
	int i=0;
	while(!(i==n1))
	{
	sum=sum+(n2-1);
	n2--;
	i++;
	}
System.out.println(sum);
}
}



		public class Ass_2 {
			public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("n1 and n2");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		MyThreadd m1=new MyThreadd(n1,n2);
		MyThreadd2 m2=new MyThreadd2(n1,n2);
		m1.start();
		try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.start();
	}

}
