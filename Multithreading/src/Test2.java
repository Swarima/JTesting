import java.util.Scanner;

//using interface
class MyThread implements Runnable
{
	private Thread t1,t2;
	private String name;
	public MyThread(String n) //constructor having two param(Thread group,Thread name))
	{
		name=n;
		t1=new Thread(this,name);
		t2=new Thread(this,name);
		t1.start();
		t2.start();

	}
	public void run()
	{
		int i;
		for(i=0;i<100;i++)
			if(Thread.currentThread()==t1)
			{
				System.out.println("hello" +name);
			}
			else if(Thread.currentThread()==t2)
			{
				System.out.println("hiii" +name);
			}
	}
}

public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		name=sc.next();
		new MyThread(name);
		
	}

}
