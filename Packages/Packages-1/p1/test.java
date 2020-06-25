package p1;
import java.util.*;
public class test extends student
{
	 Scanner n=new Scanner(System.in);
	 public int t1,t2;
	test()
	 {
		 System.out.println("Enter The test mark for 2 subjects");
		 t1=n.nextInt();
		 t2=n.nextInt();
	 }
	 void putdata()
	 {
		 super.putdata();
		 System.out.println("The 1st subject mark is"+t1);
		 System.out.println("The 2st subject mark is"+t2);
	 }
}
