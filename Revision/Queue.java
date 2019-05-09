package Revision;

public class Queue {
    private int data[];
    protected int front;
    protected int size;

    public static final int Default_Size=10;
    public Queue()
    {
        this(Default_Size);

    }
    public Queue(int capacity)
    {
        this.data= new int[capacity];
        this.front=0;
        this.size=0;
    }
    public int size()
    {
        return this.size;
    }
    public boolean isEmpty()
    {
        return this.size()==0;
    }
    public void enqueue(int item) throws Exception
    {
        if(this.size()==this.data.length)
        {
            throw new Exception("Queue is Full");
        }
        int rear= (this.front+this.size)%this.data.length;
        this.data[rear]=item;
        this.size++;
    }
    public int dequeue() throws Exception
    {
        if(this.isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        int ans=this.data[this.front];
        this.data[this.front]=0;
        this.front=(this.front+1)%this.data.length;
        this.size--;
        return ans;
    }
}
