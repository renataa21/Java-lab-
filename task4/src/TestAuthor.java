import java.lang.*;
public class TestAuthor {
    public static void main(String[] args) {
        Author d1 = new Author("Mila", "r.yandex",'ж');
        Author d2 = new Author("Bob","rr.yandex",'м');
        Author d3 = new Author("Helen","rrr.yandex",'ж');
        System.out.println(d3);
        d3.setEmail("sos.ru");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        }
    }

