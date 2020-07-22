package Day11_Classes;


public class Robot
{
    int noOfWheels = 4;

    double radiusOfWheels;
    double eventPerRev;

    Robot(int wheels, double radius, double events)
    {
        noOfWheels = wheels;

        radiusOfWheels = radius;
        eventPerRev = events;
    }

    void moveX(double distance, double power)
    {

    }

    int inchesToCounts(double inches)
    {
        //wheel specification
        final double Servocity_Omnni_Circumference = Math.PI * 4;
        final double GoBuilda_YJ_435_eventsPerRev = 383.6;
        final double COUNTS_PER_REVOLUTION = GoBuilda_YJ_435_eventsPerRev / Servocity_Omnni_Circumference;

        return (int) (COUNTS_PER_REVOLUTION * inches);
    }

    void agagaga(boolean open)
    {
        if(open==true)
        {
            //servo.setPosition(1);
        }
        else
        {
            //servo.setPosition(0);
        }
    }



}
