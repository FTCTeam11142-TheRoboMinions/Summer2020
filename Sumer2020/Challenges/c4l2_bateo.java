package Challenges;
import java.util.*;


class c4l2_bateo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        double total = 0;
        char symbol = 'a';
        int counter = 1;
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
                
                case '^':
                while (counter < number-1)        //5 = total ^= symbol  3=number
                {
                    total *= total;
                    counter++;
                }
                break;
                
                default:
                System.out.println("Your total is " + total);
                System.exit(0);
            }
        }
    }
}