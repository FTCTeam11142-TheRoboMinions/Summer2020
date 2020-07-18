package Day10;

public class HarryPooter
{
    public static void main(String[] args)
    {
        //Object creation/Instance creation
        // [DATATTYPE/name of class] [IDENTIFIER/NAME of variable] = [new] [NAME OF CLASS](PARAMETERS)

        int i;
        Book hp;
        hp = new Book("Harry Potter", "JK Rowling", 500);
        Book LOTR = new Book("Lord of the Rings", "Jon", 250);

        System.out.println("Name of the book is " + hp.bookName);
        System.out.println("Name of the book is " + hp.getBookName());
    }
}
