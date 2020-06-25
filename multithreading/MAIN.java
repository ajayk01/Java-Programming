package p;

public class MAIN {
	public static void main(String args[]) {
		Mythread t=new Mythread();
		int i;
		for(i=0;i<4;i++){
			t.run();
		}
	}

}
