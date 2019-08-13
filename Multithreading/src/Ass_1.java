import java.util.Scanner;

class MyThreada extends Thread{
	private int n;
	public MyThreada(int no)
	{
		n=no;
	}
	public void run()
	{	int i;
		for(i=n;i<=n+10;i++)
		System.out.println("no =" +i);
	}
}

class MyThreadb extends Thread{
	private int n;
	public MyThreadb(int no)
	{
		n=no;
	}
	public void run()
	{
		int i=1;
		int j=0;
		while(i<=10)
		{
			j=n*i;
		System.out.println("n =" +j);
		i++;
	}
}

}
public class Ass_1 {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number");
	 int n=sc.nextInt();
	 MyThreada t1=new MyThreada(n);
	 MyThreadb t2=new MyThreadb(n);
	 t1.start();
	 try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 t2.start();

	}

}
