package anglethread;
public class sin extends Thread {
	int d;
	sin(int a)
	{
		d=a;
		start();
	}
	public void run()
	{
	double r;
	double ds=Math.toRadians(d);
	r=Math.sin(ds);
	System.out.println("The sin valueis "+r);
	}

}
