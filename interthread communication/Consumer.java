package P2;

public class Consumer implements Runnable {
	Q q;
	Consumer(Q q){
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run(){
		while(true){
			q.get();
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				
			}
		}
	}
}
