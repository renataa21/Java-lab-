import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball d1 = new Ball(0.6d,0.8d);
        Ball d2 = new Ball(0.8d, 0.5d);
        Ball d3 = new Ball(10.0d, 10.0d);
        System.out.println(d3);
        d3.Disp(0.5d, 0.7d);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}
