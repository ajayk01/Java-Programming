package anglethread;
public class cos extends Thread {
	int d;
	cos(int a)
	{
		d=a;
		start();
	}
	public void run()
	{
	double r;
	double ds=Math.toRadians(d);
	r=Math.cos(ds);
	System.out.println("The cos valueis "+r);
	
	}
}
