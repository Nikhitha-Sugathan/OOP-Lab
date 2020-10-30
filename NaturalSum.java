//Sum of first n natural numbers
import java.util.Scanner;
 class NaturalSum
 {
   public static void main(String args[])
   { 
    int sum=0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of n :");
    int n = input.nextInt();
    for(int i=0;i<n;i++)
    {
      sum=sum+i;
    }
    System.out.println("Sum of first "+n+" natural numbers = "+sum);
   }
 }

//output

//Enter the value of n :
//5
//Sum of first 5 natural numbers = 10