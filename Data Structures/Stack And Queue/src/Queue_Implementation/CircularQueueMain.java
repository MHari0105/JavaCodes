package Queue_Implementation;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue cQueue = new CircularQueue(5);
        cQueue.insert(3);
        cQueue.insert(11);
        cQueue.insert(23);
        cQueue.insert(47);
        cQueue.insert(63);
        cQueue.display();

        System.out.println("Removed : " + cQueue.remove());
        cQueue.insert(90);
        cQueue.display();

    }
}
