import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static <E> void ArrayToArrayList(E[] array, ArrayList<E>list) {
        list.addAll(Arrays.asList(array));
    }
    public static void main(String[] args) {

        Integer[] intArray = {55, 66};
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        ArrayToArrayList(intArray, integerArrayList);
        System.out.println(integerArrayList);

        String[] strings = {"q", "w", "e", "r", "t", "y"};
        ArrayList<String> stringArrayList = new ArrayList<>();

        ArrayToArrayList(strings, stringArrayList);
        System.out.println(stringArrayList);

    }
}