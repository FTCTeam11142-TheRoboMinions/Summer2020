package Day8_GitIntro_FuncIntro;

public class Function
{
    public static void main(String[] args)
    {
        System.out.println(add(5,3));
        System.out.println(add (7, 5));
        System.out.println(add(5,4));
        System.out.println(add(12, 8));
    }

    static int add(int a, int b)
    {
        return a+b;
    }
}
