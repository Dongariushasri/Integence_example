import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorialvalue = calculateFact(n);
        System.out.println(factorialvalue);
    }
    public static int calculateFact(int n)
    {
       if(n==0 || n==1)
       {
           return 1;
       }
       else
       {
          return n* calculateFact(n-1);
       }
    }

}
