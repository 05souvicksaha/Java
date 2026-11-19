// Creating a custom exception class
class StackUnderflowException extends Exception
{
    public String toString()
    {
        return "Stack Underflow Exception";
    }
}

// Stack class
class Stack
{
    int a[];
    int top;

    // Constructor
    Stack()
    {
        a = new int[5];
        top = -1;
    }

    // Push operation
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

    // Pop operation
    int pop() throws StackUnderflowException
    {
        if(top < 0)
        {
            throw new StackUnderflowException();
        }

        return a[top--];
    }
}

// Main class
class DemoStack
{
    public static void main(String args[])
    {
        Stack s = new Stack();

        try
        {
            s.pop();
        }
        catch(StackUnderflowException se)
        {
            System.out.println(se);
        }
    }
}