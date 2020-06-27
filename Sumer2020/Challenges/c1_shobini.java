package Challenges;


import java.util.Scanner;
public class c1_shobini
{
    // Make a Calculator
    // O: Please enter the symbol for the operation you want to do
    // I: +-*/
    // O: Enter two numbers so that we can perform this operation
    // I: 2
    // I: 2
    // O: 4
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        /**
         *                int i = sc.nextInt();
         *                
         *                double d = sc.nextDouble(); 
        **/
        //Your code goes here
        double input1;
        double input2;
        double answer;
        String symbol;
        
        System.out.println("Please enter the symbol for the operation you want to do");
        symbol = sc.next();
        
        
        System.out.println("First Number");
        input1 = sc.nextDouble();
        
        System.out.println("Second Number");
        input2 = sc.nextDouble();
        
        if (symbol.equals("+"))
        {
            answer = input1 + input2;
            System.out.println(answer);
        }
      
        else if (symbol.equals ("-"))
        {
            answer = input1 - input2;
            System.out.println(answer);
        }
        
        else if (symbol.equals ("*"))
        {
            answer = input1 * input2;
            System.out.println(answer);
        }
        
        else if (symbol.equals ("/"))
        {
            answer = input1 / input2;
            System.out.println(answer);
        }
        
        else 
        {
            System.out.println("wrong symbol");
        }
        
   
}
}