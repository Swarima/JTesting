import java.awt.*;
class MovingClass extends Frame implements Runnable
{
	private Thread t1,t2;
	private int x1,x2;
	public MovingClass()
	{
		x1=100;
		x2=200;
		t1=new Thread(this,"zensar");
		t2=new Thread(this,"techno");
		t1.start();
		t2.start();
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.setFont(new Font("verdana",16,20));
		g.drawString(" zensar", x1, 100);
		g.drawString(" technologies", x2, 100);
	}
	
	public void run()
	{
		while(true)
		{
			if(Thread.currentThread()==t1)
			{
				x1++;
				if(x1==this.getWidth())
				{
					x1=0;
				}
				try
				{
					Thread.sleep(10);
				}
				
				catch(Exception e)
				{
					
				}
			}
			else if(Thread.currentThread()==t2)
			{
				x2--;
				
				if(x2==0)
				{
					x2=this.getWidth();
				}
				try
				{
					Thread.sleep(10);
				}
				
				catch(Exception e)
				{
					
				}
			}
			repaint();
		}
	}
}
	


public class Awt1 {
	
	public static void main(String[] args) {
	
 MovingClass fr=new MovingClass();
 fr.setVisible(true);
 fr.setSize(400,400);
 System.out.println("bontey");
	}

}

