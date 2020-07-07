package Day6_While_For_DoWhile;

public class Looooops
{
    public static void main(String args[])
    {
        int counter = 1;
        int b = 1;
        int sum = 0;
        
        while(counter <= 5)      //while loop that runs 5 times
        {
            System.out.println("While loop");
            System.out.println(counter);
            counter++;
        }
        
        for(counter = 1; counter <= 5; counter++)
        {
            System.out.println("For loop");
            System.out.println(counter);
        }
        
        counter = 1;
        do
        {
            System.out.println("DO_While loop");
            System.out.println(counter++);            
        }while(counter <6);
    }
}