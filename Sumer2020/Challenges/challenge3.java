package Challenges;

import java.util.Scanner;

public class challenge3
{
    /**
     *  You are still the owner of the shop. You are still making the cashier app.
     *  
     *  Level 1 (EZ Dubs)
     *      Write a program that will calculate the running total for the counter. Ask the user to enter product values (double) that
     *      you will then add up until you get the total. Assume you are making this app for the "5 items only" counter. The user will have exactly 5 items.
     *      
     *  Level 2 (EZ Dubs)
     *      Write a Program (WAP) that will calculate the the running total for as many items as the user wants. The user will enter "-1" (Integer) when they are done
     *      
     *  Level 3 (Kinda Hard)
     *      Combine the program you wrote for challenge 2 with Challenge 3 Level 2. 
     *      So you will have to ask the user for what day it is and then store the discount that will be applicable. 
     *      The discount for weekdays is 10 percent and the store is closed on weekends. This is the discount that will be applied then add your code
     *      for the runnng total. This will calculate the total cost. The last step will be to output the discount multiplied by the price.
     *      
     * Level 4 (God Mode)
     *      Go online and look up how to terminate a JAVA program using code. Then apply it. If the user enters a value that is unnacceptable like showing
     *      up on a weekend, then terminate the program then. Else, keep it going.
     *      
     * Rules
     *    1. Have variable names that make sense
     *    2. Follow one convention systematically. If your brackets start on the next line as mine do, Do not change that
     *    3. Try to make the code as concise as possible. Not the least line numbers but logically, as simple as it can be
     *    4. Make the program funny or sarcastic bc why not.
     *      
     *      
     *      
    **/

    //ANSWER STARTS HERE
    public static void main(String args)
    {
        Scanner sc = new Scanner(System.in);

        //loop for level 1
        //you want the while loop to run exactly 5 times. So we will initilaize a counter variable
            int counter = 1;
            double d = 0;
            double total = 0;

            while(counter <= 5)
            {
                System.out.println("Enter price");
                total += sc.nextDouble();
                
                counter++;
            }

        //loop for level 2
        //We have no idea how many times the user wants to run this. But we know that when they are done,
        //they will enter -1. So check if the inputted value is equal to -1

            while(true)
            {
                
            }
            
    }
}