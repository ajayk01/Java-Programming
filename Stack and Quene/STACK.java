import java.util.*;
  class stack
    {
	int a[]=new int[10];
	int top,b;
	stack()
	 {
	   top=-1;
	 }
    
   	void push(int b)
           {
	     if(top==10)
		    System.out.println("The stack is full");
                   
	     else 
               a[++top]=b;
            }
  	void pop()
              {
		if(top==-1)
	           System.out.println("The stack is Empty");
	       else
               System.out.println("The poped element is " + a[top--]);
             }
       void display()
            {
             int f=top;
	     if(f==-1)
	           System.out.println("The stack is Empty");
                
	     else 
                {
                   System.out.println("The elements are");
                    while(f>=0)
                       {
                         System.out.println(a[f]);
                          f--;
	 		}
		 }
            }
    }


  class STACK
	{
	   public static void main(String args[])
                 {
		     stack s;
                     s = new stack();
		     int b,ch,c=1;
                     Scanner n=new Scanner(System.in);
		      
		      do
			{
			  System.out.println("Enter the choice \n 1.Push \n 2.Pop \n 3.display ");
                          
			  ch=n.nextInt();
                          switch(ch)
			    {
				case 1 : System.out.println("Enter the element to be pushed");
                                         b=n.nextInt(); 
					 s.push(b);
					 break;
				case 2 : s.pop();
                                       
					 break;
				case 3 : s.display();
					 break;
				case 4 : System.out.println("Thank you");
				         break;
                                          
			        default :System.out.println("Enter the valid number");
                            }
		     System.out.println("1.continue \n 0.exit");
		     c=n.nextInt();
                    }while(c==1);
                }
        }
