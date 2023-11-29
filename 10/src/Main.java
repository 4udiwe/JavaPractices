import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static int onesAmount(){
        //номер 11 - счет единиц в последовательности, концом яв. 0, 0.
        int num = scanner.nextInt();
        if (num == 0){
            int num1 = scanner.nextInt();
            if (num1 == 0)
                return 0;
            else if (num1 == 1)
                return 1 + onesAmount();
            else
                return onesAmount();
        }
        if (num == 1)
            return 1 + onesAmount();
        else
            return onesAmount();
    }

    /*public static void nechet(){
        //номер 12 - вывод каждого нечетного, концом яв. 0
        int num = scanner.nextInt();
        if (num == 0)
            return;
        else if (num % 2 == 1){
            System.out.println(num);
            nechet();
        }
        else
            nechet();
    }
    public static void nechetIndex(){

    }*/
    public static void leftToRight(int num){
        if (num % 10 == 0){
            return;
        }
            leftToRight(num / 10);
            System.out.println(num % 10);
    }

    public static void rightToLeft(int num){
        if (num == 0)
            return;
        else{
            System.out.println(num % 10);
            rightToLeft(num / 10);
        }
    }

    public static void main(String[] args) {

        //System.out.println(onesAmount());
        //leftToRight(12345678);
        rightToLeft(12345);

    }


}
