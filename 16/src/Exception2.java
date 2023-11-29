import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Enter an integer ");
        /*
         * При вводе целых чисел кроме 0 ошибки не возникает
         * При вводе 0 возникает ArithmeticException
         * При вводе double чисел или иных символов возникает ошибка NumberFormatException
         */
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Wrong format of entered number");
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}