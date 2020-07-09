package Challenges;

import java.util.Scanner;

public class c4_showbhini
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double input1 = 0;
        double input2 = 0;
        double answer = 0;
        char symbol = 0;
       
        System.out.println("Welcome to the corona calculator! Use this calculator to kill time in quarantine. Press = to total your expression or 's' for when you get sick of math!");
        System.out.println("Enter your first number: ");
        input1 = sc.nextDouble();
       
        while (symbol != '=')
        {

        System.out.println("enter a symbol: +, -, *, /, ^, or = when you're done.");
        symbol = sc.next().charAt(0);
       
        if (symbol == '=')
        {
            System.out.println(answer);
            System.exit(0);
        }
       
        System.out.println("Enter your next number: ");
        input2 = sc.nextDouble();
       
        switch(symbol)
        {
            case '+' : answer = input1 + input2;
            break;
           
            case '-' : answer = input1 - input2;
            break;
           
            case '*' : answer = input1 * input2;
            break;
           
            case '/' : answer = input1 / input2;
            break;
           
            case '^' : answer = (int)Math.pow(input1, input2);
            break;
           
            default: System.out.println("wrong input bruh");
        }
       
        input1 = answer;
       
        }
    }
}