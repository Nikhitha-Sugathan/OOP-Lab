import java.io.*;
class ArmstrongExample
{
   public static void main(String[] args) 
    {  
      int arm = 0,num = 153,temp;    
      temp = num;  
      while(num > 0)  
      {  
        arm = arm + (num % 10) * (num % 10) * (num % 10); 
        num = num / 10; 
      }  
      if(arm == temp)  
    System.out.println(temp + " is an armstrong number");   
    else  
        System.out.println(temp + " is not an armstrong number");   
   }  
}  

//output

//153 is an armstrong number