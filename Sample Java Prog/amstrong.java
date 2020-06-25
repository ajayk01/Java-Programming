import java.util.*;
class amstrong
	{ 
	  public static void main(String args[])
	   { 
	      int n,i=0,sum=0,b;
	      System.out. println("Enter the digits");
	       Scanner in = new Scanner(System.in);
	       n = in.nextInt();
	       b=n;
	       while (n>0)
	        {
	          i=n%10;
	          sum=sum+(i*i*i);
	          n=n/10;
	          
	        }
	       if(sum==b)	       
	        System.out.println("The number is amstrong");
	      else
	        System.out.println("The number is not amstrong");
	       
	     }
	   }
