package p1;
import p2.sport;
import java.util.*;
public class result  extends test implements sport
{
   int tot,a;
   Scanner n=new Scanner(System.in);
   result()
   {
	  
   }
   public void get()
   {
	   System.out.println("Enter The Sport weight");
	   a=n.nextInt();
   }
   public void put()
   {
	   System.out.println("The Sport weight"+a);
   }
   public void putdata()
   {
	   super.putdata();
	   tot=t1+t2;
	   System.out.println("The total marks of the two subject mark is "+tot);
   }
}
