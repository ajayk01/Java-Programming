package p1;

import java.util.Scanner;

public class hybrid 
{
public static void main(String[] args)
  {
	  int p;
	  Scanner l = new Scanner(System.in);
	  System.out.println("Enter the no.of students");
	  p=l.nextInt();
	  result b[] = new result[p];
	  for(int i=0;i<p;i++)
	  {
		  System.out.println("Enter the details for the student"+i);
		  b[i] =new result(); 
 		  b[i].get();
		  b[i].put();
		  b[i].putdata();
	  }
	  l.close();
  }
}
