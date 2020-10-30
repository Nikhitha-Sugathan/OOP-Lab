import java.util.Scanner;
 class OddEven
 {
   public static void main(String args[])
   {
     Scanner in=new Scanner(System.in); 
     System.out.println("Enter the number:");
     int n=in.nextInt();
     if(n%2==0)
     {
       System.out.println(+n+" is even");
     }
     else
     {
       System.out.println(+n+" is odd");
     }
   }
 }

//output

//Enter the number:
//10
//10 is even