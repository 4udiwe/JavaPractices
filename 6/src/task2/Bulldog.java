package task2;

class Bulldog extends Dog {
    public Bulldog(String breed, int age) {
        super(breed, age);
    }

    @Override
    public void bark() {
        System.out.println("Bulldog is barking...");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
