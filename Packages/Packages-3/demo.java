package java07;
import java.util.*;
class demo extends Exception
{
		public demo(int c) {
		System.out.println("The ented roll no is"+c);
	}
	static void roll(int c) throws demo
	{
			if(c>30)
			throw new demo(c);
			else
			{
				String s;
				System.out.println("Enter the name");
				Scanner n=new Scanner(System.in);
				s=n.nextLine();
				if(c>10)
				System.out.println(" The Roll no is 18itr0"+c);
				else
				System.out.println("The Roll no is 18itr00"+c);
				System.out.println("The name is "+s);
			}
    }
	public static void main(String args[])
	{
	try {
		int b;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the Rollno");
		b=n.nextInt();
		roll(b);
		n.close();
	  }
	catch (demo c)
	{
		System.out.println("The enter roll no is invalid "+c);
	}
  }
	
}
