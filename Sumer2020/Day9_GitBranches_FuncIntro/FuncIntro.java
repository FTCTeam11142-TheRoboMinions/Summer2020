package Day9_GitBranches_FuncIntro;

public class FuncIntro
{
    // OPTIONAL [ACCESS MODIFIER] [STATIC] [RETURN TYPE] [IDENTIFIER] [PARANTHESIS(PARAMETERS)]
// ACCESS MODIFIER  [NOTHING] PUBLIC PROTECTED PRIVATE

// OPTIONAL STATIC

// MUST HAVE RETURN TYPE INT DOUBLE CHAR STRING VOID

// IDENTIFIER = NAME

// MUST HAVE PARENTHESES

// OPTIONAL PARAMETERS THIS IS WHAT YOU GIVE TO THE FUNCTION

    public static void main(String[] args)
    {
        int i = 5;
        System.out.println(add(5,7));
        Math.abs(-5);
    }

    public static int add(int a, int b) //this function is a static function that adds two numbers and returns nothing
    {
        int sum = a+b;
        String output = "The sum of " + a + " + " + b + " is ";
        //System.out.println(output + sum);

        return sum;
    }




}
