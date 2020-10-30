//program to print 10 fibonacci numbers
import java.util.Scanner;
class Fibonacci 
{
  public static void main(String[] args)
   {
     int n1 = 0, n2 = 1, n3;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter the value of n :");
     int n = in.nextInt();
     System.out.print("First " + n + " terms: ");
    for (int i = 1; i <= n; ++i)
    {
      System.out.print(n1 + " ");
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
    }
   }
}

//output

//Enter the value of n :
//10
//First 10 terms: 0 1 1 2 3 5 8 13 21 34 