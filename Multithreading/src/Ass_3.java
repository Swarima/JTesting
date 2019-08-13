import java.awt.*;
class Circle1 extends Frame implements Runnable
{
	
	private Thread c1,c2;
	private int x,y;
public Circle1()
{
	x=100;
	y=100;
	c1=new Thread(this,"move");
	c2=new Thread(this,"cic");

	c1.start();
	c2.start();

}
public void run()
{
	while(true)
	{
		if(Thread.currentThread()==c1)
		{
			x++;
			if(x==this.getWidth())
			{
				x=0;
			}
			try
			{
				Thread.sleep(10);
			}
			
			catch(Exception e)
			{
				
			}
		}
	
		else if(Thread.currentThread()==c2)
		{
			x--;
			
			if(x==0)
			{
				x=this.getWidth();
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
public void paint(Graphics g)
{
	g.setColor(Color.GREEN);
	g.setFont(new Font("verdana",16,20));
	g.fillOval(x, y, 100,100);
}
	
}
public class Ass_3 {

	public static void main(String[] args) {
		Circle1 f1=new Circle1();
		 f1.setVisible(true);
		 f1.setSize(400,400);
		 System.out.println("hii");
		 
	}

}
