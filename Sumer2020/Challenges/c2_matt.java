package Challenges;

import java.util.*;

public class c2_matt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double discount = 1.00;
        char bulldog = 'N';
        System.out.println("Welcome to the Krusty Krab, please enter the date: M, T, W, H, F, A, U");
        char date = sc.next().charAt(0);
        switch(date)
        {
            case 'A': System.out.println("Nope");
            break;
            case 'U': System.out.println("False");
            break;
            case 'M': discount -= .0500;
            break;
            case 'T': discount -= .100;
            break;
            case 'W': discount -= .1500;
            break;
            case 'H': discount -= .200;
            break;
            case 'F': discount -= .2500;
            break;
            default: System.out.println("That's not a day of the week pal");
        }

        System.out.println("Enter item Price");
        double price = sc.nextDouble();

        System.out.println("Are you a previous employee or a graduating senior from Pleasant Valley High School? Enter Y or N");
        char grad = sc.next().charAt(0);

        if (grad == 'Y')
        {
            discount -= .05;
        }
        else if(grad == 'N')
        {
            System.out.println("Are you a graduating senior from Bettendorf High School? Enter Y or N");
            bulldog = sc.next().charAt(0);
        }
        else
        {
            bulldog = 'N';
        }
        switch(bulldog)
        {
            case 'Y': discount += 0.05;
            break;
            case 'N':
            break;
            default: System.out.println("Ambiguous does not look good on you");
        }
        System.out.println("Your total is");
        System.out.println(price * discount);
    }
}