import java.util.*;
class padalindrome
	{ 
	  public static void main(String args[])
	   { 
	      int n,i=0,sum=0,a;
	      System.out. println("Enter the number to be checked wheather it is padalindrome or not");
	       Scanner in = new Scanner(System.in);
	       n = in.nextInt();
	       a=n;
	       while (n>0)
	        {
	          i=n%10;
	          n=n/10;
	          sum=sum*10+i;
	       
                 }	       
	      System.out.println("The reversed number is  "+sum);
	        if(a==sum)
	          
	             System.out.println("The number is padalindrome");
	          else 
	            System.out.println("The number is not a padalindrome");  
	     }
	   }
