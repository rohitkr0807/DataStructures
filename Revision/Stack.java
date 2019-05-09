package Revision;

public class Stack {
    private int data[];
    private int tos;

    public static final int defaultSize=10;
    public Stack()
    {
        this(defaultSize);
    }
    public Stack(int capacity)
    {
        this.data=new int[capacity];
        this.tos=-1;

    }

    public int size()
    {
        return this.tos+1;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }
    public void push(int item) throws Exception
    {
        if(this.size()==this.data.length)
        {
            throw new Exception("Stack is full");
        }
        this.tos++;
        this.data[this.tos]=item;
    }
    public int pop() throws Exception
    {
        if(this.isEmpty())
        {
            throw new Exception("Stack is Empty");
        }
        int ans = this.data[this.tos];
        this.data[this.tos]=0;
        this.tos--;
        return ans;
    }


}
