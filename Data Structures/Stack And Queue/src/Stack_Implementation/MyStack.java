package Stack_Implementation;


public class MyStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;

    public MyStack() {
        this(DEFAULT_SIZE);
    }

    public MyStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("SATCK FULL");
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty())
            throw new StackException("STACK EMPTY TO POP");
        return data[pointer--];
    }

    public int peek() throws StackException {
        if (isEmpty())
            throw new StackException("STACK EMPTY TO PEEK");
        return data[pointer];
    }

    public boolean isFull() {
        return pointer == data.length-1;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }
}