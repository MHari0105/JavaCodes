package Stack_Implementation;

public class StackMain {
    public static void main(String[] args) throws StackException {

        MyStack stack = new MyStack(5);
        stack.push(6);
        stack.push(10);
        stack.push(2);
        stack.push(4);
        stack.push(8);
        // WHEN INSERTING ANOTHER ELEMENT "STACK IS FULL" MESSAGE IS DISPLAYED
        // BUT IN DYNAMIC STACK THIS IS OVERRIDDEN

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
