import static java.lang.Math.*;

public class Main {
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i < n + 1; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i < 5){
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
        int j = 0;
        do {
            System.out.print(array[j] + " ");
            j++;
        }while(j<5);

        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("\n");
        for (double k = 1; k < 11; k++) {
            System.out.print(1 / k + " ");
        }
        System.out.println("\n");

        int[] array1 = new int[]{
                (int) (random() * 100),
                (int) (random() * 100),
                (int) (random() * 100),
                (int) (random() * 100),
                (int) (random() * 100),
                (int) (random() * 100),
                (int) (random() * 100),
                (int) (random() * 100),
                (int) (random() * 100),
        };

        for (int item : array1) {
            System.out.print(item + " ");
        }
        for (i = 0; i < array1.length - 1; i++) {
            for(j = 0; j < array1.length - i - 1; j++) {
                if(array1[j + 1] < array1[j]) {
                    int swap = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = swap;
                }
            }
        }
        System.out.println("\n");
        for (int value : array1) {
            System.out.print(value + " ");
        }

        System.out.println("\n");
        System.out.println(factorial(5));

    }
}