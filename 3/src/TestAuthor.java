
public class TestAuthor {
    public static void main(String args[]){
        Author a1 = new Author("George", "george@gmail.com", 'm');
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());

        System.out.println(a1.getGenger());

        a1.setEmail("george@yandex.ru");
        System.out.println(a1.getEmail());
    }

}