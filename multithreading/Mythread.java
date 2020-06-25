package p;

import java.util.Random;
public class Mythread extends Thread {
	public void run(){
		int a1;
		Random r=new Random();
		a1=r.nextInt(30);
		System.out.println("The random number is "+a1);
		if(a1%2==0){
			EVEN th1=new EVEN();
		
			th1.run(a1);
		}	
		else{
			ODD th2=new ODD();
			//th2.start();
			th2.run(a1);
		}	
	}
}