  import java.util.*;
  public class prime {

 public static void main(String[] args) {

  int num , count;
  Scanner n=new Scanner(System.in);
  num=n.nextInt();
  for (int i = 1; i <= num; i++)
     {
     count = 0;
      for (int j = 2; j <= i / 2; j++) 
      {
     if (i % j == 0)
      {
     count++;
     break;
    }
   }

   if (count == 0) {
    System.out.println(i);
   }

  }
 }
}
