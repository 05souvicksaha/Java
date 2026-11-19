class StackUnderflowException extends Exception
{
    public String toString()
    {
        return "Stack Underflow Exception";
    }
}

class Stack
{
    private int a[];
    private int top;

    Stack()
    {
        a = new int[5];
        top = -1;
    }

    void push(int el)
    {
        if(top == a.length - 1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            a[++top] = el;
            System.out.println(el + " pushed");
        }
    }

    int pop() throws StackUnderflowException
    {
        if(top < 0)
        {
            throw new StackUnderflowException();
        }

        return a[top--];
    }
}

public class DemoStack
{
    public static void main(String args[])
    {
        Stack s = new Stack();

        try
        {
            s.push(10);
            s.push(20);
            s.push(30);

            System.out.println("Deleted element: " + s.pop());
            System.out.println("Deleted element: " + s.pop());
        }
        catch(StackUnderflowException se)
        {
            System.out.println(se);
        }
    }
}