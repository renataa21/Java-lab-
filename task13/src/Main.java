import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(24);
        arr.add(13);
        arr.add(7);
        arr.add(0);
        arr.add(11);

        System.out.println(arr.indexOf(1));
        System.out.println(arr.get(2));
        System.out.println(arr.size());

        arr.set(3,10);

        for (Integer a : arr) System.out.print(a + " ");
        arr.remove((Integer) 2);
        System.out.println();

        for (Integer a : arr) System.out.print(a + " ");
        arr.remove(5);
        System.out.println();

        for (Integer a : arr) System.out.print(a + " ");
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println();
        for (Integer a : arr) System.out.print(a + " ");
    }
}