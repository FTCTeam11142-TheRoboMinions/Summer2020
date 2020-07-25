import java.util.Scanner;
public class challenge6
{
    public static char day;

    public static void main(String args[])
    {
        double cost = discount(checkDay());
        double sum = sum();
        finalTotal(cost,sum);


    }

    public static boolean checkDay()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week: M, T, W, H, F, A, U");
        day = sc.next().charAt(0);
        boolean check = true;
        if(day == 'A' || day == 'U')
        {
            check = false;
        }
        return check;
    }

    public static double discount(boolean c)
    {
        double discount = 0;
        if(c=true) {

            switch (day) {
                case 'M':
                    discount = .95;
                    break;

                case 'T':
                    discount = .90;
                    break;

                case 'W':
                    discount = .85;
                    break;

                case 'H':
                    discount = .80;
                    break;

                case 'F':
                    discount = .75;
                    break;
            }
        }
        else
        {
            System.out.println("u suck");
            System.exit(0);
        }
        return discount;
    }

    public static double sum()
    {
        double itemInput = 0;
        double total = 0;
        Scanner sc = new Scanner(System.in);

        while (itemInput != -1)
        {
            System.out.println("Enter price of each item. Once you have finished, enter -1.");
            itemInput = sc.nextDouble();
            if (itemInput == -1)
            {
                break;

            }

            total += itemInput;
            System.out.println("Your total is " + total);

        }
        return total;
    }

    public static void finalTotal(double d, double t)
    {

        System.out.println(d * t);
    }



}
