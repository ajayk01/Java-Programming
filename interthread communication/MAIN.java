package P2;

public class MAIN {

	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			
		}
		new Consumer(q);
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			
		}
	}
}
