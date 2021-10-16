import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        String name;
        int date;
        String author;
        String genre;

        Book book = new Book();
        Scanner scan = new Scanner(System.in);
        System.out.println("Name");
        name = scan.next();
        System.out.println("Int Date");
        date = scan.nextInt();
        System.out.println("Author");
        author = scan.next();
        System.out.println("Gender");
        genre = scan.next();

        book.setAuthor(author);
        book.setDate(date);
        book.setGenre(genre);
        book.setName(name);

        System.out.println(book.toString());

    }
}