import java.lang.*;
public abstract class Dish {
    protected String color;
    protected String size;


    abstract void Shape();
    abstract void Name();

    public Dish(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

class Cup extends Dish{

    String content;
    boolean lime;
    boolean milk;
    int degrees;

    public Cup(String color, String size, String content, boolean lime, boolean milk, int degrees) {
        super(color, size);
        this.content = content;
        this.lime = lime;
        this.milk = milk;
        this.degrees = degrees;
    }

    public String getContent() {
        return content;
    }

    public boolean isMilk() {
        return milk;
    }

    public boolean isLime() {
        return lime;
    }

    public int getDegrees() {
        return degrees;
    }

    public void Shape(){
        System.out.println("Я кружка!!!");
    }
    public void Name(){
        System.out.println("Меня зовут Лена");
    }

    @Override
    public String toString() {
        return "Cup{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", content='" + content + '\'' +
                ", lime=" + lime +
                ", milk=" + milk +
                ", degrees=" + degrees +
                '}';
    }
}

class Plate extends Dish{

    double rate;
    String material;
    boolean broken;

    public Plate(String color, String size, double rate, String material, boolean broken) {
        super(color, size);
        this.rate = rate;
        this.material = material;
        this.broken = broken;
    }

    public double getRate() {
        return rate;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void Shape(){
        System.out.println("Я круглая");
    }
    public void Name(){
        System.out.println("Я Тарелка!!!!!!!!!");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", rate=" + rate +
                ", material='" + material + '\'' +
                ", broken=" + broken +
                '}';
    }
}