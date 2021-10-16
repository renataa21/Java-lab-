import java.lang.*;
public class Ball {
    private String size;
    private String color;
    public Ball(String n, String  a){
        size = n;
        color = a;
    }
    public Ball(String n){
        size = n;
        color = "";
    }
    public Ball(){
        size = "Big";
        color = "";
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize(String size){
        return size;
    }
    public String getColor() {
        return color;
    }
    public String toString(){
        return "Размер " + this.size +", цвет - "+this.color;
    }

}
