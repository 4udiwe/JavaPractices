import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void writer() throws IOException {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Арсений\\IdeaProjects\\pr13\\textfile.txt", false);
            writer.write("Мама раму мыла\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void writerappend() throws IOException {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Арсений\\IdeaProjects\\pr13\\textfile.txt", true);
            writer.write("Раму мыла мама\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void reader() throws FileNotFoundException {
        try {
            FileReader reader = new FileReader("C:\\Users\\Арсений\\IdeaProjects\\pr13\\textfile.txt");
            int c;
            while ((c = reader.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException {
        writer();   //ввод текста
        System.out.println("Вывод 1: \n");
        reader();   //вывод
        writerappend();     //добавление текста в конец
        System.out.println("\nВывод 2: \n");
        reader();   //вывод
        writer();   //перезапись текста
        System.out.println("\nВывод 3: \n");
        reader();   //вывод
    }
}