package task2;

class Labrador extends Dog {
    public Labrador(String breed, int age) {
        super(breed, age);
    }

    @Override
    public void bark() {
        System.out.println("Labrador is barking...");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}