package Challenges;

import java.util.Scanner;
public class c2_bobini
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

           //int i = sc.nextInt();
           //double d = sc.nextDouble();
           //char c = sc.next().charAt(0);
       
        double price;
        char day;
        char discount;
        String statement = "";
       
       
   
        System.out.println("enter the day as in M, T, W, H, F, A, U respectively for the days of the week");
        day = sc.next().charAt(0);
       
        System.out.println("enter price of item they want to buy");
        price = sc.nextDouble();
       
       
       
        switch (day)
        {
            case 'M':
            price = price * .95;
            statement = ". You got a 5% discount";
            break;
           
            case 'T':
            price = price * .90;
            statement = ". You got a 10% discount";
            break;
           
            case 'W':
            price = price * .85;
            statement = ". You got a 15% discount";
            break;
           
            case 'H':
            price = price * .80;
            statement = ". You got a 20% discount";
            break;
           
            case 'F':
            price = price * .75;
            statement = ". You got a 25% discount";
            break;
           
            case 'A':
            statement = "either you're lying or a thief because the store is supposed to be closed";
            break;
           
            case 'U':
            statement = "either you're lying or a thief because the store is supposed to be closed";
            break;
        }
       
        
        if ( statement == "either you're lying or a thief because the store is supposed to be closed")
        {
            System.out.println(statement);
        }
        else{
        System.out.println("are you a graduating senior or employee? Enter Y or N");
        discount = sc.next().charAt(0);
       
        if (discount =='Y')
        {
            System.out.println("PV or Bett? Enter P or B.");
            if (sc.next().charAt(0) == 'P')
            {
                price = price * .95;
            }
           
            else if (sc.next().charAt(0) == 'B')
            {
                price = price * 1.05;
            }
           
            else
            {
                price = price;
            }
        }
        else
        {
            price = price;
        }
       
        System.out.println("Your total is " + price + statement);
    }
    }
}