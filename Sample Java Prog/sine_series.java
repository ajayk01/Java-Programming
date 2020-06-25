import java.util.*;
class FactorialExample{  
 public static void main(String args[]){  
  int i,fact=1,n,sum=0;
  System.out.println("Enter the limit");
    Scanner in = new Scanner(System.in);
	     n = in.nextInt();
     while(n>0)  
       {
       	fact=1;
  for(i=1;i<=n;i++){    
      fact=fact*i;
         
  }    
    sum=sum+fact;
    n--;
    }
  System.out.println("the series is: "+ sum);    
   
  }
  }
