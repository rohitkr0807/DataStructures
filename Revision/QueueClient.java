package Revision;

public class QueueClient {
    public static void main(String[] args) throws Exception {
        Queue q= new Queue(4);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(7);
        q.enqueue(6);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
//        q.enqueue(9);
    }
}
