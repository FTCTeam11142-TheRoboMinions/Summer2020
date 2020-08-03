package challenge7;
import java.util.Scanner;

public class challenge7
{



    //static int counter = 0; //lol i need help with this
    public static void main(String args[])
    {
        teamName();
        teamNumber();
        moveSkystone();
        autoPark();
        blocksDelivered();
        blocksStacked();
        moveFoundation();
        cap();
        endgamePark();
    }


    //teaminfo
    public static String teamName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter team name");
        return sc.nextLine();
    }

    public static int teamNumber()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter team number");
        return sc.nextInt();
    }

    //autonomous
    public static int moveSkystone()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many skystones can you move in auto?");
        return sc.nextInt();
    }

    public static char autoPark()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("In auto, park Quarry (Q) or Wall (W)");
        return sc.next().charAt(0);
    }

    //teleop
    public static int blocksDelivered()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many skystones can you deliver in teleop?");
        return sc.nextInt();
    }

    public static int blocksStacked()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many skystones can you stack in teleop?");
        return sc.nextInt();
    }

    //endgame
    public static char moveFoundation()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you move foundation? Enter Y or N");
        return sc.next().charAt(0);
    }

    public static char cap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you cap? Enter Y or N");
        return sc.next().charAt(0);
    }

    public static char endgamePark()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you park in endgame? Enter Y or N");
        return sc.next().charAt(0);
    }

    //counter
    /*public void increment()
    {
        counter++;
    }
*/

}

