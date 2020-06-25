import java.util.*;
class factorial
	{ 
	  public static void main(String args[])
	   { 
	       int n,i=0,sum=1;
	       System.out.println("Enter the nth number of the factorial");
	       Scanner in = new Scanner(System.in);
	       n = in.nextInt();
	       while(n>0)
	        {
	          sum=sum*n;
	          n--;
	        }
	       System.out.println("The factorial of the number is "+sum);
	   }
	 }
	       
	       
