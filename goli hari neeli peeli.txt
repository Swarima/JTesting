
import java.awt.*;
class MovingCircle extends Frame implements Runnable{
	private int xr,xg,xb;
	Thread t1,t2,t3;
	public MovingCircle()
	{
		xr=xg=xb=100;
		t1=new Thread(this,"red");
		t2=new Thread(this,"green");
		t3=new Thread(this,"blue");
		t1.start();
		t2.start();
		t3.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(xr,100,50,50);
		g.setColor(Color.GREEN);
		g.fillOval(xg,250,50,50);
		g.setColor(Color.blue);
		g.fillOval(xb,400,50,50);
	}
	public void run()
	{
		while(true)
		{
		if(Thread.currentThread()==t1)	{
			synchronized(this)
			{
				xr++;
				if(xr==this.getWidth()-50)
				{
					try {
						wait();
					}
					catch(Exception e)
					{}
					}
				}
			try {
				Thread.sleep(20);
			}
			catch(InterruptedException e) { }
		}
			else if(Thread.currentThread()==t2)	{
				xg++;
			synchronized(this)
				{
			if(xg==this.getWidth()-50)
					{
						try {
							wait();
						}
						catch(Exception e)
						{}
						}
					}
				try {
					Thread.sleep(40);
				}
				catch(InterruptedException e) {}
				}
			else if(Thread.currentThread()==t3)	{
				xb++;
			synchronized(this)
				{
			if(xb==this.getWidth()-50)
					{
				notifyAll();
				xr=xg=xb=0;
					}
				}
				try {
					Thread.sleep(60);
				}
				catch(InterruptedException e) {}
				}
			repaint();
			
			
		}
	}
}
public class Test6 {

	public static void main(String[] args) 
	{
		MovingCircle ms=new MovingCircle();
		ms.setSize(400,400);
		ms.setVisible(true);
		System.out.println("abc");
	}

}
