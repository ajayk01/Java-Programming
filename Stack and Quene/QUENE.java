import java.util.*;
  class quene
    {
	int a[]=new int[10];
	int front,rear,b;
	quene()
	 {
	   front=rear=-1;
	 }
    
   	void enquene(int b)
           {
	     if(front==10)
		    System.out.println("The stack is full");
                   
	     else 
               a[++front]=b;
            }
  	void dequene()
              {
		if(rear==front)
	           System.out.println("The stack is Empty");
	       else
               System.out.println("The removed element is " + a[rear++]);
             }
       void display()
            {
             rear++;
             int f=rear;
	     if(rear==front)
	           System.out.println("The stack is Empty");
                
	     else 
                {
                   System.out.println("The elements are");
                    while(f<=front)
                       {
                         System.out.println(a[f]);
                          f++;
	 		}
		 }
            }
    }


  class QUENE
	{
	   public static void main(String args[])
                 {
		     quene s;
                     s = new quene();
		     int b,ch,c=1;
                     Scanner n=new Scanner(System.in);
		     
		     while(c>0)
			{
			  System.out.println("Enter the choice \n 1.enquene \n 2.dequene \n 3.display ");
                          
			  ch=n.nextInt();
                          switch(ch)
			    {
				case 1 : System.out.println("Enter the element to be added");
                                         b=n.nextInt(); 
					 s.enquene(b);
					 break;
				case 2 : s.dequene();
                                       
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
