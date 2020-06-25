package anglethread;

import java.util.Scanner;

public class MAIN {
	public static void main(String args[])
	{
		int d1,d2,d3;
		System.out.println("Enter the Degree for sin ");
		Scanner n =new Scanner(System.in);
		d1=n.nextInt();
		System.out.println("Enter the Degree for Cos ");
		d2=n.nextInt();
		System.out.println("Enter the Degree for Tan ");
		d3=n.nextInt();
		new sin(d1);
		new cos(d2);
		new tan(d3);
        n.close();

	}

}
