public abstract class Furniture {
    protected String color;
    protected String size;


    abstract void Shape();
    abstract void Name();

    public Furniture(String color, String size) {
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
        return "Furniture{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }


}

class Chair extends Furniture {

    double rate;
    String material;
    boolean broken;

    public Chair(String color, String size, double rate, String material, boolean broken) {
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

    public void Shape() {
        System.out.println("Я круглое");
    }

    public void Name() {
        System.out.println("Я Кресло!!!!!!!!!");
    }

    @Override
    public String toString() {
        return "Chair{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", rate=" + rate +
                ", material='" + material + '\'' +
                ", broken=" + broken +
                '}';
    }
}

