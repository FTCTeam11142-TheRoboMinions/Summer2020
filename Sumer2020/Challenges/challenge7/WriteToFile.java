package challenge7;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile extends challenge7
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter myWriter = new FileWriter("scoutingsheet.txt");
            myWriter.write("Name: " +  teamName());
            myWriter.write("Number: " + teamNumber());
            myWriter.write("Skystones: " + moveSkystone());
            myWriter.write("Park?: " + autoPark());
            myWriter.write("Blocks delivered: " + blocksDelivered());
            myWriter.write("Blocks stacked: " + blocksStacked());
            myWriter.write("Move foundation?: " + moveFoundation());
            myWriter.write("Cap?: " + cap());
            myWriter.write("Park (endgame): " + endgamePark());
            //System.out.println("Teams scouted: " + counter);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
