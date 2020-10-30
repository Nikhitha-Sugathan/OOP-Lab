import java.util.Scanner;
class Factor
{

  public static void main(String[] args)
   {
    Scanner in = new Scanner(System. in);
    System.out.println("Enter the number :");
    int n = in.nextInt();
    System.out.print("Factors of " + n + " are: ");
    
    for (int i = 1; i <= n; ++i)
     {
       if (n % i == 0)
        {
          System.out.print(i + " ");
        }
     }
  }
}

//output

//Enter the number :
//20
//Factors of 20 are: 1 2 4 5 10 20 