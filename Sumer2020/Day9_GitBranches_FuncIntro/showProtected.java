package Day9_GitBranches_FuncIntro;

public class showProtected
{
    public static void main(String[] args)
    {
        int i = FuncIntro.add(5,8);  //error because add in FuncIntro is declared private
        System.out.println(i);
    }
}
