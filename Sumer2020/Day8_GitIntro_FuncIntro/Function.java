package Day8_GitIntro_FuncIntro;

import Day9_GitBranches_FuncIntro.FuncIntro;

public class Function
{
    public static void main(String[] args)
    {
        System.out.println(add(5,3));
        add(5,2);
        System.out.println(add (7, 5));
        System.out.println(add(5,4));
        System.out.println(add(12, 8));

        int sum = FuncIntro.add(8,4); //error because add in FuncIntro is declared private
        System.out.println("This is the sum from another class" + sum);
    }

    static int add(int a, int b)
    {
        return a+b;
    }


}
