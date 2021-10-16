import java.lang.*;
public class TestBall{
    public static void main(String[] args) {
        Ball d1 = new Ball("Little", "Red");
        Ball d2 = new Ball("Middle", "Blue");
        Ball d3 = new Ball("Good book");
        d3.setColor("Green");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }

}
