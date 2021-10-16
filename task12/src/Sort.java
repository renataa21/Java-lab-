import java.util.Comparator;
import java.util.Arrays;

public class Sort {

    private Student[] FirstArr () {
        Student[] array1 = new Student[5];
        array1[0] = new Student(3,"Kate",4);
        array1[1] = new Student(1,"Peter",5);
        array1[2] = new Student(2, "Ann", 3);
        array1[3] = new Student(5,"Harry", 2);
        array1[4] = new Student(4,"John",5);

        return array1;
    }

    private Student[] SecondArr() {
        Student[] array2 = new Student[5];
        array2[0] = new Student(6,"Michale",2);
        array2[1] = new Student(7,"Daniil",4);
        array2[2] = new Student(8,"Denny",5);
        array2[3] = new Student(9,"Abby",3);
        array2[4] = new Student(10,"Frank",1);

        return array2;
    }

    <T> T swap(T... args) {
        return args[0];
    }

    public void insertionSort (Student[] arr) {
        for (int i=1; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j].getId() < arr[j-1].getId()){
                arr[j] = swap(arr[j-1], arr[j-1]=arr[j]);
                j--;
            }
        }
    }

    public void insertionTest() {
        Student[] students = FirstArr();
        System.out.println("Before insertion sort: ");
        for (int i=0; i< students.length;i++) System.out.println(students[i]);

        insertionSort((Student[]) students);
        System.out.println("After insertion sort: ");
        for (int i=0;i<students.length;i++) System.out.println(students[i]);
    }



    public void QuickSortTest() {
        Student[] students = FirstArr();

        System.out.println("Before quicksort: ");
        for (int i=0; i< students.length;i++) System.out.println(students[i]);

        Comparator cmpr = new SortingStudentsByGPA();
        Arrays.sort(students,cmpr);

        System.out.println("After quicksort: ");
        for (int i=0; i< students.length;i++) System.out.println(students[i]);
    }



    public Student[] merge() {
        Student[] arr1 = FirstArr();
        Student[] arr2 = SecondArr();
        Student[] arr = new Student[arr1.length + arr2.length];

        for (int i=0; i < arr1.length; i++) arr[i] = arr1[i];

        for(int i=0; i < arr2.length; i ++) arr[i + arr2.length]=arr2[i];

        return arr;
    }

    public void MergeSort(Student[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        MergeSort(a, lo, mid);
        MergeSort(a, mid + 1, hi);

        Student[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].getScore() > buf[i].getScore()) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public void MergeSortTest() {
        Student[] arr = merge();

        System.out.println("Before merge sort: ");
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]);

        MergeSort(arr, 0, arr.length-1);
        System.out.println("After merge sort: ");
        for (int i=0; i<arr.length; i++) System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Sort test = new Sort();
        test.insertionTest();
        test.QuickSortTest();
        test.MergeSortTest();
    }
}
