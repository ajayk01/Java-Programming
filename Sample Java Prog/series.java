import java.util.*;
public class series {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        Scanner in = new Scanner(System.in);
	     n = in.nextInt();
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1+"+");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            
        }
    }
}
	       
	       