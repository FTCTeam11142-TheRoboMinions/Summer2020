package Day10;

public class Book
{
    //these are called attributes
    int noOfPages;
    String authorName;
    String bookName;
    boolean isPartOfSeries;
    double price;

    //same name as the class
    //it has no return type
    public Book(String name, String author, int pagesNumber)
    {
        noOfPages = pagesNumber;
        authorName = author;
        bookName = name;
    }

    public String getBookName()
    {
        return bookName;
    }
}
