import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inn = scanner.next();
        try {
            if (!Objects.equals(inn, "123")) {
                throw new BadINNException("incorrect inn");
            } else {
                System.out.println("inn is correct");
            }
        } catch (BadINNException e){
            System.out.println("Erorr catched: " + e.getMessage());
        }
    }
}