package Queue_Implementation;

public class QueueMain {
    public static void main(String[] args) throws Exception {

        MyQueue queue = new MyQueue(5);
        queue.insert(3);
        queue.insert(11);
        queue.insert(23);
        queue.insert(47);
        queue.insert(63);

        queue.display();

        System.out.println("Removed : " + queue.remove());
        queue.display();
    }
}
