import java.util.Scanner;
class Factorial 
 {
   public static void main(String args[])
   {
     int f=1;
     Scanner in = new Scanner(System. in);
     System.out.println("Enter the value of n :");
     int n = in.nextInt();
     for(int i = 1; i <= n; i++)
     f = f*i;
     System.out.println("Factorial of the given number is "+f);
   }
 }

//output

//Enter the value of n :
//5
//Factorial of the given number is 120
