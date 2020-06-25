package aj06;
import java.util.*;
abstract class s1 implements stack   
{      
       int a[]=new int[10];
	int top=-1;
       int b; 
	Scanner n=new Scanner(System.in);
  	 public void push()
           {
	     if(top==10)
		    System.out.println("The stack is full");
                  
	     else 
		{
		   System.out.println("Enter the element to be pushed");
                  b=n.nextInt(); 
                  a[++top]=b;
               }
           }
 	public void pop()
             {
		if(top==-1)
	           System.out.println("The stack is Empty");
	       else
              System.out.println("The poped element is " + a[top--]);
            }
 }