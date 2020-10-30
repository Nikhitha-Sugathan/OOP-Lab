import java.io.*;
class Palindrome 
{
      public static void main(String[] args) 
   {
        int num = 121, rev = 0, rem, n;

        n = num;

        while( num != 0 )
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num  /= 10;
        }
        
        if (n == rev)
            System.out.println(n + " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }
}

//output

//121 is a palindrome.