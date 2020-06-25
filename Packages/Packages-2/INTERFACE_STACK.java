package aj06;
import java.util.*;
public class INTERFACE_STACK {
	public static void main(String args[])
    {  
        stack so1 = new s2();
        int ch,c=1;
        Scanner n=new Scanner(System.in);
 do
{
 System.out.println("Enter the choice \n 1.Push \n 2.Pop \n 3.display ");
             
 ch=n.nextInt();
             switch(ch)
   {
	case 1 :
		 so1.push();
		 break;
	case 2 : so1.pop();
                          	 break;
	case 3 : so1.display();
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
