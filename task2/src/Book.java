import java.lang.*;
public class Book {
    private String title;
    private String author;
    public Book(String n, String  a){
        title = n;
        author = a;
    }
    public Book(String n){
        title = n;
        author = "";

    }
    public Book(){
        title = "Naruto";
        author = "";
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle(String title){
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String toString(){
        return this.title+", автор - "+this.author;
    }

}