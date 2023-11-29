import java.util.ArrayList;

public class TestStudent {
    private  static StudentComp comp = new StudentComp();
    public static void qSort(Object[] array, int high, int low){
        if(array == null || array.length == 0) return;
        if(high <= low) return;

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }

    }
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student(435, 5),
            new Student(522, 4.9),
            new Student(143, 3.6),
            new Student(789, 3.9),
            new Student(432, 4.2),
            new Student(543, 3.2),
            new Student(123, 4.87)
        };
        Student[] students1 = new Student[]{
            new Student(342, 2.0),
            new Student(243, 3.89),
            new Student(642, 3.99),
            new Student(149, 4.1)
        };

        System.out.println("Исходный список");
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("-----------------------------");

        //сортировка вставками по id
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i-1;
            for(; j >= 0 && current.compareTo(students[j]) < 0; j--) {
                students[j+1] = students[j];
            }
            students[j+1] = current;
        }
        System.out.println("После сортировки вставками по id");
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("-----------------------------");

        //Быстрая сортировка по GPA
        qSort(students, students.length - 1, 0);

        System.out.println("После быстрой сортировки по GPA");
        for (Student s : students){
            System.out.println(s);
        }

        //Слияние двух списков
        Student[] students2 = new Student[students.length + students1.length];//новый массив для двух списков
        //Заполнение нового массива сначала значениями первого, а потом второго
        System.arraycopy(students, 0, students2, 0, students.length);
        System.arraycopy(students1, 0, students2, students.length, students1.length);
        mergeSort(students2, students2.length);

        System.out.println("После слияния двух списков");
        for (Student s : students2){
            System.out.println(s);
        }
    }
}
