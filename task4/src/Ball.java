import java.lang.*;
public class Ball {
    double x = 0.0d;
    double y = 0.0d;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.y = y;
        this.x = x;
    }
    public void Disp(double DispX, double DispY){
        this.x += DispX;
        this.y += DispY;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
