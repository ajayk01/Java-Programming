package P2;

public class Producer implements Runnable {
	Q q;
	Producer(Q q){
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run(){
		int i=0;
		while(true){
			q.put(i++);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				
			}
		}
	}
}