import java.util.*;
class strcount
{
public static void main (String args[])
{
 String t;
 int i,a=0,d=0,w=0,sp=0,j;
 Scanner s=new Scanner(System.in);
System.out.println("enter the string");
 t=s.nextLine();
 System.out.println("the length of string");
 i=t.length();
 System.out.println(""+i);
 for(j=0;j<i;j++)
 {
  char ch=t.charAt(j);
  if(Character.isLetter(ch))
  a++;
  else if(Character.isDigit(ch))
  d++;
  else if(Character.isSpace(ch))
  w++;
  else 
  sp++;
  }
 System.out.println("the no. of alphabet are"+a);
 System.out.println("the no. of digits are"+d);
 System.out.println("the no. of space are "+w);
 System.out.println("the no. of specialcase are "+sp);
 }
}
