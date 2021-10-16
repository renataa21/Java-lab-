import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Cat", "Renata");
        Book d2 = new Book("Lolite", "Mark");
        Book d3 = new Book("Good book");
        d3.setAuthor("Good man");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
