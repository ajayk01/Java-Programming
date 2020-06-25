import java.util.*;
class sum
	{ 
	  public static void main(String args[])
	   { 
	      int n,i=0,sum=0;
	      System.out. println("Enter the digits");
	       Scanner in = new Scanner(System.in);
	       n = in.nextInt();
	       
	       while (n>0)
	        {
	          i=n%10;
	          n=n/10;
	          sum=sum+i;
	       
                 }	       
	      System.out.println("The sum of the digits  is  "+sum);
	     }
	   }
