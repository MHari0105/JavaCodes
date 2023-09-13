package Stack_Implementation;

// INSERTS EXTRA ELEMENTS THAN STACK SIZE
// STACK DOESN'T GET FULL

public class DynamicStack extends MyStack {

    public DynamicStack() {
        super();    // CALLS MyStack()
    }

    public DynamicStack(int size) {
        super(size);    // CALLS MyStack(int size)
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {    // DOUBLE THE ARRAY SIZE
            int[] temp = new int[data.length * 2];
            for (int i=0; i<data.length; i++) {     // COPY ALL PREV ITEMS IN NEW DATA
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
