import java.io.Serializable;
class Animal{
    private String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animal='" + animal + '\'' +
                '}';
    }
}
public class MyClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T dataT;
    private V dataV;
    private K dataK;

    public MyClass(T t, V v, K k){
        this.dataT = t;
        this.dataV = v;
        this.dataK = k;
    }
    public T getDataT() {
        return dataT;
    }
    public V getDataV() {
        return dataV;
    }
    public K getDataK() {
        return dataK;
    }
    @Override
    public String toString() {
        return "MyClass\n" +
                "dataT=" + dataT + " class: " + dataT.getClass() +
                "\ndataV=" + dataV + " class: " + dataV.getClass() +
                "\ndataK=" + dataK + " class: " + dataK.getClass();
    }

    public static void main(String[] args) {
        String string = "string";
        Animal dog = new Animal("dog");
        int key = 123;

        MyClass object = new MyClass(string, dog, key);
        System.out.println(object);

    }
}
