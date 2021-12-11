import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();

        arr.add("Michael");
        arr.add("Danya");
        arr.add("Sam");
        arr.addLast("John");
        arr.addFirst("Jack");
        arr.add(1,"Oskar");
        for (String a : arr) System.out.print(a + " ");
        System.out.println();

        System.out.printf("There're %d elements \n", arr.size());
        System.out.println("The second: " + arr.get(2));
        arr.set(1,"Charley");
        for (String a : arr) System.out.print(a + " ");
        System.out.println();

        arr.remove("Sam");
        arr.removeFirst();
        arr.removeLast();
        for (String a : arr) System.out.print(a + " ");
    }
}