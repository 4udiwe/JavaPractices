public class ArrayBox {
    private int size;
    private Object[] objects;
    public ArrayBox() {
        objects = new Object[10];
        size = 0;
    }
    public void add(Object e) {
        if (size < objects.length) {
            objects[size] = e;
        }
        size++;
    }
    public Object get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (Object)objects[index];
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        String res = "";
        for (Object o : objects){
            if (o == null)
                continue;
            res += o + " ";
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayBox arrayBox = new ArrayBox();
        arrayBox.add("w");
        arrayBox.add(5);
        arrayBox.add("qwe");
        arrayBox.add(123.45);
        System.out.println(arrayBox);
        System.out.println(arrayBox.get(3));
    }
}
