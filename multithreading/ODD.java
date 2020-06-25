package p;

public class ODD extends Thread {
	public void run(int a1){
		System.out.println("Odd Number="+a1+"\tCube value="+(a1*a1*a1));
	}
}
