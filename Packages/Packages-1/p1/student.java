package p1;
import java.util.*;
public class student 
 {
   int roll_no;
   String name;
   Scanner n =new Scanner(System.in);
   
   void putdata()
   {
	   System.out.println("The name is "+name);
	   System.out.println("The Roll no  is "+roll_no);
   }
   student()
   {
	System.out.println("Enter The Roll no and Name");
	   roll_no = n.nextInt();
	   name = n.nextLine();
     }
 }
