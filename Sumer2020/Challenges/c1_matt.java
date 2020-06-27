package Challenges;

import java.util.Scanner;

public class c1_matt
{
    public static void main(String args[])
    {
        double answer = 0;
        Scanner sc = new Scanner(System.in);

        //Your code goes here
        System.out.println("Enter first number");

        double a = sc.nextDouble();

        System.out.println("Please enter the symbol for the operation you want to do");
        //To ask the user for input copy relevant datatype

        char f = sc.next().charAt(0);

        System.out.println("Enter second number");

        double b = sc.nextDouble();

        if (f == '+')
        {
            answer = a+b;

            System.out.println(answer);
        }
        if (f == '-')
        {
            answer = a-b;

            System.out.println(answer);
        }
        if (f == '/')
        {
            answer = a/b;

            System.out.println(answer);
        }
        if (f == '*')
        {
            answer = a*b;

            System.out.println(answer);
        }
    }
}