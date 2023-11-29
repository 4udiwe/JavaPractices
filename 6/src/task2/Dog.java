package task2;

abstract class Dog {
    protected String breed;
    protected int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public abstract void bark();

    @Override
    public String toString() {
        return "Dog {" +
                "breed = '" + breed + '\'' +
                ", age = " + age +
                '}';
    }
}
