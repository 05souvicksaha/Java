class TestException
{
    static void test(int a)
    {
        try
        {
            if(a == 0)
            {
                throw new ArithmeticException();
            }
            else
            {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}

class Demo
{
    public static void main(String args[])
    {
        TestException.test(0);
        TestException.test(5);
    }
}