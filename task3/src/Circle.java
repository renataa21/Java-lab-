public class Circle {
    int radius;
    int centrx;
    int centry;
    public Circle(){

    }
    public Circle(int radius, int centrx, int centry) {
        this.radius = radius;
        this.centrx = centrx;
        this.centry = centry;
    }

    public int getRadius() {
        return radius;
    }

    public int getCentrx() {
        return centrx;
    }

    public int getCentry() {
        return centry;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setCentrx(int centrx) {
        this.centrx = centrx;
    }

    public void setCentry(int centry) {
        this.centry = centry;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centrx=" + centrx +
                ", centry=" + centry +
                '}';
    }
}
