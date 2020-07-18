package Day10;

public class Overloading
{
    int sum = 0;

    static int add(int a, int b)
    {
        return a+b;
    }

    static int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args)
    {
        System.out.println("returned using two parameters" + add(1,2));
        //System.out.println("returned using three parameters" + add(1,2, 3));

    }

}
