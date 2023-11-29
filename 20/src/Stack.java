public class Stack {
    private int[] elems;
    private int capacity;
    private int topindex = -1;

    Stack(int size) {
        elems = new int[size];
        capacity = size;
    }


    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            System.exit(1);
        }
        System.out.println("Inserting " + value);
        elems[++topindex] = value;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is emtpy");
            System.exit(1);
        }
        return elems[topindex--];
    }
    public int getSize() {
        return topindex + 1;
    }
    public Boolean isEmpty() {
        return topindex == -1;
    }
    public Boolean isFull() {
        return topindex == capacity - 1;
    }
    @Override
    public String toString(){
        String res = "";
        for (int i = 0; i <= topindex; i++) {
            res += elems[i] + "; ";
        }
        return res;
    }
}
