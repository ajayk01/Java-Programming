package aj06;

class s2  extends s1 implements stack{
    public void display()
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