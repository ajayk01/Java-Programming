package P2;

public class Q {
	int n;
	Boolean valueset=false;
	synchronized int get(){
		while(!valueset)
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Interrupted Exception caught");
			}
			System.out.println("Got: "+n);
			
			valueset=false;
			notify();
			return n;
	}
	synchronized void put(int n){
		while(valueset)
			try{
				wait();
			}
			catch(InterruptedException e){
				System.out.println("Interrupted Exception caught");
			}
			this.n=n;
			valueset=true;
			System.out.println("Put: "+n);
			notify();
	}
}
