package anglethread;

public class tan extends Thread {
	int d;
	tan(int a)
	{
		d=a;
		start();
	}
	public void run()
	{
	double r;
	double ds=Math.toRadians(d);
	r=Math.cos(ds);
	System.out.println("The Tan value is "+r);
     }
}
