import java.util.ArrayList;
import java.util.Random;

public class Polygon extends Shape{
    private Double angle = 0.0;
    private Double linear_oper[][];

    private void set_points(){
        int min = 30;


        int length = min + (int)(Math.random()*4);
        x_points = new ArrayList<Integer>(this.angle_val);
        y_points = new ArrayList<Integer>(this.angle_val);
        x_points.add(length);
        y_points.add(0);
        for (int i = 1; i < this.angle_val; i++){
            x_points.add((int) Math.round(linear_oper[0][0]* x_points.get(i-1) + linear_oper[0][1]*y_points.get(i-1)));
            y_points.add((int) Math.round(linear_oper[1][0]* x_points.get(i-1) + linear_oper[1][1]*y_points.get(i-1)));
        }
        for (int i = 0; i < this.angle_val; i++){
            x_points.set(i, x_points.get(i) + x_center);
            y_points.set(i, y_points.get(i) + y_center);
        }
    }

    Polygon (){
        int min = 3;


        this.angle_val = min + (int)(Math.random() * 4);
        this.r = (int)(Math.random() * ((255-100) + 1));
        this.g = (int)(Math.random() * ((255-100) + 1));
        this.b = (int)(Math.random() * ((255-100) + 1));
        this.angle = 360.0 / angle_val;
        this.x_center = 100 + (int)(Math.random() * ((700-100) + 1));
        this.y_center = 100 + (int)(Math.random() * ((700-100) + 1));
        Double arr[][] = {{Math.cos(Math.toRadians(angle)), -Math.sin(Math.toRadians(angle))},
                {Math.sin(Math.toRadians(angle)), Math.cos(Math.toRadians(angle))}};
        linear_oper = arr;
        set_points();
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "x_points=" + x_points +
                ", y_points=" + y_points +
                '}';
    }
}