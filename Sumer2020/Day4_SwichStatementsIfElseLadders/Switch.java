package Day4_SwichStatementsIfElseLadders;
import java.util.Scanner;

/**
 * Write a description of class Switch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Switch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your symbol for the calculator");
        char symbol = sc.next().charAt(0);
        
        System.out.println("Enter first number");
        double input1 = sc.nextDouble();


        System.out.println("Enter second number");
        double input2 = sc.nextDouble();

        
        System.out.println("the answer is ");
        switch(symbol)
        {
            case '+': System.out.println(input1 + input2);
            break;
            
            case '-': System.out.println(input1 - input2);
            break;
            
            case '*': System.out.println(input1 * input2);
            break;
            
            case '/': System.out.println(input1 / input2);
            break;
            
            default: System.out.println("Incorrect input");
        }
    }
}
