package Challenges;

import java.util.Scanner;

public class c5_Shobini
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        char operation = 0;
        System.out.println("Enter digit 1-5");
        System.out.println(" 1. Degrees to Radians Converter 2. Radians to Degrees Converter 3. Law of Cosines Calculator given 2 sides and an angle 4. Polar to Rectangular Converter 5. Rectangular to Polar Converter ");

        operation = sc.next().charAt(0);

        //case 1
        double angle = 0;

        //case 2
        double side1 = 0;
        double side2 = 0;
        double ang = 0;  //included angle

        //case3
        double r = 0;
        double theta = 0;

        //case 4
        double x = 0;
        double y = 0;


        switch(operation)
        {
            //degrees to radians
            case '1' :
                System.out.println("Enter angle in degrees");
                angle = sc.nextDouble();
                System.out.println("Angle in radians is " + Math.toRadians(angle));
                break;

            //radians to degrees
            case '2' :
                System.out.println("Enter angle in radians");
                angle = sc.nextDouble();
                System.out.println("Angle in degrees is " + Math.toDegrees(angle));
                break;

            //law of cosines
            case '3' :
                System.out.println("Enter side 1");
                side1 = sc.nextDouble();

                System.out.println("Enter side 2");
                side2 = sc.nextDouble();

                System.out.println("Enter angle");
                side2 = sc.nextDouble();

                System.out.println((Math.pow(side1, 2) + Math.pow(side2, 2)) - Math.cos(ang));
                break;

            //polar to rectangular
            case '4' :
                System.out.println("Enter r");
                r = sc.nextDouble();

                System.out.println("Enter theta");
                theta = sc.nextDouble();

                System.out.println("x = " + (r * Math.cos(theta)));
                System.out.println("y = " + (r * Math.sin(theta)));
                break;

            //rect to polar
            case '5' :
                System.out.println("Enter x coordinate");
                x = sc.nextDouble();

                System.out.println("Enter y coordinate");
                y = sc.nextDouble();

                System.out.println("r is " + Math.hypot(x, y));
                System.out.println("theta is " + Math.atan2(x, y));
                break;

            default: System.out.println("Incorrect Input");
        }
    }
}