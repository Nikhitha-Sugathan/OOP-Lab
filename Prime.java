import java.util.Scanner;
 class Prime
 {
   public static void main(String args[])
   { 
     int i,count=0;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter the number :");
     int n=in.nextInt();
     for(i=2;i<=n/2;++i)
     if(n%i==0)
     {
       count++;
       break;
     }
     if(count==0 && n!=1)
     {
       System.out.println(+n+" is a prime number");
     }
     else
     {
       System.out.println(+n+" is not a prime number");
     }
   }
 }

//output

//Enter the number :
//5
//5 is a prime number