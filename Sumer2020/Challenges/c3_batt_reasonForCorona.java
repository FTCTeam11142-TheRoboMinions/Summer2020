package Challenges;

import java.util.*;

class c3_batt_reasonForCorona
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double item1 = 0;
        double item2 = 0;
        double item3 = 0;
        double item4 = 0;
        double item5 = 0;
        double total = 0;
        
        System.out.println("Please enter first item");
        item1 = sc.nextDouble();
        total += item1;
        System.out.println("Your current total is " + total);

        System.out.println("Please enter second item");
        item2 = sc.nextDouble();
        total += item2;
        System.out.println("Your current total is " + total);

        System.out.println("Please enter third item");
        item3 = sc.nextDouble();
        total += item3;
        System.out.println("Your current total is " + total);

        System.out.println("Please enter fourth item");
        item4 = sc.nextDouble();
        total += item4;
        System.out.println("Your current total is " + total);

        System.out.println("Please enter final item");
        item5 = sc.nextDouble();
        total += item5;
        System.out.println("Your total is " + total);
    }
}


class Challenge3Level2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double item = 0;
        double total = 0;
        System.out.println("Please enter first item to begin");
        item = sc.nextDouble();
        total += item;
        System.out.println("Your current total is " + total);
        while (item != -1)
        {
            System.out.println("Enter next item, or type -1 to finish");
            item = sc.nextDouble();
            total += item;
            System.out.println("Your current total is " + total);
        }
        System.out.println("Your final total is " + total);
    }
}

class Challenge3Level3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double discount = 1.00;
        double item = 0;
        double total = 0;
        char bulldog = 'N';
        System.out.println("Welcome to the Krusty Krab, please enter the date: M, T, W, H, F, A, U");
        char date = sc.next().charAt(0);
        switch(date)
        {
            case 'A': System.out.println("Nope");
            break;
            case 'U': System.out.println("False");
            break;
            case 'M': discount -= .1;
            break;
            case 'T': discount -= .1;
            break;
            case 'W': discount -= .1;
            break;
            case 'H': discount -= .1;
            break;
            case 'F': discount -= .1;
            break;
            default: System.out.println("That's not a day of the week, no daily discount for you pal");
        }
        System.out.println("Please enter first item to begin");
        item = sc.nextDouble();
        total += item;
        System.out.println("Your current total is " + total);
        while (item != -1)
        {
            System.out.println("Enter next item, or type -1 to finish");
            item = sc.nextDouble();
            total += item;
            System.out.println("Your current total is " + total);
        }

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
        total *= discount;
        System.out.println("Your final total is " + total);
    }
}

class Challenge3Level4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double discount = 1.00;
        double item = 0;
        double total = 0;
        char bulldog = 'N';
        System.out.println("Welcome to the Krusty Krab, please enter the date: M, T, W, H, F, A, U");
        char date = sc.next().charAt(0);
        switch(date)
        {
            case 'A': System.out.println("Nope");
            System.exit(0);
            break;
            case 'U': System.out.println("False");
            System.exit(0);
            break;
            case 'M': discount -= .1;
            break;
            case 'T': discount -= .1;
            break;
            case 'W': discount -= .1;
            break;
            case 'H': discount -= .1;
            break;
            case 'F': discount -= .1;
            break;
            default: System.out.println("That's not a day of the week, no daily discount for you pal");
        }
        System.out.println("Please enter first item to begin");
        item = sc.nextDouble();
        total += item;
        System.out.println("Your current total is " + total);
        while (item != -1)
        {
            System.out.println("Enter next item, or type -1 to finish");
            item = sc.nextDouble();
            total += item;
            System.out.println("Your current total is " + total);
        }

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
        total *= discount;
        System.out.println("Your final total is " + total);
    }
}