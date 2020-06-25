import java.util.*;       
 class primefactor{ 
 	         static void even(int a)
 	          {
           		if((a%2==0)&&(a%a==0))
           		   {
              		System.out.println("2");
              		a=a/2;
               	   even(a);
              		}
              	 else
              	 {
              	 	if(a%2==0)
               		System.out.println(a);
               		else 
               	      odd(a);
               	}
              	 
           	}
           	static void odd(int a)
 	          {
           		if((a%3==0)&&(a%a==0))
           		   {
              		System.out.println("3");
              		a=a/3;
               	  odd(a);
              		}
              	 else
              	 {
              	 	if(a%2==0)
              	 	even(a);
              	 	else
               		System.out.println(a);
               	}
              	 
           	}
 	         public static void main(String args[])
               {
               	
           int i,m=0,flag=0,n,b;
           System.out. println("Enter the number");
	       Scanner in = new Scanner(System.in);
	       n = in.nextInt();
	       if(n%2==0)
	         {
               b=n/2;
	           System.out.println("2");
               even(b);  
          } 
          else
          {
          	m=n/3;
          	System.out.println("3");
          }   odd(m);
      } 
        
    }   


   
