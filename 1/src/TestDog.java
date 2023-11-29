import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike",2);
        Dog d2 = new Dog();
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        d2.setName("Tim");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.intoHumanAge();

        d3.intoHumanAge();
    }
}