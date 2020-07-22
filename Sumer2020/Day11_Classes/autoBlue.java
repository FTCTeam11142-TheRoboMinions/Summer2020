package Day11_Classes;


public class autoBlue
{
  //Object creation or making an instance
    Robot stuart = new Robot(4, 120, 360); // declaration of variable
  //DATATTYPE IDENTIFIER = new CLASSNAME(PARAMETERS)


    public void runOpMode() throws InterruptedException
    {
        stuart.moveX(15, 1);
    }

}
