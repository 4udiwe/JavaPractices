package task2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Labrador("Labrador Retriever", 3);
        System.out.println(dog1);
        dog1.bark();

        Dog dog2 = new Bulldog("English Bulldog", 4);
        System.out.println(dog2);
        dog2.bark();
    }
}
