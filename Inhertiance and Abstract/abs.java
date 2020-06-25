import java.util.*;
 abstract class shape 
  {
   int l,b;
   void printarea(int x,int y){ }
  }
 
class rectangle extends shape 
  { 
    void printarea(int i,int j)
     {
       System.out.println(" The area of the Rectangle is : "+i*j);
     }
  }

class triangle extends shape 
  { 
    void printarea(int i,int j)
     {
       System.out.println(" The area of the Triangle is : "+0.5*i*j);
     }
  }
class abs
  {
     public static void main(String args[])
        {
           int a,b;
           Scanner in = new Scanner(System.in);
	   System.out.println(" Enter the length and the breath");
           a=in.nextInt();
           b=in.nextInt();
	   rectangle r = new rectangle();
	   triangle t = new triangle();
 	   r.printarea(a,b);
	   t.printarea(a,b);
        }
   }
