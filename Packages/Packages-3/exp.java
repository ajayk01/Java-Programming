package java07;
import java.util.*;
public class exception 
{
   public static void main(String args[])
   {
	  while(true)
	  {
		  System.out.println("Enter the option 1.Arithmetic Exception\n 2.Array IndexOut Of Bounds Exception\n 3.Negative Array Size Exception\n 4.Exit");
		  Scanner z = new Scanner(System.in);
		  int v=z.nextInt();

	 switch(v) 
	    {
	 case 1:  try{
	    
             int a,b;
             System.out.println("Enter the value for b");
             Scanner n = new Scanner(System.in);
             a=n.nextInt();
             b=43/a;
             System.out.println("The value is"+b);
             n.close();
	      }
	   catch(ArithmeticException e)
	   {
	    	System.out.println("The value of a is zero"+e);
	   }break;
	   
	 case 2:   try{
		   int a[]={1,2,3,4,5,6},b;
		   System.out.println("Enter the value to be printed :");
		   Scanner n = new Scanner(System.in);
		   b=n.nextInt();
		   System.out.println("The value is "+a[b]);
		   n.close();
	       }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
	    	System.out.println("The value of b is not in the array memory");
	   }break;
case 3:  try
	     {
		  int b,d;
		  System.out.println("Enter the no of elements:");
		  Scanner n = new Scanner(System.in);
		  b=n.nextInt();
		  int a[]=new int[b];
		  if(b<0)
		     throw new NegativeArraySizeException("b");
		  System.out.println("Enter the no of elements:");
		  for(int i=0;i<=b;i++)
		  {
			  a[i]=n.nextInt();
			  if(i>b)
			  throw new ArrayIndexOutOfBoundsException("i");
		  }
		  for(int i=0;i<b;i++)
		  {
			 System.out.println(a[i]);
			  if(i>b)
			  throw new ArrayIndexOutOfBoundsException("i");
		  }
		  n.close();
	     }
	    catch(NegativeArraySizeException b)
	      {
	    	System.out.println("The Entered array size is negative"+b);
	      }
	   catch(ArrayIndexOutOfBoundsException i)
        {
    	System.out.println("The Entered array size is negative"+i);
        }
       break;
case 4: System.exit(0);
	}
	  }
   }
}

