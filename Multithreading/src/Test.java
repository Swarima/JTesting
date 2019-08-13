//using thread class
class MyThread1 extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<100;i++)
		{
			System.out.println("helo...");
			
		}
	}
}


class MyThread2 extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<100;i++)
		{
			System.out.println("hii...");
			
		}
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();
	}

}
