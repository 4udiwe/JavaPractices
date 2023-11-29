import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book book1 = new Book("Fight club", "Chuck Palaniuc", 256);
        book1.open(150);
        System.out.println(book1);
        book1.turnpages(100);
        System.out.println(book1);
        book1.colse();
        System.out.println(book1);
    }
}
