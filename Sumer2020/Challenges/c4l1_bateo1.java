package Challenges;
import java.util.Scanner;

/**
 * Welcome Coders of Earth. Today you will be making another calculator. This one more advanced
 * and better than the earlier one.
 *
 * Objective
 * Level 1
 * WAP that allows the user to add, subtract, multiply, or divide nubers infinitely until
 * they input the 's' to stop. This will look something like this
 *
 * O: Welcome to Mathinator my doofenshmirtz.
 * O: Start Calculating by entering numbers and symbols +,-,*,/,=
 * I: 2
 * I: +
 * I: 8
 * I: *
 * I: 2
 * I: =
 * O: 20
 *
 * Do the operations as they come. You dont have to follow PEMDAS for now.
 * Only the equal to sign outputs something.
 *
 * Level 2
 * Include a power function. The Caret sign '^' will serve as the power operator.
 *
 * Rules are the same as alway
 * 0. Indent your code correctly
 * 1. Have variable names that make sense
 * 2. Follow one convention systematically. If your brackets start on the next line as mine do, Do not change that
 * 3. Try to make the code as concise as possible. Not the least line numbers but logically, as simple as it can be
 * 4. Make the program funny or sarcastic bc why not.
 *
 **/

public class c4l1_bateo1
{

    /**
     * int i = sc.nextInt();
     *
     * double d = sc.nextDouble();
     *
     * char c = sc.next().charAt(0);
     **/
    //Your code goes herepackage Challenges;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        double total = 0;
        char symbol = 'a';
        System.out.println("Enter first number to begin");
        total = sc.nextDouble();
        while (symbol != 's')
        {
            System.out.println("Please enter an operator, or type s to stop");
            symbol =sc.next().charAt(0);
            if (symbol == 's')
            {
                System.out.println("Your total is " + total);
                System.exit(0);
            }
            System.out.println("Please enter a number");
            number = sc.nextDouble();
            switch (symbol)
            {
                case '+':
                total += number;
                break;
                
                case '-':
                total -= number;
                break;
                
                case '*':
                total *= number;
                break;
                
                case '/':
                total /= number;
                break;
                
                default:
                System.out.println("This is the first  prog Your total is " + total);
                System.exit(0);
            }
        }
    }
}